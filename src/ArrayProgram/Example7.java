package ArrayProgram;

public class Example7 {

	public static void main(String[] args) {
		int[] a= {10,120,195,122,33};
		int len=a.length;
		int fmax=0;
		int smax=0;
		fmax=a[0];
		smax=a[0];
		for(int i=1;i<=len-1;i++)
		{
			if(fmax<a[i])
			{
				smax=fmax;
				fmax=a[i];
				
			}else if(smax<a[i])
			{
				smax=a[i];
			}
		}
        System.out.println(fmax);
        System.out.println(smax);
	}

}
