package S4_6;

public class S4_6
{
	public static void main(String[] args)
	{
		;
	}
}
//把下面的代码补充完整，输出结果为“实现了Inner接口的匿名内部类！”，并测试输出结果。
interface Inner
{
	void introduce();
}

class Outer
{
	//补齐代码，完成方法主要功能
	public static Inner method()
	{
		class inInner implements Inner
		{
			public void introduce()
			{
				System.out.println("实现了Inner接口的匿名内部类！");
			}
		}
		return new inInner();
		//这一句是问ai的，ai还让我用匿名内部类和lambda表达式
	}
}

class InnerClassTest
{
	public static void main(String[] args)
	{
		Outer.method().introduce();
	}
}