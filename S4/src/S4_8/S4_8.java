package S4_8;

public class S4_8
{
	public static void main(String[] args)
	{
		ShapeTest.testShapes();
	}
}
interface Shape
{
	double length();
}
class Triangle implements Shape
{
	private double a, b, c;
	public Triangle(double a, double b, double c)
	{
		if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a))
		{
			this.a = this.b = this.c = 0;
		}
		else
		{
			this.a = a;
			this.b = b;
			this.c = c;
		}
	}
	public double length()
	{
		return a + b + c; // 三角形周长
	}
}
class Rectangle implements Shape
{
	private double a, b;
	public Rectangle(double width, double height)
	{
		if (width <= 0 || height <= 0)
		{
			this.a = this.b = 0;
		}
		else
		{
			this.a = width;
			this.b = height;
		}
	}
	public double length()
	{
		return 2 * (a + b);
	}
}
class Circle implements Shape
{
	private double r;
	private static final double PI = 3.14;

	public Circle(double radius)
	{
		this.r = (radius > 0) ? radius : 0;
	}
	public double length()
	{
		return 2 * PI * r;
	}
}
class ShapeTest
{
	public static void testShapes()
	{
		Shape shape1 = new Triangle(3, 4, 5);
		System.out.println("abc: " + shape1.length());
		Shape shape2 = new Triangle(1, 2, 3);
		System.out.println("abc/0: " + shape2.length());
		Shape shape3 = new Rectangle(5, 10);
		System.out.println("abcd: " + shape3.length());
		Shape shape4 = new Circle(7);
		System.out.println("r: " + shape4.length());
		Shape shape5 = new Circle(-5);
		System.out.println("r/0: " + shape5.length());
	}
}
//（1）定义一个接口 Shape用于表示图形，其包含一个 double length()的方法用于求周长；
//（2定义三角形类Triangle、长方形类Rectangle、圆形类Circle分别实现接口Shape；
//（3）定义测试类ShapeTest并使用 Shape接口定义变量shape，用其指向不同类型的对象，输出各种图形的周长。
//提示：
//（1）计算圆周长时PI取3.14即可；
//（2）需要判断能否构成三角形（任意两个边的和大于第三边），不能构成三角形的话周长为0；
//（3）若输入数据中有0或负数，则不表示任何图形，周长为0。