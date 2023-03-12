import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

 
 


public class login {

	public static JFrame frame;
	public static JPasswordField pass;
	public static JLabel lblMemberLogin;
	public static JButton btnCancel, login,createacc;
	public static listener listener;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	public static JTextField userlog;
	private JLabel bc;
	private JLabel bc_1;

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(211, 211, 211));
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(SystemColor.menu);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		lblMemberLogin = new JLabel("MEMBER LOGIN");
		lblMemberLogin.setBounds(301, 83, 114, 22);
		lblMemberLogin.setForeground(new Color(105, 105, 105));
		lblMemberLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.getContentPane().add(lblMemberLogin);
		
		JPanel panel = new JPanel();
		panel.setBounds(207, 173, 285, 141);
		panel.setBackground(new Color(169, 169, 169));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setForeground(new Color(255, 255, 255));
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
		btnCancel.setBackground(new Color(178, 34, 34));
		btnCancel.setBounds(153, 31, 99, 23);
		panel.add(btnCancel);
		Image img = new ImageIcon(this.getClass().getResource("/lc.png")).getImage();
			
		login = new JButton("Login");
		login.setForeground(new Color(255, 255, 255));
		login.setFont(new Font("Times New Roman", Font.BOLD, 11));
		login.setBounds(54, 31, 101, 23);
		panel.add(login);
		login.setBackground(new Color(178, 34, 34));
		
		pass = new JPasswordField(16);
		pass.setBounds(54, 0, 198, 20);
		panel.add(pass);
		pass.setBackground(new Color(192, 192, 192));
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(32, 0, 16, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setIcon(new ImageIcon(img));
		
		createacc = new JButton("Create Account");
		createacc.setForeground(new Color(255, 255, 255));
		createacc.setFont(new Font("Times New Roman", Font.BOLD, 11));
		createacc.setBackground(new Color(178, 34, 34));
		createacc.setBounds(78, 84, 156, 23);
		panel.add(createacc);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(0, 0, 0));
		textField_1.setBounds(20, 65, 247, 4);
		panel.add(textField_1);
		
		
		Image img1 = new ImageIcon(this.getClass().getResource("/usr.png")).getImage();		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(238, 132, 16, 20);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(Color.GRAY);
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		frame.getContentPane().add(lblNewLabel_1);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/pro.png")).getImage();		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(325, 22, 67, 50);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(img2));
		frame.getContentPane().add(lblNewLabel_2);
		
		userlog = new JTextField();
		userlog.setBounds(264, 132, 195, 20);
		frame.getContentPane().add(userlog);
		userlog.setColumns(10);
		
		Image img3 = new ImageIcon(this.getClass().getResource("/bc1.jpg")).getImage();		
		bc = new JLabel("");
		bc.setBounds(0, 0, 207, 152);
		bc.setIcon(new ImageIcon(img3));
		frame.getContentPane().add(bc);
		
		bc_1 = new JLabel("");
		bc_1.setBounds(0, 148, 207, 174);
		bc_1.setIcon(new ImageIcon(img3));
		frame.getContentPane().add(bc_1);
		
	
		frame.setBounds(500, 200, 493, 316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		listener = new listener();
			
		login.addActionListener(listener);
		btnCancel.addActionListener(listener);
		createacc.addActionListener(listener);
	}

}

