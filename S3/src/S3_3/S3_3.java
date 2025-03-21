package S3_3;

public class S3_3
{
	public static void main(String[] args)
	{
		;
	}
}
class Employee
{
	private int id = 0;
	private String name = "";
	private int age = 0;
	private String position = "";
	private String department = "";
	private static int attendanceCount = 0;


	public Employee()
	{
		this.id = 0;
		this.name = "Unknown";
		this.age = 0;
		this.position = "Unknown";
		this.department = "Unknown";
	}
	public Employee(int id, String name, int age,
					String position, String department)
	{
		this.id = id;
		this.name = name;
		this.age = age;
		this.position = position;
		this.department = department;
	}


	public void sign_in(String name)
	{
		attendanceCount++;
		System.out.println(name+ " has signed, "+
				"and now there're "+attendanceCount+" staffs have signed.");
	}
	public void displayInfo()
	{
		System.out.println(this.id+" "+this.name+" "+
				this.age+" "+this.position+" "+this.department);
	}
}
class TestEmployee
{
	public static void main(String[] args)
	{
		Employee staff1 = new Employee();
		Employee staff2 = new Employee(114514,"Wasabi",
				42,"Eat","Shimokitazawa");
		staff1.sign_in("Xiaowong");
		staff2.sign_in("Wasabi");
		staff1.displayInfo();
		staff2.displayInfo();
	}
}