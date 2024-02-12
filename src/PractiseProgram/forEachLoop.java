package PractiseProgram;

public class forEachLoop {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int x:num)
		{
			sum+=x;
		}
		System.out.println(sum);

	}

}
