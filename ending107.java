package Day4;

public class ending107 {

	public static void main(String[] args) {
		int start=105;
		int end=200;
		int num=0;
		while(start<end)
		{	
			num=start%10;
			if(num==7)
				System.out.println(start);
			start++;
		}
		

	}

}
