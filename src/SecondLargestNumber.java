
public class SecondLargestNumber {

	public static void main(String[] args) {
		int num=897612345;
		int large=0;
		int sec_large=0;
		int rem=0;
		while(num!=0) 
		{
			rem=num%10;
			if(large<rem)
			{
				sec_large=large;
				large=rem;
			}
			else if(rem>=sec_large)
			{
				sec_large=rem;
			}
			num=num/10;
		}
		System.out.print(sec_large);
	}

}
