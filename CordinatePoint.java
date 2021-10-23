package Day4;

import java.util.Scanner;

public class CordinatePoint {

	public static void main(String[] args) {
		
			System.out.println("Enet X Cordinate");
		 Scanner sc=new Scanner(System.in);
		 int x=sc.nextInt();
		 System.out.println("Enet Y Cordinate");
		 int y=sc.nextInt();
		 if(y>0 && x>0)
		 {
			 System.out.println(" its First Cordinate");
		 }
		 else if(y>0 && x<0)
		 {
			 System.out.println(" its Second Cordinate");
		 }
		 else if(y<0 && x<0)
		 {
			 System.out.println(" its third Cordinate");
		 }
		 else if(x>0 && y<0)
			 System.out.println("its 4 cordinate ");
		 else if((x==0 && y!=0) || (y==0 && x!=0))
			 System.out.println("Liner ");
		 else
			 System.out.println("Zero");

	}

}
