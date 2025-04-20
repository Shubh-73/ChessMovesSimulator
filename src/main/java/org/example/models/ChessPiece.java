package org.example.models;

import java.util.List;

public interface ChessPiece {

    String getName();
    List<Position> getPossibleMoves(Position currentPosition);
}
