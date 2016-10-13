class Chick implements Animal 
{     
     //your code here
	private String myType;
	private String mySound;

	public Chick(String type, String sound)
	{
		myType = type;
		mySound = sound;
	}

	public Chick(String type, String soundone, String soundtwo)
	{
		myType = type;
		if(Math.random() < 0.5)
			mySound = soundone;
		else {
			mySound = soundtwo;
		}
	}
	

	public Chick()
	{
		myType = "unknown";
		mySound = "unknown";
	}

	public String getSound(){return mySound;}
	public String getType(){return myType;}
}