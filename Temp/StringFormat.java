import java.util.*;
import java.text.SimpleDateFormat;

public class StringFormat {

  public static final String YEAR = "Year";
  public static final String MONTH = "Month";
  public static final String DAY = "Date";
  public static void main(String[] args) {

    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
		SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
		SimpleDateFormat dayFormat = new SimpleDateFormat("dd");
		Date todayDate = new Date();
		Date yesterdayDate = new Date();
    Calendar newCalendar = Calendar.getInstance();
    newCalendar.set(2018,0,1);
    newCalendar.add(Calendar.DAY_OF_MONTH, -1);
    yesterdayDate = newCalendar.getTime();
    String YESTERDAY = yearFormat.format(yesterdayDate) + YEAR+ monthFormat.format(yesterdayDate) + MONTH + dayFormat.format(yesterdayDate) + DAY;


    System.out.println(YESTERDAY);
  }

}
