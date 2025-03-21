package S2_2;

import java.util.Scanner;

public class S2_2_3
{
	public static void main(String[] args)
	{
//		不：  100 3200
//		闰：4 400 172800
//		1582
		Scanner in = new Scanner(System.in);


		System.out.println("Enter a year with a month "+
				"(space/return/enter between), "+
				"and you'll get how many days it is.");
		int year = in.nextInt();
		int month = in.nextInt();
		Days aDemo = new Days(year,month);
		System.out.println(year+", "+month +", "+aDemo.getDaysNeedToShow());


		in.close();
	}
}
class Leap
{
	private int year = 1582;
	protected Leap()
	{
		System.out.println("Plz enter a year.");
	}
	protected Leap(int year)
	{
		this.year = year;
	}
	protected boolean getIfLeap()
	{
		if(this.year <= 1582)
		{
			System.out.println("Long long ago, "+
					"there was not leap years like today……");
		}
		else
		{
			if(this.year%4==0)
			{
				if(this.year%100==0)
				{
					if(this.year%400==0)
					{
						if(this.year%3200==0)
						{
							if(this.year%172800==0)
							{
								return true;
							}
							else
							{
								return false;
							}
						}
						else
						{
							return true;
						}
					}
					else
					{
						return false;
					}
				}
				else
				{
					return true;
				}
			}
		}
		return false;
	}
}
class Days
{
	private int year = 1582;
	private int month = 0;
	private int[] daysOfPeace = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int[] daysOfLeap = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int daysNeedToShow = 30;


	public Days()
	{
//		this(123);
		System.out.println("Maybe there're something wrong.");
	}
	public Days(int random)
	{
		this();
	}
	public Days(int year,int month)
	{
		this.year = year;
		this.month = month;
		if(month>=13 || month<=0)
		{
			System.out.println("Error.");
			return;
		}
		if(registerYear(this.year))
		{
			daysNeedToShow = daysOfLeap[this.month-1];
		}
		else
		{
			daysNeedToShow = daysOfPeace[this.month-1];
		}
	}
	private boolean registerYear(int year)
	{
		Leap ifLeap = new Leap(year);
		return ifLeap.getIfLeap();
	}
	public int getDaysNeedToShow()
	{
		return daysNeedToShow;
	}
}