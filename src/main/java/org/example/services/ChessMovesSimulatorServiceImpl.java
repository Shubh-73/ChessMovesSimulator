package org.example.services;

import org.example.exceptions.InvalidPieceException;
import org.example.models.*;
import org.example.utils.CommandParserUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ChessMovesSimulatorServiceImpl implements ChessMovesSimulatorService {

    CommandParserUtil commandParserUtil = new CommandParserUtil();

    @Override
    public List<String> getAllMoves(String pieceName, Position position) {
        ChessPiece piece = resolveChessPiece(pieceName);
        List<Position> positionalMoves = piece.getPossibleMoves(position);
        return getPositionsInChessNotations(positionalMoves);
    }

    public List<String> getPositionsInChessNotations(List<Position> positions){

        if(positions == null || positions.isEmpty()){
            System.out.println("No valid moves for the given position — likely at the edge of the board.");
        }
        List<String> formattedPositions = new ArrayList<>();
        for (Position position : positions) {
            String strintNotationForPosition = commandParserUtil.convertToChessNotation(position.getRow(), position.getColumn());
            formattedPositions.add(strintNotationForPosition);
        }
        return formattedPositions;
    }

    private ChessPiece resolveChessPiece(String chessPiece) {

        switch (chessPiece.toLowerCase(Locale.ROOT)){
            case "king":
                return new King();
            case "queen":
                return new Queen();
            case "pawn":
                return new Pawn();
            default:
                throw new InvalidPieceException("incorrect piece name or invalid piece type is mentioned:: " + chessPiece);
        }
    }
}
