import java.util.Random;
import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Random random = new Random();
        int numberOfAttempts1 = 0;
        int numberOfAttempts2 = 0;
        int numberUser1;
        int numberUser2;
        Scanner scanner = new Scanner(System.in);
        int secretNumber = random.nextInt(1000) + 1;
        do {
            System.out.println("User 1 Select a number");
            numberUser1 = scanner.nextInt();
            numberOfAttempts1 = numberOfAttempts1 + 1;
            if (numberUser1 > secretNumber) {
                System.out.println("The last guess is bigger than the secret number ");
            }
            else if (numberUser1 < secretNumber) {
                System.out.println("The last guess is smaller than the secret number ");
            }
            else break;
            System.out.println("User 2 Select a number");
            numberUser2 = scanner.nextInt();
            numberOfAttempts2 = numberOfAttempts2 + 1;
            if (numberUser2 > secretNumber) {
                System.out.println("The last guess is bigger than the secret number ");
            }
            else if (numberUser2 < secretNumber) {
                System.out.println("The last guess is smaller than the secret number ");
                numberOfAttempts2 = numberOfAttempts2 + 1;
            }
        }
        while (numberUser2 != secretNumber);{
            if (numberUser1 == secretNumber) {
                System.out.println("User1 correctly guessed the number after " + numberOfAttempts1 + " attempts");
            }
           else {
                System.out.println("User2 correctly guessed the number after " + numberOfAttempts2 + " attempts");
            }
        }
    }
}


