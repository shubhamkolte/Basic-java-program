package Day4;

import java.util.Scanner;

public class consunativenoornot {

	public static void main(String[] args) {

		System.out.println("Enet X value");
	 Scanner sc=new Scanner(System.in);
	 int x=sc.nextInt();
	 System.out.println("Enet Y value");
	 int y=sc.nextInt();
	 if(x==(y+1) || y==(x-1))
	 {
		 System.out.println("its consecutive number");
	 }
	 else
		 System.out.println("its Not consecutive number");
	}

}
