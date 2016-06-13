package homework_3.extras;

/*
2. Write a script for dices game.
Two players will throw dices 3 times,
player who has bigger sum of will win or
it may be draw if both players has equal sum.
Each dice roll may be from 1 to 6.
*/


public class DiceGame {

    static int numberOfRounds = 3;
    static String playerOne = "Iron Man";
    static String playerTwo = "Batman";


    static int totalPlayerOneScore;
    static int totalPlayerTwoScore;

    public static void main(String[] args) {

        startGame(DiceGame.numberOfRounds, DiceGame.playerOne, DiceGame.playerTwo);
        printResult(DiceGame.playerOne, DiceGame.playerTwo, DiceGame.totalPlayerOneScore, DiceGame.totalPlayerTwoScore);
    }

    public static void startGame(int rounds, String playerOne, String playerTwo) {

        for (int i = 1; i <= rounds; i++) {
            int playerOneScore = rollTheDice();
            int playerTwoScore = rollTheDice();

            DiceGame.totalPlayerOneScore += playerOneScore;
            DiceGame.totalPlayerTwoScore += playerTwoScore;

            System.out.println("\nRound " + i + ".");
            System.out.println(playerOne + " scored " + playerOneScore + ". Total score is " + DiceGame.totalPlayerOneScore);
            System.out.println(playerTwo + " scored " + playerTwoScore + ". Total score is " + DiceGame.totalPlayerTwoScore);
        }
    }

    public static int rollTheDice() {
        return (int) (Math.random()*6) + 1;
    }

    public static void printResult(String playerOne, String playerTwo, int playerOneScore, int playerTwoScore) {

        String winner = "";
        int winnerScore = 0;
        boolean draw = false;

        if (playerOneScore > playerTwoScore) {
            winner = playerOne;
            winnerScore = playerOneScore;

        } else if (playerOneScore < playerTwoScore) {
            winner = playerTwo;
            winnerScore = playerTwoScore;

        } else {
            draw = true;
        }

        if (draw) {
            System.out.println("\nIt`s a draw! Each player scored " + playerOneScore + " points.");
        } else {
            System.out.println("\nThe winner is ... " + winner + "!!! He scored " + winnerScore + " points.");
        }
    }
}
