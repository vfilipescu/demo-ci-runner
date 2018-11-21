/**
 * 
 */
package javaTest;
import org.joda.time.LocalTime;

public class JavaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Servus Cluj, I love you!");

		JavaTest jt = new JavaTest();
		jt.run();
	}
	
	public void run() {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
	}

}
