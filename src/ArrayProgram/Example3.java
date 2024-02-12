package ArrayProgram;

public class Example3 {

	public static void main(String[] args) {
	int[] a= {10,20,30,40};
	int[] b= {40,30,20,10};
	int[] c= new int[a.length];
	for(int i=0;i<=a.length-1;i++)
	{
		c[i]=a[i]+b[i];
		System.out.println(c[i]);
	}
			

	}

}
