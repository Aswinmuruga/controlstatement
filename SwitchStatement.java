package controlstatement;
import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int day;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the day of week");day=in.nextInt();
		switch(day) 
		{
		case 1:
			System.out.println("monday"); break;
		case 2 :
			System.out.println("tuesday");
		break;
		case 3:
			System.out.println("wednsday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
			default:
				System.out.println("enter in wrong path.....");
		}
		
	}
}
