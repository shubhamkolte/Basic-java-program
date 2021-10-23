package Day4;

import java.util.Scanner;

public class menu {
// Write a menu driven program to find all prime,
	//even and odd numbers between 1 to 100
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("1.Find Prime");
			System.out.println("2.press Even");
			System.out.println("3.ODD Number");
			int a=sc.nextInt();
			int num=1;
			if(a==1)
			{
				System.out.println("Prime no are ");
				int count=0;
				for(int i=1;i<=200;i++)
				{
					for(int j=1;j<=i;j++)
					{
						if(i%j==0)
							count++;
					}
					if(count==2)
						System.out.print(" "+i);
				count=0;
				}
			}
			else if(a==2)
			{
				System.out.println("Even Number");
				for(int i=0;num<100;i++)
				{
					if(num%2==0)
						System.out.println(num);
					num++;
				}
			}
			else if(a==3)
			{
				System.out.println("Odd  Number");
				for(int i=0;num<100;i++)
				{
					if(num%2!=0)
						System.out.println(num);
					num++;
				}
			}
		

	}

}
