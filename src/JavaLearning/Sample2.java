package JavaLearning;

public class Sample2 extends A {
	String s="s...abc";
	int x=10;
	void m1()
	{
		super.m1();
		System.out.println("Subclass m1");
	}
	void m2()
	{
		System.out.println("Subclass m2");
		super.m2();
	}
	void m4()
	{
		System.out.println(super.s+"..."+s);
		System.out.println(super.x+"..."+x);
		super.m1();
		m1();
		super.m2();
		m2();
	}
	public static void main(String[] args) {
	  Sample2 s= new Sample2();
	  s.m4();
	}
	
}
class A
{
	String s="p..abc";
	int x=20;
	void m1()
	{
		System.out.println("Parent m1");
	}
	void m2()
	{
		System.out.println("Parent m2");
	}
	void m3()
	{
		System.out.println("Parent m3");
	}
	
}