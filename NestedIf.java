package controlstatement;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
int a,b,c;
int max=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter  the value of a=");
a=s.nextInt();
System.out.println("Enter the value of b=");
b=s.nextInt();
System.out.println("enter the value of c=");
c=s.nextInt();
if(a>b)
{
	if(a>c)
		max=a;
	else  //this else is associate with this if(a>c)
		max=c;
}
else //this else is associate with this  if(a>b)
{
	if(b>c)
		max=b;
	
else  //this else is associate with this if (b>c)
{
}
System.out.println("\n max value="+max);


	}
	}
}
