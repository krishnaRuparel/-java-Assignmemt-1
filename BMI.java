import java.util.Scanner;
class BMI{


public static void main(String[]args) 
{
  
 float height,weight,cal;

  Scanner  s=new Scanner(System.in);
  height=s.nextFloat();
  weight=s.nextFloat(); 

 height=height/100;
 height=height*height;
 System.out.println(height);
 cal=weight/height;
System.out.println("Your BMI is "+ cal);

  
}


}