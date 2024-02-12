
public class Demo4 {

	public static void main(String[] args) {
		String s="Abhishek is working in software engineer";
		String result1=reverseSentense(s);
		String result2=reverseWords(s);
		String result3=reverseSequence(s);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	public static String reverseSentense(String s)
	{
		char[] ch=s.toCharArray();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
		}
		return rev;
	}
	public static String reverseWords(String s)
	{
		String[] words=s.split(" ");
		String rev="";
		for(int i=0;i<=words.length-1;i++)
		{
			String word=words[i];
			String revw="";
			for(int j=word.length()-1;j>=0;j--)
			{
				revw=revw+word.charAt(j);
			}
			rev=rev+revw+" ";
		}
		return rev;
		
	}
	public static String reverseSequence(String s)
	{
		String[] words=s.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++)
		{
			if(i == words.length-1)
				rev=words[i]+rev;
			else
				rev=" "+words[i]+rev;
		}
		return rev;
	}
}
