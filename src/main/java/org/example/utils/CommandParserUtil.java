package org.example.utils;

import org.example.exceptions.InvalidPositionCommandException;

public class CommandParserUtil {

    public static int[] parsePositionToCoordinates(String chessPosition) {
        //System.out.println("Parsing chess position: " + chessPosition);

        if (chessPosition == null || chessPosition.length() != 2) {
            throw new InvalidPositionCommandException("Invalid chess position input: " + chessPosition);
        }

        char column = Character.toUpperCase(chessPosition.charAt(0));
        int row = Character.getNumericValue(chessPosition.charAt(1));

        //System.out.println("Parsed column: " + column + ", row: " + row);

        int outputCol = ColumnMapping.fromChar(column);
        int outputRow = 8 - row + 1;

        //System.out.println("Converted to internal coordinates: (" + outputRow + ", " + outputCol + ")");
        return new int[]{outputRow, outputCol};
    }


    public String convertToChessNotation(int row, int col) {
        if (row < 1 || row > 8 || col < 1 || col > 8) {
            throw new InvalidPositionCommandException("Cannot convert invalid indices to chess notation: " + row + ", " + col);
        }
        char outputColumn = (char) ('A' + col - 1);  // fix here
        int outputRow = 8 - row + 1;
        return "" + outputColumn + outputRow;
    }
}
