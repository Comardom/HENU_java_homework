package S5_6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class S5_6
{
	public static void main(String[] args)
	{
		LocalDate today = LocalDate.now();
		LocalDate springFestival = LocalDate.of(2025, 1, 29);
		long daysLeft = ChronoUnit.DAYS.between(today, springFestival);
		if (daysLeft >= 0)
		{
			System.out.println("距离蛇年春节还有 " + daysLeft + " 天。");
		}
		else
		{
			System.out.println("蛇年春节已经过去了 " + Math.abs(daysLeft) + " 天。");
		}
	}
}
//根据所学知识，计算明年（蛇年）春节的倒计时天数并输出：“距离蛇年春节还有***天”。