// package S3_4;

public class S3_4
{
	public static void main(String[] args)
	{
		testTurnOnOff();
		testVolumeControl();
		testChannelChange();
		testDisplayInfo();
	}

	public static void testTurnOnOff()
	{
		TV tv = new TV();
		tv.turnOff();
		tv.turnOn();
		tv.turnOn();
		tv.turnOff();
		tv.turnOff();
	}

	public static void testVolumeControl()
	{
		TV tv = new TV();
		tv.increaseVolume();
		tv.turnOn();
		tv.increaseVolume();
		tv.decreaseVolume();
		for (int i = 0; i < 100; i++) tv.increaseVolume();
		tv.decreaseVolume();
		for (int i = 0; i < 100; i++) tv.decreaseVolume();
	}

	public static void testChannelChange()
	{
		TV tv = new TV();
		tv.changeChannel(5);
		tv.turnOn();
		tv.changeChannel(5);
		tv.changeChannel(120);
		tv.changeChannel(99);
	}

	public static void testDisplayInfo()
	{
		TV tv1 = new TV();
		TV tv2 = new TV();
		tv1.turnOn();
		tv1.increaseVolume();
		tv1.changeChannel(8);

		System.out.println("\nTV1 Info：");
		tv1.displayInfo();

		System.out.println("\nTV2(off) Info：");
		tv2.displayInfo();
	}
}
class TV
{
	private int id = 0;
	private boolean isOn = false;
	private int vol = 0;
	private int channel = 0;
	private static int nextID = 0;


	public TV()
	{
		this.id = nextID++;
		this.isOn = false;
		this.vol = 0;
		this.channel = 1;
	}
	public void turnOn()
	{
		if(!isOn)
		{
			isOn = true;
			System.out.println(id+" on.");
		}
		else
		{
			System.out.println(id+" has been open.");
		}
	}
	public void turnOff()
	{
		if(isOn)
		{
			isOn = false;
			System.out.println(id+" closed.");
		}
		else
		{
			System.out.println(id+" has been closed.");
		}
	}
	public void increaseVolume()
	{
		if(isOn && vol<100)
		{
			vol++;
			System.out.println("Up volume. NNow:"+vol);
		}
		else if(!isOn)
		{
			System.out.println("Plz turn on the TV first.");
		}
		else
		{
			System.out.println("Biggest volume.");
		}
	}
	public void decreaseVolume()
	{
		if(isOn && vol>0)
		{
			vol--;
			System.out.println("Down volume. NNow:"+vol);
		}
		else if(!isOn)
		{
			System.out.println("Plz turn on the TV first.");
		}
		else
		{
			System.out.println("Zero volume.");
		}
	}
	public void changeChannel(int newChannel)
	{
		if(isOn && newChannel<=99)
		{
			this.channel = newChannel;
			System.out.println("Channel "+channel+".");
		}
		else if(!isOn)
		{
			System.out.println("Plz turn on the TV first.");
		}
		else
		{
			System.out.println("A right channel plz.");
		}
	}
	public void displayInfo()
	{
		System.out.println("ID："+this.id);
		System.out.println("Status："+(isOn?"ON":"OFF"));
		System.out.println("VVolume："+vol);
		System.out.println("Channel：" + channel);
	}


	public static int getNextProductId()
	{
		return nextID;
	}
}
