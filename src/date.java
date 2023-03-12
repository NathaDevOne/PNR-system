import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	public static String petsa;
	public date () {
		Date();
		
	}
public void Date() {
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd ");
	Date date = new Date();
	System.out.println(sdf.format(date));
	
	petsa = sdf.format(date);
	System.out.println(petsa);
}
	
}