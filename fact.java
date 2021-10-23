package Day4;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no");
		 Scanner sc=new Scanner(System.in);
		 int no=sc.nextInt();
		 int fact=1;
		 for(int i=2 ;i<=no ; i++)
		 {
			 fact=fact*i;
		 }
		 System.out.println("factorial " +fact);
	}

}
 