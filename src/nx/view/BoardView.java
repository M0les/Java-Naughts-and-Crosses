package nx.view;

import nx.model.Board;

public class BoardView {
public BoardView(Board board) {
	this.board = board;
}

public String getText() {
	String output = "";
	for(int row = 0; row < Board.MAX_ROW; row++) {
		output += getRowText(row);
		if(row < Board.MAX_ROW - 1) {
			output += "---+---+---\n";
		}
	}
	return output;
}

private String getRowText(int row) {
	return " " + board.get(row, 0).text + " | " + board.get(row, 1).text + " | " + board.get(row, 2).text + "\n";
}

private final Board board;
}
