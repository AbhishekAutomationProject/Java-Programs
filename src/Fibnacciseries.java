
public class Fibnacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3;
		int length = 9;
		int i;
		System.out.println(n1+" "+n2);
		for(i=2;i<length;++i) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
