package Day4; 
public class OddEven {

	public static void main(String[] args) {
		int start=100;
		int end =120;
		int j=0;
		System.out.println("All Even Number ");
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println("All odd no");
		for(int i=start; i<=end;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		} 
		
	}

}
