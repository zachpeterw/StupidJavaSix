package stupid.model;

public class MarshmallowMonster
{
	private String name;
	private double hornCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;

	public MarshmallowMonster()
	{
		this.name = "Hermes";
		this.hornCount = 2;
		this.eyeCount = 2;
		this.legCount = 4;
		this.noseCount = 1;
		this.hasBellyButton = false;
	}
	public MarshmallowMonster(String name, double hornCount, int eyeCount, int legCount, int noseCount, boolean hasBellyButton)
	{
		this.name = name;
		this.hornCount = hornCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
		
	}
public String toString()
{
	String description = ("Monster says: Name is " + name);	
	
	return description;
}
 public String getName()
 {
	 return name;
 }
public boolean gethasBellyButton()
{
	return hasBellyButton;
}
public double gethornCount()
{
	return hornCount;
}
public int geteyeCount()
{
	return eyeCount;
}
public int getlegCount()
{
	return legCount;
}
public int getnoseCount()
{
	return noseCount;
}

}


