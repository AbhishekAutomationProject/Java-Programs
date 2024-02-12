
public class LargeNumber {

	public static void main(String[] args) {
		int n =5843267;
		int large=0;
		while(n!=0)
		{
			int rem=n%10;
			if(rem>large)
			{
				large=rem;
			}
			n=n/10;
		}
		System.out.println("Largest Number: "+large);
	}

}
