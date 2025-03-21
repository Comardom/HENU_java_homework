// package S2_3;

import java.util.Scanner;

public class S2_3_1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);


		System.out.println("Harmonic series, with limited precision.");
		int acc = in.nextInt();
		HarmonicSeries aDemo = new HarmonicSeries(acc,true);
//		HarmonicSeries aDemo = new HarmonicSeries(acc,false);
		System.out.println(aDemo.getSum());
	}
}
class HarmonicSeries
{
	private int accuracy = 0;
	private double sum = 0.0;
	public HarmonicSeries()
	{
		return;
	}
	public HarmonicSeries(int acc, boolean ifDoWhile)
	{
		this.accuracy = acc;
		if(ifDoWhile)
		{
			int i = 0;
			do
			{
				sum+=(1.0/(double)(i+1));
				i++;
			}while(i<accuracy);
		}
		else
		{
			for(int i=0;i<accuracy;i++)
			{
				sum+=(1.0/(double)(i+1));
			}
		}
	}

	public double getSum()
	{
		return sum;
	}
}
