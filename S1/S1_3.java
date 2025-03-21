import java.math.*;
import java.util.*;

public class S1_3
{
	public static void main(String[] args)
	{
//		Now register for the standard input flow
		Scanner in = new Scanner(System.in);
		System.out.println("Hello! This programme is to calculate the 「n!」.\n"
		+"Plz enter the number you wanna calculate.");
		int numWannaBeFactorized = in.nextInt();
//		Fill it with the return value
		System.out.println(Factorial(numWannaBeFactorized));
	}
	private static BigInteger Factorial(int n)
	{
		BigInteger sum = BigInteger.ONE;
//		Here i can't start with 1
		for(int i=1;i<n;i++)
		{
//			sum*=(n-i);
			sum=sum.multiply(BigInteger.valueOf(i));
		}
		return sum;
	}
}

