public class TicTacToe {
    private Board board = new Board();
    public Message move(BoardPosition position, BoardSymbol symbol) {

        board.addSymbol(position, symbol);

        if (board.containsSymbolAtPosition(new BoardPosition(0, 0), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(0, 1), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(0, 2), symbol)) {

            return symbol.equals(new BoardSymbol("X")) ? Message.X_WINS : Message.O_WINS;
        }

        if (board.containsSymbolAtPosition(new BoardPosition(0, 0), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(1, 0), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(2, 0), symbol)) {

            return symbol.equals(new BoardSymbol("X")) ? Message.X_WINS : Message.O_WINS;
        }

        if (board.containsSymbolAtPosition(new BoardPosition(0, 0), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(1, 1), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(2, 2), symbol)) {

            return symbol.equals(new BoardSymbol("X")) ? Message.X_WINS : Message.O_WINS;
        }

        if (board.containsSymbolAtPosition(new BoardPosition(2, 0), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(1, 1), symbol)
                && board.containsSymbolAtPosition(new BoardPosition(0, 2), symbol)) {

            return symbol.equals(new BoardSymbol("X")) ? Message.X_WINS : Message.O_WINS;
        }

        return Message.X_WINS;
    }
}
