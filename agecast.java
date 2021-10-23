package Day4;

import java.util.Scanner;

public class agecast {

	public static void main(String[] args) {

	 System.out.println("Eneter Age of Candidate");
	 Scanner sc=new Scanner(System.in);
	 int age=sc.nextInt();
	 if(age>=18)
	 {
		 System.out.println(" its Eligible of vote");
	 }
	 else
		 System.out.println("Not  Eligible ");

	}

}
