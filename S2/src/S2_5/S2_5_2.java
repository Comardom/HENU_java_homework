package S2_5;

public class S2_5_2
{
	public static void main(String[] args)
	{
		int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println("");
		}
		transpose(arr);
	}
	public static void transpose(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j][i]+ " ");
			}
			System.out.println("");
		}
	}
}
