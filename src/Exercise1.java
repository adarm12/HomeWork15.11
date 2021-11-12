import  java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = scanner.nextInt();
        if (number > 0) {
            System.out.println("The number is " + number);
        }
        else if (number < 0) {
            number = number * (-1);
            System.out.println("The number is " + number);
        }
    }
}
