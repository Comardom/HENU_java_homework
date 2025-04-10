package S5_7;

import java.util.Scanner;

public class S5_7
{
	public static void main(String[] args)
	{
		System.out.println("Enter year.");
		Scanner in = new Scanner(System.in);
		Leap aYear = new Leap(in.nextInt());
		if(aYear.getIfLeap())
		{
			System.out.println("Feb, 29days.");
		}
		else
		{
			System.out.println("Feb, 28days.");
		}
	}
}
//二月是一个有趣的月份，平年的二月有28天，闰年的二月有29天。
// 编写一个程序，从键盘输入年份，根据输入的年份计算这一年的二月有多少天。
class Leap
{
	private int year = 1582;
	public Leap()
	{
		System.out.println("Plz enter a year.");
	}
	public Leap(int year)
	{
		this.year = year;
	}
	public boolean getIfLeap()
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
