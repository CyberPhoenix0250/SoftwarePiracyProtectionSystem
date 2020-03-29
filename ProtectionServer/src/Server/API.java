package Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

class API extends Thread
{
	private ServerSocket server;
	private Socket socket;
	private boolean running;
	public API()
	{
		running = true;
	}
	public void run()
	{
		startServer();	
	}
	public void startServer()
	{
		try
		{
			server = new ServerSocket(6464,100);
			while(running)
			{
				socket = null;
				socket = server.accept();
				System.out.println("New Client Connected : "+socket.getInetAddress().toString()+" Port "+socket.getPort());
				new RequestHandler(socket).start();
			}
		} catch (Exception e)
		{}
	}
	public void stopServer()
	{
		try
		{
			running = false;
			server.close();
			System.out.println("Server closed");
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}