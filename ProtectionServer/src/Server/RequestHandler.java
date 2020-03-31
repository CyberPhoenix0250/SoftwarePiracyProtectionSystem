package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Date;

class RequestHandler extends Thread
{
	private Database db;
	private AccessCode ac;
	private DataInputStream input;
	private DataOutputStream output;
	private Socket socket;
	private String md5;
	private String mac;
	private String fname;
	private String lname;
	private String clientIP;
	private Date date;
	private Memory memory;
	public RequestHandler(Socket s, Memory m)
	{
		memory = m;
		date = new Date();
		db = new Database();
		ac = new AccessCode();
		//System.out.println("Request handler is running");
		clientIP = s.getInetAddress().toString().substring(1);
		socket = s;
		try
		{
			input = new DataInputStream(socket.getInputStream());
			output = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e)
		{
			System.out.println("No Input/Output Source Found");
			e.printStackTrace();
		}
		getRequest();
	}
	@SuppressWarnings("deprecation")
	public void getRequest()
	{
		String reply = "";
		try
		{
			String key = "";
			String text = input.readUTF();
			String arr[] = text.split("@");
			
			md5 = arr[0];
			mac = arr[1];
			fname = arr[2];
			lname = arr[3];
			//
			if(db.isKeyPresent(md5))
			{
				key = db.getKey(md5);
				if(!db.isMacAssociated(md5))
				{
					if(db.updateCredentials(key, mac, fname, lname, date.toGMTString()))
					{
						reply = ac.getAccessCode(key, mac);
						System.out.println("Server replying with : "+reply);
						memory.s.insertTable(key, clientIP, "Genuine/Registered");
						output.writeUTF(reply);
					}
				}
				else
				{
					reply = ac.getAccessCode(key, mac);
					System.out.println("Server replying with : "+reply);
					memory.s.insertTable(key, clientIP, "Fake/Type A");
					output.writeUTF(reply);
				}
			}
			else
			{
				reply = "AccessDenied";
				System.out.println("Server replying with : "+reply);
				memory.s.insertTable(key, clientIP, "Fake/Type B");
				output.writeUTF(reply);
			}
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}