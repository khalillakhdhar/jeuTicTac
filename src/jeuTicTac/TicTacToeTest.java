package jeuTicTac;

import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class TicTacToeTest {
		@Rule
		public ExpectedException exception = ExpectedException.none();
		private TictTacToe ticTacToe;
		@Before
		public final void before() {
		ticTacToe = new TictTacToe();
		}
}
