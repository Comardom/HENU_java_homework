package S3_2;

public class S3_2
{
	public static void main(String[] args)
	{
		;
	}
}
class MonkeyAssistant
{
	private String name = "";
	private int age = 0;
	private double weight = 0.0;
	private String hobby = "";
	private double temperature = 0.0;


	public MonkeyAssistant(String name, int age,
						   double weight, String hobby,
						   double temperature)
	{
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.hobby = hobby;
		this.temperature = temperature;
	}
	public MonkeyAssistant()
	{
		name = "default";
		age = 0;
		weight = 0.0;
		hobby = "none";
		temperature = 0.0;
	}


	public void climbTree()
	{
		System.out.printf("Monkey %s is climbing a tree.",this.name);
	}
	public void printDetails()
	{
		System.out.println(this.name+" "+this.age+" "+
							this.weight+" "+this.hobby);
	}
	public void setTemperature(double temperature)
	{
		this.temperature = temperature;
	}


	public double celsiusToFahrenheit(double celsius)
	{
		return celsius*(9.0/5.0)+32.0;
	}
	public double fahrenheitToCelsius(double fahrenheit)
	{
		return (fahrenheit-32.0)/1.8;
	}
	public double fahrenheitToCelsius(int fahrenheit)
	{
		return (fahrenheit-32.0)/1.8;
	}


	public static void main(String[] args)
	{
		MonkeyAssistant assistant1 = new MonkeyAssistant();
		MonkeyAssistant assistant2 = new MonkeyAssistant("皮皮",2,
				48.0,"",0.0);
		assistant1.printDetails();
		assistant2.printDetails();
		assistant1.climbTree();
		assistant2.climbTree();
		System.out.println(
							assistant1.celsiusToFahrenheit(37.0)+
							assistant1.fahrenheitToCelsius(116)+
							assistant1.celsiusToFahrenheit(109.4)+
							assistant2.celsiusToFahrenheit(37.0)+
							assistant2.fahrenheitToCelsius(116)+
							assistant2.celsiusToFahrenheit(109.4));

	}
}










