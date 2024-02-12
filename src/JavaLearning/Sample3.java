package JavaLearning;

public class Sample3 extends new1{
	String s="abc";
	int x=10;
	void m1()
	{
		System.out.println("Subclass m1");
	}
	void m2()
	{
		System.out.println("Subclass m2");
	}
	void m3()
	{
		System.out.println("Subclass m3");
	}

	public static void main(String[] args) {
		Sample3 s= new Sample3();
		  
		  System.out.println(s.s);
		  System.out.println(s.x);
		  s.m1();
		  s.m2();
		  s.m3();
		  s.m4();

	}

}
class new1
{
	String s="abc";
	int x=10;
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
	void m4()
	{
		System.out.println("Parent m4");
	}
	
}