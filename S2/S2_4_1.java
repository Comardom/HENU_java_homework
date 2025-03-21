// package S2_4;

import java.util.Scanner;

public class S2_4_1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int n = in.nextInt();
		in.nextLine();

		Student top = new Student("", Integer.MIN_VALUE);
		Student second = new Student("", Integer.MIN_VALUE);

		for(int i = 0; i < n; i++)
		{
			System.out.print("Enter student name: ");
			String name = in.nextLine();
			System.out.print("Enter student score: ");
			int score = in.nextInt();
			in.nextLine();

			if(score > top.score)
			{
				second = top;
				top = new Student(name, score);
			}
			else if(score > second.score)
			{
				second = new Student(name, score);
			}
		}

		System.out.println("Top student: " + top.name + " (" + top.score + ")");
		System.out.println("Second top student: " + second.name + " (" + second.score + ")");

		in.close();
	}
}
class Student
{
	String name;
	int score;

	public Student(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
}
