package nx.model;

public enum Piece {
None (' '),
X ('X'),
O ('O'),
;

Piece(char text) {
	this.text = text;
}

public final char text;
}
