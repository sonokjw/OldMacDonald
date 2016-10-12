class NamedCow extends Cow
{
	private String [] cowNames = {"Bob", "Tammi", "Sam", "Tom", "Sal", "Sue", "Tim", "Ana"};
	private String cowName;
	private int myNum;

	public String getName()
	{
		myNum = (int)(Math.random()*8);
		return cowNames[myNum];
	}

}