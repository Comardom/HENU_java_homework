package S2_1;

import java.util.Scanner;

public class S2_1_2
{
	public static void main(String[] args)
	{
		System.out.println("Hello! Plz give me 3 numbers,"
		+"and I'll give you the MAX.");
		Scanner in = new Scanner(System.in);
		Max maxObject = new Max(in);
		System.out.println(maxObject.getMax());
		in.close();
	}
}
class Max
{
	private double[] num = new double[3];
//	private double max=0;
	public Max(Scanner in)
	{
		for(int i = 0; i<num.length; i++)
		{
			this.num[i] = in.nextDouble();
		}
	}
	public double getMax()
	{
		//这里可以用两次Math.max,但是为了符合要求用了?:运算
		return Math.max((num[0] > num[1] ? num[0] : num[1]), num[2]);
	}
}