package S4_3;

import java.math.BigDecimal;

public class S4_3
{
	public static void main(String[] args)
	{
		PartTimeMember aPartTimeMember = new  PartTimeMember("John",BigDecimal.ZERO);
		System.out.println(aPartTimeMember);
		aPartTimeMember.addSalary();
		System.out.println(aPartTimeMember);
		if(aPartTimeMember.payDues())
		{
			System.out.println(aPartTimeMember);
		}
		else
		{
			System.out.println("加油干吧！");
			System.out.println(aPartTimeMember);
		}
	}
}
/*会员每个月需要支付一定的会费（假设为1500元）。
而俱乐部的工作人员则每月会获得一份工资（随机生成，范围在1000到3000元之间）。
有一种特殊的角色叫做“兼职员工”，他们既是俱乐部的会员，也是工作人员。
因此，兼职员工既有工资收入，也需要支付会费。
兼职员工的净收入为（工资 - 会费），如果兼职员工的工资不足以支付会费，
请输出一句鼓励的话：“加油干吧！*/
interface StaffSalary
{
	void addSalary();
}
abstract class Person
{
	private String name;
	private BigDecimal money;
	private static final BigDecimal min = new BigDecimal("1000");
	private static final BigDecimal max = new BigDecimal("3000");
	public Person()
	{
		this.name = "unkown";
		this.money = BigDecimal.ZERO;
	}
	public Person(String name)
	{
		this.name = name;
		this.money = BigDecimal.ZERO;
	}
	public Person(String name, BigDecimal money)
	{
		this.name = name;
		this.money=money;
	}
	public boolean payDues()
	{
		if(this.money.compareTo(BigDecimal.valueOf(1500))<0)
		{
			return false;
		}
		else
		{
			this.money=this.money.subtract(BigDecimal.valueOf(1500));
			return true;
		}
	}
	protected void addSalary()
	{
		BigDecimal randomBigDecimal=min.add(BigDecimal.valueOf(Math.random()).multiply(max.subtract(min)));
		this.money=this.money.add(randomBigDecimal);
	}
	public String toString()
	{
		return "Person{" +
				"name='" + name + '\'' +
				", money=" + money +
				'}';
	}
}
class Vip extends Person
{
	public Vip()
	{
		super();
	}
	public Vip(String name)
	{
		super(name);
	}
	public Vip(String name, BigDecimal money)
	{
		super(name,money);
	}
	public boolean payDues()
	{
		if(super.payDues())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
//	这里override了本来不能用的发工资，以确保无法访问
	protected void addSalary(BigDecimal addend)
	{
		throw new UnsupportedOperationException("No salary!");
	}
}
class PartTimeMember extends Vip implements StaffSalary
{
	public PartTimeMember()
	{
		super();
	}
	public PartTimeMember(String name)
	{
		super(name);
	}
	public PartTimeMember(String name, BigDecimal money)
	{
		super(name,money);
	}
//	由于实现了接口所以必须写这个方法，要不然可以删掉的，Person里面有了
	public void addSalary()
	{
		super.addSalary();
	}
}
