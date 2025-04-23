package S6;

import java.util.Scanner;

public class S6
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		try
		{
			System.out.print("Enter side a: ");
			double a = scanner.nextDouble();

			System.out.print("Enter side b: ");
			double b = scanner.nextDouble();

			System.out.print("Enter side c: ");
			double c = scanner.nextDouble();

			if (!isValidTriangle(a, b, c))
			{
				throw new InvalidTriangleException("The sides do not form a valid triangle.");
			}

			double s = (a + b + c) / 2;
			double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.printf("The area of the triangle is: %.2f\n", area);

		}
		catch(InvalidTriangleException e)
		{
			System.out.println("Custom Exception: " + e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurred: " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Other Exception occurred: " + e.getMessage());
		}
		finally
		{
			scanner.close();
		}
	}

	public static boolean isValidTriangle(double a, double b, double c)
	{
		return a + b > c && a + c > b && b + c > a;
	}
}
class InvalidTriangleException extends Exception
{
	public InvalidTriangleException(String message)
	{
		super(message);
	}
}
