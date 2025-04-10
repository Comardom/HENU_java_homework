package S5_12;

import java.util.Objects;

public class S5_12
{
	public static void main(String[] args)
	{
		Person p1 = new Person("A",100);
		Person p2 = new Person("A",1000);
		Person p3 = new Person("C",100);
		System.out.println(p1.equals(p2));
	}
}
class Person
{
	String name;
	int age;

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object o)
	{
		if(o == null || getClass() != o.getClass())
		{
			return false;
		}
		if(this == o)
		{
			return true;
		}
		Person p = (Person) o;
		return this.name.equals(p.name);
	}
	public int hashCode()
	{
		return Objects.hash(name);
	}
	public String toString()
	{
		return name + " (" + age + ")";
	}
}
//集合中不容许有重复的对象，对于多个重复对象只能添加一次。例如在HashSet集合中添加三个Person对象，
// 把姓名相同的人当做同一个人，虽然可以添加多次但集合里只保留一个，但是这对类的设计是有要求的，
// 假设Person类中只包含name和age属性，则需要重写hashCode()方法和equals()方法，
// 如果两个对象的name相同，则hashCode()方法的返回值相同，equals（）方法返回true。