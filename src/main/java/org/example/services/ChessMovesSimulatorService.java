package org.example.services;

import org.example.models.Position;

import java.util.List;


public interface ChessMovesSimulatorService {
    List<String> getAllMoves(String pieceName, Position position);
}
