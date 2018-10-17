import Yahtzee.*;
import java.util.Scanner;

public class Play{
public static void main(String[] args){
	Yahtzee game = new Yahtzee();
	char cont = 'y';
	char userOpt = '1';
	Scanner input1 = new Scanner(System.in);
	
	while(cont == 'y'){
		System.out.println("What do you want to do ?");
		System.out.println("a - player one rolls");
		System.out.println("b - player one rolls");
		System.out.println("c - cheat");
		System.out.println("d - Quit game");
		userOpt = input1.next().charAt(0);
		input1.nextLine();
		
		if(userOpt == 'a'){
			System.out.println("Player 1 rolled a " + game.toss());
			
		}
		if(userOpt == 'b'){
			System.out.println("Player 2 rolled a " + game.toss());
			
		}
		if(userOpt == 'c'){
			System.out.println("Player 1 Wins!");
		}
		if(userOpt == 'd'){
			cont = 'n';
		}
	}
}
}