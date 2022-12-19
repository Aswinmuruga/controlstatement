package controlstatement;

import java.util.Scanner;

public class TamilIf {

	public static void main(String[] args) {
		int mark;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your mark");
		mark=in.nextInt();
		 
		if(mark>=36)
		{
			System.out.println("you will pass");
		}
		else if(mark<35)
		{
			System.out.println("you will fail");
		}
	}

}
