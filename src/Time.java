import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        System.out.println("Current Date " + dateFormat.format(date));

        // Convert Date to Calendar
        Calendar c = Calendar.getInstance();
        c.setTime(date);

        // Perform addition/subtraction
        int min =120;
      
        c.add(Calendar.HOUR, 00);
        c.add(Calendar.MINUTE, min);
        c.add(Calendar.SECOND, 50);

        // Convert calendar back to Date
        Date currentDatePlusOne = c.getTime();

        System.out.println("Updated Date " + dateFormat.format(currentDatePlusOne));
    }
}