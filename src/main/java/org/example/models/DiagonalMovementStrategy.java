package org.example.models;

import java.util.ArrayList;
import java.util.List;

public class DiagonalMovementStrategy implements MovementStrategy{

    /**
     *
     *
     * this class creates the strategy for diagonal movement. There can be two types of diagonal
     * movement. One where there is no boundation and can be done acroos the board's diagonal
     * limit. This type of behaviour currently can be replicated by Queen, but if we happen to
     * have Bishop as well, then this strategy can be added.
     *
     * However, King also has diagonal movement, but that is restricted with one steps, therefore,
     * we can go ahead with the setup where there is an attribute which defines how many diagonal
     * steps can be taken.
     *
     * Also, pawn, exhibits the diagonal movement in the case of capture, in that situation
     * another class can implement the MovementStrategy with something
     * like -> DiagonalWithPawnCaptureMovementStrategy
     */


    private final int maxSteps;
    public DiagonalMovementStrategy(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    @Override
    public List<Position> getMoves(Position position) {
        List<Position> moves = new ArrayList<>();

        int[][] directions = {
                {-1, -1}, {-1, 1},  // top-left, top-right
                {1, -1}, {1, 1}     // bottom-left, bottom-right
        };

        for (int[] dir : directions) {
            for (int step = 1; step <= maxSteps; step++) {
                int newRow = position.getRow() + dir[0] * step;
                int newCol = position.getColumn() + dir[1] * step;

                Position nextPosition = new Position(newRow, newCol);
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
