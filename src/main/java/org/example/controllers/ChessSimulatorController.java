package org.example.controllers;

import org.example.dto.InputCommandDto;
import org.example.exceptions.InvalidPieceException;
import org.example.exceptions.InvalidPositionCommandException;
import org.example.models.ChessPiece;
import org.example.models.Position;
import org.example.services.*;
import org.example.utils.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ChessSimulatorController {

    private final ChessMovesSimulatorService chessMovesSimulatorService;
    private final CommandParserUtil commandParserUtil;

    public ChessSimulatorController() {
        this.chessMovesSimulatorService = new ChessMovesSimulatorServiceImpl();
        this.commandParserUtil = new CommandParserUtil();
    }

    public List<String> getMovesFromCommand(String inputCommand) throws InvalidPieceException, InvalidPositionCommandException {
        String[] parts = inputCommand.trim().split("\\s+");
        if (parts.length != 2) {
            throw new InvalidPositionCommandException("Command must contain a piece and a position (e.g., 'Queen D4')");
        }

        String pieceName = parts[0];
        String positionCommand = parts[1];

        int[] coords = commandParserUtil.parsePositionToCoordinates(positionCommand);
        Position position = new Position(coords[0], coords[1]);

        return chessMovesSimulatorService.getAllMoves(pieceName, position);
    }

    public void processMoves(String inputCommand) {
        try {
            List<String> moves = getMovesFromCommand(inputCommand);

            if (moves.isEmpty()) {
                System.out.println("No legal moves available.");
            } else {
                System.out.println("Possible moves: " + String.join(", ", moves));
            }

        } catch (InvalidPieceException | InvalidPositionCommandException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}


