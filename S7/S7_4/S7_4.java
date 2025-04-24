package S7_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S7_4
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		List<Student> students = new ArrayList<>();

		System.out.println("请输入5个学生的信息（姓名 成绩）：");
		for (int i = 0; i < 5; i++)
		{
			System.out.print("第" + (i + 1) + "个学生：");
			String name = in.next();
			double score = in.nextDouble();
			students.add(new Student(name, score));
		}

		// 按成绩从高到低排序
		students.sort((a, b) -> Double.compare(b.score, a.score));

		File file = new File("/mnt/students.txt");

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)))
		{
			for (Student student : students)
			{
				writer.write(student.toString());
				writer.newLine();
			}
		}
		catch (IOException e)
		{
			System.out.println("写入文件时发生错误：" + e.getMessage());
		}

		System.out.println("\n文件内容如下：");
		try (BufferedReader reader = new BufferedReader(new FileReader(file)))
		{
			String line;
			while ((line = reader.readLine()) != null)
			{
				System.out.println(line);
			}
		}
		catch (IOException e)
		{
			System.out.println("读取文件时发生错误：" + e.getMessage());
		}
	}
}
//向指定的txt文件中写入键盘输入的内容，然后再重新读取该文件的内容，显示到控制台上。
//键盘录入5个学生信息(姓名, 成绩)，按照成绩从高到低追加存入上述的文本文件中。
class Student
{
	String name;
	double score;

	Student(String name, double score)
	{
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString()
	{
		return "Student{" +
				"name='" + name + '\'' +
				", score=" + score +
				'}';
	}
}