package org.example.models;

import java.util.ArrayList;
import java.util.List;


    /**
     * Forward movement strategy can be exhibited by all three pieces under the consideration,
     * which again comes with the same restriction as the diagonal movement strategy.
     *
     * Therefore, this too shall have an attribute to define what is the max step that can
     * be taken.
     *
     */

public class ForwardMovementStrategy implements MovementStrategy {
    private final int maxSteps;

    public ForwardMovementStrategy(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    @Override
    public List<Position> getMoves(Position position) {
        List<Position> moves = new ArrayList<>();

        for (int step = 1; step <= maxSteps; step++) {
            Position nextPosition = new Position(position.getRow() - step, position.getColumn());
            if (nextPosition.isValid()) {
                moves.add(nextPosition);
            } else {
                break;
            }
        }

        return moves;
    }
}
