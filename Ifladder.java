package controlstatement;
import java.util.Scanner;
public class Ifladder {

	public static void main(String[] args) {
	Scanner r=new Scanner(System.in);
	System.out.println("enterday between 0 to 6 day=");
	int day;
	day=r.nextInt();
	if(day==0)
	{
		System.out.println("\nsunday");
		
	}
	else if(day==1)
	{
		System.out.println("\nmonday");
		
	}
	else if(day==2) {
		System.out.println("\n tuesday");
	}
	else if(day==3)
	{

		System.out.println("\n wednesday");
	}
	else if(day==4) {
		System.out.println("\n thursday");
	}
	else if(day==5)
	{
		System.out.println("\n friday");
	}
	else if (day==6) {
		System.out.println("\n staurday");
	}
	else {
		System.out.println("\n enter in wrong path..........");
	}
	}
}
