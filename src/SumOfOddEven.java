
public class SumOfOddEven {

	public static void main(String[] args) {
		int sum=0,sum1=0;
		for(int i=1;i<=100;i++)
		{
			if((i%2)!=0)
			{
				sum=sum+i;
			}
			if((i%2)==0)
			{
				sum1=sum1+i;
			}
		}
		System.out.println("Sum of Odd Number : "+ sum);
		System.out.print("Sum of Odd Number : "+ sum1);
	}

}
