package grade;

import java.util.Scanner;

public class Grade {
	public static void main(String[]args) {
		
		int marks;
		Scanner s1=new Scanner(System.in);
		marks=s1.nextInt();
		if(marks<40) {System.out.println("Failed");}
		else if(marks>=40&&marks<=50) {
			
			System.out.println("Passed with D grade");
			}
		else if(marks>50&&marks<60)
		{
			
			System.out.println("Passed with C grade");
		}
		else if(marks>=60&&marks<70) {System.out.println("Passed with B grade");}
		else if(marks>=70&&marks<80) {System.out.println("Passed with B+ grade");}
		else if(marks>=80&&marks<90) {System.out.println("Passed with A grade");}
		
		else if(marks>=90&&marks<=100) {
			System.out.println("Passed with A+ grade");
		}
		}
		
	}

