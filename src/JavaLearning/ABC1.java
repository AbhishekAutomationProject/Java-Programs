package JavaLearning;

public class ABC1 extends C6{
	void m1()
	{
		System.out.println(" D m1");
	}
	void m2()
	{
		System.out.println(" D m2");
	}
	void m4()
	{
		System.out.println(" D m4");
	}

	public static void main(String[] args) {
		ABC1 a = new ABC1();
		a.m1();
		a.m2();
		a.m3();
		a.m4();

	}

}
class A6
{
void m1()
{
	System.out.println(" A m1");
}
void m2()
{
	System.out.println(" A m2");
	m1();
}
}
class B6 extends A6
{
	void m1()
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
class C6 extends B6
{
	void m2()
	{
		System.out.println(" C m2");
		
	}
	
}