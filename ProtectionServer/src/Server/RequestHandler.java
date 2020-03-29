package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JOptionPane;

class RequestHandler extends Thread
{
	private DataInputStream input;
	private DataOutputStream output;
	private Socket socket;
	private String md5;
	private String mac;
	private String fname;
	private String lname;
	public RequestHandler(Socket s)
	{
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
	public void getRequest()
	{
		try
		{
			String text = input.readUTF();
			String arr[] = text.split("@");	
			md5 = arr[0];
			mac = arr[1];
			fname = arr[2];
			lname = arr[3];
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		System.out.println("MD5 = "+md5);
		System.out.println("MAC = "+mac);
		System.out.println("First Name = "+fname);
		System.out.println("Last Name = "+lname);
	}
}