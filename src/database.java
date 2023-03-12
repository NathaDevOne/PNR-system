import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

 
import net.proteanit.sql.DbUtils;

 
 



public class database { 
	
	public database() throws Exception {
		
		createTable();


	}

	public static void createTable() throws Exception{
		PreparedStatement create;
		try {
			
			Connection con = getConnection();
			
			create = con.prepareStatement("CREATE TABLE IF NOT EXISTS users( userid int NOT NULL AUTO_INCREMENT, firstname varchar(255) ,"
					+ "lastname varchar(255),email varchar(255),password varchar(255),date_created Varchar(255),PRIMARY KEY(userid))");
			create = con.prepareStatement("CREATE TABLE IF NOT EXISTS routes(routeid int NOT NULL AUTO_INCREMENT  PRIMARY KEY , userid int NOT NULL ,"
					+ " trainnumber varchar(255)  , source varchar(255),destination varchar(255),departure varchar(255),arrival varchar(255), totaldelay int,"
					+ "delaycaused varchar(255),haltstation varchar(255),totaltime int NOT NULL ,FOREIGN KEY(userid) REFERENCES users(userid))");
			create = con.prepareStatement("CREATE TABLE IF NOT EXISTS station (routeid int NOT NULL, trainnumber varchar(255), alabang varchar(255),sucat varchar(255), bicutan varchar(255), fti varchar(255), nichols varchar(255)"
					+ ",edsa varchar(255), pasay_road varchar(255), dela_rosa varchar(255), vito_cruz varchar(255), san_andres varchar(255), paco varchar(255)"
					+ ", pandacan varchar(255), sta_mesa varchar(255), espana varchar(255), laon_laon varchar(255), bluemetritt varchar(255), tutuban varchar(255) ,FOREIGN KEY(routeid) REFERENCES routes(routeid))");
			
			
			create.executeUpdate();
		
			
		}catch (Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Creating Table Completed");
		 
		}
	}
	
	public static void insertroute() throws Exception{
		PreparedStatement insert1;
		String trainnumber,source, destination,departure,arrival,delaycaused;
		 int  haltstation,totaltime, totaldelay;
		try {
			
			 
			trainnumber  = (String) pnrinterface.cmbtrain.getSelectedItem();
			source = pnrinterface.txtcstation.getText();
			destination = pnrinterface.txtnstation.getText();
			departure =   pnrinterface.txtdtime.getText(); 
			arrival =    pnrinterface.txtarrival.getText();
			haltstation = 16;
			totaltime =  Integer.parseInt(pnrinterface.txtttt.getText());
			delaycaused = "N/A";
			totaldelay = 0;
			
			
			Connection con = getConnection();
			insert1 = con.prepareStatement("INSERT INTO routes( userid ,trainnumber,source, destination,departure,arrival,totaldelay,delaycaused,haltstation,totaltime) "
					+ "VALUES ('" + 1 + "', '"+trainnumber+ "',' " +source+ " ', '" + destination + "', '"+departure+ "',' " +arrival+ " ', '"+totaldelay+ "',' " +delaycaused+ " ', '" + haltstation +"', '"+totaltime+ "')");
		
			insert1.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Inserting Completed");
		}
		
	}
	public static void insertstations() throws Exception{
		PreparedStatement insert1;
		String alabang,sucat, bicutan ,fti,nichols,edsa,pasay_road,dela_rosa ,vito_cruz,san_andres, paco , pandacan , sta_mesa  , espana , laon_laon , bluemetritt , tutuban ;
		 JFrame frame = new JFrame();
		 int id = 0;
		 try { 
			SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

			 alabang =  dateFormat.format(listener.dalabang);
			 sucat=   dateFormat.format(listener.dsucat);
			 bicutan=   dateFormat.format(listener.dbicutan);
			 fti=   dateFormat.format(listener.dfti);
			 nichols=  dateFormat.format(listener.dnichols);
			 edsa=   dateFormat.format(listener.dedsa);
			 pasay_road=   dateFormat.format(listener.dpasay_road);
			 dela_rosa =  dateFormat.format(listener.ddela_rosa);
			 vito_cruz= dateFormat.format(listener.dvito_cruz);
			 san_andres= dateFormat.format( listener.dsan_andres);
			 paco = dateFormat.format(listener.dpaco);
			 pandacan=  dateFormat.format( listener.dpandacan);
			 sta_mesa = dateFormat.format( listener.dsta_mesa);
			 espana = dateFormat.format(listener.desp);
			 laon_laon=  dateFormat.format(listener.dlaon_laon);
			 bluemetritt=  dateFormat.format( listener.dblumentrit);
			 tutuban= dateFormat.format(listener.tutuban);
			 String trainnumber  = (String) pnrinterface.cmbtrain.getSelectedItem();
			
				Connection con = getConnection();
				Statement stmt = con.createStatement();
				String SQL = "SELECT routeid FROM routes ORDER BY routeid DESC LIMIT 1 ";
				ResultSet rs3 = stmt.executeQuery(SQL);
				
				if(rs3.next()) {
					
					   id = rs3.getInt("routeid");
				 
					
				}else {
				JOptionPane.showMessageDialog(frame, "User Unknown");
					
				}
				
			insert1 = con.prepareStatement("INSERT INTO station(routeid,trainnumber,alabang,sucat, bicutan ,fti,nichols,edsa,pasay_road,dela_rosa ,vito_cruz,san_andres, paco , pandacan "
					+ " , sta_mesa  , espana , laon_laon , bluemetritt , tutuban  ) "
					+ "VALUES ('"+id+"', '"+trainnumber+ "',' " +alabang+ " ', '" + sucat + "', '"+bicutan+ "',' " +fti+ " ', '"+nichols+ "',"
							+ "' " +edsa+ " ', '" + pasay_road +"', '"+dela_rosa+ "', '" + vito_cruz +"', '"+san_andres+ "', '" + paco +"', '"+pandacan+ "', "
									+ "'" + sta_mesa +"', '"+espana+ "', '" + laon_laon +"', '"+bluemetritt+ "', '"+tutuban+ "')");
		
			insert1.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Inserting Completed");
		}
		
	}
	public static void inserts() throws Exception{
		PreparedStatement insert1;
		String trainnumber,source, destination,departure,arrival,delaycaused;
		 int  haltstation,totaltime, totaldelay;
		try {
			
			 
			trainnumber  = (String) pnrinterface.cmbtrain.getSelectedItem();
			source = pnrinterface.txtcstation.getText();
			destination = pnrinterface.txtnstation.getText();
			departure =   pnrinterface.txtdtime.getText(); 
			arrival =    pnrinterface.txtarrival.getText();
			haltstation = 16;
			totaltime =  Integer.parseInt(pnrinterface.txtttt.getText());
			delaycaused = "N/A";
			totaldelay = 0;
			
			
			Connection con = getConnection(); 
			insert1 = con.prepareStatement("INSERT INTO routes( userid ,trainnumber,source, destination,departure,arrival,totaldelay,delaycaused,haltstation,totaltime) "
					+ "VALUES ('" + 1 + "', '"+trainnumber+ "',' " +source+ " ', '" + destination + "', '"+departure+ "',' " +arrival+ " ', '"+totaldelay+ "',' " +delaycaused+ " ', '" + haltstation +"', '"+totaltime+ "')");
		
			insert1.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Inserting Completed");
		}
		
	}
	public static void inserregister() throws Exception{
		PreparedStatement insert1;
		String firstname ,lastname,email;
		
		try {
			
			firstname =register.fname.getText();
			lastname = register.lname.getText();
			email = register.username.getText();
		
			
			Connection con = getConnection();
			insert1 = con.prepareStatement("INSERT INTO users( firstname ,lastname,email, password,date_created) VALUES ('" + firstname + "', '"+lastname+ "',' " +email+ " ', '"+register.passcreate.getText()+"' ,'"+date.petsa+"')");
		
			insert1.executeUpdate();
			
			register.frame.dispose();
			new pnrinterface();
			
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Inserting Completed");
		}
		
	}

	public static void  get() throws Exception{
	 JFrame frame = new JFrame();
		String username = register.username.getText();
	
	try {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		String SQL = "SELECT email FROM users WHERE email = ' " +username+ "' ";
		ResultSet rs = stmt.executeQuery(SQL);
		
		if(rs.next()) {
			JOptionPane.showMessageDialog(frame, "Account is already Existing!!!");
		}else {
			JOptionPane.showMessageDialog(frame, "Succesfully!!!");
			inserregister(); 
			register.frame.setVisible(false);
		}
			
	}catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
	}
	
	public static void  getLogname() throws Exception{
		 JFrame frame = new JFrame();
			String username = login.userlog.getText();
			String password =  login.pass.getText();
		try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String SQL = "SELECT email ,password FROM users WHERE email = ' " +username+ "' AND  password = '"+password+"' ";
			ResultSet rs1 = stmt.executeQuery(SQL);
			
			if(rs1.next()) {
				JOptionPane.showMessageDialog(frame, "Login Successfully!"); 
				new pnrinterface();
				register.frame.setVisible(false); 
				login.frame.dispose();
			}else {
				JOptionPane.showMessageDialog(frame, "Username or Password Incorrect,Pls Try Again!");
			}
				
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
		}
	

	public static void update() throws Exception{
		PreparedStatement update;
		String trainnumber,source, destination,departure,arrival,delaycaused;
		 int  haltstation,totaltime, totaldelay , routeid;
		try {
			routeid =  (int) traindetails.routeid.getSelectedItem();
			 
			trainnumber  = (String) pnrinterface.cmbtrain.getSelectedItem();
			source = pnrinterface.txtcstation.getText();
			destination = pnrinterface.txtnstation.getText();
			departure =   pnrinterface.txtdtime.getText(); 
			arrival =    pnrinterface.txtarrival.getText();
			haltstation = 16;
			totaltime =  Integer.parseInt(pnrinterface.txtttt.getText());
			totaldelay = totaltime - 72;
			delaycaused = (String) traindetails.comboBox.getSelectedItem();

			 
			Connection con = getConnection();
			
			update = con.prepareStatement("Update routes set arrival = '" +arrival+ "', totaltime = '"+totaltime+ "'"
					+ " ,totaldelay = '" +totaldelay+ "', delaycaused = '"+delaycaused+ "' where routeid = '"+routeid+ "' ");
		
			update.executeUpdate();
			
			
	 
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("Updating Completed");
		}
		
	}
	public static void  display2() throws Exception{
	 
			try {
			Connection con = getConnection();
			Statement stmt = con.createStatement();
			String SQL = "SELECT  * FRom routes";
			ResultSet rs6 = stmt.executeQuery(SQL);
			traindetails.table.setModel(DbUtils.resultSetToTableModel(rs6));
			System.out.println(rs6);
			//while(rs6.next()) {
				
				//JOptionPane.showMessageDialog(frame, rs6.getInt(1) + " " + rs6.getString(2));
				
			//}
				
			con.close();
			
			pnrinterface.pnrframe.setVisible(false);
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
			
		}
	public static void  display() throws Exception{
		 
		try {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		String SQL = "SELECT  * FROM station";
		ResultSet rs6 = stmt.executeQuery(SQL);
		traindetails.table_1.setModel(DbUtils.resultSetToTableModel(rs6));
		System.out.println(rs6);
		//while(rs6.next()) {
			
			//JOptionPane.showMessageDialog(frame, rs6.getInt(1) + " " + rs6.getString(2));
			
		//}
			
		con.close();
		
		pnrinterface.pnrframe.setVisible(false);
	}catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
		
	}
	public static void  displayid() throws Exception{
 		try {
		Connection con = getConnection();
		Statement stmt = con.createStatement();
		String SQL = "SELECT  routeid  FROM  routes";
		ResultSet rs6 = stmt.executeQuery(SQL);
		
		
		
		System.out.println(rs6);
		while(rs6.next()) {
			
			int routeid = rs6.getInt("routeid");
			traindetails.routeid.addItem(routeid);
			
		}
			
		con.close();
		
		pnrinterface.pnrframe.setVisible(false);
	}catch (Exception e) {
		System.out.println("Error: " + e.getMessage());
	}
		
	}
	public static Connection getConnection() throws Exception{
		try {
			String driver = "com.mysql.jdbc.Driver";
			String url = "jdbc:mysql://localhost:3306/pnr_database";
			String username = "root";
			String password = "";
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
			return conn;
		}catch (Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
}
