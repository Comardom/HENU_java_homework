package S5_11;

import java.util.*;

public class S5_11
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		Random rand = new Random();
		while (list.size() < 10)
		{
			int num = rand.nextInt(101) + 350;
			if (!list.contains(num))
			{
				list.add(num);
			}
		}
		Set<Integer> set = new HashSet<>();
		rand = new Random();
		while (set.size() < 10)
		{
			int num = rand.nextInt(101) + 350;
			set.add(num);
		}
		for (int n : list)
		{
			System.out.print(n + " ");
		}
		for (int n : set)
		{
			System.out.print(n + " ");
		}
	}
}
//分别利用Arraylist和Set随机生成十个不重复的随机整数，随机整数范围为350到450。