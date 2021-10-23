package Day4;

import java.util.Scanner;

public class pallindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter no");
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		
		int num1=num; //323
		int num2=0;
		while(num1>0)
		{
			int lastDigit=num1%10;  //3  //2 //0
			num2=num2*10+lastDigit;  //3 //32 //323
			num1=num1/10; //32 //3 //0
			
		}
		if(num==num2)
			System.out.println("Pallindrome");
		else
			System.out.println("Not pallindrome");
	}

}
