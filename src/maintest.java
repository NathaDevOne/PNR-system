 

public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new database();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
       new login();
   	try {
		database.displayid();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//		new date();
//		new register();
		
//		new pnrinterface();
//		new traindetails();
	}

}
