
public class TicTacToe {
	private static final int V_ROW = 3;
	private static final int H_ROW = 3;
	
	private char[][] board;
	
public TicTacToe(){
	board = new char[][]
{
		{' ',' ',' '},
		{' ',' ',' '},
		{' ',' ',' '}
};
}
public boolean  playGame(boolean playerInput, int v, int h) {
	 char player;
	 
	 if(playerInput == true) {
	  player = 'X';
	  if (board[v][h] == 'X' || board[v][h] == 'O') {
		  System.out.println("Sorry this space has been previously chosen.");
		  playerInput = true;
		  
	  }else {
		  board[v][h] = player;
		  playerInput = false;
	  }
	 
	 }else if(playerInput == false){
	 player = 'O';
		  
	 if(board[v][h] == 'X' || board[v][h] == 'O') {
		 System.out.println("Sorry this space has been previously chosen.");
		 playerInput = false;
	 }else {
		 board[v][h] = player;
		 playerInput = true;
	 }
	 }
	return playerInput;
}
public int squaresPlayed() {
	int v,
		h;
	int spotsPlayed = 0;
	for(v = 0; v < V_ROW; v++) {
		
		for(h = 0; h < H_ROW; h++) {
		if(board[v][h+1] == 'X' || board[v][h] == 'O') {
			spotsPlayed++;
		}
		}
	}return spotsPlayed;
}
public char winTracker() {
	//win for vertical
	int v,
		h;
	char winner = 'N';
	
	for(v = 0; v < V_ROW; v++){
		if(board[v][0] == board[v][1] && board[v][2] == board[v][0]) {
			winner = board[v][1];
		}
	}
	//win horizontal
	for(h = 0; h < H_ROW; h++) {
		if(board[0][h] == board[1][h] && board[2][h] == board[0][h]) {
			winner = board[1][h];
		}
	}
	//Diagonal
	if(board[0][0] == board[1][1] && board[1][1] == board[2][2] 
			|| board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
		winner = board[1][1];
	}
	//if game is still being played 
	for(v = 0; v < V_ROW; v++)
		for(h = 0; h < H_ROW; h++)
		{
		if(board[v][h] != 'O' || board[v][h] != 'X') {
			winner = 'N';
		}else {
			winner = 'T';
		}
		}
	return winner;
}
public void displayField() {
	System.out.println("  0 1 2  ");
	System.out.printf("0 %c %c %c\n", board[0][0], board[0][1], board[0][2]);
	System.out.printf("1 %c %c %c\n", board[1][0], board[1][1], board[1][2]);
	System.out.printf("2 %c %c %c\n", board[2][0], board[2][1], board[2][2]);
	
}

	

}
