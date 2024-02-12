
public class Duplicatedigit {

	public static void main(String[] args) {
		int i=12345;
		int digit=0;
		while(i!=0) {
			digit=i%10;
			i=i/10;
//			System.out.print(digit);
		}
		System.out.println(digit);	
	}

}
