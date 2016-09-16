package stupid.controller;

import stupid.model.MarshmallowMonster;
import java.util.Scanner;

public class StupidController
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;

	
	public StupidController()
	{
		firstMonster = new MarshmallowMonster("Hermes",2,2,2,1,false);
		keyboardInput = new Scanner(System.in);
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
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
	
	}
	/*monsters name is hermes
	  *has 2 horns
	  *has 2 eyes
	  *has 2 legs
	  *has 1 nose
	  *has no belly button
	*/
}
