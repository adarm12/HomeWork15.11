import  java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        double theSumOfTheNumbers; // הגדרת משתנה לסכום של של שני המספרים
        System.out.println("Enter the firstNumber: ");
        firstNumber = scanner.nextDouble();
        System.out.println("Enter the secondNumber: ");
        secondNumber = scanner.nextDouble();
        theSumOfTheNumbers = firstNumber + secondNumber;
        if ( theSumOfTheNumbers%2==0) {
            System.out.println("The sum is double"); }
        else {
            System.out.println("The sum is not double"); }
    }
}
