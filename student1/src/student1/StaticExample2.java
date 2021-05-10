package student1;

public class StaticExample2 
{
	StaticExample2()
	{
		System.out.println("constructor");
	}
	static
	{
		System.out.println("static block 3");
	}
	static void show()
	{
		System.out.println("static method");
	}
	static
	{
		System.out.println("static block 1");
	}
     public static void main(String[] args)
     {
    	 System.out.println("main method");
    	 StaticExample2 sc=new StaticExample2();
    	 StaticExample2.show();
     }
    	 static
    	 {
    		 System.out.println("static block 2");
    	 }
     }
