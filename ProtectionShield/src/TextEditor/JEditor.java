package TextEditor;

import javax.swing.JFrame;
import javax.swing.*;

class JEditor
{
	private JFrame window;
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public JEditor()
	{
		window = new JFrame("JEditor");
		window.setBounds(420, 100, 1024, 720);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
	private void updateTitle(String filename)
	{
		window.setTitle("JEditor   -   "+filename);
	}
	public static void main(String args[])
	{
		new JEditor();
	}
}