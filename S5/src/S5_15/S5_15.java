package S5_15;

import java.util.HashMap;
import java.util.Map;

public class S5_15
{
	public static void main(String[] args)
	{
		Map<String, String> userMap = new HashMap<>();
		userMap.put("A", "passwd123");
		userMap.put("B", "qwerty");
		userMap.put("C", "abc123");
		userMap.put("D", "adminadmin");
		userMap.put("E", "123456");
		for (Map.Entry<String, String> entry : userMap.entrySet()) {
			System.out.println("Username: " + entry.getKey() + ", Password: " + entry.getValue());
		}
	}
}
//选择合适的Map集合保存5个用户的用户名和密码，然后将这些键值对打印出来。