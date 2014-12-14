import java.util.GregorianCalendar;
import java.util.*;
class Lab9
{
	public static void main(String[] args) 
	{
		Calendar calendar = new GregorianCalendar();
		System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		if(calendar.get(Calendar.MONTH) == Calendar.DECEMBER)
		{
			System.out.println("MONTH: " + 12);
		}
		System.out.println("DAY OF MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(1234567898765L);
		System.out.println("After Setting Time:  " + cal.getTime());
	}
}
/*=================================================================================
YEAR: 2014
MONTH: 12
DAY OF MONTH: 13
After Setting Time:  Fri Feb 13 18:31:38 EST 2009*/