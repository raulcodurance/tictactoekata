import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class TicTacToeShould {

    @Test
    public void
    have_a_game_board_initialized() {

        TicTacToe ticTacToe = new TicTacToe();
        assertNotNull(ticTacToe.board());
    }

    @Test
    public void
    have_a_game_board_which_has_9_squares() {
        TicTacToe ticTacToe = new TicTacToe();
        assertThat(ticTacToe.boardSize(), is(9));
    }

    @Test
    public void
    have_as_a_first_move_an_X() {

        TicTacToe ticTacToe = new TicTacToe();
        assertThat(ticTacToe.game("X"), is("X"));
    }
}
