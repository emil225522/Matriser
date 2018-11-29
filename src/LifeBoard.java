public class LifeBoard {
	private int rows, cols;
	 boolean[][] board;
	private int generation = 1;

	/** Skapar en spelplan med rows rader och cols kolonner. Spelplanen �r fr�n
	    b�rjan tom, dvs alla rutorna �r tomma och generationsnumret �r 1. */	
	public LifeBoard(int rows, int cols) {
		this.rows = rows;
		this.cols = cols;
		board = new boolean[rows][cols];
	}

	/** Ger true om det finns en individ i rutan med index row, col, false annars. 
	    Om index row, col �r utanf�r spelplanen returneras false */
	public boolean get(int row, int col) {
		if (row >= 0 && row < this.rows && col >= 0 && row < this.rows)
			if ((board[row][col] == true)) {
				return true;
			}
		return false;
	}

	/** Lagrar v�rdet val i rutan med index row, col */
	public void put(int row, int col, boolean val) {
		board[row][col] = val;
	}

	/** Tar reda p� antalet rader */
	public int getRows() {
		return board.length;
	}

 	/** Tar reda p� antalet kolonner */
	public int getCols() {
		return board[0].length;
	}

	/** Tar reda p� aktuellt generationsnummer */
	public int getGeneration() {
		return generation;
	}

	/** �kar generationsnumret med ett */
	public void increaseGeneration() {
		generation++;
	}
}