package org.example;

import org.example.controllers.ChessSimulatorController;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ChessSimulatorController controller = new ChessSimulatorController();

        System.out.println("Welcome to Chess Moves Simulator!");
        System.out.println("Use command format: <Piece> <Position> (e.g., 'King E4') or type 'exit'");

        while (true) {
            System.out.print("Enter command: ");
            String inputCommand = scanner.nextLine();

            if (inputCommand.equalsIgnoreCase("exit")) {
                System.out.println("Let the force be with you! Goodbye.");
                break;
            }

            controller.processMoves(inputCommand);
        }
    }
}