package jeuTicTac;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TicTacToeTest {
		@Rule
		public ExpectedException exception = ExpectedException.none();
		private TictTacToe ticTacToe;
		@Before
		public final void before() {
		ticTacToe = new TictTacToe();
		}
		@Test
		public void whenYOutsideBoardThenRuntimeException() {
		exception.expect(RuntimeException.class);
		ticTacToe.play(8, 2);
		}
		@Test
		public void whenOccupiedThenRuntimeException() {
		ticTacToe.play(2, 1);
		exception.expect(RuntimeException.class);
		ticTacToe.play(2, 1);
		}
}
