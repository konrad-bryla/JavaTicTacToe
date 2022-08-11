import java.util.Random;
import java.util.Scanner;
public class PlayTicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kbd = new Scanner(System.in);
		TicTacToe call = new TicTacToe(); 
		
 Random randomValue = new Random();
 boolean playerX = randomValue.nextBoolean();
 
 String playerName;
 int vValue;
 int hValue;
 
 if(playerX == true) {
	 playerName = "X";
 System.out.print("Player " + playerName  +" goes first\n");
	} else {
	 playerName = "O";
 System.out.print("Player " + playerName  +" goes first\n");
 }
 
int counter = 0;
char playAgain;

do {
	do {
		call.displayField();
		if(playerX == true) {
			System.out.print("What row do you want to pick? (0, 1, 2,)\n");
			vValue = kbd.nextInt();
			System.out.println("What column do you want to pick? (0, 1, 2,)\n");
			hValue = kbd.nextInt();
			call.playGame(playerX, vValue, hValue);
		}else if( playerX == false) {
			System.out.print("What row do you want to pick? (0, 1, 2,)\n");
			vValue = kbd.nextInt();
			System.out.println("What column do you want to pick? (0, 1, 2,)\n");
			hValue = kbd.nextInt();
			call.playGame(playerX, vValue, hValue);
		}
		counter++;
		if(playerX == false) {
			playerX = true;
		}else {
			playerX = false;
		if(counter >= 5) {
			call.winTracker();
		}
		
			
		}	
	}while (call.winTracker() == 'N');
	call.displayField();
	if (call.winTracker() == 'X') {
		System.out.print("\n The winner is player X. Do you want to play again? (y/n)");
	}else if(call.winTracker() == 'O') {
		System.out.print("\n The winner is player O. Do you want to play again? (y/n)");
	}else if (call.winTracker() == 'T') {
		System.out.print("\n There is no winner. Do you want to play again? (y/n)");
	}
	playAgain = kbd.next().charAt(0);
}while (playAgain == 'y' || playAgain == 'Y');
 
 
 
 
 }
	
}
