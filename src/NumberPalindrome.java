
public class NumberPalindrome {

	public static void main(String[] args) {
		int n=522;
		int m=n;
		int rem=0;
		int pal=0;
		while(n!=0)
		{
			rem=n%10;
			pal =(pal*10)+rem;
			n=n/10;
		}
		if(pal==m)
		{
			System.out.println("Number is palindrome " +pal);
		}
		else
		{
			System.out.println("Number is not palindrome "+m);
		}

	}

}
