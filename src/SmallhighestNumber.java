import java.util.Scanner;

public class SmallhighestNumber {

	public static void main(String[] args) {
		int small=0;
		int large=0;
		int num;
		System.out.println("Please Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		num=sc.nextInt();
		small=num;
		for(int i=2;i<n;i++)
		{
			num=sc.nextInt();
			if(num>large) {
				large=num;
			}
			if(num<small)
			{
				small=num;
			}
			
		}
		System.out.println("Largest Number: "+large);
		System.out.println("Smallest Number: "+small);
		

	}

}
