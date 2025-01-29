package chess;

import java.util.ArrayList;
import java.util.Collection;

public class PawnCalc {
    public PawnCalc(){}

    public static Collection<ChessMove> run (ChessBoard board, ChessPosition pos){
        Collection<ChessMove> moves = new ArrayList<>();
        ChessGame.TeamColor color = board.getPiece(pos).getTeamColor();
        int row = pos.getRow();
        int col = pos.getColumn();

        if (color == ChessGame.TeamColor.WHITE){
            int xrow = row;
            int xcol = col;
            if (row < 8){
                xrow++;
                ChessPosition next = new ChessPosition(xrow, xcol);
                if (board.getPiece(next) == null){
                    if (xrow == 8){
                        ChessMove newMove = new ChessMove(pos, next, ChessPiece.PieceType.KNIGHT);
                        moves.add(newMove);
                        newMove = new ChessMove(pos, next, ChessPiece.PieceType.BISHOP);
                        moves.add(newMove);
                        newMove = new ChessMove(pos, next, ChessPiece.PieceType.QUEEN);
                        moves.add(newMove);
                        newMove = new ChessMove(pos, next, ChessPiece.PieceType.ROOK);
                        moves.add(newMove);

                    } else {
                        ChessMove newMove = new ChessMove(pos, next, null);
                        moves.add(newMove);
                    }

                    if (row == 2){
                        next = new ChessPosition(xrow+1, xcol);
                        if (board.getPiece(next) == null){
                            ChessMove newMove = new ChessMove(pos, next, null);
                            moves.add(newMove);
                        }

                    }
                }
                if(col < 8){
                    xcol++;
                    next = new ChessPosition(xrow, xcol);
                    if (board.getPiece(next) != null){
                        if (board.getPiece(next).getTeamColor() != color){
                            if (xrow == 8){
                                ChessMove newMove = new ChessMove(pos, next, ChessPiece.PieceType.KNIGHT);
                                moves.add(newMove);
                                newMove = new ChessMove(pos, next, ChessPiece.PieceType.BISHOP);
                                moves.add(newMove);
                                newMove = new ChessMove(pos, next, ChessPiece.PieceType.QUEEN);
                                moves.add(newMove);
                                newMove = new ChessMove(pos, next, ChessPiece.PieceType.ROOK);
                                moves.add(newMove);

                            } else {
                                ChessMove newMove = new ChessMove(pos, next, null);
                                moves.add(newMove);
                            }
                        }
                    }


                    xcol = col;
                }
                if(col > 1){
                    xcol--;
                    next = new ChessPosition(xrow, xcol);
                    if (board.getPiece(next) != null){
                        if (xrow == 8){
                            ChessMove newMove = new ChessMove(pos, next, ChessPiece.PieceType.KNIGHT);
                            moves.add(newMove);
                            newMove = new ChessMove(pos, next, ChessPiece.PieceType.BISHOP);
                            moves.add(newMove);
                            newMove = new ChessMove(pos, next, ChessPiece.PieceType.QUEEN);
                            moves.add(newMove);
                            newMove = new ChessMove(pos, next, ChessPiece.PieceType.ROOK);
                            moves.add(newMove);

                        } else {
                            ChessMove newMove = new ChessMove(pos, next, null);
                            moves.add(newMove);
                        }
                    }

                    //xcol = col;
                }
            }
        }

        if (color == ChessGame.TeamColor.BLACK){
            int xrow = row;
            int xcol = col;
            if (row > 1){
                xrow--;
                ChessPosition next = new ChessPosition(xrow, xcol);
                if (board.getPiece(next) == null){
                    if (xrow == 1){
                        ChessMove newMove = new ChessMove(pos, next, ChessPiece.PieceType.KNIGHT);
                        moves.add(newMove);
                        newMove = new ChessMove(pos, next, ChessPiece.PieceType.BISHOP);
                        moves.add(newMove);
                        newMove = new ChessMove(pos, next, ChessPiece.PieceType.QUEEN);
                        moves.add(newMove);
                        newMove = new ChessMove(pos, next, ChessPiece.PieceType.ROOK);
                        moves.add(newMove);

                    } else {
                        ChessMove newMove = new ChessMove(pos, next, null);
                        moves.add(newMove);
                    }

                    if (row == 7){
                        next = new ChessPosition(xrow-1, xcol);
                        if (board.getPiece(next) == null){
                            ChessMove newMove = new ChessMove(pos, next, null);
                            moves.add(newMove);
                        }

                    }
                }
                if(col < 8){
                    xcol++;
                    next = new ChessPosition(xrow, xcol);
                    if (board.getPiece(next) != null){
                        if (board.getPiece(next).getTeamColor() != color){
                            if (xrow == 1){
                                ChessMove newMove = new ChessMove(pos, next, ChessPiece.PieceType.KNIGHT);
                                moves.add(newMove);
                                newMove = new ChessMove(pos, next, ChessPiece.PieceType.BISHOP);
                                moves.add(newMove);
                                newMove = new ChessMove(pos, next, ChessPiece.PieceType.QUEEN);
                                moves.add(newMove);
                                newMove = new ChessMove(pos, next, ChessPiece.PieceType.ROOK);
                                moves.add(newMove);

                            } else {
                                ChessMove newMove = new ChessMove(pos, next, null);
                                moves.add(newMove);
                            }
                        }
                    }


                    xcol = col;
                }
                if(col > 1){
                    xcol--;
                    next = new ChessPosition(xrow, xcol);
                    if (board.getPiece(next) != null){
                        if (xrow == 1){
                            ChessMove newMove = new ChessMove(pos, next, ChessPiece.PieceType.KNIGHT);
                            moves.add(newMove);
                            newMove = new ChessMove(pos, next, ChessPiece.PieceType.BISHOP);
                            moves.add(newMove);
                            newMove = new ChessMove(pos, next, ChessPiece.PieceType.QUEEN);
                            moves.add(newMove);
                            newMove = new ChessMove(pos, next, ChessPiece.PieceType.ROOK);
                            moves.add(newMove);

                        } else {
                            ChessMove newMove = new ChessMove(pos, next, null);
                            moves.add(newMove);
                        }
                    }

                    //xcol = col;
                }
            }



        }

        return moves;

    }
}
