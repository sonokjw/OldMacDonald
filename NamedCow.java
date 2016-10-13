class NamedCow extends Cow
{
	private String myType;
	private String mySound;
	private String cowName;
	NamedCow(String type, String name, String sound)
	{
		myType = type;
		cowName = name;
		mySound = sound;
	}
	
	public String getName()
	{
		return cowName;
	}
}