import java.util.Scanner;
public class Exercise9 {
    public static void main(String[] args) {
        int theFirstNumbers = positiveNumber();
        System.out.println( "The prime numbers are:");
        for (int i = 1; i <= theFirstNumbers; i++) {
            if (primeNumber(i) == false) {
                System.out.print( i + ",");
            }
        }
    }


    public static boolean noResidue(int number1, int number2) {
        boolean answer;
        answer = (number1 % number2 == 0);
        return answer;
    }

    public static boolean primeNumber(int number) {
        boolean primeNum = false;
        for (int i = 2; i < number; i++) {
            primeNum = noResidue(number, i);
            if (primeNum == true) {
                break;
            }
        }
        return primeNum;
    }


    public static int positiveNumber() {
        int thePositiveNumberOfTheUser;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter positive number: ");
            thePositiveNumberOfTheUser = scanner.nextInt();
        }
        while (thePositiveNumberOfTheUser <= 0);
        {
            return thePositiveNumberOfTheUser;
        }
    }
}
