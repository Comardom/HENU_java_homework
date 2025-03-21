package S4_1;

public class S4_1
{
	public static void main(String[] args)
	{
//		创建一个名为 S4_1的类，该类包含一个 main 方法。
//		在 main 方法中创建一个 Animal 对象和一个 Monkey 对象。
//		使用 Animal 和 Monkey 对象的构造方法初始化属性。
//		调用 displayInfo() 方法显示动物和猴子的详细信息。
//		调用 makeSound() 方法让动物和猴子发出声音。
//		调用 eat() 方法让动物和猴子吃东西。
//		调用 climbTree() 方法让猴子爬树。
		Animal animal = new Animal("wasabi",3,"anime","nihonn");
		Monkey monkey = new Monkey("mon",2,"monkey","tree","eating",44.0);
		animal.displayInfo();
		monkey.displayInfo();
		animal.eat();
		monkey.eat();
		monkey.climbTree();
	}
}
class Animal
{
//	名称 (name)：字符串类型，私有属性。
//	年龄 (age)：整数类型，私有属性。
//	种类 (species)：字符串类型，私有属性。
//	生活环境 (habitat)：字符串类型，私有属性。
	private String name;
	private int age;
	private String species;
	private String habitat;
	public Animal(String name,int age,String species,String habitat)
	{
		this.age=age;
		this.name=name;
		this.habitat=habitat;
		this.species=species;
	}
//	makeSound()：发出声音的方法，格式为 "The [species] makes a sound."。
//	displayInfo()：显示动物的基本信息，包括名称、年龄、种类和生活环境。
//	eat()：吃东西的方法，格式为 "The [species] is eating."。
	public void makeSound()
	{
		System.out.printf("The %s makes a sound.\n",this.species);
	}
	public void displayInfo()
	{
		System.out.printf("Animal{" +
				"name='" + name + '\'' +
				", age=" + age +
				", species='" + species + '\'' +
				", habitat='" + habitat + '\'' +
				'}');
	}
	public void eat()
	{
		System.out.printf("The %s is eating.\n",this.species);
	}
	public String getName()
	{
		return name;
	}
	public String getSpecies()
	{
		return species;
	}
	public int getAge()
	{
		return age;
	}
	public String getHabitat()
	{
		return habitat;
	}
}
class Monkey extends Animal
{
//	爱好 (hobby)：字符串类型，私有属性。
//	体重 (weight)：浮点数类型，私有属性。
	private String hobby;
	private double weight;
//	带参数的构造方法：使用 super 关键字调用父类的带参数构造方法，并初始化爱好和体重属性。
	public Monkey(String name,int age,String species,String habitat,String hobby,double weight)
	{
		super(name,age,species,habitat);
		this.hobby=hobby;
		this.weight=weight;
	}
//	重写 makeSound() 方法：猴子发出的声音，格式为 "The monkey says 'Ooh ooh ah ah'."。
//	重写 eat() 方法：猴子吃东西的方式，格式为 "The monkey is eating bananas."。
//	climbTree()：猴子爬树的方法，格式为 "The monkey [name] is climbing a tree."。
//	displayInfo()：显示猴子的详细信息，包括名称、年龄、种类、生活环境、爱好和体重。
	public void makeSound()
	{
		System.out.println("The monkey says 'Ooh ooh ah ah'.");
	}
	public void eat()
	{
		System.out.println("The monkey is eating bananas.");
	}
	public void climbTree()
	{
		System.out.printf("The monkey %s is climbing a tree.",super.getName());
	}
	public void displayInfo()
	{
		System.out.printf("Animal{" +
				"name='" + super.getName() + '\'' +
				", age=" + super.getAge() +
				", species='" + super.getSpecies() + '\'' +
				", habitat='" + super.getHabitat() + '\'' +
				", hobby='" + hobby + '\'' +
				", weight=" + weight +
				'}');
	}
}