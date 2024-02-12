package ArrayProgram;

import java.util.Arrays;

public class Example4 {

	public static void main(String[] args) 
	{
		 int a[]= {10,20,30,40,50};
		 int b[]=a;
		 int c[]= {10,20,30,40,50};
		 int d[]= {60,70,80,90,100};
		 
		 if(a==b)
		 {
			 System.out.println("a and b are equal");
		 }
		 else
		 {
			 System.out.println("a and b are not equal");
		 }
		 if(a==c)
		 {
			 System.out.println("a and c are equal");
		 }
		 else
		 {
			 System.out.println("a and c are not equal");
		 }
		 if(a==d)
		 {
			 System.out.println("a and d are equal");
		 }
		 else
		 {
			 System.out.println("a and d are not equal");
		 }
		 
		 //using equal method
		 if(Arrays.equals(a,b))
		 {
			 System.out.println("a and b are equal");
		 }
		 else
		 {
			 System.out.println("a and b are not equal");
		 }
		 if(Arrays.equals(a,c))
		 {
			 System.out.println("a and c are equal");
		 }
		 else
		 {
			 System.out.println("a and c are not equal");
		 }
		 if(Arrays.equals(a,d))
		 {
			 System.out.println("a and d are equal");
		 }
		 else
		 {
			 System.out.println("a and d are not equal");
		 }


	}

}
