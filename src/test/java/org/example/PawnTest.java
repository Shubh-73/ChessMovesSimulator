package org.example.models;

import org.example.exceptions.InvalidPositionCommandException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PawnTest {

    private final Pawn pawn = new Pawn();

    @Test
    void testPawnFromSecondRow_ShouldReturnTwoMoves() {
        Position position = new Position(7, 4); // E7 in chess
        List<Position> moves = pawn.getPossibleMoves(position);

        assertEquals(2, moves.size(), "Pawn should have 2 forward moves from row 7");
        assertEquals(6, moves.get(0).getRow());
        assertEquals(5, moves.get(1).getRow());
    }

    @Test
    void testPawnFromMiddleRow_ShouldReturnOneMove() {
        Position position = new Position(5, 4); // E5 in chess
        List<Position> moves = pawn.getPossibleMoves(position);

        assertEquals(1, moves.size(), "Pawn should have 1 forward move from middle rows");
        assertEquals(4, moves.get(0).getRow());
    }

    @Test
    void testPawnFromLastRow_ShouldThrowException() {
        Position position = new Position(8, 4); // E8 (Invalid)
        assertThrows(
                InvalidPositionCommandException.class,
                () -> pawn.getPossibleMoves(position),
                "Pawn should not be allowed to be placed on row 8"
        );
    }

    @Test
    void testPawnFromRow1_ShouldReturnNoMove() {
        Position position = new Position(1, 4); // E1
        List<Position> moves = pawn.getPossibleMoves(position);

        assertEquals(0, moves.size(), "Pawn should not have forward moves from row 1");
    }
}
