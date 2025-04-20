package org.example.utils;

import org.example.exceptions.InvalidPositionCommandException;

public enum ColumnMapping {
    A(1), B(2), C(3), D(4), E(5), F(6), G(7), H(8);

    private final int index;

    ColumnMapping(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static int fromChar(char fileChar) {
        try {
            return ColumnMapping.valueOf(String.valueOf(Character.toUpperCase(fileChar))).getIndex();
        } catch (IllegalArgumentException e) {
            throw new InvalidPositionCommandException("Invalid file character: " + fileChar);
        }
    }
}
