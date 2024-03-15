package calculator;
import java.util.Scanner;

public class Calculator {
	public static void main(String[]args) {

	int a,b,choice,c;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter first value");
	a=s1.nextInt();
	System.out.println("Enter second value");
	b=s1.nextInt();
	System.out.println("Enter choice 1 = +");
	System.out.println("Enter choice 2 = -");
	System.out.println("Enter choice 3 = *");
	System.out.println("Enter choice 4 = /");
	
	System.out.println("Enter Your choice here - ");
	choice=s1.nextInt();
	switch(choice) {
	case 1:
		System.out.println("The Addition of Number is-  "+ a+b );
		break;
	case 2:
		c=a-b;
		System.out.println("The subtraction of number is- "+ c);
	
	break;
	case 3:
		System.out.println("The multiplication is- "+ a*b);
		break;
	case 4:
		System.out.println("The division of the code is- "+ a/b);
		break;
	
	}
	}

}
