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
	
	public boolean place(int x, int y, Piece piece) {
		if(Piece.None == board[x][y] && Piece.None != piece) {
			board[x][y] = piece;
			return true;
		}
		return false;
	}
	
	public Piece get(int x, int y) {
		return board[x][y];
	}
	
	
}
