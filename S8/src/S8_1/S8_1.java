package S8_1;

public class S8_1
{
	public static void main(String[] args)
	{
		Ticket task = new Ticket();

		// 启动5个售票窗口线程
		for (int i = 0; i < 5; i++)
		{
			Thread t = new Thread(task, "窗口" + ((int)i+1));
			t.start();
		}
	}
}

class Ticket implements Runnable
{
	public static int CZ3981 = 138;
	@Override
	public void run()
	{
		for(;;)
		{
			synchronized (Ticket.class) // 锁定类对象，所有线程共享一把锁
			{
				if (CZ3981 > 0)
				{
					System.out.println(Thread.currentThread().getName() + " 售出第 " + (139 - CZ3981) + " 张票");
					CZ3981--;

				}
				else
				{
					break; // 票卖完退出
				}
			}
			try
			{
				Thread.sleep(50); // 模拟售票耗时
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
//南方航空现有5个售票窗口，发售三日后郑州飞往三亚的CZ3981次航班机票，
//已知可售机票共有138张，请使用多线程程序模拟5个售票窗口出售该航班机票的过程。
//输出演示：
//窗口2售出第1张票
//窗口1售出第2张票
//……