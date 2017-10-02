package nx.model;

/**
 * Bolierplate
 */

public class Board {
	public static final int MAX_ROW = 3;
	public static final int MAX_COLUMN = 3;
	
	private final Piece board[][] = {
			{Piece.None,Piece.None,Piece.None},
			{Piece.None,Piece.None,Piece.None},
			{Piece.None,Piece.None,Piece.None}
			};
	
	public boolean place(int row, int column, Piece piece) {
		if(Piece.None == board[row][column] && Piece.None != piece) {
			board[row][column] = piece;
			return true;
		}
		return false;
	}
	
	public Piece get(int row, int column) {
		return board[row][column];
	}
	
	
}
