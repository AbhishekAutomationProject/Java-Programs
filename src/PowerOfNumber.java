import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number: ");
		int n=sc.nextInt();
		System.out.println("Number Entred is: "+n);
		System.out.println("Enter 2nd Number: ");
		int m=sc.nextInt();
		System.out.println("Number Enterd is: "+m);
		int j=power(m,n);
		int k=power(n,m);
		System.out.println("1st Number to ther power of 2nd Number is: "+k);
		System.out.println("2st Number to ther power of 1nd Number is: "+j);
	}
	static int power(int base,int exponent)
	{
		int power=1;
		for(int i=1;i<=exponent;i++)
		{
			power=power*base;
		}
		return power;
	}

}
