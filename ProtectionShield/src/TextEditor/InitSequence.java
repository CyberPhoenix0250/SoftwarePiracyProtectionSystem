package TextEditor;

import javax.swing.JPanel;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class InitSequence extends JFrame
{
	private JPanel panel;
	private JProgressBar bar;
	public InitSequence()
	{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle rect = ge.getMaximumWindowBounds();
		
		super.setUndecorated(true);
		super.getContentPane().setLayout(null);
		
		bar = new JProgressBar();
		bar.setBounds(150, 380, 400, 15);
		bar.setForeground(new Color(0 , 191, 254));
		bar.setBackground(Color.WHITE);
		bar.setValue(0);
		
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setLayout(null);
		panel.setBounds(12, 12, 576, 476);
		panel.add(bar);
		
		super.getContentPane().add(panel);
		super.setBackground(Color.BLACK);
		
		int sl = rect.width;
		int sb = rect.height;
		int wl = 600;
		int wb = 500;
		int x = ((sl/2)-(wl/2));
		int y = ((sb/2)-(wb/2));
		super.setBounds(x, y, wl, wb);
		
		JLabel lb1 = new JLabel();
		lb1.setText("Powered by Protection Shield");
		lb1.setBounds(25, 420, 500, 35);
		lb1.setForeground(new Color(0 , 191, 254));
		lb1.setFont(new Font("Alice", Font.PLAIN, 35));
		panel.add(lb1);
		
		JLabel lb2 = new JLabel();
		lb2.setText("by Software Piracy Protection Solutions");
		lb2.setBounds(25, 460, 500, 25);
		lb2.setForeground(new Color(0 , 191, 254));
		lb2.setFont(new Font("Alice", Font.PLAIN, 25));
		panel.add(lb2);
		
		JLabel lb3 = new JLabel();
		lb3.setText("JEditor");
		lb3.setBounds(20, 125, 500, 45);
		lb3.setForeground(Color.WHITE);
		lb3.setFont(new Font("Orbitron", Font.BOLD, 45));
		panel.add(lb3);
		
		JLabel lb4 = new JLabel();
		lb4.setText("A Simple and Stable Text Editor.");
		lb4.setBounds(20, 250, 500, 30);
		lb4.setForeground(Color.WHITE);
		lb4.setFont(new Font("Orbitron", Font.BOLD, 25));
		panel.add(lb4);
		
		JLabel lb5 = new JLabel();
		lb5.setText("Loading");
		lb5.setBounds(30, 380, 200, 20);
		lb5.setForeground(Color.WHITE);
		lb5.setFont(new Font("Orbitron", Font.BOLD, 20));
		panel.add(lb5);
		
		super.setVisible(true);
	}
	public void updateProgress(int value)
	{
		bar.setValue(value);
	}
	@Override
	public void paint(Graphics g)
	{
		panel.paintComponents(g);
		g.setColor(new Color(0 , 191, 254));
		for(int i = 0 ; i < 600 ; i=i+10)
		{
			if(350 <= i && i <= 390)
			{
				continue;
			}
			if(470 <= i && i <= 500)
			{
				continue;
			}
			g.drawRect(0, 0, i, i-230);
		}
		int x1= 230,y2=370;
		g.setColor(Color.BLACK);
		for(int i = 0 ; i < 200 ; i++)
		{
			g.drawLine(x1, 0, 600, y2);
			x1=x1+2;
			y2=y2-2;
		}
	}
	public static void main(String args[])
	{
		new InitSequence();
	}
}