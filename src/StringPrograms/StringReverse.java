package StringPrograms;

public class StringReverse {

	public static void main(String[] args) {
		String s="bcda";
//		StringBuilder sb = new StringBuilder();
		char ch;
		int len=s.length();
		for(int i=len-1;i>=0;i--)
		{
			ch=s.charAt(i);
			System.out.print(ch);
		}
//        System.out.println(sb);
	}

}
