package S2_2;

import java.util.*;

public class S2_2_1
{
	public static void main(String[] args)
	{
//		scanner准备
		Scanner in = new Scanner(System.in);

//		给用户的提示词
		System.out.println("Now register a user."
		+" Plz enter your name first, "
		+"and the password after an ENTER.");
		System.out.println("Your name must be greater than 3 digits, "
		+"and your password must be greater than 6 digits");

//		开始构造用户
		User aUser = new User(in);

//		检查长度
		while(!aUser.checkUserName())
		{
			System.out.println("That's wrong. Type name again.");
			aUser.setUserName(in);
		}
		while(!aUser.checkPasswd())
		{
			System.out.println("That's wrong. Type password again.");
			aUser.setPasswd(in);
		}

//		再次输入密码并检查一致性
		boolean isPasswdCheckFail = false;
		do
		{
			if(isPasswdCheckFail)
			{
				System.out.println("Plz enter your password (1).");
				aUser.setPasswd(in);
			}
			System.out.println(aUser.getUserName()+", "
					+"plz enter your password again (2).");
			if(aUser.checkPasswdAgain(in))
			{
				System.out.println("Checked.");
				isPasswdCheckFail = false;
			}
			else
			{
				System.out.println("Oops. Plz enter your password again.");
				isPasswdCheckFail = true;
			}
		}while(isPasswdCheckFail);

//		关闭Scanner
		in.close();
	}
}
class User
{
//	实例字段
	private String userName = "";
	private String passwd = "";

//  构造器
	public User(Scanner in)
	{
//		userName = in.nextLine();
//		passwd = in.nextLine();
		this.setUserName(in);
		this.setPasswd(in);
	}

//  写入字段
	public void setUserName(Scanner in)
	{
		userName = in.nextLine().trim();
	}
	public void setPasswd(Scanner in)
	{
		passwd = in.nextLine().trim();
	}

//  读出字段
	public String getUserName()
	{
		return userName;
	}
	public String getPasswd()
	{
		return passwd;
	}

//  检查长度
	public boolean checkUserName()
	{
		return userName.length() >= 3;
	}
	public boolean checkPasswd()
	{
		return passwd.length()>=6;
	}

//	检查两次输入密码一致性
	public boolean checkPasswdAgain(Scanner in)
	{
		return Objects.equals(passwd, in.nextLine().trim());
	}
}