package S5_2;

import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Scanner;

public class S5_2
{
	public static void main(String[] args)
	{
//		此处为大循环（full）三个板块：注册、登录、登录失败处理
		Scanner in = new Scanner(System.in);
		full:
		for(;;)
		{
			User aUser = new User();
			String[] tmp = new String[4];
//			此处tmp同时用于注册和登录
			register:
			for(;;)
			{
				System.out.println("Now register!");
				System.out.println("Plz enter your " +
						"username, password, password(re-enter), phone number" +
						"sequentially.");
				for (int i=0;i<tmp.length;i++)
				{
					tmp[i] = in.nextLine();
				}
				aUser.setUser(tmp[0],tmp[1],tmp[3]);
				if(SHA256Hash.hash(tmp[2]).equals(aUser.getPasswdHash()))
				{
					System.out.println("注册成功");
					break register;
				}
				else
				{
					System.out.println("密码不一致，请重新注册");
				}
			}
			signIn:
			for(;;)
			{
				System.out.println("Now sign in!");
				System.out.println("Plz enter your " +
						"username, password sequentially, " +
						"and the password case insensitive.");
				for (int i=0;i<2;i++)
				{
					tmp[i] = in.nextLine();
				}
				int i = 0;
				for(;;)
				{
					if(tmp[0].equals(aUser.getUsername())
							&& SHA256Hash.hash(tmp[1].toLowerCase())
									.equals(aUser.getPasswdHash()))
					{
//						此处打开计算器
						Calc.calc();
						break full;
					}
					else
					{
						i++;
						System.out.println("密码错误，请重新输入！");
						if(i==2)
						{
//							三次失败
							System.out.println("登录失败，无法再继续登录");
							break signIn;
						}
					}
				}
			}
			ifReRegister:
			for(;;)
			{
				System.out.println("If you wanna register again?");
				System.out.println("[Y/n]");
				String input = in.nextLine().trim();
				if (input.isEmpty() || input.equalsIgnoreCase("y"))
				{
					continue full;
				}
				else if(input.equalsIgnoreCase("n"))
				{
					break full;
				}
				else
				{
					System.out.println("Em? Invalid entry.");
					continue ifReRegister;
				}
			}
		}
		in.close();
	}
}
class User
{
	private String username;
	private String originPassword;
	private String passwdHash;
	private String phoneNum;

	public User()
	{
		username=originPassword=phoneNum="Preparatory entry";
	}

	public void setUser(String username, String originPassword, String phoneNum)
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
		this.originPassword = originPassword.toLowerCase(Locale.ROOT);
		this.passwdHash = SHA256Hash.hash(this.originPassword);
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
	public String getPasswdHash()
	{
		return passwdHash;
	}
}
//这个类是ai写的，我完全不会
class Calc
{
	public static void calc()
	{
		String os = System.getProperty("os.name").toLowerCase();
		String calculatorCmd;
		if (os.contains("win"))
		{
			calculatorCmd = "calc"; // Windows
		}
		else if (os.contains("mac"))
		{
			calculatorCmd = "open -a Calculator"; // macOS 计算器
		}
		else
		{
			// 检测 Linux 桌面环境
			String desktop = System.getenv("XDG_CURRENT_DESKTOP");
			calculatorCmd = switch (desktop)
			{
				case "KDE" -> "kcalc";
				case "GNOME" -> "gnome-calculator";
				default -> "xcalc";
			};
		}
		try
		{
			new ProcessBuilder(calculatorCmd).start();
		}
		catch (IOException e)
		{
			System.out.println("无法启动计算器，请检查是否已安装！");
			e.printStackTrace();
		}
	}
}
//这个也是ai写的哈哈
class SHA256Hash
{
	public static String hash(String input)
	{
		try{
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(input.getBytes());
			StringBuilder hexString = new StringBuilder();
			for(byte b : hash)
			{
				hexString.append(String.format("%02x", b));
			}
			return hexString.toString();
		}
		catch(NoSuchAlgorithmException e)
		{
			throw new RuntimeException("SHA-256 algorithm not found", e);
		}
	}
}