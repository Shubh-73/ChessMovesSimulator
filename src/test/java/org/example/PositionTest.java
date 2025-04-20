package org.example;

import org.example.models.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {

    @Test
    void red_shouldParseValidChessNotation() {
        Position pos = new Position(5, 5);
        assertTrue(pos.isValid());
    }

    @Test
    void red_shouldDetectInvalidNegativeRow() {
        Position pos = new Position(-1, 4);
        assertFalse(pos.isValid());
    }

    @Test
    void red_shouldDetectInvalidColumnGreaterThan8() {
        Position pos = new Position(4, 9);
        assertFalse(pos.isValid());
    }
}
