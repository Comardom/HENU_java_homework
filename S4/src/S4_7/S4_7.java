package S4_7;

public class S4_7
{
	public static void main(String[] args)
	{
		Son son = new Son();
		son.method();
	}
}
class Parent
{
	Parent()
	{
		System.out.println("Parent's Constructor without parameter");
	}
	Parent(boolean b)
	{
		System.out.println("Parent's Constructor with a boolean parameter");
	}
	public void method()
	{
		System.out.println("Parent's method()");
	}
}
class Son extends Parent
{
	Son()
	{
		super(true);
		System.out.println("Son's Constructor without parameter");
	}
	public void method()
	{
		System.out.println("Son's method()");
		super.method();
	}
}
//输出样例：
//Parent's Constructor with a boolean parameter
//Son's Constructor without parameter
//Son's method()
//Parent's method()