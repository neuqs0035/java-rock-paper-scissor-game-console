import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        System.out.println("|    Rock Paper Scissors Game    |");
        System.out.println("-----------------------------------");

        while (true) {

            System.out.println("\n--------   Main Menu  --------");
            System.out.println("\n1. Rock\n2. Paper\n3. Scissors");

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nChoose your move (1-3): ");
            int playerChoice = scanner.nextInt();

            int computerChoice = getRandomNum();

            System.out.println("\nYour Choice: " + getChoiceName(playerChoice));
            System.out.println("Computer Choice: " + getChoiceName(computerChoice));

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("\nInvalid Input, please choose between 1 and 3.");
            } else if ((playerChoice == 2 && computerChoice == 1) || (playerChoice == 3 && computerChoice == 2)
                    || (playerChoice == 1 && computerChoice == 3)) {
                System.out.println("\nComputer Wins! Better luck next time.");
            } else if (playerChoice == computerChoice) {
                System.out.println("\nIt's a Tie! Try again.");
            } else {
                System.out.println("\nCongratulations! You Win! Let's go for another round!");
            }
        }
    }

    public static int getRandomNum() {
        Random random = new Random();
        return random.nextInt(1, 4);
    }

    public static String getChoiceName(int choiceNum) {
        if (choiceNum == 1) {
            return "Rock";
        } else if (choiceNum == 2) {
            return "Paper";
        } else {
            return "Scissors";
        }
    }
}
