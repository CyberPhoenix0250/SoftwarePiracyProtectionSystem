package PiracyShield;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

class FourthPage
{
	private JTextField fnameField;
	private JTextField lnameField;
	private Log log;
	private JFrame window;
	private String license;
	public FourthPage(Memory memory)
	{
		window = memory.window;
		log = memory.log;
		license = memory.LicenseKey;
//		log = new Log();
//		JFrame window = new JFrame();
//		window.setTitle("Software Piracy Protection System");
//		window.getContentPane().setBackground(Color.WHITE);
//		window.setResizable(false);
//		window.getContentPane().setLayout(null);
//		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		window.setBounds(420, 50, 700, 500);

		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(10, 88, 664, 8);
		window.getContentPane().add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 399, 664, 8);
		window.getContentPane().add(separator_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(SecondPage.class.getResource("/Images/shieldIcon.png")));
		lblNewLabel_2.setBounds(594, 10, 80, 70);
		window.getContentPane().add(lblNewLabel_2);

		JButton btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{

			}
		});
		btnCancel.setFont(new Font("Alice", Font.PLAIN, 14));
		btnCancel.setBounds(572, 417, 95, 27);
		window.getContentPane().add(btnCancel);

		JButton btnNext = new JButton("Next >");
		btnNext.setEnabled(false);
		btnNext.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{

			}
		});
		btnNext.setFont(new Font("Alice", Font.PLAIN, 14));
		btnNext.setBounds(460, 417, 95, 27);
		window.getContentPane().add(btnNext);

		JButton button_1 = new JButton("< Back");
		button_1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				
				window.getContentPane().removeAll();
				window.repaint();
				new ThirdPage(memory);
			}
		});
		button_1.setFont(new Font("Alice", Font.PLAIN, 14));
		button_1.setBounds(348, 417, 95, 27);
		window.getContentPane().add(button_1);

		JLabel lblNewLabel = new JLabel("Product Registration");
		lblNewLabel.setFont(new Font("Alice", Font.PLAIN, 26));
		lblNewLabel.setBounds(10, 10, 572, 34);
		window.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Enter your information to register the product.");
		lblNewLabel_1.setFont(new Font("Alice", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 42, 572, 34);
		window.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_3 = new JLabel("First Name");
		lblNewLabel_3.setFont(new Font("Alice", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(30, 122, 115, 24);
		window.getContentPane().add(lblNewLabel_3);

		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Alice", Font.PLAIN, 18));
		lblLastName.setBounds(348, 122, 115, 24);
		window.getContentPane().add(lblLastName);

		fnameField = new JTextField();
		fnameField.setBounds(143, 116, 193, 30);
		window.getContentPane().add(fnameField);
		fnameField.setColumns(10);

		lnameField = new JTextField();
		lnameField.setColumns(10);
		lnameField.setBounds(456, 116, 193, 30);
		window.getContentPane().add(lnameField);

		JLabel lblKey = new JLabel("License Key");
		lblKey.setFont(new Font("Alice", Font.PLAIN, 18));
		lblKey.setBounds(30, 180, 115, 24);
		window.getContentPane().add(lblKey);

		LicenseKey lk = new LicenseKey(license);
		MAC m = new MAC();

		JLabel keylabel = new JLabel("");
		keylabel.setBackground(Color.WHITE);
		keylabel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		keylabel.setBounds(143, 180, 506, 26);
		keylabel.setFont(new Font("Alice", Font.PLAIN, 20));
		keylabel.setHorizontalAlignment(JLabel.CENTER);
		license = license.toUpperCase();
		keylabel.setText(lk.getKey());
		window.getContentPane().add(keylabel);

		JLabel lblIpAddress = new JLabel("IP Address");
		lblIpAddress.setFont(new Font("Alice", Font.PLAIN, 18));
		lblIpAddress.setBounds(30, 235, 115, 24);
		window.getContentPane().add(lblIpAddress);

		JLabel lblMacAddress = new JLabel("MAC");
		lblMacAddress.setFont(new Font("Alice", Font.PLAIN, 18));
		lblMacAddress.setBounds(30, 286, 115, 24);
		window.getContentPane().add(lblMacAddress);

		JLabel label = new JLabel("");
		label.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label.setBackground(Color.WHITE);
		label.setBounds(143, 233, 506, 26);
		label.setText(m.getIP());
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Alice", Font.PLAIN, 20));
		window.getContentPane().add(label);

		JLabel label_1 = new JLabel("");
		label_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(143, 284, 506, 26);
		label_1.setText(m.getMAC());
		label_1.setHorizontalAlignment(JLabel.CENTER);
		label_1.setFont(new Font("Alice", Font.PLAIN, 20));
		window.getContentPane().add(label_1);

		JButton btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				if(checkConnectivity())
				{
					//call to contact server.
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Your computer is not connected to the internet", "No Internet", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnRegister.setFont(new Font("Alice", Font.PLAIN, 14));
		btnRegister.setBounds(554, 340, 95, 27);
		window.getContentPane().add(btnRegister);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Alice", Font.PLAIN, 18));
		lblDate.setBounds(30, 341, 115, 24);
		window.getContentPane().add(lblDate);
		
	    Date date = new Date();
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Alice", Font.PLAIN, 20));
		label_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(143, 339, 376, 26);
		label_2.setText(date.toLocaleString());
		window.getContentPane().add(label_2);

		window.setVisible(true);
	}
	private boolean checkConnectivity()
	{
		boolean isConnected=false;
		try
		{
			log.writeLog("Checking Internet Connectivity.");
			URL url = new URL("https://www.google.com");
			URLConnection connection = url.openConnection();
			connection.connect();
			isConnected = true;
			log.writeLog("Internet is available.");
		} catch (Exception ae)
		{
			log.writeLog("Internet not available.");
			isConnected = false;
		}
		return isConnected;
	}
	public static void main(String args[])
	{
		new FourthPage(new Memory());
	}
}