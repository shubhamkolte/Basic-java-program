package Day4;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		System.out.println("Enter no");
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 int prime=0;
		 int count=0;
		 for(int i=0;i<n;i++)
		 {
			 
			 for(int j=i;j<100;j++)
			 {
				 if(n%2==0)
						count++;
				 else
					 prime=j;
			 
			 if(count==prime)
					System.out.println(prime);
				else
					System.out.println("Not"+prime);
			 }
			}
		int count1=0;
		for(int i=0;i<n;i++)
		{
			if(n%2==0)
				count1++;
		}
		if(count1==0)
			System.out.println("Prime");
		else
			System.out.println("Not prime"+count1); 
	}

}
