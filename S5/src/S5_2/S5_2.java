package S5_2;

import java.util.Scanner;

public class S5_2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		String[] tmp = new String[4];
		for(;;)
		{

		}
	}
}
class User
{
	private String username;
	private String originPassword;
	private String passwdHash;
	private String phoneNum;


	public User(String username, String originPassword,String phoneNum)
	{
		setUsername(username);
		setOriginPassword(originPassword);
		setPhoneNum(phoneNum);
	}


	public void setUsername(String username)
	{
		this.username = username;
	}
	public void setOriginPassword(String originPassword)
	{
		this.originPassword = originPassword;
		originPassword = null;
		this.passwdHash = String.valueOf(this.originPassword.hashCode());
		this.originPassword = null;
	}
	public void setPhoneNum(String phoneNum)
	{
		this.phoneNum = phoneNum;
	}


	public String getUsername()
	{
		return username;
	}
	public String getPhoneNum()
	{
		return phoneNum;
	}
	public String getPasswdHash()
	{
		return passwdHash;
	}
}
