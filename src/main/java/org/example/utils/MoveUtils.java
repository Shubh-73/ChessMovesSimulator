package org.example.utils;

import org.example.models.MovementStrategy;
import org.example.models.Position;

import java.util.ArrayList;
import java.util.List;

public class MoveUtils {

    public static List<Position> collectMoves(Position currentPosition, List<MovementStrategy> movementStrategies){

        List<Position> allMoves = new ArrayList<>();

        for(MovementStrategy strategy : movementStrategies){
            allMoves.addAll(strategy.getMoves(currentPosition));
        }
        return allMoves;
    }
}
