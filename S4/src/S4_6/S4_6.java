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
	// 使用匿名内部类实现 Inner 接口
	public static Inner method()
	{
		return new Inner()
		{
			@Override
			public void introduce()
			{
				System.out.println("实现了Inner接口的匿名内部类！");
			}
		};
	}
}
class InnerClassTest
{
	public static void main(String[] args)
	{
		Outer.method().introduce();
	}
}