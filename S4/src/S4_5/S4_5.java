package S4_5;

public class S4_5
{
	public static void main(String[] args)
	{
		var aStaff = new Staff("Bob",25,10002,2000.0,3);
		var aManager = new Manager("Babara",45,10001,5000,5);
		System.out.println(aStaff.getName()+" "+aStaff.getSalary());
		System.out.println(aManager.getName()+" "+aManager.getSalary());
		aStaff.salaryRise();
		aManager.salaryRise();
		System.out.println(aStaff.getName()+" "+aStaff.getSalary());
		System.out.println(aManager.getName()+" "+aManager.getSalary());
	}
}
/*某公司的人员分为员工和经理两类，但经理也属于员工中的一类，
公司员工和经理都有自己的姓名，年龄，工号、工资、工龄等属性（通过属性无法区分员工和经理）和工资上涨函数。
假设每次给员工涨工资一次能涨10%，经理能涨20%。要求利用多态实现给员工和经理涨工资，测试并通过。*/
class Staff
{
	private String name;
	private int age;
	private int id;
	private double salary;
	private int yearsHaveWorked;
	public Staff(String name, int age, int id, double salary, int yearsHaveWorked)
	{
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
		this.yearsHaveWorked = yearsHaveWorked;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public void salaryRise()
	{
		this.setSalary(this.getSalary()*1.1);
	}
}
class Manager extends Staff
{
	public Manager(String name, int age, int id, double salary, int yearsHaveWorked)
	{
		super(name, age, id, salary, yearsHaveWorked);
	}
	public void salaryRise()
	{
		super.setSalary(super.getSalary()*1.2);
	}
}