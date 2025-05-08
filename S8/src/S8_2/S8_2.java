package S8_2;

public class S8_2
{
	public static void main(String[] args)
	{
		Thread rabbit = new Thread(new Rabbit((int)(Math.random() * 5000) + 3000)); // 兔子休息时间3000-8000
		Thread tortoise = new Thread(new Tortoise());

		rabbit.start();
		tortoise.start();
	}
}

class Rabbit implements Runnable {
	private int restTime; // 兔子的休息时间（毫秒）

	public Rabbit(int restTime) {
		this.restTime = restTime;
	}

	@Override
	public void run() {
		double distance = 0;
		while (distance < 50) {
			try {
				Thread.sleep(100); // 每0.1秒跑0.5米
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			distance += 0.5;
			System.out.printf("兔子跑了 %.1f 米\n", distance);

			if (distance >= 40 && distance - 0.5 < 40) {
				System.out.println("兔子到达40米，开始休息...");
				try {
					Thread.sleep(restTime);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("🐰兔子到达终点！");
	}
}

class Tortoise implements Runnable {
	@Override
	public void run() {
		double distance = 0;
		while (distance < 50) {
			try {
				Thread.sleep(100); // 每0.1秒跑0.3米
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			distance += 0.3;
			System.out.printf("乌龟跑了 %.1f 米\n", distance);
		}
		System.out.println("🐢乌龟到达终点！");
	}
}

//将兔子和乌龟的赛跑以两个线程的方式模拟出来，以达到一个初步的效果。要求如下：路程总距离为50米，耗时精确到0.1秒。
//兔子：每秒跑5米，跑至40米，休息一次；
//乌龟：每秒跑3米，不休息。
//兔子的休息时长自定义，可以调整数值，使其输出兔子先到达终点和乌龟先到达终点两种情况。