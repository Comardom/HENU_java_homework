// package S2_5;

import java.util.Scanner;

public class S2_5_1
{
	public static void main(String[] args)
	{
		int[] arr = {10, 20, 30, 40, 50, 60, 70};

		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		int target = in.nextInt();

		int index = search(arr, target);

		if(index != -1)
		{
			System.out.println("Found at index: " + index);
		}
		else
		{
			System.out.println("Not found.");
		}

		in.close();
	}
	public static int search(int[] arr, int target)
	{
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] == target)
			{
				return i;
			}
		}
		return -1;
	}
}
