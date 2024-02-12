package JavaLearning;

public class Sample5 extends Example5{
	static void m1()
	{
		System.out.println("Sample m1");
	}
	void m2()
	{
		System.out.println("Sample m2");
	}
	void m4(String s)
	{
		System.out.println("Sample m4(String-pram)");
	}

	public static void main(String[] args) {
		Sample5 s = new Sample5();
		s.m1();
		s.m2();
		s.m3();
		s.m4();
		s.m4("HK");
		
		Example5 s1 = new Sample5();
		s1.m1();
		s1.m2();
		s1.m3();
		s1.m4();
//		s1.m4("HK");

	}

}
class Example5
{
	static void m1()
	{
		System.out.println("Example m1");
	}
	void m2()
	{
		System.out.println("Example m2");
	}
	void m3()	{
		System.out.println("Example m3()");
	}
	void m4()
	{
		System.out.println("Example m4(no-pram)");
	}
}
