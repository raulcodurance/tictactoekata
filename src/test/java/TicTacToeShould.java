import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TicTacToeShould {

    @Test
    public void
    have_a_game_board_initialized() {

        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe.board());
    }
}
