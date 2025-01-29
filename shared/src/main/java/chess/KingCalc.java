package chess;

import java.util.ArrayList;
import java.util.Collection;

public class KingCalc {
    public KingCalc(){}

    public static Collection<ChessMove> run(ChessBoard board, ChessPosition pos){
        Collection<ChessMove> moves = new ArrayList<>();
        ChessGame.TeamColor color = board.getPiece(pos).getTeamColor();
        int row = pos.getRow();
        int col = pos.getColumn();



        /// up and to the sides
        if(row < 8){
            int xrow = row+1;
            ChessPosition next = new ChessPosition(xrow, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }

            if (col < 8){
                int xcol = col + 1;
                next = new ChessPosition(xrow, xcol);

                if (board.getPiece(next) == null){
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                } else if (board.getPiece(next).getTeamColor() != color){
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                }
            }

            if (col > 1) {
                int xcol = col - 1;
                next = new ChessPosition(xrow, xcol);

                if (board.getPiece(next) == null) {
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                } else if (board.getPiece(next).getTeamColor() != color) {
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                }
            }
        }



        /// down and to the sides
        if (row > 1){
            int xrow = row - 1;
            ChessPosition next = new ChessPosition(xrow, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }

            if (col < 8){
                int xcol = col + 1;
                next = new ChessPosition(xrow, xcol);

                if (board.getPiece(next) == null){
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                } else if (board.getPiece(next).getTeamColor() != color){
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                }
            }

            if (col > 1) {
                int xcol = col - 1;
                next = new ChessPosition(xrow, xcol);

                if (board.getPiece(next) == null) {
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                } else if (board.getPiece(next).getTeamColor() != color) {
                    ChessMove newMove = new ChessMove(pos, next, null);
                    moves.add(newMove);
                }
            }

        }



        /// To the right
        if (col < 8){
            int xcol = col + 1;
            ChessPosition next = new ChessPosition(row, xcol);

            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }
        }



        /// to the left
        if (col > 1) {
            int xcol = col - 1;
            ChessPosition next = new ChessPosition(row, xcol);

            if (board.getPiece(next) == null) {
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color) {
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            }
        }






        return moves;
    }
}
