package ArrayProgram;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		int[] a= {10,10,20,30,40,40,50};
		int[] newArray= removeDuplicates(a);
		System.out.println("Original String"+Arrays.toString(a));
		System.out.println("After Removing Duplicates"+Arrays.toString(newArray));
		
	}
public static int[] removeDuplicates(int[] a)
{
	 int j=0; 
     int len= a.length-1;
      for(int i=0;i<len;i++)
        {
	           if(a[i]!=a[i+1]) 
	           {
	        	   a[j++]=a[i];
	           }
         }
      if(a[j]!=a[len])
	    a[j++]=a[len];
 return Arrays.copyOf(a,j);
}
}