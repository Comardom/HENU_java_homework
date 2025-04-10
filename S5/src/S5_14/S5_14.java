package S5_14;

import java.util.*;

public class S5_14
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		ArrayList<Integer> who = new ArrayList<>();
		ArrayList<Integer> howMany = new ArrayList<>();
		for(;;)
		{
			int tmp;
			tmp=in.nextInt();
			if(tmp==0)
			{
				break;
			}
			else
			{
				if (set.add(tmp))
				{
					// 第一次出现
					who.add(tmp);
					howMany.add(1);
				}
				else
				{
					// 已出现过，找到对应的索引，次数+1,此时不需要再who.add(tmp);
					int index = who.indexOf(tmp);
					howMany.set(index,howMany.get(index)+1);
				}
			}
		}
		// 先找最大值
		int max = Collections.max(howMany);
		// 再找所有等于最大值的元素
		List<Integer> maxElements = new ArrayList<>();
		for(int i = 0; i < howMany.size(); i++)
		{
			if (howMany.get(i) == max)
			{
				maxElements.add(who.get(i));
			}
		}
		//输出有谁
		for(int num:maxElements)
		{
			System.out.println(num);
		}
	}
}

//编写一个程序，读取个数不定的整数，然后查找其中出现频率最高的数字。
// 要求通过键盘输入数据，当输入为0时，表示结束输入。
// 如： 如果输入的数据是2   3   40   3   54   -3   3   3   2   0，
// 那么数字3的出现频率是最高的。如果出现频率最高的数字不是一个而是多个，则应该将它们全部输出。
// 例如当数据是9  30  3  9  3  2  4时，3和9都出现了两次，3和9都应该输出。
//提示：可以利用集合的元素不能重复这一特性。