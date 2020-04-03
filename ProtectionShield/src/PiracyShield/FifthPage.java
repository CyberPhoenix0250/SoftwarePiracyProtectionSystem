package PiracyShield;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.JLabel;
import javax.swing.JTextField;

class FifthPage
{
	private JTextField textField;
	public FifthPage()
	{
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Rectangle rect = ge.getMaximumWindowBounds();
		try { 
			UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel"); 
	        //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel"); 
	        //UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
	    } catch(Exception ignored){}
		
		JFrame window = new JFrame();
		window.setTitle("Software Piracy Protection System");
		window.getContentPane().setBackground(Color.WHITE);
		window.setResizable(false);
		window.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/Images/shield.png")));
		window.getContentPane().setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		int sl = rect.width;
		int sb = rect.height;
		int wl = 700;
		int wb = 500;
		int x = ((sl/2)-(wl/2));
		int y = ((sb/2)-(wb/2));
		window.setBounds(x, y, wl, wb);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(15, 88, 664, 8);
		window.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(15, 399, 664, 8);
		window.getContentPane().add(separator_1);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				//log.writeLog("Terminate Application");
				window.dispose();
			}
		});
		btnCancel.setFont(new Font("Alice", Font.BOLD, 16));
		btnCancel.setBounds(572, 417, 95, 27);
		window.getContentPane().add(btnCancel);
		
		JButton btnNext = new JButton("Next >");
		btnNext.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				
			}
		});
		btnNext.setFont(new Font("Alice", Font.BOLD, 16));
		btnNext.setBounds(460, 417, 95, 27);
		window.getContentPane().add(btnNext);
		
		JButton button_1 = new JButton("< Back");
		button_1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				
			}
		});
		button_1.setFont(new Font("Alice", Font.BOLD, 16));
		button_1.setBounds(348, 417, 95, 27);
		window.getContentPane().add(button_1);
		
		JLabel lblNewLabel = new JLabel("Select Destination Location");
		lblNewLabel.setFont(new Font("Alice", Font.BOLD, 24));
		lblNewLabel.setBounds(20, 12, 413, 39);
		window.getContentPane().add(lblNewLabel);
		
		JLabel lblWhereShouldThe = new JLabel("Where should My Product be installed.");
		lblWhereShouldThe.setFont(new Font("Alice", Font.PLAIN, 16));
		lblWhereShouldThe.setBounds(20, 50, 363, 27);
		window.getContentPane().add(lblWhereShouldThe);
		
		JLabel lblSetupWillInstall = new JLabel("Setup will install the Product in the Following given Location");
		lblSetupWillInstall.setFont(new Font("Alice", Font.BOLD, 16));
		lblSetupWillInstall.setBounds(25, 108, 537, 27);
		window.getContentPane().add(lblSetupWillInstall);
		
		JLabel lblToContinueClick = new JLabel("To Continue, click Next, If you would like to select a different folder, click Browse");
		lblToContinueClick.setFont(new Font("Alice", Font.PLAIN, 16));
		lblToContinueClick.setBounds(25, 147, 600, 27);
		window.getContentPane().add(lblToContinueClick);
		
		textField = new JTextField();
		textField.setBounds(25, 198, 530, 27);
		window.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Alice", Font.BOLD, 16));
		btnBrowse.setBounds(570, 198, 95, 27);
		window.getContentPane().add(btnBrowse);
		
		JLabel lblAtLeast = new JLabel("At least 2 MB of free disk space is required.");
		lblAtLeast.setFont(new Font("Alice", Font.PLAIN, 16));
		lblAtLeast.setBounds(25, 360, 600, 27);
		window.getContentPane().add(lblAtLeast);
		
		
		window.setVisible(true);
	}
	public static void main(String args[])
	{
		new FifthPage();
	}
}