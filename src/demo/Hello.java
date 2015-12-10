package demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dateString = dateFormat.format(date);
		
		System.out.println(dateString);
		String weekDay = getWeekOfDate(date);
		System.out.println(weekDay);
		Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	int w = cal.get(Calendar.DAY_OF_WEEK)-1;
    	System.out.println(w);
    	cal.add(Calendar.DAY_OF_MONTH, -w+1);
    	String oneday = dateFormat.format(cal.getTime());
    	cal.add(Calendar.DAY_OF_MONTH, 1);
    	String twoday = dateFormat.format(cal.getTime());
    	cal.add(Calendar.DAY_OF_MONTH, 1);
    	String threeday = dateFormat.format(cal.getTime());
    	cal.add(Calendar.DAY_OF_MONTH, 1);
    	String fourday = dateFormat.format(cal.getTime());
    	cal.add(Calendar.DAY_OF_MONTH, 1);
    	String fiveday = dateFormat.format(cal.getTime());
    	System.out.println(oneday+"----"+twoday+"----"+threeday+"----"+fourday+"----"+fiveday+"----");
    	
	}

	 public static String getWeekOfDate(Date date) {
	    	String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
	    	Calendar cal = Calendar.getInstance();
	    	cal.setTime(date);
	    	int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
	    	if (w < 0)
	    	w = 0;
	    	return weekDays[w];
	    	}
	
	
}
