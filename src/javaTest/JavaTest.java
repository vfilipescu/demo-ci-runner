/**
 * 
 */
package javaTest;
import org.joda.time.LocalTime;

public class JavaTest {

//	static int a = 0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Servus Cluj, te iubesc!");
		
//		int a = 1;
//		System.out.println(JavaTest.a);
//		System.out.println(a);
//
		JavaTest jt = new JavaTest();
		jt.run();
	}
	
	public void run() {
//		System.out.println(JavaTest.a);

		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
	}

}
