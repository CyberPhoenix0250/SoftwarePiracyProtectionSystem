package TextEditor;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;

class InitSequence extends JFrame
{
	private JPanel panel;
	public InitSequence()
	{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle rect = ge.getMaximumWindowBounds();
		super.setUndecorated(true);
		super.getContentPane().setBackground(new Color(30, 144, 255));
		super.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 12, 576, 476);
		
		super.getContentPane().add(panel);
		super.setBackground(Color.BLACK);
		
		int sl = rect.width;
		int sb = rect.height;
		int wl = 600;
		int wb = 500;
		int x = ((sl/2)-(wl/2));
		int y = ((sb/2)-(wb/2));
		super.setBounds(x, y, wl, wb);
		super.setVisible(true);
	}
	@Override
	public void paint(Graphics g)
	{
		panel.paintComponents(g);
		g.setColor(Color.white);
		g.drawRect(10, 10, 60, 80);
		g.drawRect(50, 50, 60, 80);
	}
	public static void main(String args[])
	{
		new InitSequence();
	}
}