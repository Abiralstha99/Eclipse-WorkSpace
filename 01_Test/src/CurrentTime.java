
public class CurrentTime {
	public static void main (String [] args) {
		long currentTime = System.currentTimeMillis();
		System.out.println("Millisecond : " + currentTime);
		long second = currentTime/1000;
		System.out.println(second); 
		long currentsecond = second % 60;
		System.out.println("CurrentSecond : " + currentsecond);
		long minute = second / 60;
		//System.out.println("CurrentMinute : "+ minute);
		long currentminute = minute % 60;
		System.out.println("CurrentMinute : "+ currentminute);
		long hour = minute / 60;
		//System.out.println("Hour : " + hour);
		long currentHour = hour % 24;
		System.out.println("Hour " + currentHour);
		long day = hour / 24;
		System.out.println("day : " + day);
		
	}
}
