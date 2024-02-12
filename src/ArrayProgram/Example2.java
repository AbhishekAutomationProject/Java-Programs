package ArrayProgram;

public class Example2 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] b= new int[a.length];
		int sum=0;
        int len=a.length;
        for(int i=0;i<=len-1;i++)
        {
        	sum+=a[i];
        	System.out.println(a[i]);
         	
        }
        System.out.println("Sum is :"+sum);
        for(int x:a)
        {
        	System.out.print(x);
        }
        for(int i=0;i<=len-1;i++)
        {
        	b[i]=a[i];
        	System.out.println(b[i]);
         	
        }
        
	}

}
