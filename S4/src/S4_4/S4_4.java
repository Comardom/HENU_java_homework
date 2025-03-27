package S4_4;

public class S4_4
{
	public static void main(String[] args)
	{
		var aCargo = new CargoShip(12,4);
		var aFighter = new FighterShip(16,2);
		aFighter.display();
		aCargo.display();
		Spaceship cargoToSpace = aCargo;
		Spaceship fighterToSpace = aFighter;
		cargoToSpace.display();
		fighterToSpace.display();
	}
}
/*
设计并实现一个抽象类 Spaceship，该类包含两个成员变量 engineNum 和 crewCapacity，以及一个抽象方法 display(). 具体要求如下：
Spaceship 类:
定义两个私有整型成员变量 engineNum 和 crewCapacity，分别代表宇宙飞船的引擎数量和乘员容量。
提供一个构造方法来初始化这两个成员变量。
定义一个抽象方法 display()，用于输出宇宙飞船的基本信息。
CargoShip 类:
继承自 Spaceship 类。
实现 display() 方法，该方法应当输出货船的引擎数量和乘员容量。
FighterShip 类:
同样继承自 Spaceship 类。
实现 display() 方法，该方法应当输出战斗机的引擎数量和乘员容量。
实验要求：
在 main 方法中创建 CargoShip 对象和 FighterShip 对象，
并通过向上转型将它们转换为 Spaceship 类型的对象。调用每个对象的 display() 方法来展示其具体信息。*/

abstract class Spaceship
{
	private int engineNum;
	private int crewCapacity;
	public abstract void display();
	public Spaceship()
	{
		;
	}
	public Spaceship(int crewCapacity, int engineNum)
	{
		this.crewCapacity = crewCapacity;
		this.engineNum = engineNum;
	}

	public int getEngineNum()
	{
		return engineNum;
	}

	public int getCrewCapacity()
	{
		return crewCapacity;
	}
}
class CargoShip extends Spaceship
{
	public void display()
	{
		System.out.println(super.getCrewCapacity()+
				" Cargo "+super.getEngineNum());
	}
	public CargoShip(int crewCapacity, int engineNum)
	{
		super(crewCapacity, engineNum);
	}
}
class FighterShip extends Spaceship
{
	public void display()
	{
		System.out.println(super.getCrewCapacity()+
				" Fighter "+super.getEngineNum());
	}

	public FighterShip(int crewCapacity, int engineNum)
	{
		super(crewCapacity, engineNum);
	}
}