package chess;

import java.util.ArrayList;
import java.util.Collection;

public class BishopCalc {
    public BishopCalc(){}

    public static Collection<ChessMove> run (ChessBoard board, ChessPosition pos){
        Collection<ChessMove> moves = new ArrayList<>();
        ChessGame.TeamColor color = board.getPiece(pos).getTeamColor();
        int row = pos.getRow();
        int col = pos.getColumn();

        while (row < 8 && col < 8){
            row++;
            col++;

            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }

        }

        row = pos.getRow();
        col = pos.getColumn();
        while (row < 8 && col > 1){
            row++;
            col--;

            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }

        }


        row = pos.getRow();
        col = pos.getColumn();
        while (row > 1 && col > 1){
            row--;
            col--;

            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }

        }


        row = pos.getRow();
        col = pos.getColumn();
        while (row > 1 && col < 8){
            row--;
            col++;

            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }

        }



        return moves;
    }
}
