package JavaLearning;

public class B3 extends A3{
	int x=30;
	int y=40;
	void m2()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		B3 b1= new B3();
		B3 b2 = new B3();
		b2.x=50;
		b2.y=60;
        b1.m1();
        b1.m2();
        System.out.println();
        b2.m1();
        b2.m2();
        
	}

}
class A3
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
