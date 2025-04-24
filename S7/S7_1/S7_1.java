package S7_1;

import java.io.File;

public class S7_1
{
	public static void main(String[] args)
	{
		// 指定目录路径
		String path = "/mnt";
		File folder = new File(path);

		// 判断目录是否存在
		if (!folder.exists() || !folder.isDirectory())
		{
			System.out.println("The specified path is not a valid directory.");
			return;
		}

		// 获取所有 .exe 文件
		// 给文件夹 folder 设置一个“筛选器”
		// 这个筛选器判断：文件名是否以 .exe 结尾
		// 如果是，就放进 files 数组里

		File[] files = folder.listFiles((dir, name) -> name.toLowerCase().endsWith(".exe"));

		if (files == null || files.length == 0)
		{
			System.out.println("No .exe files found in the directory.");
		}
		else
		{
			System.out.println(".exe files found:");
			for (File file : files) {
				System.out.println(file.getName());
			}
		}
	}
}
