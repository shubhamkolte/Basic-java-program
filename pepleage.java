package Day4;

import java.util.Scanner;

public class pepleage {

	public static void main(String[] args) {
		System.out.println("Enet first age");
		 Scanner sc=new Scanner(System.in);
		 int p1=sc.nextInt();
		 System.out.println("Enet Second person");
		 int p2=sc.nextInt();
		 System.out.println("Enet third person");
		 int p3=sc.nextInt();
		 if(p1>p2 && p1>p3)
		 {
			 System.out.println("P1 is old");
		 }
		 else if(p2>p1 && p2>p3)
		 {
			 System.out.println("p2 is oldest");
		 }
		 else
		 {
			 System.out.println("p  3 is oldest");
		 }
		 if(p1<p2 && p1<p3)
		 {
			 System.out.println("P1 is smallest");
		 }
		 else if(p2<p1 && p2<p3)
		 {
			 System.out.println("p2 is smallest");
		 }
		 else
		 {
			 System.out.println("p3 is smallest");
		 }
	}

}
