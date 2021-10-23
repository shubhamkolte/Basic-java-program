package Day4;

import java.util.Scanner;

public class digit {

	public static void main(String[] args) {
		System.out.println("Enter no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); 
		int count=0;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			count++;
			num=num/10;
		}
		System.out.println("digit are =   "+count);
		System.out.println(" Sum of Digit =  "+sum);
	}

}
