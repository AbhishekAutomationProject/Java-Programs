package ArrayProgram;

public class Example6 {

	public static void main(String[] args) {
		int[] a= {10,120,195,122,33};
		int len=a.length;
		int big=0;
		for(int i=0;i<=len-1;i++)
		{
			for(int j=i+1;j<=len-1;j++)
			{
				if(a[i]>a[j])
				{
				big=a[i];
				a[i]=a[j];
				a[j]=big;
				}
			}
		}
        System.out.print("the Big Number is : "+big);
	}

}
