package S5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class S5_1_1
{
	public static void main(String[] args)
	{

	}
}
class CaesarCipher
{
	public static final int SHIFT = 12;
	private String text;

	public CaesarCipher(String text)
	{
		this.text = text;
	}

	public String encryption()
	{
		ArrayList<Character> list = new ArrayList<>();
//		list = text.toCharArray();
		for(char ch : this.text.toCharArray())
		{
			list.add(ch);
		}
		for(char ch : list)
		{
			ch+=SHIFT;
		}
		for(char ch : list)
		{

		}
		return list.stream().map(String::valueOf).collect(Collectors.joining());
//		我也不知道为什么要这么写，反正我是没看懂这一串是什么
	}
	public String decryption()
	{
		return "";
	}
}