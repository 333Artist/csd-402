import java.util.Random;
import javax.swing.JOptionPane;

public class Rock_Paper_Scissors {
    //NOTE : I decided to utilize a ENUM list 
    //-The assignment requirement were adamandant about using 
    //...numbers as identifiers of the moves...
    //...and I was more familiar with Strings...
    //...which led me to using the ID for the ENUM lists...
    //...as the way to create the move...


    //Define the Move Enum

    enum Move {

    // Constants | States
        ROCK(1, "Rock"), 
        PAPER(2, "Paper"), 
        SCISSORS(3, "Scissors");

    // Fields | NON-Changable 
        private final int value;
        private final String name;

    // Constructor 
        Move(int value, String name) {
            this.value = value;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        // Helper method to match the user's number input to an Enum constant
        // ...I think this reminds me of SQL serial number look-ups...
        public static Move fromInt(int num) {
            for (Move move : Move.values()) {
                if (move.value == num) {
                    return move;
                }
            }
            return null; // Return null if the number doesn't match 1, 2, or 3
        }

        // Inside the enum, we can cleanly define the winning logic
        //...I don't like how java uses first person, this, to refer to itself...
        public int compareMoves(Move opponent) {
            if (this == opponent) return 0; // Tie


        //...I don't know why, but the switch method always has the caution squiggle underneath it...
        //...The first time I made the switch statement, I had it in the MAIN and it was not working...

        //Opponent is passed into parathesis
        //Only asks if your playing agaisnt a winning move or a move that ties.
            switch (this) {
                case ROCK:
                    //Rock wins agaisnt scissors
                    return (opponent == SCISSORS) ? 1 : -1;
                case PAPER:
                    //Paper wins agaisnt Rock
                    return (opponent == ROCK) ? 1 : -1;
                case SCISSORS:
                    //Scissors wins agaisnt Paper
                    return (opponent == PAPER) ? 1 : -1;
                default:
                    //loses
                    return -1;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        boolean playAgain = true;

        JOptionPane.showMessageDialog(null, 
            "Welcome to Rock, Paper, Scissors!\nLet's play.", 
            "Rock Paper Scissors", 
            JOptionPane.INFORMATION_MESSAGE);

    //Game Loop

        while (playAgain) {
            // Get user input
            String input = JOptionPane.showInputDialog(null, 
                "Enter your choice:\n1 = Rock\n2 = Paper\n3 = Scissors", 
                "Make Your Move", 
                JOptionPane.QUESTION_MESSAGE);

            if (input == null) break; 

            int userNum;
            try {
                userNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number!");
                continue;
            }

            //Convert the integer input into our Move Enum
            Move userMove = Move.fromInt(userNum);

            if (userMove == null) {
                JOptionPane.showMessageDialog(null, "Invalid choice! Please choose 1, 2, or 3.");
                continue; 
            }

            //Computer Move using Enum values array
            Move[] moves = Move.values();
            Move computerMove = moves[random.nextInt(moves.length)];

            //Determine Winner using Enum method
            String resultMessage = "You chose: " + userMove.getName() + "\nComputer chose: " + computerMove.getName() + "\n\n";
            int result = userMove.compareMoves(computerMove);

            if (result == 0) {
                resultMessage += "It's a tie!";
            } else if (result > 0) {
                resultMessage += "You win!";
            } else {
                resultMessage += "Computer wins!";
            }

            // Display Results
            JOptionPane.showMessageDialog(null, resultMessage, "Game Result", JOptionPane.INFORMATION_MESSAGE);

            // Ask to play again
            int response = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Play Again?", JOptionPane.YES_NO_OPTION);
            if (response != JOptionPane.YES_OPTION) {
                playAgain = false;
            }
        }

        JOptionPane.showMessageDialog(null, "Thanks for playing!", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
    }
}