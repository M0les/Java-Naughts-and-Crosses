package nx;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import nx.model.Board;
import nx.model.SimpleSolver;
import nx.model.Solver;
import nx.ui.TextInterface;

/**
 * A really simple naughts and crosses game to try and demonstrate some of the features of Java and
 * object-oriented coding in general.
 * 
 * @author M0les
 *
 */
public class Main {

	public static void main(String[] args) {
		Board board = new Board();
		Solver solver = new SimpleSolver(System.out);
		TextInterface iface = new TextInterface(board, new BufferedReader(new InputStreamReader(System.in)),
				System.out, solver);
		iface.run();
	}

}
