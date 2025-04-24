package S7_3;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class S7_3
{
	public static void main(String[] args)
	{

	}
}
//编写一个程序，分别使用转换流、字符流和缓冲字符流拷贝一个文本文件。要求：
//分别使用InputStreamReader、OutputStreamWriter类和FileReader、FileWriter类用两种方式（字符和字符数组）进行拷贝。
//使用BufferedReader、BufferedWriter类的特殊方法进行拷贝。
class TextFileCopy {

	public static void main(String[] args) throws IOException
	{
		String src = "/mnt/my.txt";

		copyWithConverterChar(src, "/mnt/copy_converter_char.txt");
		copyWithConverterCharArray(src, "/mnt/copy_converter_array.txt");

		copyWithCharStream(src, "/mnt/copy_charstream_char.txt");
		copyWithCharStreamArray(src, "/mnt/copy_charstream_array.txt");

		copyWithBufferedStream(src, "/mnt/copy_buffered.txt");

		System.out.println("All copies completed.");
	}

	// 1. 转换流：单字符复制
	public static void copyWithConverterChar(String src, String dest) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(new FileInputStream(src), StandardCharsets.UTF_8);
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dest), StandardCharsets.UTF_8);

		int ch;
		while ((ch = isr.read()) != -1)
		{
			osw.write(ch);
		}

		isr.close();
		osw.close();
	}

	// 2. 转换流：字符数组复制
	public static void copyWithConverterCharArray(String src, String dest) throws IOException
	{
		InputStreamReader isr = new InputStreamReader(new FileInputStream(src), StandardCharsets.UTF_8);
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(dest), StandardCharsets.UTF_8);

		char[] buffer = new char[1024];
		int len;
		while ((len = isr.read(buffer)) != -1)
		{
			osw.write(buffer, 0, len);
		}

		isr.close();
		osw.close();
	}

	// 3. 字符流：单字符复制
	public static void copyWithCharStream(String src, String dest) throws IOException
	{
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);

		int ch;
		while ((ch = fr.read()) != -1)
		{
			fw.write(ch);
		}

		fr.close();
		fw.close();
	}

	// 4. 字符流：字符数组复制
	public static void copyWithCharStreamArray(String src, String dest) throws IOException
	{
		FileReader fr = new FileReader(src);
		FileWriter fw = new FileWriter(dest);

		char[] buffer = new char[1024];
		int len;
		while ((len = fr.read(buffer)) != -1)
		{
			fw.write(buffer, 0, len);
		}

		fr.close();
		fw.close();
	}

	// 5. 缓冲字符流：readLine / newLine 方法
	public static void copyWithBufferedStream(String src, String dest) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader(src));
		BufferedWriter bw = new BufferedWriter(new FileWriter(dest));

		String line;
		while ((line = br.readLine()) != null)
		{
			bw.write(line);
			bw.newLine(); // 保留换行
		}

		br.close();
		bw.close();
	}
}
