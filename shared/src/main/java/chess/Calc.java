package chess;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collection;

public class Calc {
    public Calc() {}

    public static Collection<ChessMove> run(ChessBoard board, ChessPosition pos){
        Collection<ChessMove> moves = new ArrayList<>();
        ChessPiece.PieceType type = board.getPiece(pos).getPieceType();

        if (type == ChessPiece.PieceType.BISHOP){
            throw new RuntimeException("Not impolememnted");
        } else if (type == ChessPiece.PieceType.ROOK){
            throw new RuntimeException("Not impolememnted");
        } else if (type == ChessPiece.PieceType.KNIGHT){
            throw new RuntimeException("Not impolememnted");
        } else if (type == ChessPiece.PieceType.QUEEN){
            throw new RuntimeException("Not impolememnted");
        } else if (type == ChessPiece.PieceType.PAWN){
            throw new RuntimeException("Not impolememnted");
        } else if (type == ChessPiece.PieceType.KING){
            throw new RuntimeException("Not impolememnted");
        }


        throw new RuntimeException("Missed type");
    }
}
