package PractiseProgram;

public class Test3 {

	public static void main(String[] args) {
		int[] a= {10,11,12,14};
		int n=a.length+1;
		int expecnum=(n*(n+1))*2;
		int actualsum=0;
		for(int num:a)
		{
			actualsum+=num;
			System.out.println(actualsum);
		}
		int missingnumber = expecnum-actualsum;
		System.out.println(missingnumber);
		

	}

}
