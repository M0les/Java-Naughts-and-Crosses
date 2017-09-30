package nx;

import nx.model.Board;
import nx.model.Piece;
import nx.view.BoardView;

public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		BoardView boardView = new BoardView(board);
		board.place(1, 1, Piece.X);
		System.out.println(boardView.getText());
	}

}
