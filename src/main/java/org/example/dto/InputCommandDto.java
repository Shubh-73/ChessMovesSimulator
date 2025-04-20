package org.example.dto;

public class InputCommandDto {

    private final String pieceName;
    private final String positionCommand;

    public InputCommandDto(String pieceName, String positionCommand) {
        this.pieceName = pieceName;
        this.positionCommand = positionCommand;
    }

    public String getPieceName() {
        return pieceName;
    }

    public String getPositionCommand() {
        return positionCommand;
    }
}
