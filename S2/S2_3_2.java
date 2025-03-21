// package S2_3;

import java.util.Scanner;

public class S2_3_2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Let your turtle climb!"+
				"Plz enter the length you wanna it climbing.");
		int length = in.nextInt();
		Turtle aTurtle = new Turtle(length);

		in.close();
	}
}
class Turtle
{
	private static final int UP_BASE = 4;
	private static final int DOWN_BASE = 1;

	public Turtle()
	{
		System.out.println("Your turtle will die 'cause of infinite climbing.");
	}
	public Turtle(int length)
	{
		System.out.println("Now your turtle is ready to climb.");
		int metre = 0;
		int time = 0;
		while(true)
		{
			System.out.printf("Now it has used %d hour", time);
			System.out.println(time >=2?"s.":".");

			System.out.printf("Now it has climbed %d metre",metre);
			System.out.println(metre >=2?"s.":".");

			metre+=UP_BASE;
			System.out.println("Up 4 metres!");
			if(metre>=length)
			{
				System.out.println("Congratulations!");
				System.out.printf("Now it has used %d hour", time);
				System.out.println(time >=2?"s.":".");
				break;
			}
			metre-=DOWN_BASE;
			System.out.println("Down 1 metres!");
			System.out.printf("Now it has climbed %d metre",metre);
			System.out.println(metre >=2?"s.":".");
			time++;
		}
	}
}
