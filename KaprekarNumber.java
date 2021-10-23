package Day4;

public class KaprekarNumber {

	public static void main(String[] args) {
		int num=9;
		int num1=num;
		
		int count=0;
		while(num1>0)
		{ 
			count++;			//1
			num1=num1/10;		//num1=0
		}
	
		int square=num*num;    //squqr=81
		int d=(int) Math.pow(10, count); // d==10
		int firstDivion=square/d;//=81/10=8
		
		int second=square%d; //second=81%10//1
		
		int div=firstDivion+second; //9
		
		if(div==num)
		{
			System.out.println("Number is Kaparekar");
		}
		else
			System.out.println("Number is not kaparekar");
		
		

	}

}
