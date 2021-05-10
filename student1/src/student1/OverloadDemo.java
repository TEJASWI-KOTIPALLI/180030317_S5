package student1;
class Overload
{
	void add()
	{
		System.out.println("no parameters");
	}
	void add(int a)
	{
		System.out.println("a="+a);
	}
	int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	float add(float a,float b)
	{
		float d=a+b;
		return d;
	}
	double add(double a,double b)
	{
		double e=a+b;
		return e;
	}
}
public class OverloadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload ob=new Overload();
		ob.add();
		ob.add(4);
		int x=ob.add(40, 50);
		System.out.println("sum="+x);
		float y=ob.add(15.0f, 20.0f);
		System.out.println("sum="+y);
		double z=ob.add(20.0, 30.0);
		System.out.println("sum="+z);
		

	}

}