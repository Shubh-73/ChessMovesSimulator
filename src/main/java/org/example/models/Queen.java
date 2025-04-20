package org.example.models;

import org.example.utils.MoveUtils;

import java.util.List;

public class Queen implements ChessPiece {
    @Override
    public String getName() {
        return "Queen";
    }

    @Override
    public List<Position> getPossibleMoves(Position currentPosition) {

        List<MovementStrategy> queenMovementStrategies = List.of(
                new DiagonalMovementStrategy(7),
                new BackwardMovementStrategy(7),
                new SidewaysMovementStrategy(7),
                new ForwardMovementStrategy(7)
        );

        return MoveUtils.collectMoves(currentPosition, queenMovementStrategies);
    }
}
