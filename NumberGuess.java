package numbergame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	static int score=0;
	 static Scanner sc= new Scanner(System.in);
	public static void play()
	{
		System.out.println("Welcome!!");
		Random rn=new Random();
		
		int computer=rn.nextInt(50);
	   
	    int attempt=5;
	    int i,user;
	    
	    
	    for(i=0;i<attempt;i++)
	    {
	    	System.out.println("Guess the Number");
	    	user=sc.nextInt();
	    	
	    	if(user==computer)
	    	{
	    		System.out.println("Congrats!Correct Guess!");
	    		score++;
	    		break;
	    	}
	    	else if(user<computer)
	    	{
	    		
	    		if(user<computer-20)
	    		{
	    			System.out.println("The guess is very low!!!");
	    			
	    		}
	    		else
	    		{System.out.println("Oops!! Wrong Guess!!");
	    		}
	    		
	    	}
	    	else if(user>computer)
	    	{
	    		
	    		if(user>computer+20)
	    		{
	    			System.out.println("The guess is very High!!!");
	    			
	    		}
	    		else
	    		{System.out.println("Oops!! Wrong Guess!!");
	    		}
	    	}
	    	
	    }
	    System.out.println("Your Score is : "+score);
	}
	public static void round()
	{
		int round=1;
		for(int i=0;i<3;i++)
		{
		play();
		System.out.println("Round"+ round++ +" is over!");
		   if(round>4)
		   {
			   System.out.println("The game is over!");
			   break;
		   }
		}
	}
	
	public static void main(String[] args) {
		round();
		System.out.println("Do you want to play again?");
		System.out.println("Enter 1 to continue and 2 to exit the game");
		int option=sc.nextInt();
		if(option==1)
		{
			round();
		}
		else
		{
			System.out.println("Thank you for playing..!!");
		}
	}
}
