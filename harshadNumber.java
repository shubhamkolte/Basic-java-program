import java.util.Scanner;

public class harshadNumber
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr number : ");
        int num = sc.nextInt();
        int x = num, y, sum = 0;
        while(x>0)
        {
        	y = x%10;
	        sum = sum + y;
	        x = x/10;
	    }     
       // int temp=num%sum;
       // System.out.print(temp);
       if(num%sum == 0)
		     System.out.println(" is a Harshad Number.");
       else
	       System.out.println(" is not a Harshad Number.");      
    }
		
}


