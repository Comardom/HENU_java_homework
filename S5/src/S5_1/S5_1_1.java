package S5_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class S5_1_1
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter something to encrypt it.");
		String str = in.nextLine();
		CaesarCipher cc = new CaesarCipher(str);
		System.out.println("Your data: "+str);
		String cData = cc.encryption();
		System.out.println("The encrypted: "+cData);
		cc.setText(cData);
		System.out.println("The decrypted: "+cc.decryption());
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

	public void setText(String text)
	{
		this.text = text;
	}

	public String encryption()
	{
		StringBuilder sb = new StringBuilder();
		for(char ch : this.text.toCharArray())
		{
//			此处不加（char）会出现存数字的情况，什么鬼
			sb.append((char)(ch+SHIFT));
		}
		return sb.toString();
	}
	public String decryption()
	{
		StringBuilder sb = new StringBuilder();
		for(char ch : this.text.toCharArray())
		{
//			此处不加（char）会出现存数字的情况，什么鬼
			sb.append((char)(ch-SHIFT));
		}
		return sb.toString();
	}
//	我都写完了arraylist才知道StringBuilder也是动态的
//	无能狂怒
/*
	public String encryption()
	{
		ArrayList<Character> list = new ArrayList<>();
//		list = text.toCharArray();
		for(char ch : this.text.toCharArray())
		{
//			list.add(ch);
			list.set((char) (ch + SHIFT));
		}
//		for(char ch : list)
//		{
//			ch+=SHIFT;
//		}
//		下面这几步是先新建一个对象往里面添加字符，防止创建多个对象
		StringBuilder sb = new StringBuilder();
		for(char ch : list)
		{
			sb.append(ch);
		}
		return sb.toString();
//		return list.stream().map(String::valueOf)
//					.collect(Collectors.joining());
//		我也不知道为什么要这么写，反正我是没看懂这一串是什么
	}

	public String decryption()
	{
		ArrayList<Character> list = new ArrayList<>();
		for(char ch : this.text.toCharArray())
		{
//			list.add(ch);
			list.add((char) (ch + SHIFT));
		}
//		for(char ch : list)
//		{
//			ch-=SHIFT;
//		}
//		下面这几步是先新建一个对象往里面添加字符，防止创建多个对象
		StringBuilder sb = new StringBuilder();
		for(char ch : list)
		{
			sb.append(ch);
		}
		return sb.toString();
	}
 */
}