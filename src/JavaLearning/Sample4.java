package JavaLearning;

public class Sample4 extends Example4{
    int x=20;
    int y=30;
    void m2()
    {
    	int x=30;
    	int y=40;
    	System.out.println("m2 method x value: "+x);
    	System.out.println("m2 method y value: "+y);
    	
    	System.out.println("m2 method x value: "+this.x);
    	System.out.println("m2 method y value: "+this.y);
    }
    void m3()
    {
    	int x=50;
    	int y=60;
    	System.out.println("m3 method x value: "+x);
    	System.out.println("m3 method y value: "+y);
    	
    	System.out.println("m3 method x value: "+this.x);
    	System.out.println("m3 method y value: "+this.y);
    	
    	System.out.println("m3 method x value: "+super.x);
    	System.out.println("m3 method y value: "+super.y);
    }
	public static void main(String[] args) {
		Sample4 s= new Sample4();
		s.m1();
		s.m2();
		s.m3();
	}

}
class Example4
{
	int x=10;
	int y=20;
	void m1()
	{
		System.out.println("Parent Class m1");
	}
}
