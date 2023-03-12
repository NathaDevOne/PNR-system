import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;

public class pnrinterface {

	 public static JFrame pnrframe;
	 public static JTextField txtcstation;
	 public static JTextField txtnstation;
	
	 public static JFormattedTextField txtarrival;
	 public static JPanel panelogo;
	 public static  JButton btntime;
	 public static listener listener;
	 public static JFormattedTextField txtdtime;
	 public static JFormattedTextField txtdate,txtttt;
	 public static JRadioButton rbtsouth ,rbtnorth;
	 public static JComboBox<Object> cmbtrain;

	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the application.
	 */
	public pnrinterface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pnrframe = new JFrame();
		pnrframe.getContentPane().setBackground(SystemColor.menu);
		pnrframe.setBounds(450,10, 773, 735);
		pnrframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pnrframe.setUndecorated(true);
		pnrframe.getContentPane().setLayout(null); 
		pnrframe.setVisible(true);
		
		
		panelogo = new JPanel();
		
		panelogo.setBackground(new Color(255, 255, 153));
		panelogo.setBounds(0, 109, 774, 300);
		pnrframe.getContentPane().add(panelogo);
		panelogo.setLayout(null);
		
		Image img2 = new ImageIcon(this.getClass().getResource("/train.jpg")).getImage();	
		JLabel pnrimage = new JLabel("");
		pnrimage.setBounds(10, 26, 754, 264);
		pnrimage.setIcon(new ImageIcon(img2));
		panelogo.add(pnrimage);
		
		btntime = new JButton("Depart");
		btntime.setBackground(Color.RED);
		btntime.setFont(new Font("Tahoma", Font.BOLD, 16));
		btntime.setBounds(337, 632, 131, 29);
		pnrframe.getContentPane().add(btntime);
		
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
		
		
		JLabel lblCurrentStation = new JLabel("Start Station:");
		lblCurrentStation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCurrentStation.setBounds(80, 530, 124, 13);
		pnrframe.getContentPane().add(lblCurrentStation);
		
		txtcstation = new JTextField();
		txtcstation.setEditable(false);
		txtcstation.setColumns(10);
		txtcstation.setBounds(214, 529, 131, 19);
		pnrframe.getContentPane().add(txtcstation);
		
		txtnstation = new JTextField();
		txtnstation.setEditable(false);
		txtnstation.setColumns(10);
		txtnstation.setBounds(214, 569, 131, 19);
		pnrframe.getContentPane().add(txtnstation);
		
		JLabel lblNextStation = new JLabel("End Destination:");
		lblNextStation.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNextStation.setBounds(58, 570, 131, 13);
		pnrframe.getContentPane().add(lblNextStation);
		
		JLabel lblDepartureTime = new JLabel("Departure Time:");
		lblDepartureTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDepartureTime.setBounds(407, 533, 124, 13);
		pnrframe.getContentPane().add(lblDepartureTime);
		
		
		 
		txtdtime = new JFormattedTextField();
		txtdtime.setEditable(false);
		txtdtime.setColumns(10);
		txtdtime.setBounds(541, 532, 131, 19);
		pnrframe.getContentPane().add(txtdtime);
		
		JLabel lblEstimateArrivingTime = new JLabel("Est. Arriving Time:");
		lblEstimateArrivingTime.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblEstimateArrivingTime.setBounds(389, 572, 142, 18);
		pnrframe.getContentPane().add(lblEstimateArrivingTime);
		
		txtarrival = new JFormattedTextField();
		txtarrival.setEditable(false);
		txtarrival.setColumns(10);
		txtarrival.setBounds(541, 571, 131, 19);
		pnrframe.getContentPane().add(txtarrival);
		
		txtdate = new JFormattedTextField();
		txtdate.setEditable(false);
		txtdate.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		 txtdate.setValue(java.time.LocalDate.now());
		txtdate.setBackground(new Color(240, 240, 240));
		txtdate.setColumns(10);
		txtdate.setBounds(673, 411, 90, 19);
		pnrframe.getContentPane().add(txtdate);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDate.setBounds(625, 414, 149, 13);
		pnrframe.getContentPane().add(lblDate);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(75, 0, 130));
		panel_1_1.setBounds(0, 709, 774, 29);
		pnrframe.getContentPane().add(panel_1_1);
		
		JLabel logolabel_1 = new JLabel("");
		logolabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		logolabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		logolabel_1.setBounds(169, 0, 53, 63);
		panel_1_1.add(logolabel_1);
		
	    txtttt = new JFormattedTextField();
		txtttt.setEditable(false);
		txtttt.setColumns(10);
		txtttt.setBounds(633, 5, 131, 19);
		panel_1_1.add(txtttt);
		
		JLabel lblDepartureTime_1 = new JLabel("Total Travel Time:");
		lblDepartureTime_1.setBackground(new Color(240, 240, 240));
		lblDepartureTime_1.setForeground(Color.WHITE);
		lblDepartureTime_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDepartureTime_1.setBounds(476, 8, 147, 13);
		panel_1_1.add(lblDepartureTime_1);
		
		cmbtrain = new JComboBox<Object>();
		cmbtrain.setModel(new DefaultComboBoxModel<Object>(new String[] {"Select","MSC 518", "MSC 548", "MSC 648", "MSC 708", "MSC 758", "MSC 828", "MSC 928", "MSC 948", "MSC 1048", "MSC 1148", "MSC 1248"}));
		cmbtrain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cmbtrain.setBounds(86, 419, 131, 21);
		pnrframe.getContentPane().add(cmbtrain);
		
		JLabel lblTrainNo = new JLabel("Train No:");
		lblTrainNo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTrainNo.setBounds(10, 419, 71, 21);
		pnrframe.getContentPane().add(lblTrainNo);
		
		rbtsouth = new JRadioButton("SouthBound");
		rbtsouth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtsouth.setBounds(6, 462, 103, 21);
		pnrframe.getContentPane().add(rbtsouth);
		
		rbtnorth = new JRadioButton("NorthBound");
		rbtnorth.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtnorth.setBounds(119, 462, 103, 21);
		pnrframe.getContentPane().add(rbtnorth);
		
		listener = new listener();
		
		btntime.addActionListener(listener);
		rbtsouth.addChangeListener(listener);
		rbtnorth.addChangeListener(listener);
	}	Format timeFormat = new SimpleDateFormat("HH:mm:ss");
}
