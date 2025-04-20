package org.example.models;

import org.example.utils.MoveUtils;

import java.util.List;

public class King implements ChessPiece {
    @Override
    public String getName() {
        return "King";
    }

    @Override
    public List<Position> getPossibleMoves(Position currentPosition) {
        List<MovementStrategy> kingMovementStrategy = List.of(
                new BackwardMovementStrategy(1),
                new SidewaysMovementStrategy(1),
                new ForwardMovementStrategy(1),
                new DiagonalMovementStrategy(1)
        );
        return MoveUtils.collectMoves(currentPosition, kingMovementStrategy);
    }

}
