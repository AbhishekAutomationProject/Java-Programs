package StringPrograms;

public class New {

	public static void main(String[] args) {
		String s ="Number of test failed are 1250 in the build #1234";
		int len=s.length();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=len-1;i++)
		{
		    char ch=s.charAt(i);
		    if(ch!='#')
		    {
		      if(ch=='0'||ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9')
		       {
		       	sb.append(ch);
		       }
		    }
		}
		System.out.print("Test count is :" +sb.toString());
	}

}
