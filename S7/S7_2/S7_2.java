package S7_2;

import java.io.*;

public class S7_2
{
	public static void main(String[] args) throws IOException
	{
		String source = "/mnt/A.mp3"; // 源文件路径
		String dest1 = "/mnt/copy_bytes.mp3"; // 字节流复制
		String dest2 = "/mnt/copy_buffered.mp3"; // 缓冲流复制

		long time1 = copyWithByteStream(source, dest1);
		System.out.println("Byte stream copy time: " + time1 + " ms");

		long time2 = copyWithBufferedStream(source, dest2);
		System.out.println("Buffered stream copy time: " + time2 + " ms");
	}
//	字节流
	public static long copyWithByteStream(String src, String dest) throws IOException
	{
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream(src);
		FileOutputStream fos = new FileOutputStream(dest);

		byte[] buffer = new byte[1024]; // 1KB 缓冲区
		int len;
		while ((len = fis.read(buffer)) != -1)
		{
			fos.write(buffer, 0, len);
		}

		fis.close();
		fos.close();
		return System.currentTimeMillis() - start;
	}
//	缓冲流
	public static long copyWithBufferedStream(String src, String dest) throws IOException
	{
		long start = System.currentTimeMillis();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

		byte[] buffer = new byte[1024]; // 同样大小
		int len;
		while ((len = bis.read(buffer)) != -1)
		{
			bos.write(buffer, 0, len);
		}

		bis.close();
		bos.close();
		return System.currentTimeMillis() - start;
	}

}
