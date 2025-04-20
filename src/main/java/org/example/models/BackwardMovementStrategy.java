package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class BackwardMovementStrategy implements MovementStrategy {
    private final int maxSteps;

    public BackwardMovementStrategy(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    @Override
    public List<Position> getMoves(Position position) {
        List<Position> moves = new ArrayList<>();

        for (int step = 1; step <= maxSteps; step++) {
            Position nextPosition = new Position(position.getRow() + step, position.getColumn());
            if (nextPosition.isValid()) {
                moves.add(nextPosition);
            } else {
                break;
            }
        }

        return moves;
    }
}
