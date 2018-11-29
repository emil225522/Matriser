public class LifeController {
	public static void main(String[] args) {
		LifeBoard board = new LifeBoard(9, 9);
		LifeView window = new LifeView(board);
		Life life = new Life(board);
		window.drawBoard();
		

		
		board.put(0, 0, true);
		board.put(1, 1, false);
		board.put(2, 2, true);

		window.update();
		while (true) {	
			int command = window.getCommand();
			if (command == 1) {
				life.flip(window.getRow(), window.getCol());
			}
			if (command == 2) {
				life.newGeneration();
			}
			if (command == 3) {
				System.exit(0);
			}
		window.update();
		}
	}
}