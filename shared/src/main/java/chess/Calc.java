package chess;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Collection;

public class Calc {
    public Calc() {}

    public static Collection<ChessMove> run(ChessBoard board, ChessPosition pos){
        ChessPiece.PieceType type = board.getPiece(pos).getPieceType();

        if (type == ChessPiece.PieceType.BISHOP){
            return BishopCalc.run(board, pos);
        } else if (type == ChessPiece.PieceType.ROOK){
            return RookCalc.run(board, pos);
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
