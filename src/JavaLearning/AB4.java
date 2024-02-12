package JavaLearning;

public class AB4 {
	static{
		System.out.println("Test AB4 is loaded");
	}

	public static void main(String[] args) {
		
           B4 b= new B4();
           C4 c= new C4();
           b.a=15;
           b.x=16;
           System.out.println("b1.a: "+b.a);
           System.out.println("c1.a: "+b.a);
           
           System.out.println("b1.x: "+b.x);
           System.out.println("c1.x: "+b.x);
	}

}
class A4
{
	static int a=10;
	int x=20;
	static{
		System.out.println("A is loaded");
	}
	
}
class B4 extends A4
{
	static int b=30;
	int x=40;
	static{
		System.out.println("B is loaded");
	}
	
}
class C4 extends A4
{
	static int c=50;
	int x=60;
	static{
		System.out.println("C is loaded");
	}
}
