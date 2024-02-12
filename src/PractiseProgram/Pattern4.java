package PractiseProgram;

public class Pattern4 {

	public static void main(String[] args) {
		int r=5;
		for(int i=r;i>=1;i--)
		{
			for(int j=r;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
