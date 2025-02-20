package chess;

import java.util.ArrayList;
import java.util.Collection;

public class QueenCalc {
    public QueenCalc(){}

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
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
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
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
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
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
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
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
            }

        }



        row = pos.getRow();
        col = pos.getColumn();
        while (row < 8 ){
            row++;

            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
            }

        }



        row = pos.getRow();
        col = pos.getColumn();
        while (row > 1){
            row--;


            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
            }

        }



        row = pos.getRow();
        col = pos.getColumn();
        while (col < 8){
            col++;


            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
            }

        }



        row = pos.getRow();
        col = pos.getColumn();
        while (col > 1){
            col--;


            ChessPosition next = new ChessPosition(row, col);
            if (board.getPiece(next) == null){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
            } else if (board.getPiece(next).getTeamColor() != color){
                ChessMove newMove = new ChessMove(pos, next, null);
                moves.add(newMove);
                break;
            } else {
                break;
            }

        }


        return moves;
    }
}
