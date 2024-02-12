package StringPrograms;

public class Test1 {

	public static void main(String[] args) {
		int[] a= {1,2,3,5};
		int total=0;
		int count=0;
		for(int i=0;i<=a.length-1;i++)
		{
			count=count+a[i];
		}
		for(int i=0;i<=5;i++)
		{
			
			total=total+i;
		}
		int result=total-count;
		System.out.println(count);
		System.out.println(total);
		
		System.out.println("Missing number "+result);
				
	}

}
