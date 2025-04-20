package org.example;

import org.example.controllers.ChessSimulatorController;
import org.example.exceptions.InvalidPieceException;
import org.example.exceptions.InvalidPositionCommandException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ChessSimulatorControllerTest {

    @Test
    public void testQueenAtD4_ShouldReturnCorrectMoves() throws Exception {
        ChessSimulatorController controller = new ChessSimulatorController();

        List<String> moves = controller.getMovesFromCommand("Queen D4");

        assertTrue(moves.contains("C3"));
        assertTrue(moves.contains("E5"));
        assertTrue(moves.contains("D5"));
    }

    @Test
    public void testKingAtLeftEdge_ShouldReturnCorrectMoves() throws Exception {

        ChessSimulatorController controller = new ChessSimulatorController();
        List<String> moves = controller.getMovesFromCommand("King h1");

        assertTrue(moves.contains("G1"));
        assertTrue(moves.contains("G2"));
        assertTrue(moves.contains("H2"));
        assertFalse(moves.contains("H0"));
    }

    @Test
    public void testPawnAtTopEdge_ShouldReturnEmptyList() throws Exception {

        ChessSimulatorController controller = new ChessSimulatorController();
        List<String> moves = controller.getMovesFromCommand("Pawn a8");

        assertTrue(moves.isEmpty());
    }

    @Test
    public void testQueenAtTopRightEdge_ShouldReturnCorrectMoves() throws Exception {
        ChessSimulatorController controller = new ChessSimulatorController();
        List<String> moves = controller.getMovesFromCommand("Queen h8");
        assertTrue(moves.size() == 21);
        assertTrue(moves.contains("A8"));
        assertTrue(moves.contains("B2"));
        assertTrue(moves.contains("H1"));
    }

    @Test
    public void testInvalidCommand_ShouldThrowException() {
        ChessSimulatorController controller = new ChessSimulatorController();

        assertThrows(InvalidPositionCommandException.class, () -> {
            controller.getMovesFromCommand("Queen");
        });
    }

    @Test
    public void testInvalidPiece_ShouldThrowException() {
        ChessSimulatorController controller = new ChessSimulatorController();

        assertThrows(InvalidPieceException.class, () -> {
            controller.getMovesFromCommand("Dragon A1");
        });
    }
}

