import java.util.Scanner;

public class LeapYear {
public static void main(String[]args) {
	
	int year,num;
	System.out.println("Enter a year");
	Scanner s1=new Scanner(System.in);
	year=s1.nextInt();


	
	/*if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	  {
		  System.out.println("This is leap year");
	  }
		
		else {
			System.out.println("This is  not leap year");
			}
		
		}}*/
	num=(year%4==0&&year%100!=0)||(year%400==0)? 1:0;
	
  switch(num)
	{
  case 1:
	  System.out.println("Leap Year");
  break;
	
	case 0:
		  System.out.println("not a leap year");
	break;
	
	}
  }}