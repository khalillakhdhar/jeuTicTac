package jeuTicTac;

public class TicTacToeTest {
		@Rule
		public ExpectedException exception = ExpectedException.none();
		private TictTacToe ticTacToe;
		@Before
		public final void before() {
		ticTacToe = new TictTacToe();
		}
}
