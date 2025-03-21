package S2_1;

import java.util.*;

public class S2_1_1
{
	public static void main(String[] args)
	{
		System.out.println("Hello! Plz enter 10 numbers, "
				+"and I'll give you the sum."
				+" Plz press ENTER to the next number, "
				+"and type 0 to end it.");
		Scanner in = new Scanner(System.in);
		Sum sumObject = new Sum(in);
		double sum = sumObject.getSum();
		System.out.println(sum);
		in.close();
	}
}
class Sum
{
//	private double[] num = new double[];
	private double sum = 0;
	public Sum(Scanner in)
	{
		int count = 0;  // 用来计数输入的数字个数
		while (true)
		{
			double num = in.nextDouble();
			if (num == 0)
			{
				break;
			}
			this.sum += num;
			count++;
		}
	}
	public double getSum()
	{
		return sum;
	}
}