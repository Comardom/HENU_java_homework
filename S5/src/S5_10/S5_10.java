package S5_10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class S5_10
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		for(int i=0;i<10;i++)
		{
			list.add(in.nextLine());
		}
		Iterator<String> it = list.iterator();
		while(it.hasNext())
		{
			String item = it.next();
			System.out.println(item);
		}
		ArrayList<String> seen = new ArrayList<>();
		it = list.iterator();
		while (it.hasNext())
		{
			String current = it.next();
			if (seen.contains(current))
			{
				it.remove();
			}
			else
			{
				seen.add(current);
			}
		}
		it = list.iterator();
		while(it.hasNext())
		{
			String item = it.next();
			System.out.println(item);
		}
	}
}
//使用ArrayList集合，向集合中添加10个整数，并使用Iterator遍历该集合，并查找键盘输入的元素。提示：
//•	使用add()方法将元素添加到ArrayList集合中。
//•	调用集合的iterator()方法获得Iterator对象，并调用Iterator的hasNext()和next()方法，
// 	迭代出集合中的所有元素，完成查找功能，并将重复的元素删除。