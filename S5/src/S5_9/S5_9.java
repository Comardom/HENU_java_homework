package S5_9;

import java.util.ArrayList;

public class S5_9
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		StringBuffer s = new StringBuffer("hello");
		list.add("hello");list.add(String.valueOf(123));
		list.add(String.valueOf(6.9));list.add("hello");
		list.add("Hello");list.add(s.toString());
		for(String s1 : list)
		{
			System.out.println(s1);
		}
		int index = list.indexOf("hello");
		System.out.println("hello:"+" : "+index);
		list.remove("hello");
		int index1 = list.indexOf("123");
		list.set(index, "1000");
	}
}
//将下列数据：“hello”、123、6.9、“hello”、“”、“Hello”、StringBuffer s=new StringBuffer(“hello”)中的s，添加到一个ArrayList对象中。。
//		•	将ArrayList中的所有元素打印输出。
//		•	查找元素“hello”。
//		•	删除指定的元素“hello”。
//		•	将元素123替换为1000。