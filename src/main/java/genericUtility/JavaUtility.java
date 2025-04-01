package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * This is a utility class that has components from java library
 * 
 */
public class JavaUtility 
{
	/**
	 * This is a generic method to generate a random number
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r=new Random();
		int value=r.nextInt(bound);
		return value;
	}
	/**
	 * This is a generic method to fetch Calendar details for the given pattern
	 * @param pattern
	 * @return
	 */
	public String getCalendarDetails(String pattern)
	{
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		String value=sdf.format(d);
		return value;
	}


}
