import Yahtzee.*;
import java.util.Scanner;

public class Play{
public static void main(String[] args){
	Yahtzee game = new Yahtzee();
	char cont = 'y';
	char userOpt = '1';
	Scanner input1 = new Scanner(System.in);
	
	try{
	while(cont == 'y'){
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("What do you want to do ?");
		System.out.println("a - player one rolls");
		System.out.println("b - player two rolls");
		System.out.println("c - cheat");
		System.out.println("d - Quit game");
		System.out.println("++++++++++++++++++++++++++++++");
		userOpt = input1.next().charAt(0);
		input1.nextLine();
		
		if(userOpt == 'a'){
			System.out.println("Player 1 rolled a " + game.toss());
			
		}
		if(userOpt == 'b'){
			System.out.println("Player 2 rolled a " + game.toss());
			
		}
		if(userOpt == 'c'){
			System.out.println("Player 1 rolls: " + game.tossCheat());
		}
		if(userOpt == 'd'){
			cont = 'n';
		}
	}
	}
	catch(CheatException ex){
		System.out.println("shame on player 1");
		cont = 'n';
	}
}
}
