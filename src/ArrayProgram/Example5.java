package ArrayProgram;

public class Example5 {

	public static void main(String[] args) {
		int[] a= {10,20,80,40,50};
		int big1 = 0;
		int len=a.length;
		int big=a[0];
		for(int i=0;i<=len-1;i++)
		{
			if(a[i]>big)
			{
				big=a[i];
			}
			big1=big;
		}
		System.out.println("Big Number is : "+big1);
		
	}
}
