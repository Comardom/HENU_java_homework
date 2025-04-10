package S5_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class S5_5
{
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		Random rand = new Random();
		char[] randomChar = new char[100];
		for(int i=0;i<randomChar.length;i++)
		{
			if (rand.nextBoolean())
			{
				randomChar[i] = (char) ('A' + rand.nextInt(26));
			}
			else
			{
				randomChar[i] = (char) ('a' + rand.nextInt(26));
			}
		}
		char[] verificationCode = new char[6];
		for(int i=0;i<verificationCode.length;i++)
		{
			if (rand.nextBoolean())
			{
				verificationCode[i] = (char) ('1' + rand.nextInt(10));
			}
			else
			{
				verificationCode[i] = randomChar[rand.nextInt(100)];
			}
		}
		System.out.println(verificationCode);
		String copy = String.valueOf(verificationCode);
		System.out.println("Enter it without case sensitivity.");
		String entry = in.nextLine();
		if(copy.equalsIgnoreCase(entry))
		{
			System.out.println("恭喜验证成功！");
		}
		else
		{
			System.out.println("验证失败！");
		}
	}
}
//使用Random类创建一个6位的验证码，其中包含数字、字母的组合，
// 并通过键盘输入该验证码，验证通过（不区分大小写）时提示“恭喜验证成功！”，否则提示“验证失败！”。