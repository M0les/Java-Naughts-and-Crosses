package nx.model;

import java.io.PrintStream;

public class SimpleSolver implements Solver {
	public SimpleSolver(PrintStream out) {
		this.out = out;
	}
	
	@Override
	public boolean solveFor(Board board, final Piece turn) {
		// Vertical solution in column 1
		if(turn == board.get(0, 0) && turn == board.get(1, 0) && turn == board.get(2, 0)) {
			out.println("Solution for " + turn.text + " in column 1");
			return true;
		}
		// Vertical solution in column 1
		if(turn == board.get(0, 1) && turn == board.get(1, 1) && turn == board.get(2, 1)) {
			out.println("Solution for " + turn.text + " in column 2");
			return true;
		}
		// Vertical solution in column 1
		if(turn == board.get(0, 2) && turn == board.get(1, 2) && turn == board.get(2, 2)) {
			out.println("Solution for " + turn.text + " in column 3");
			return true;
		}
		// TODO Horizontal solution in row 1
		// TODO Horizontal solution in row 1
		// TODO Horizontal solution in row 1
		// TODO Diagonal solution from top-left
		// TODO Diagonal solution from top-right
		return false;
	}
	
	private final PrintStream out;
}
