package stupid.controller;

import stupid.model.MarshmallowMonster;
public class StupidController
{
	private MarshmallowMonster firstMonster;
	
	public StupidController()
	{
		firstMonster = new MarshmallowMonster("Hermes",2,2,2,1,false);
	}
	public void start()
	{
		System.out.println("we made monsters today!");
		System.out.println("Here is mine " + firstMonster);
		System.out.println("legs? I have " + firstMonster.getlegCount());
		System.out.println("horns? I have " + firstMonster.gethornCount());
		System.out.println("eyes? I have " + firstMonster.geteyeCount());
		System.out.println("nose? I have " + firstMonster.getnoseCount());
		System.out.println("I have a bellybutton? " + firstMonster.gethasBellyButton());
	}
	/*monsters name is hermes
	  *has 2 horns
	  *has 2 eyes
	  *has 2 legs
	  *has 1 nose
	  *has no belly button
	*/
}
