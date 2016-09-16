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
		
		//name change
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setname(newName);
		}
		else
		{
			System.out.println("I have to keep my name, I don\'t like it :(");
		}
		System.out.println(firstMonster);
		
		//belly button change
		System.out.println("Do you want me to have a belly button?");
		String bellyButtonAnswer = keyboardInput.nextLine();
		if (bellyButtonAnswer.equalsIgnoreCase("yes"))
		{
			System.out.println("True or False");
			Boolean newhasBellyButton = keyboardInput.nextBoolean();
			firstMonster.sethasBellyButton(newhasBellyButton);
			System.out.println("I have a belly button!!");
		}
		else
		{
			System.out.println("Didn\'t need one anyways!");
		}
		
		//leg change
		System.out.println("Should I have more legs?");
		String leganswer = keyboardInput.nextLine();
		if (leganswer.equalsIgnoreCase("yes"))
		{
			System.out.println("how many?");
			int newlegCount = keyboardInput.nextInt();
			firstMonster.setlegCount(newlegCount);
			System.out.println("Sweet time for some new kicks!");
		}
	
	
	
	
	}
	
	
}
