import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

 

public class register {

	public static JFrame frame;
	public static JTextField fname;
	public static JPasswordField passcreate;
	public static JTextField lname;
	public static listener listener;
	public static JTextField username;
	public static JButton register;
	private JPanel panel_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JPanel panel;
	public static JCheckBox agree;
	public static JPanel panel_2;
	private JLabel lblNewLabel_7;

	/**
	 * Create the application.
	 */
	public register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(500, 200, 571, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		fname = new JTextField();
		fname.setBounds(337, 66, 142, 20);
		frame.getContentPane().add(fname);
		fname.setColumns(10);
		
		passcreate = new JPasswordField(16);
		passcreate.setBounds(337, 223, 142, 20);
		frame.getContentPane().add(passcreate);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(337, 120, 142, 20);
		frame.getContentPane().add(lname);
		
		username = new JTextField();
		username.setColumns(10);
		username.setBounds(337, 174, 142, 20);
		frame.getContentPane().add(username);
		
		JLabel lblNewLabel = new JLabel("Create Password");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(337, 205, 89, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Image img = new ImageIcon(this.getClass().getResource("/bc3.jpg")).getImage();
		JLabel lblbc = new JLabel("");
		lblbc.setBounds(0, 0, 282, 210);
		lblbc.setIcon(new ImageIcon(img));
		frame.getContentPane().add(lblbc);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 209, 282, 113);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_4 = new JLabel("Become a Member!");
		lblNewLabel_4.setBounds(77, 60, 128, 17);
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		lblNewLabel_4.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Register ");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		lblNewLabel_5.setBounds(111, 23, 59, 17);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("&");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Century Gothic", Font.ITALIC, 13));
		lblNewLabel_6.setBounds(133, 39, 15, 27);
		panel_1.add(lblNewLabel_6);
		
		lblNewLabel_1 = new JLabel("FIRSTNAME");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setBounds(337, 41, 113, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("LASTNAME");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_2.setBounds(337, 97, 89, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("USERNAME");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_3.setBounds(337, 150, 89, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(282, 0, 271, 322);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		register = new JButton("Sign Up");
		register.setBounds(82, 286, 92, 23);
		panel.add(register);
		register.setBackground(new Color(240, 128, 128));
		
		agree = new JCheckBox("I Agree to the Terms and Condition");
		agree.setBackground(Color.WHITE);
		agree.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		agree.setBounds(42, 256, 171, 23);
		panel.add(agree);
		
		panel_2 = new JPanel();
		panel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				login.frame.setVisible(true);	
				frame.setVisible(false);
			}
		});
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(224, 0, 47, 34);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		lblNewLabel_7 = new JLabel("x");
		lblNewLabel_7.setBounds(10, 0, 34, 23);
		panel_2.add(lblNewLabel_7);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(128, 0, 0));
		
	
		listener = new listener();
		register.addActionListener(listener);
		agree.addItemListener(listener);
		
	}
}
