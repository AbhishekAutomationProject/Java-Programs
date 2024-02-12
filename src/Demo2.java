
public class Demo2 {

	public static void main(String[] args) {
		String s="this is my good day";
		int len=s.length();
		char[] ch=s.toCharArray();
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		System.out.println(rev);

	}

}
