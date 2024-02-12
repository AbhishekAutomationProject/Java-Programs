
public class ReversingTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Akshata";
		String rev=" ";
		char ch;
		System.out.println("the origional string is :"+s);
		System.out.println();
		
		for(int i=s.length()-1;i>=0;i--) {
			ch=s.charAt(i);
			rev=rev+ch;
			
		}
		System.out.println("reversed string is:"+rev);
	}

}
