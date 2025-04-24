package S7_6;

import java.io.*;
import java.util.Arrays;

public class S7_6
{
	public static void main(String[] args)
	{

	}
}
//已知s.txt文件中有这样的一个字符串：“hcexfgijkamdnoqrzstuvwybpl”，
// 请编写程序读取数据内容，把数据排序后写入ss.txt中。
class SortFileContent
{
	public static void main(String[] args)
	{
		try
		{
			// 读取文件 s.txt 中的内容
			BufferedReader reader = new BufferedReader(new FileReader("/mnt/1.txt"));
			String line = reader.readLine();  // 读取第一行字符串
			reader.close();

			if (line != null)
			{
				// 将字符串转换为字符数组并排序
				char[] chars = line.toCharArray();
				Arrays.sort(chars);

				// 写入到 ss.txt 文件
				BufferedWriter writer = new BufferedWriter(new FileWriter("/mnt/2.txt"));
				writer.write(chars);
				writer.close();

				System.out.println("排序完成，结果已写入 ss.txt");
			}
			else
			{
				System.out.println("s.txt 文件为空");
			}
		}
		catch (IOException e)
		{
			System.out.println("发生错误：" + e.getMessage());
		}
	}
}