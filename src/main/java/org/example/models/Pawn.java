package org.example.models;

import org.example.exceptions.InvalidPositionCommandException;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements ChessPiece {

    @Override
    public String getName() {
        return "Pawn";
    }

    @Override
    public List<Position> getPossibleMoves(Position currentPosition) {
        if(currentPosition.getRow() == 8){
            throw new InvalidPositionCommandException("pawn cannot be placed on the first rank");
        }

        if(currentPosition.getRow() == 7){
            return new ForwardMovementStrategy(2).getMoves(currentPosition);
        }
        return new ForwardMovementStrategy(1).getMoves(currentPosition);
    }
}
