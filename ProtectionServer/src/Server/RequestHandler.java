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
	private Date date;
	public RequestHandler(Socket s)
	{
		date = new Date();
		db = new Database();
		ac = new AccessCode();
		System.out.println("Request handler is running");
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
		try
		{
			String key = "";
			String text = input.readUTF();
			String arr[] = text.split("@");
			String reply = "";
			md5 = arr[0];
			mac = arr[1];
			fname = arr[2];
			lname = arr[3];
			//
			System.out.println("MD5 = "+md5);
			System.out.println("MAC = "+mac);
			System.out.println("First Name = "+fname);
			System.out.println("Last Name = "+lname);
			//
			if(db.isKeyPresent(md5))
			{
				key = db.getKey(md5);
				if(!db.isMacAssociated(md5))
				{
					if(db.updateCredentials(key, mac, fname, lname, date.toGMTString()))
					{
						//reply = ac.getAccessCode(key, mac);
					}
				}
				else
				{
					//reply = ac.getAccessCode(key, mac);
				}
			}
			else
			{
				reply = "AccessDenied";
			}
			output.writeUTF(reply);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
}