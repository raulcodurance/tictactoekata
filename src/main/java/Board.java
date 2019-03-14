import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<BoardPosition, BoardSymbol> board = new HashMap<>();

    public boolean containsPlayerPosition(BoardPosition position) {
        return board.containsKey(position);
    }

    public boolean containsSymbolAtPosition(BoardPosition boardPosition, BoardSymbol symbolX) {
        return symbolX.equals(board.get(boardPosition));
    }

    public void addSymbol(BoardPosition position, BoardSymbol symbolX) {
        board.put(position, symbolX);
    }
}
