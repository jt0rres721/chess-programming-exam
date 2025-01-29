package chess;

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
            return KnightCalc.run(board, pos);
        } else if (type == ChessPiece.PieceType.QUEEN){
            return QueenCalc.run(board, pos);
        } else if (type == ChessPiece.PieceType.PAWN){
            return PawnCalc.run(board, pos);
        } else if (type == ChessPiece.PieceType.KING){
            return KingCalc.run(board,pos);
        }


        throw new RuntimeException("Missed type");
    }
}
