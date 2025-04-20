package org.example.models;

import java.util.List;

public interface MovementStrategy {

    List<Position> getMoves(Position position);
}
