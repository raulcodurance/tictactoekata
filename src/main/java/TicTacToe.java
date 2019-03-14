import java.util.HashMap;
import java.util.Map;

public class TicTacToe {
    private Map<BoardPosition, BoardSymbol> board = new HashMap<>();

    public Message move(BoardPosition position, BoardSymbol symbolX) {

        if (board.containsKey(position)) {
            return Message.POSITION_TAKEN;
        }
        board.put(position, symbolX);

        if (symbolX.equals(board.get(new BoardPosition(0, 0)))
                && symbolX.equals(board.get(new BoardPosition(0, 1)))
                && symbolX.equals(board.get(new BoardPosition(0, 2)))) {

            return symbolX.equals(new BoardSymbol("X")) ? Message.X_WINS : Message.O_WINS;
        }

        return Message.X_WINS;
    }
}
