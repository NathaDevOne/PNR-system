import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class listener implements ActionListener, ChangeListener,ItemListener  {
	int min;
	public static Date date;
	public  int tutubans, alabang,sucat,bicutan,fti,nichols,edsa,pasay_road,dela_rosa,vito_cruz,san_andres,paco,pandacan,sta_mesa,espana,laon_laon,bluementrit;
	 
	 public static   Calendar c;
	public String trainnumber;
	public int routeid;
	public static Date tutuban ,dalabang,dblumentrit,dlaon_laon,desp,dsta_mesa,dpandacan,dpaco,dsan_andres,dvito_cruz,ddela_rosa,dpasay_road,dedsa,dnichols,dfti,dbicutan,dsucat;
 
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
 
		
		
		
	
	}

	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
	
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    date = new Date();
	    System.out.println("Current Date " + dateFormat.format(date));
	        // Convert Date to Calendar
	     c = Calendar.getInstance();
	     Calendar  blu = Calendar.getInstance();
	     Calendar laon = Calendar.getInstance();
	     Calendar esp = Calendar.getInstance();
	     Calendar sta = Calendar.getInstance();
	     Calendar pand = Calendar.getInstance();
	     Calendar pacod = Calendar.getInstance();
	     Calendar san = Calendar.getInstance();
	     Calendar vito = Calendar.getInstance();
	     Calendar  dela = Calendar.getInstance();
	     Calendar  pasay = Calendar.getInstance();
	     Calendar   nichol = Calendar.getInstance();
	     Calendar ft = Calendar.getInstance();
	     Calendar bic = Calendar.getInstance(); 
	     Calendar  suc = Calendar.getInstance();
	     Calendar ala = Calendar.getInstance();
	     Calendar eds = Calendar.getInstance();
	    
	     c.setTime(date);
	     blu.setTime(date);
	     laon.setTime(date);
	     esp.setTime(date);
	     sta.setTime(date);
	     pand.setTime(date);
	     pacod.setTime(date);
	     san.setTime(date);
	     vito.setTime(date);
	     dela.setTime(date);
	     pasay.setTime(date);
	     eds.setTime(date);
	     nichol.setTime(date);
	     ft.setTime(date);
	     bic.setTime(date);
	     suc.setTime(date);
	     ala.setTime(date);
	     
	   
			if (e.getSource().equals(pnrinterface.btntime)) {
				
			        // Perform addition/subtraction
			    
				
				if(pnrinterface.rbtsouth.isSelected()){
				 min =72;
					pnrinterface.txtcstation.setText( "Tutuban Station"); 
					pnrinterface.txtnstation.setText( "Alabang Station"); 
					 
					tutuban =  date;
					System.out.println("tutuban: " + dateFormat.format(tutuban));
					
					bluementrit = 6;
					blu.add(Calendar.HOUR, 00);
					blu.add(Calendar.MINUTE, 6);
					blu.add(Calendar.SECOND, 50); 
				    dblumentrit =blu.getTime();
					System.out.println("bluementrit: " + dateFormat.format(dblumentrit));
					
					 
					laon_laon = 6 + 4; 
					laon.add(Calendar.HOUR, 00);
					laon.add(Calendar.MINUTE, 10);
					laon.add(Calendar.SECOND, 50); 
					  dlaon_laon =laon.getTime();
					System.out.println("laon_laon: " + dateFormat.format(dlaon_laon));

					
					
					
					espana =  laon_laon + 3; 
					esp.add(Calendar.HOUR, 00);
					esp.add(Calendar.MINUTE, 13);
					esp.add(Calendar.SECOND, 50); 
					  desp =esp.getTime();
					System.out.println("espana: " + dateFormat.format(desp));

					
					
					sta_mesa = espana + 5 ;
					sta.add(Calendar.HOUR, 00);
					sta.add(Calendar.MINUTE, 18);
					sta.add(Calendar.SECOND, 50); 
					dsta_mesa =sta.getTime();
					System.out.println("sta_mesa: " + dateFormat.format(dsta_mesa));

					 
				   	pandacan =  sta_mesa + 4;
				   	pand.add(Calendar.HOUR, 00);
				   	pand.add(Calendar.MINUTE, 22);
				   	pand.add(Calendar.SECOND, 50); 
					dpandacan =pand.getTime();
					System.out.println("pandacan: " + dateFormat.format(dpandacan));

				   	
				   	paco =  pandacan + 4;
				   	pacod.add(Calendar.HOUR, 00);
				   	pacod.add(Calendar.MINUTE, 26);
				   	pacod.add(Calendar.SECOND, 50); 
				  dpaco =pacod.getTime();
					System.out.println("paco: " + dateFormat.format(dpaco));

				   	
				   	san_andres = paco + 3;
				   	san.add(Calendar.HOUR, 00);
				   	san.add(Calendar.MINUTE, 29);
				   	san.add(Calendar.SECOND, 50); 
				  dsan_andres =san.getTime();
					System.out.println("san_andres: " + dateFormat.format(dsan_andres));

				   	
				   	vito_cruz = san_andres + 2;
				   	vito.add(Calendar.HOUR, 00);
				   	vito.add(Calendar.MINUTE, 31);
				   	vito.add(Calendar.SECOND, 50); 
				  dvito_cruz =vito.getTime();
					System.out.println("vito_cruz: " + dateFormat.format(dvito_cruz));

				   	
				   	dela_rosa = vito_cruz + 4;
				   	dela.add(Calendar.HOUR, 00);
				   	dela.add(Calendar.MINUTE, 35);
				   	dela.add(Calendar.SECOND, 50); 
				  ddela_rosa =dela.getTime();
					System.out.println("dela_rosa: " + dateFormat.format(ddela_rosa));

				   	
				   	pasay_road = dela_rosa +3;
				   	pasay.add(Calendar.HOUR, 00);
				   	pasay.add(Calendar.MINUTE, 38);
				   	pasay.add(Calendar.SECOND, 50); 
					  dpasay_road =pasay.getTime();
					System.out.println("pasay_road: " + dateFormat.format(dpasay_road));

				   	
				   	edsa = pasay_road + 3;
				   	eds.add(Calendar.HOUR, 00);
				   	eds.add(Calendar.MINUTE, 41);
				   	eds.add(Calendar.SECOND, 50); 
			 dedsa =eds.getTime();
					System.out.println("edsa: " + dateFormat.format(dedsa));

				   	
				   	nichols = edsa + 5;
				   	nichol.add(Calendar.HOUR, 00);
				   	nichol.add(Calendar.MINUTE, 46);
				   	nichol.add(Calendar.SECOND, 50); 
			 dnichols =nichol.getTime();
					System.out.println("nichols: " + dateFormat.format(dnichols));

				   	
				   	fti =  nichols + 4;
				   	ft.add(Calendar.HOUR, 00);
				   	ft.add(Calendar.MINUTE, 50);
				   	ft.add(Calendar.SECOND, 50); 
				  dfti =ft.getTime();
					System.out.println("fti: " + dateFormat.format(dfti));

					
				   	
				   	bicutan = fti + 5 ;
				   	bic.add(Calendar.HOUR, 00);
				   	bic.add(Calendar.MINUTE, 55);
				   	bic.add(Calendar.SECOND, 50); 
				   	dbicutan =bic.getTime();
					System.out.println("bicutan: " + dateFormat.format(dbicutan));

				   	
				   	sucat =  bicutan + 9 ;
				   	suc.add(Calendar.HOUR, 00);
				   	suc.add(Calendar.MINUTE, 64);
				   	suc.add(Calendar.SECOND, 50); 
					  dsucat =suc.getTime();
					System.out.println("sucat: " + dateFormat.format(dsucat));

				   	
				   	alabang = min +8 ;
				   	ala.add(Calendar.HOUR, 00);
				   	ala.add(Calendar.MINUTE, 72);
				   	ala.add(Calendar.SECOND, 50); 
					 dalabang =ala.getTime();
					System.out.println("alabang: " + dateFormat.format(dalabang));

					
				
				}else
				{
					 min =72;
					pnrinterface.txtcstation.setText( "Alabang tation"); 
					pnrinterface.txtnstation.setText( "Tutuban Station"); 
					
					  		alabang =8 ;
							sucat = 9 ;
							bicutan =5 ;
							fti = 4;
							nichols =5;  
							edsa = 3;
							pasay_road =3;
							dela_rosa =4;
							vito_cruz =2;
							san_andres = 3;
							paco = 4;
							pandacan = 4;
							sta_mesa = 5 ;
							espana = 3;
							laon_laon = 4;
							bluementrit = 6;
							 tutubans =1;
				
				}
				
			
			    c.add(Calendar.HOUR, 00);
		        c.add(Calendar.MINUTE, min);
		        c.add(Calendar.SECOND, 50);
		        
			    // Convert calendar back to Date
			    Date currentDatePlusOne = c.getTime();
				pnrinterface.txtdtime.setValue(dateFormat.format(date));
				pnrinterface.txtarrival.setValue(dateFormat.format(currentDatePlusOne));
			        
				pnrinterface.txtttt.setValue(min);
				new traindetails();
				
				try {
					database.insertroute();
					database.display2();
					database.display();
					database.displayid();
					database.insertstations();
 				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 
			
			}
			if (e.getSource().equals(traindetails.btndelay)) 
			{
				 
				if(traindetails.txtdelay.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, 
                            "Approximate Time of Delay is a must!!!", 
                            "Warning!!!", 
                            JOptionPane.WARNING_MESSAGE);
				}
				else
				{
			        // Perform addition/subtraction
					
			         min += Integer.parseInt( traindetails.txtdelay.getText());  
			         int min1 = Integer.parseInt( traindetails.txtdelay.getText());  
			       String dtime =   pnrinterface.txtarrival.getText(); 
			       DateFormat df = new SimpleDateFormat("HH:mm:ss"); 
				 
				 try {
					Date d1 = df.parse(dtime);
					System.out.println(dateFormat.format( d1));
					
					 Date date1 = d1; 
					 
					 Calendar d = Calendar.getInstance(); 
					   d.setTime(date1);
					   
					   
					    d.add(Calendar.HOUR, 00);
				        d.add(Calendar.MINUTE, min1);
				        d.add(Calendar.SECOND, 0);
				        
					   Date currentDatePlusOne2 = d.getTime();
					   System.out.println(dateFormat.format( currentDatePlusOne2));
		 				pnrinterface.txtarrival.setValue(dateFormat.format(currentDatePlusOne2));
						pnrinterface.txtttt.setValue(min + 72);
						
					   
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 

 	            }	
				
				
				
				try { 
					database.update();
					database.display2();
					database.display();
					database.displayid();
					
 
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 
				}	
			if (e.getSource().equals(login.login)) {
				
				try {
					database.getLogname();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 
			}
			if(e.getSource().equals(login.createacc)) {
				new register();
			 pnrinterface.pnrframe.setVisible(false);
			 traindetails.pnrframe.setVisible(false);
				login.frame.setVisible(false);
				 
				
					
			}
			
			if(e.getSource().equals(login.btnCancel)) {
				 
			}
			if(e.getSource().equals(register.register)) {
				
				JFrame frame = new JFrame();
				if( register.passcreate.getText() .equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Create your Password");
				
				}else if (register.username.getText() .equals(""))
				{
					JOptionPane.showMessageDialog(frame, "Create your Username");
				}else 
				{
					try {
						database.get(); 
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
				
				}
				 
			}
			 
			public static void clear() {
		// Clearing value
				pnrinterface.txtcstation.setText(" ");
				pnrinterface.txtnstation.setText(" ");
				pnrinterface.txtarrival.setText(" ");
				pnrinterface.txtdtime.setValue(" ");
				
	}

	}


