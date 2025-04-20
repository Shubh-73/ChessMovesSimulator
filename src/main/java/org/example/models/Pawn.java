package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class Pawn implements ChessPiece {

    @Override
    public String getName() {
        return "Pawn";
    }

    @Override
    public List<Position> getPossibleMoves(Position currentPosition) {

        return new ForwardMovementStrategy(1).getMoves(currentPosition);
    }
}
