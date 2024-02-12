package JavaLearning;

public class AB1 {

	public static void main(String[] args) {
		B1 b= new B1();
		A1 a= new B1();
		System.out.println(b.x+"...."+b.y);
		System.out.println(a.x+"...."+a.y);
		
		b.x=5;
		a.x=6;
		
		System.out.println(b.x+"...."+b.y);
		System.out.println(a.x+"...."+a.y);
				
	}

}
class A1
{
	int x=10;
	int y=20;
}
class B1 extends A1
{
	int x=30;
	int y=40;
}
