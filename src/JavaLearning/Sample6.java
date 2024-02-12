package JavaLearning;

public class Sample6 extends Example6{
	void Add(int a, int b)
	{
		super.Add(10, 20);
		System.out.println();
		System.out.println("Add(int,int) in Sample");
		System.out.println("The addition of"+a+"and"+b+"is:"+(a+b));
	}

	public static void main(String[] args) {
		Sample6 s= new Sample6();
	    s.Add(10, 10);
		s.sub(30,10);
		System.out.println();
		Example6 e= new Sample6();
		e.Add(10, 10);
		e.sub(30,10);
	}

}
class Example6
{
	void Add(int a, int b)
	{
		System.out.print("Example Add(int,int):"+(a+b));
	}
	void Add(int a, int b,int c)
	{
		System.out.print("Example Add(int,int):"+(a+b));
	}
	void sub(int a, int b)
	{
		System.out.println("Example sub(int,int)"+(a-b));
	}
}

