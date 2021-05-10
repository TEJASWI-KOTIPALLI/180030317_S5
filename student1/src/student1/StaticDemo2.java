package student1;

class Student1
{
	int sid,marks;
	String name;
	static String college="KLU";
	Student1(int id,String n,int m)
	{
		sid=id;
		name=n;
		marks=m;
	}
	void  display()
	{
		System.out.println("student id:"+sid);
		System.out.println("student name:"+name);
		System.out.println("student marks:"+marks);
		System.out.println("student college:"+college);
		
		
		
		
	}
	static
	{
		college="KLUniversity";
	}
}
public class StaticDemo2 {
	public static void main(String args[])
	{
		Student1 s=new Student1(317,"teja",40);
		s.display();
	}

}
