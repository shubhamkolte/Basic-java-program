package Day4;

import java.util.Scanner;

public class eliglibilityStudent {

	public static void main(String[] args) 
	{
		System.out.println("Enetr marks of 3 sub");
	 Scanner sc=new Scanner(System.in);
	 int math=sc.nextInt();
	 int phy=sc.nextInt();
	 int chem=sc.nextInt();
	 int total=math+chem+phy;
	 if(math>=65 && phy>=55 && chem>=50)
	 { 
		if(total>=190 || math+phy >=140)
		{
			System.out.println(" Student Are Eligibile");
		}
		 else
		 {
			 System.out.println("Student Are Not Eligibile better");
		 }
	 }
	 else
	 {
		 System.out.println("Student Are Not Eligibile");
	 }
	}

}
