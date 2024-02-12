
public class NumberOfDigitCount {

	public static void main(String[] args) {
		int i = 1234564521;
		int count=0;
		while(i!=0)
		{
		
			i=i/10;
			count++;
		}
		System.out.println(count);
}

}
