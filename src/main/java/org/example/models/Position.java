package org.example.models;

import org.example.exceptions.InvalidPositionCommandException;


public class Position {
    private final int row;
    private final int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public boolean isValid() {
        return row >= 1 && row <= 8 && column >= 1 && column <= 8;
    }
}