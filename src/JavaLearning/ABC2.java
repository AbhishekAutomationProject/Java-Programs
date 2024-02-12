package JavaLearning;

public class ABC2 extends C7 {
	static void m1()
	{
		System.out.println(" D m1");
	}
	static void m2()
	{
		System.out.println(" D m2");
	}
	static void m4()
	{
		System.out.println(" D m4");
	}

	public static void main(String[] args) {
		ABC2 a = new ABC2();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}

}
class A7
{
static void m1()
{
	System.out.println(" A m1");
}
static void m2()
{
	System.out.println(" A m2");
	m1();
}
}
class B7 extends A7
{
	static void m1()
	{
		System.out.println(" B m1");
	}
	void m3()
	{
		System.out.println("B m3");
		m1();
		super.m2();
	}	
}
class C7 extends B7
{
	static void m2()
	{
		System.out.println(" C m2");
		
	}
	
}
