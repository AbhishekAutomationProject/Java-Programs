
public class RecurringNumber {

	public static void main(String[] args) {
		 int  n=31698891;
		 int  prev_digit=n%10;
		 int  res=prev_digit;
		 int pow=10;
		 while(n!=0)
		 {
			 int curr_digit=n%10;
			 if(curr_digit!=prev_digit)
			 {
				res=res+curr_digit*pow;
				prev_digit=curr_digit;
				 pow=pow*10;
				 
			 }
			 n=n/10;
		 }
		 System.out.print(res);

	}

}
