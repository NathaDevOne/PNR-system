import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.awt.SystemColor;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class traindetails {

	 public static JFrame pnrframe;
	 public static JPanel panelogo;
	 public static listener listener;
	 public static JFormattedTextField txtdate;
	 public static	JButton btndelay;
	 public static JFormattedTextField txtdelay;
	public static Object model;
	 public static JComboBox<Object> comboBox ,routeid;

	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the application.
	 */
	public traindetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pnrframe = new JFrame();
		pnrframe.getContentPane().setBackground(SystemColor.menu);
		pnrframe.setBounds(450,10, 773, 811);
		pnrframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnrframe.setUndecorated(true);
		pnrframe.setVisible(true);
		pnrframe.getContentPane().setLayout(null);
		
		
		panelogo = new JPanel();
		panelogo.setBounds(0, 109, 774, 300);
		
		panelogo.setBackground(new Color(255, 255, 153));
		pnrframe.getContentPane().add(panelogo);
		panelogo.setLayout(null);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/train.jpg")).getImage();	
		JLabel pnrimage = new JLabel("");
		pnrimage.setBounds(10, 26, 754, 264);
		pnrimage.setIcon(new ImageIcon(img2));
		panelogo.add(pnrimage);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 774, 111);
		pnrframe.getContentPane().add(panel_1);
		panel_1.setBackground(new Color(75, 0, 130));
		panel_1.setLayout(null);
		

		Image img3 = new ImageIcon(this.getClass().getResource("/logo1.png")).getImage();	
		JLabel logolabel = new JLabel("");
		logolabel.setIcon(new ImageIcon(img3));
		logolabel.setBounds(169, 0, 53, 63);	
		logolabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		logolabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(logolabel);
		
		JLabel lblNewLabel_1 = new JLabel(" Philippine National Railways");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(222, 10, 330, 45);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tracking and Arrival Time Prediction System");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(232, 42, 310, 45);
		panel_1.add(lblNewLabel_1_1);
		
		txtdate = new JFormattedTextField();
		txtdate.setBounds(58, 416, 87, 19);
		txtdate.setEditable(false);
		txtdate.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		 txtdate.setValue(java.time.LocalDate.now());
		txtdate.setBackground(new Color(240, 240, 240));
		txtdate.setColumns(10);
		pnrframe.getContentPane().add(txtdate);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setBounds(10, 419, 41, 13);
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnrframe.getContentPane().add(lblDate);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(0, 782, 774, 29);
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(75, 0, 130));
		pnrframe.getContentPane().add(panel_1_1);
		
		JLabel logolabel_1 = new JLabel("");
		logolabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		logolabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		logolabel_1.setBounds(169, 0, 53, 63);
		panel_1_1.add(logolabel_1);
		model = new DefaultTableModel();
		Object[] column = {	"Train No.", "Source", "Destination", "Departure", "Arrival", "Number of Halt Station", "Total Travel Time"};
 		((DefaultTableModel) model).setColumnIdentifiers(column);
		
		JLabel lblNewLabel = new JLabel(" Cause of Delay:");
		lblNewLabel.setBounds(58, 689, 124, 21);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnrframe.getContentPane().add(lblNewLabel);
		
		  comboBox = new JComboBox<Object>();
		  comboBox.setBounds(193, 689, 152, 21);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"None", "Technical Issues", "Weather", "Ob-Board Emergencies", "Track Fault/ Obstraction"}));
		comboBox.setFont(new Font("Tahoma", Font.ITALIC, 14));
		pnrframe.getContentPane().add(comboBox);
		
		JLabel lblApproxTimeOf = new JLabel("Approx. Time of Delay:");
		lblApproxTimeOf.setBounds(367, 690, 180, 18);
		lblApproxTimeOf.setFont(new Font("Tahoma", Font.BOLD, 15));
		pnrframe.getContentPane().add(lblApproxTimeOf);
		
		JLabel lblNewLabel_2 = new JLabel("How many Minutes?");
		lblNewLabel_2.setBounds(553, 678, 131, 13);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		pnrframe.getContentPane().add(lblNewLabel_2);
		
		  txtdelay = new JFormattedTextField();
		  txtdelay.setBounds(541, 691, 131, 19);
		txtdelay.setColumns(10);
		pnrframe.getContentPane().add(txtdelay);
		
		btndelay = new JButton("Delay");
		btndelay.setBounds(321, 730, 131, 29);
		btndelay.setFont(new Font("Tahoma", Font.BOLD, 16));
		btndelay.setBackground(new Color(165, 42, 42));
		pnrframe.getContentPane().add(btndelay);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(40, 455, 685, 90);
		pnrframe.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 555, 753, 113);
		pnrframe.getContentPane().add(scrollPane_1);
		
		table_1 = new JTable();
		scrollPane_1.setViewportView(table_1);
		
		   routeid = new JComboBox();
		routeid.setBounds(682, 691, 65, 21);
		pnrframe.getContentPane().add(routeid);
		new DefaultTableModel();
		
		listener = new listener();
		btndelay.addActionListener(listener);
	}	Format timeFormat = new SimpleDateFormat("HH:mm:ss");
	public static JTable table;
	public static  JTable table_1;
}
