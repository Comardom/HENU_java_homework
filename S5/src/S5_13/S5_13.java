package S5_13;

import java.util.Comparator;
import java.util.TreeSet;

public class S5_13
{
	public static void main(String[] args)
	{
		//这个东西是ai写的//好难
		TreeSet<Students> set = new TreeSet<>(
				new Comparator<Students>()
				{
					public int compare(Students s1, Students s2)
					{
						int result = s2.getScore() - s1.getScore();
						if(result == 0)
						{
							return s1.getName().compareTo(s2.getName());
						}
						return result;
					}
				}
		);
		set.add(new Students("A",50));
		set.add(new Students("B",60));
		set.add(new Students("D",60));
		set.add(new Students("C",40));
		for (Students s : set)
		{
			System.out.println(s.toString());
		}
	}
}
class Students
{
	private String name;
	private int score;
	public String getName()
	{
		return name;
	}
	public int getScore()
	{
		return score;
	}
	public Students(String name, int score)
	{
		this.name = name;
		this.score = score;
	}

	public String toString()
	{
		return "Students{" +
				"name='" + name + '\'' +
				", score=" + score +
				'}';
	}
}

//编写程序将一组学生对象的姓名和成绩存入到一个树集（TreeSet）中，完成以下要求：
//•	使得按照成绩自动降序排列，并输出排序的结果。