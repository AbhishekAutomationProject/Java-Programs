package ArrayProgram;

public class Example1 {
	static void m1(int[] a)
	{
	  a[1]=5;	
	}
	
	public static void main(String[] args) {
		 int[] a= {10,20,30,40};
		 int[] a2= {1,2};
		 m1(a);
		 m1(a2);
		
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
          for(int i=0;i<a2.length;i++) {
			
			System.out.println(a2[i]);
		}
		

	}

}
