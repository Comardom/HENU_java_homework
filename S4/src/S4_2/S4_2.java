package S4_2;

import java.math.BigDecimal;

public class S4_2
{
	public static void main(String[] args)
	{
//		定义一个类，在类中声明成员变量和成员方法，尝试使用final关键词修饰类中的变量、方法及该类，
//		测试并查看结果，必要时加以注释。（练习目标：final关键字的应用）
		new aClass().showPI();
	}
}
final class aClass//不可继承
{
	int anInt;
	final BigDecimal PI_HERE = BigDecimal.valueOf(10.0/3.0);//不可改动
	public final void showPI()//不可override
	{
		System.out.println(PI_HERE);
	}
}