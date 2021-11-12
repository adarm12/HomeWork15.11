import  java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double thirdNumber;
        System.out.println("Enter the firstNumber: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Enter the secondNumber: ");
        secondNumber = scanner.nextDouble();
        System.out.println("Enter the thirdNumber: ");
        thirdNumber = scanner.nextDouble();
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            System.out.println("The biggest number " + firstNumber);
            if (secondNumber > thirdNumber) {
                System.out.println("The next number " + secondNumber);
                System.out.println("The smallest number " + thirdNumber);
            }
            else {
                System.out.println("The next number " + thirdNumber);
                System.out.println("The smallest number " + secondNumber);
            }
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println("The biggest number " + secondNumber);
            if (firstNumber > thirdNumber) {
                System.out.println("The next number " + firstNumber);
                System.out.println("The smallest number " + thirdNumber);
            } else {
                System.out.println("The next number " + thirdNumber);
                System.out.println("The smallest number " + firstNumber);
            }
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            System.out.println("The biggest number " + thirdNumber);
            if (firstNumber > secondNumber) {
                System.out.println("The next number " + firstNumber);
                System.out.println("The smallest number " + secondNumber);
            }
            else {
                System.out.println("The next number " + secondNumber);
                System.out.println("The smallest number " + firstNumber);
            }

        }
    }
}
