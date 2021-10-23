package Day4;

import java.util.Scanner;

public class guess {

	public static void main(String[] args) {
		 System.out.println("Eneter Guess ");
		 Scanner sc=new Scanner(System.in);
		 int guess=sc.nextInt();
		 int ans=20;
		 if(guess<ans)
		 {
			 System.out.println("Low");
		 }
		 else if(guess==ans)
		 {
			 System.out.println("Correct");
		 }
		 else
		 {
			 System.out.println("High");
		 }

	}

}
