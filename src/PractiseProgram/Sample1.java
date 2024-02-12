package PractiseProgram;

public class Sample1 extends Example1{
	Sample1()
	{
		super();
		System.out.println("Sample Zero-param");
	}
	Sample1(int a)
	{
		super();
		System.out.println("Sample int-param");
	}


	public static void main(String[] args) {
		Sample1 s = new Sample1();
		Sample1 s1 = new Sample1(10);
//		Example1 e= new Sample1();
       
	}

}
class Example1
{
	Example1(){
		System.out.println("Example Zero Prem");
		
	}
	Example1(int a)
	{
		System.out.println("Example int-param");
	}
	
}
