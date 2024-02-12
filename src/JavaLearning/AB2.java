package JavaLearning;

public class AB2 {

	public static void main(String[] args) {
		B2 b= new B2();
		A2 a= new B2();
		System.out.println(b.x+"...."+b.y);
		System.out.println(a.x+"...."+a.y);
		System.out.println(B2.x+"...."+A2.x);
		
		b.x=5;
		a.x=6;
		
		System.out.println(b.x+"...."+b.y);
		System.out.println(a.x+"...."+a.y);
		System.out.println(B2.x+"...."+A2.x);

	}

}
class A2
{
	static int x=10;
	int y=20;
}
class B2 extends A2
{
	static int x=30;
	int y=40;
}
