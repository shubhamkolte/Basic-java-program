package Day4;

public class dmo {

	   public static void main (String[] args)
	   {
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
}