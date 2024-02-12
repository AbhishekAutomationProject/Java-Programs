package ArrayProgram;

import java.util.Arrays;

public class Example8 {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int len=a.length;
		for(int i=0,j=len-1;i<(len/2);i++,j--)
		{
		   int tem=a[i];
		   a[i]=a[j];
		   a[j]=tem;
		}
		System.out.print(Arrays.toString(a));
	}

}
