
public class Life {
	int generation = 1;
	LifeBoard lifeBoard;
	int i, j;
	public Life(LifeBoard board) {
		this.lifeBoard = board;
	}
	void newGeneration() {
		boolean[][] temp = new boolean[lifeBoard.getRows()][lifeBoard.getCols()];
		for (int i = 0; i < lifeBoard.board.length; i++) {
			for (int j = 0; j < lifeBoard.board[0].length; j++) {
		temp[i][j] = lifeBoard.board[i][j];
			}
		}
		for (int i = 1; i < temp.length-1; i++) {
			for (int j = 1; j < temp[0].length-1; j++) {
		if (temp[i-1][j] == true) {
			
		
			
			lifeBoard.put(i, j, false);
		}
			}
		}
		
		//if (GetNeighbours(lifeBoard) >1 && GetNeighbours(lifeBoard) < 3)
		//flip(i, j);
			lifeBoard.increaseGeneration();
	}
	private int GetNeighbours(LifeBoard board) {
		int row = board.getRows();
		int col = board.getCols();
		int counter = 0;
		boolean[][] temp = new boolean[row][col];
		for (int i = 0; row < lifeBoard.getRows(); i++) {
			for (int j = 0; j < lifeBoard.getCols(); j++) {
		
		for ( int dx = -1; dx <= 1; ++dx) {
		    for (int dy = -1; dy <= 1; ++dy) {
		        if (dx != 0 || dy != 0) {
		        	if (lifeBoard.get(i, j) == true){
		        		counter++;
		        	 this.i = i;
		        	 this.j = j;
		        	}
		            
		        }
		    }
		}
			}
		}
		
		
		return counter;
		
	}
	void flip(int row, int col) {
		lifeBoard.put(row, col,!lifeBoard.get(row, col));
	}

}
