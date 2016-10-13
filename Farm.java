class Farm 
{     
   //your code here
	private Animal[] aBunchOfAnimals = new Animal[100];
	private int myNum;

	public Farm()
	{
		for(int i =0; i< aBunchOfAnimals.length; i++)
		{
			myNum = (int)(Math.random()*3);

			if(myNum == 0)
			{
				aBunchOfAnimals[i] = new NamedCow("Cow", "Momo", "moo");
			}
			else if(myNum == 1)
			{
				aBunchOfAnimals[i] = new Chick("Chick", "cheep", "cluck");
			}
			else
			{
				aBunchOfAnimals[i] = new Pig("Pig", "oink");
			}
		}
	}
	public void animalSounds()    {       
    	for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       		if( aBunchOfAnimals[nI] instanceof Cow)
       		{

       			System.out.println( aBunchOfAnimals[nI].getType() + " " + ((NamedCow)aBunchOfAnimals[nI]).getName() + " goes " + aBunchOfAnimals[nI].getSound());
       		}

    		else {
    			System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());	
    		}       
      	}    
    } 
}
