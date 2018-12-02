
public class Life {
	int generation = 1;
	LifeBoard lifeBoard;
	LifeBoard tempBoard;
	public Life(LifeBoard board) {
		this.lifeBoard = board;
	}
	void newGeneration() {
		LifeBoard tempBoard = new LifeBoard(lifeBoard.getRows(),lifeBoard.getCols());
		for (int i = 0; i <lifeBoard.getRows() ; i++) {
			for (int j = 0; j < lifeBoard.getCols(); j++) {
				tempBoard.board[i][j] = lifeBoard.get(i,j);
			}
			
		}
		for (int y = 0; y < tempBoard.getRows() ; y++) {
			for (int x = 0; x < tempBoard.getCols(); x++) {
			 int n  = GetNeighbours(tempBoard,x,y);
			 System.out.println(n);
			 if (n < 2 || n >3)
				 lifeBoard.put(x, y, false);
			 else if (n == 3)
				 lifeBoard.put(x, y, true);
				
			}
		}
		for (int i = 0; i < tempBoard.getCols(); i++) {
			
			
			 //System.out.println(tempBoard.board[2][i]);
			 }
		//if (GetNeighbours(lifeBoard) >1 && GetNeighbours(lifeBoard) < 3)
		//flip(i, j);
			lifeBoard.increaseGeneration();
	}
	private int GetNeighbours(LifeBoard board, int inx, int iny) {
		int counter = 0;		
		for ( int y = iny-1; y <= iny+1; y++) {
		    for (int x = inx-1; x <= inx+1; x++) {
		        if (y == 0 && x == 0) {
		        	counter= 0;
		        	continue;
		        }
		        else {
		        	if (board.get(y, x)){
		        		counter++;
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
