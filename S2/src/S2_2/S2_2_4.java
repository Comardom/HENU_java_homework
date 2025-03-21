package S2_2;

import java.util.Scanner;

public class S2_2_4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);


		System.out.println("Plz enter your kms to get your bill.");
		double km = in.nextDouble();
		MoneyOfTaxi aTrip = new MoneyOfTaxi(km);
		System.out.println("Money you need to pay is: "+
				"￥"+aTrip.getSum());


		in.close();
	}
}
class MoneyOfTaxi
{
	private static final double BASE = 5.0;
	private static final double[] LEVEL_A = new double[]{2.0,1.3};
	private static final double[] LEVEL_B = new double[]{9.0,2.0};
	private static final double OIL_TAX = 1.0;
	private double sum = 0.0;
	private double km = 0.0;


	public MoneyOfTaxi()
	{
		return;
	}
	public MoneyOfTaxi(double km)
	{
		this.km = Math.abs(km);
		if(this.km< LEVEL_A[0])
		{
			sum = BASE + OIL_TAX;
		}
		else if(this.km< LEVEL_B[0])
		{
			sum = BASE + (this.km - LEVEL_A[0])* LEVEL_A[1] + OIL_TAX;
		}
		else
		{
			sum = BASE + (LEVEL_B[0] - LEVEL_A[0])* LEVEL_A[1] +
					(this.km - LEVEL_B[0])* LEVEL_B[1] + OIL_TAX;
		}
	}


	public double getSum()
	{
		return sum;
	}
}