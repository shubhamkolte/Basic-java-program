import java.util.Iterator;
import java.util.Scanner;

public class pallNumber {

	public static void main(String[] args)
	{
		int z=15;
		int a=1;
		int b=0;
		int result=0;
		for(int i=0;i<z;i++)
		{
			System.out.println(result);
			result=a+2*b;
			
			a=b;
			b=result;
		}
     
	}

}
