package org.example;

import org.example.models.Position;
import org.example.models.Queen;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QueenTest {

    @Test
    void red_shouldReturnMultipleDirectionsMoves() {
        Queen queen = new Queen();
        Position start = new Position(4, 4);

        List<Position> moves = queen.getPossibleMoves(start);

        assertTrue(moves.contains(new Position(5, 5)));
        assertTrue(moves.contains(new Position(4, 1)));
        assertTrue(moves.contains(new Position(1, 4)));
        assertTrue(moves.contains(new Position(6, 4)));

        assertFalse(moves.contains(new Position(-1, -1)));
    }
}

