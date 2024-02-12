
public class Sample8 extends Example8{

	public static void main(String[] args) {
	     B8 b= new B8();
	     Example8 e = new B8();
	     B8 b1= new B8(10);
	     Example8 e1 = new B8(10);
	     b.Add();
	     e.Add();
	     System.out.println();
	     b1.Mul();
	     e1.Mul();
	     System.out.println();
	     
	     b.x=50;
	     b1.x=60;
	     
	     
	     System.out.println();
	     b.Add();
	     e.Add();
	     System.out.println();   
	     b1.Mul();
	     e1.Mul();
	     
	     System.out.println();
	     b.change();
	     b.Add();
	     e.Add();
	     b1.change();
	     System.out.println();   
	     b1.Mul();
	     e1.Mul();
   
	}
}
class Example8
{
	int x=10;
	int y=10;
	Example8()
	{
		System.out.println("Constructor Ec1");
	}
	Example8(int x)
	{
		System.out.println("Constructor Ec2");
	}
	void Add()
	{
		System.out.println("Example Add:"+(x+y));
	}
	void Mul()
	{
		System.out.println("Example Multiply: "+(x*y));
	}
	
}
class B8 extends Example8
{
	int x=20;
	int y=30;
	B8()
	{
		System.out.println("Constructor Bc1");
	}
	B8(int x)
	{
		System.out.println("Constructor Bc2");
	}
	void Add()
	{
		super.Add();
		System.out.println("B class Add:"+(x+y));
	}
	void Mul()
	{
		super.Mul();
		System.out.println("B class Multiply: "+(x*y));
	}
	void change()
	{
		super.x=70;
		super.y=90;
	}
}
