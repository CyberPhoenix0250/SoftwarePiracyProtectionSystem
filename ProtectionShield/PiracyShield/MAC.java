package PiracyShield;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

class MAC
{
	private String MacAddress = "";
	private String IpAddress = "";

	public MAC()
	{
		String ip;
		try
		{
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("google.com", 80));
			ip = socket.getLocalAddress().toString().substring(1);
			IpAddress = ip;
			MacAddress = getMacAddress(ip);
			socket.close();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public String getMacAddress(String ipAddr) throws UnknownHostException, SocketException
	{
		InetAddress addr = InetAddress.getByName(ipAddr);
		NetworkInterface ni = NetworkInterface.getByInetAddress(addr);
		if (ni == null)
			return null;

		byte[] mac = ni.getHardwareAddress();
		if (mac == null)
			return null;

		StringBuilder sb = new StringBuilder(18);
		for (byte b : mac)
		{
			if (sb.length() > 0)
				sb.append(':');
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}
	public ArrayList<String> getAllMac() throws Exception
	{
		ProcessBuilder builder = new ProcessBuilder("ifconfig");
		builder.redirectErrorStream(true);
		Process process = builder.start();
		InputStream is = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));

		String line = null;
		String o = "";
		while ((line = reader.readLine()) != null)
		{
			o = o + line;
		}
		
		ArrayList<String> macList = new ArrayList<String>();
		line = "";
		int x;
		for(int i = 0 ; i < o.length()-6 ; i++)
		{
			if(o.charAt(i) == 'e' && o.charAt(i+1) == 't' && o.charAt(i+2) == 'h' && o.charAt(i+3) == 'e' && o.charAt(i+4) == 'r')
			{
				x = i+6;
				while(o.charAt(x)!=' ')
				{
					line = line+o.charAt(x);
					x=x+1;
				}
				macList.add(line);
				line = "";
			}
		}
		return macList;
	}
	public String getMAC()
	{
		return MacAddress.toUpperCase();
	}
	public String getIP()
	{
		return IpAddress;
	}

}