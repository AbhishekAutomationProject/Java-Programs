
public class Demo3 {

	public static void main(String[] args) {
		String s="Abhishek is damn nice";
		String rev="";
		String[] words=s.split(" ");
		for(int i=0;i<words.length;i++)
		{
			if(i==words.length-1)
			{
				rev=words[i]+rev;
			}
			else
			{
				rev=" "+words[i]+rev;
			}
		}
		System.out.println(rev);
		

	}

}
