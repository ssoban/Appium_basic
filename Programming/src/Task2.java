import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class Task2
{
	
	
	public static void main(String[] args)
	{
		
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		long elapsedTime = 0L;

		while (elapsedTime <60*1000) {
		    System.out.println("hiiii");
		    elapsedTime = (new Date()).getTime() - startTime;
		    System.out.println(elapsedTime);
		}
		System.out.println(startTime);	
		
		//String s= "Watch," + " " + n + " " + "new";
		System.out.println(startTime);	
		 
		 
		 }
	
	}
	

