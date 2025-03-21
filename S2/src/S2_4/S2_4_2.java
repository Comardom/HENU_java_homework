package S2_4;

import java.lang.Math.*;

public class S2_4_2
{
	public static void main(String[] args)
	{
		;
	}
}
class A
{
	public static void main(String[] args)
	{
		System.out.println("Max of 3 and 5: " + max(3, 5));

		System.out.println("Max of 2.5 and 7.8: " + max(2.5, 7.8));

		System.out.println("Max of 1.2, 3.4, 2.8: " + max(1.2, 3.4, 2.8));

	}
	public static int max(int a,int b)
	{
		return Math.max(a, b);
	}

	public static double max(double a, double b)
	{
		return Math.max(a, b);
	}

	public static double max(double a, double b,double c)
	{
		return Math.max(Math.max(a, b), c);
	}
}