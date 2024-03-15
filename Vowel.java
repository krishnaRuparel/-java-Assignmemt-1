import java.util.Scanner;
class Vowel{ 
 char a;
   Vowel(){
Scanner s1=new Scanner(System.in);
a=s1.next().charAt(0);

if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.println("Entered character is a vowel");
}
else
{
System.out.println("it is a consonent");
}

}
public static void main(String[]args)
{
Vowel v=new Vowel();
}

}

