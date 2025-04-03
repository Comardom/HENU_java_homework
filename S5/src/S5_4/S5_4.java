package S5_4;

import java.util.Scanner;

public class S5_4
{
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		StringBuffer sb = new StringBuffer(in.nextLine());
		System.out.println(sb.reverse());
		String[] strArr = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
		String s1 = "";
		StringBuffer s2 = new StringBuffer();
		for(String str : strArr)
		{
			s1+=str;
		}
		for(String str : strArr)
		{
			s2.append(str);
		}
	}
}
//（1）使用StringBuffer类对键盘输入的字符串进行反转。
//（2）使用String和StringBuffer类分别对数组进行字符串拼接，使其变成一个字符串。