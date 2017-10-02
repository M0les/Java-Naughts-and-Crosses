package nx.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import nx.model.Board;
import nx.model.Piece;
import nx.model.Solver;
import nx.view.BoardView;

public class TextInterface implements Runnable {
	public TextInterface(Board board, BufferedReader in, PrintStream out, Solver solver) {
		this.board = board;
		this.view = new BoardView(board);
		this.in = in;
		this.out = out;
		this.solver = solver;
	}

	private final void printPrompt() {
		out.print(turn.text + "'s turn (q123456789)> ");
		out.flush();
	}

	@Override
	public void run() {
		try {
			boolean running = true;
			while (running) {
				out.println(view.getText());
				printPrompt();
				String input = in.readLine();
				final char inChar = Character.toLowerCase(input.charAt(0));
				if ('q' == inChar) {
					out.println("Quitting...");
					running = false;
				} else if ('1' <= inChar && '9' >= inChar) {
					int val = inChar - '1'; // '1' -> 0, '9' -> 8
					final int row = val / Board.MAX_COLUMN;
					final int column = val % Board.MAX_COLUMN;
					if (board.place(row, column, turn)) {
						out.println("Success!");
						if(solver.solveFor(board, turn)) {
							out.println(view.getText());
							out.println(turn.text + " wins!");
							running = false;
						} else {
							if (turn == Piece.X) {
								turn = Piece.O;
							} else {
								turn = Piece.X;
							}
						}
					}else {
						out.println("Not allowed!");
					}
				} else {
					out.println("Don't know: \"" + input + "\"");
				}
			}
		} catch (IOException e) {
			out.println("Oh dear: " + e.getMessage());
		}
	}

	private final Board board;
	private final BoardView view;
	private final BufferedReader in;
	private final PrintStream out;
	private final Solver solver;
	
	private Piece turn = Piece.X;
}
