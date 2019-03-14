import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TicTacToeShould {

    @Test
    public void
    return_X_wins_for_three_X_in_a_row_single_player() {

        TicTacToe ticTacToe = new TicTacToe();
        BoardSymbol symbolX = new BoardSymbol("X");

        ticTacToe.move(new BoardPosition(0,0), symbolX);
        ticTacToe.move(new BoardPosition(0,1), symbolX);
        Message message = ticTacToe.move(new BoardPosition(0,2), symbolX);

        assertThat(message, is(Message.X_WINS));
    }

    @Test
    public void
    return_X_wins_for_three_X_in_a_row() {

        TicTacToe ticTacToe = new TicTacToe();
        BoardSymbol symbolX = new BoardSymbol("X");
        BoardSymbol symbolO = new BoardSymbol("O");

        ticTacToe.move(new BoardPosition(0,0), symbolX);
        ticTacToe.move(new BoardPosition(1,1), symbolO);
        ticTacToe.move(new BoardPosition(0,1), symbolX);
        ticTacToe.move(new BoardPosition(2,1), symbolO);
        Message message = ticTacToe.move(new BoardPosition(0,2), symbolX);

        assertThat(message, is(Message.X_WINS));
    }

    @Test
    public void
    return_O_wins_for_three_O_in_a_row() {

        TicTacToe ticTacToe = new TicTacToe();
        BoardSymbol symbolX = new BoardSymbol("X");
        BoardSymbol symbolO = new BoardSymbol("O");

        ticTacToe.move(new BoardPosition(1,0), symbolX);
        ticTacToe.move(new BoardPosition(0,0), symbolO);
        ticTacToe.move(new BoardPosition(2,2), symbolX);
        ticTacToe.move(new BoardPosition(0,1), symbolO);
        Message message = ticTacToe.move(new BoardPosition(0,2), symbolO);

        assertThat(message, is(Message.O_WINS));
    }

    @Test
    public void
    return_X_wins_for_three_X_in_a_column() {

        TicTacToe ticTacToe = new TicTacToe();
        BoardSymbol symbolX = new BoardSymbol("X");
        BoardSymbol symbolO = new BoardSymbol("O");

        ticTacToe.move(new BoardPosition(0,0), symbolX);
        ticTacToe.move(new BoardPosition(1,1), symbolO);
        ticTacToe.move(new BoardPosition(1,0), symbolX);
        ticTacToe.move(new BoardPosition(2,1), symbolO);
        Message message = ticTacToe.move(new BoardPosition(2,0), symbolX);

        assertThat(message, is(Message.X_WINS));
    }


    @Test
    public void
    return_O_wins_for_three_O_in_a_column() {

        TicTacToe ticTacToe = new TicTacToe();
        BoardSymbol symbolX = new BoardSymbol("X");
        BoardSymbol symbolO = new BoardSymbol("O");

        ticTacToe.move(new BoardPosition(1,1), symbolX);
        ticTacToe.move(new BoardPosition(0,0), symbolO);
        ticTacToe.move(new BoardPosition(2,1), symbolX);
        ticTacToe.move(new BoardPosition(1,0), symbolO);
        ticTacToe.move(new BoardPosition(2,2), symbolX);
        Message message = ticTacToe.move(new BoardPosition(2,0), symbolO);

        assertThat(message, is(Message.O_WINS));
    }

    @Test
    public void
    return_O_wins_for_three_O_in_a_diagonal_starting_at_zero_zero() {

        TicTacToe ticTacToe = new TicTacToe();
        BoardSymbol symbolX = new BoardSymbol("X");
        BoardSymbol symbolO = new BoardSymbol("O");

        ticTacToe.move(new BoardPosition(1,0), symbolX);
        ticTacToe.move(new BoardPosition(0,0), symbolO);
        ticTacToe.move(new BoardPosition(2,0), symbolX);
        ticTacToe.move(new BoardPosition(1,1), symbolO);
        ticTacToe.move(new BoardPosition(2,1), symbolX);
        Message message = ticTacToe.move(new BoardPosition(2,2), symbolO);

        assertThat(message, is(Message.O_WINS));
    }

    @Test
    public void
    return_O_wins_for_three_O_in_a_diagonal_starting_at_two_zero() {

        TicTacToe ticTacToe = new TicTacToe();
        BoardSymbol symbolX = new BoardSymbol("X");
        BoardSymbol symbolO = new BoardSymbol("O");

        ticTacToe.move(new BoardPosition(1,0), symbolX);
        ticTacToe.move(new BoardPosition(2,0), symbolO);
        ticTacToe.move(new BoardPosition(2,1), symbolX);
        ticTacToe.move(new BoardPosition(1,1), symbolO);
        ticTacToe.move(new BoardPosition(2,2), symbolX);
        Message message = ticTacToe.move(new BoardPosition(0,2), symbolO);

        assertThat(message, is(Message.O_WINS));
    }


}
