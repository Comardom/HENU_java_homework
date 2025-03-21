package S2_2;

import java.util.Scanner;

public class S2_2_2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);


		System.out.println("Enter the year to determine the zodiac sign.");
		int tmpYear = 0;
		tmpYear = in.nextInt();
		Zodiac aUser = new Zodiac(tmpYear);
		System.out.println(aUser.getZodiac());

		in.close();
	}
}
class Zodiac
{
	private int userYear = 0;
	private int userMod = 0;

	public Zodiac()
	{
		System.out.println("Hey. Error.");
	}
	public Zodiac(int year)
	{
		this.userYear = Math.abs(year);
	}


	public String getZodiac()
	{
		switch(userYear%12)
		{
			case 0:return "猴";
			case 1:return "鸡";
			case 2:return "狗";
			case 3:return "猪";
			case 4:return "鼠";
			case 5:return "牛";
			case 6:return "虎";
			case 7:return "兔";
			case 8:return "龙";
			case 9:return "蛇";
			case 10:return "马";
			case 11:return "羊";
			default:System.out.println("Error.");
		}
		return "";
	}
}