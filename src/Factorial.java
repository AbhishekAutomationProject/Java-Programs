import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		System.out.println("Number Entred : " + n);
		int k=fact(n);
		System.out.println("Factorial of Number is : " +k);
	}
	public static int fact(int n)
	{ 
		if(n==0) 
			return 1;
		else
		return(n*fact(n-1));
	}

}

