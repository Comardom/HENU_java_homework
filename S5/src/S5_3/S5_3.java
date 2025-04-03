package S5_3;

import java.util.ArrayList;
import java.util.Scanner;

public class S5_3
{
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("Now enter what you wanna say," +
				" and you'll get its " +
				"number of uppercase and lowercase letters and numbers.");
		int[] intArr = new int[4];
		intArr = Statistics.statistic(in.nextLine());
		System.out.println("Uppercase : "+intArr[0]);
		System.out.println("Lowercase : "+intArr[1]);
		System.out.println("Number : "+intArr[2]);
		System.out.println("Others : "+intArr[3]);
		in.close();
	}
}
class Statistics
{
	public static int[] statistic(String str)
	{
		ArrayList<Character> strArr = new ArrayList<>();
		for(char ch : str.toCharArray())
		{
			strArr.add(ch);
		}
		int[] intArr = new int[4];
		for(char ch : strArr)
		{
			if(ch>='A'&&ch<='Z')
			{
				intArr[0]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				intArr[1]++;
			}
			else if(ch>='0'&&ch<='9')
			{
				intArr[2]++;
			}
			else
			{
				intArr[3]++;
			}
		}
//		ps.以上这一堆可以写成如下形式，但是懒得改了
		/*for (char ch : str.toCharArray())
		{
			if (ch >= 'A' && ch <= 'Z')
			{
				intArr[0]++;
			} else if (ch >= 'a' && ch <= 'z')
			{
				intArr[1]++;
			} else if (ch >= '0' && ch <= '9')
			{
				intArr[2]++;
			} else
			{
				intArr[3]++;
			}
		}*/
		return intArr;
	}
}
