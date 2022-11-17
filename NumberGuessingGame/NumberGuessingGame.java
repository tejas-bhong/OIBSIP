import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        int randomNumber;
        int userNumber;
        int score = 0;
        int chances = 7;
        int trial = 1;

        randomNumber = (int) (Math.random() * 100);
        System.out.println("Guess a number between 1 to 100");
        System.out.println("You have 7 chances to go...");
        System.out.println("Good Luck!!!");
        do {

            System.out.println("Enter your answer: ");
            Scanner sc = new Scanner(System.in);
            userNumber = sc.nextInt();
            if (trial < chances) {

                if (userNumber == randomNumber) {

                    System.out.println("You won");
                    break;
                } else if (userNumber > randomNumber) {

                    System.out.println("Number too large");
                } else {

                    System.out.println("Number too small");
                }
                trial++;
                score = (chances - trial + 1) * 100 / chances;
            } else if (trial == chances && userNumber == randomNumber) {

                System.out.println("You won");
                break;
            } else {

                System.out.println("Out of chances! Better luck next time.");
                score = 0;
                break;
            }
        } while (userNumber > 0);
        System.out.println("The number is: " + randomNumber);
        if (userNumber > 0) {

            System.out.println("Your score: " + score + "%");
        } else {

            System.out.println("Wanna try again?");
        }
        System.out.println("Press 1 to play again and 0 to exit: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {

            main(args);
        } else {

            System.out.println("Thank you");
        }
    }
}
