# Chess Move Simulator

This project is a command-line-based Chess Move Simulator written in Java. It allows users to simulate and calculate possible moves for various chess pieces based on their positions on a chessboard. The game follows standard chess rules, including specific movement rules for each piece.

## Assumptions
    
- Major assumption of the project is that all the pieces in the board shall be white, therefore, on a chess board, a pawn shall only move from A1 to A8
- A pawn also has diagonal movement while capturing, however, that part is not considered in this version. 

## Features

- Simulate chess moves for the following pieces:
    - **King**
    - **Queen**
    - **Pawn**

- Though the current simulator simulates only three types of pieces, as per the given requirement, but since the movement is backed by strategy, more pieces can be added without changing the existing code



## Project Structure

- `src/`: The source code for the application.
- `target/`: The build directory created by Maven (auto-generated).
- `pom.xml`: The Maven configuration file, including dependencies.
- `.gitignore`: A file that specifies which files and directories Git should ignore.

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Shubh-73/ChessMovesSimulator.git


2. Navigate to the project directory:

   cd chess-simulator

3. Build the project using Maven

   mvn clean install

4. Run the simulator

   mvn exec:java


### **Usage**

Once you start the program, you will be prompted to enter commands. 
The format for commands is as follows:


<Piece> <Position>

For example:

    Queen D4
    King E5
    Pawn A2

Sample Input and Output:
    Welcome to Chess Moves Simulator!

    Enter command: Queen D4

    Possible moves: D5, D6, D7, D8, C4, B4, A4, E4, F4, G4

    Enter command: Pawn A2

    Possible moves: A3, A4

    Enter command: exit

    Let the force be with you! Goodbye.
    
### Development

Running Tests
If you want to run the tests:

    mvn test

This will run the existing unit tests for the movement logic and other functionality in the application.

### **Contribution**

Feel free to fork the repository and create pull requests. Any contributions or improvements are welcome!


### Explanation:
- **Features**: Gives an overview of what the project supports (e.g., different pieces, movement types).
- **Project Structure**: Explains the directory layout and what each part of the project is for.
- **Installation**: Provides the steps for cloning, building, and running the project.
- **Usage**: Example commands and expected output from the Chess Moves Simulator.
- **Development/Tests**: Instructions for running tests (if any).
- **Contribution**: Encouragement to contribute to the project.

Any suggestions or feedback shall be welcomed !! 