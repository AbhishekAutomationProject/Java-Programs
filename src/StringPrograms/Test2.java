package StringPrograms;

import net.bytebuddy.build.AndroidDescriptor;

public class Test2 {

	public static void main(String[] args) {
		String string="Auto@!m#tion";
		String revString=" ";
		char[] ch=string.toCharArray();
		for(int i=string.length()-1;i>=0;i--)
		{
			if(ch[i]!='@'&& ch[i]!='!' && ch[i]!='#')
			{
			revString=revString+ch[i];
			}
		}
		System.out.println("reversed string is " +revString );

	}

}
