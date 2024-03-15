package weekday;
import java.util.Scanner;
public class WeekDay {
	public static void main(String[]args)
	{

		System.out.println(" Enter Your choice here as per given number");
	
		int num;
		System.out.println(" 1= monday");
		System.out.println(" 2= Tuesday");
		System.out.println(" 3= wednesday");
		System.out.println(" 4= Thrusday");
		System.out.println(" 5= Friday");
		System.out.println(" 6= Saturday");
		System.out.println(" 7= Sunday");
	   Scanner s1=new Scanner(System.in);
		num=s1.nextInt();
		switch(num) {
		
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
		case 3:

			System.out.println("Wednesday");
			break;
		case 4:

			System.out.println("Thrusday");
		  break;
		case 5:

			System.out.println("friday");
			break;
		case 6:

			System.out.println("saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		}
		
	}

}
