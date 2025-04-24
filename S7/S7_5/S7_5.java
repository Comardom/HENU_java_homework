package S7_5;

import java.io.*;

public class S7_5
{
	public static void main(String[] args)
	{

	}
}
//复制指定目录中的指定类型（如.java）的文件到另一个目录中。
class CopyJavaFiles
{
	public static void main(String[] args)
	{
		String sourceDirPath = "/mnt";       // 源目录
		String targetDirPath = "/run/media/comardom/e3de41d2-639c-4913-8e00-75cb6aafbdec";    // 目标目录

		File sourceDir = new File(sourceDirPath);
		File targetDir = new File(targetDirPath);

		if (!sourceDir.exists() || !sourceDir.isDirectory())
		{
			System.out.println("源目录不存在或不是一个目录。");
			return;
		}

		if (!targetDir.exists())
		{
			targetDir.mkdirs(); // 如果目标目录不存在就创建
		}

		File[] files = sourceDir.listFiles();
		if (files != null)
		{
			for (File file : files)
			{
				if (file.isFile() && file.getName().endsWith(".java"))
				{
					File destFile = new File(targetDir, file.getName());
					copyFile(file, destFile);
					System.out.println("已复制：" + file.getName());
				}
			}
		}
		else
		{
			System.out.println("源目录中没有文件。");
		}
	}

	public static void copyFile(File source, File dest)
	{
		try (InputStream in = new FileInputStream(source);
			 OutputStream out = new FileOutputStream(dest))
		{
			byte[] buffer = new byte[1024];
			int length;
			while ((length = in.read(buffer)) > 0)
			{
				out.write(buffer, 0, length);
			}
		}
		catch (IOException e)
		{
			System.out.println("复制文件失败：" + e.getMessage());
		}
	}
}