package JavaLearning;

public class Sample7 extends Example7 {

	public static void main(String[] args) {
		Sample7 s = new Sample7();
		s.setInt(20);
		s.setName("Abhi");
		System.out.println(s.getInt());
		System.out.println(s.getName());
	}

}
class Example7
{
	private int x=10;
	private String s="Abhisehk";
	
	int getInt()
	{
		return x;
	}
	String getName()
	{
		return s;
	}
	void setInt(int x)
	{
		this.x=x;
	}
	void setName(String s)
	{
		this.s=s;
	}
	
}
