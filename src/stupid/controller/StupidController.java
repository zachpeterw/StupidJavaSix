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
	}
	/*monsters name is hermes
	  *has 2 horns
	  *has 2 eyes
	  *has 2 legs
	  *has 1 nose
	  *has no belly button
	*/
}
