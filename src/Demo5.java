
public class Demo5 {

	public static void main(String[] args) {
		
		int x=23;
		int n=4;
		split(x,n);
				
	}
	public static void split(int x,int n)
	{
		if(x<n)
		{
			System.out.println("Invalid input");
		}
		else if((x%n)==0)
		{
			for(int i=0;i<n;i++)
			{
				System.out.println(x/n+ " ");
			}
		}
		else
		{
			int zp=n-(x%n);
			int pp=x/n;
			for(int i=0;i<n;i++)
			{
				if(i>=zp)
				{
					System.out.println((pp+1)+" ");
				}
				else
				{
					System.out.println(pp+" ");
				}
			}
		}
	}

}
