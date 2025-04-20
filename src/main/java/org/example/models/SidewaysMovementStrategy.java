package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class SidewaysMovementStrategy implements MovementStrategy {
    private final int maxSteps;

    public SidewaysMovementStrategy(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    @Override
    public List<Position> getMoves(Position position) {
        List<Position> moves = new ArrayList<>();

        for (int dir : new int[]{-1, 1}) {
            for (int step = 1; step <= maxSteps; step++) {
                int newColumn = position.getColumn() + dir * step;
                Position nextPosition = new Position(position.getRow(), newColumn);

                if (nextPosition.isValid()) {
                    moves.add(nextPosition);
                } else {
                    break;
                }
            }
        }

        return moves;
    }
}
