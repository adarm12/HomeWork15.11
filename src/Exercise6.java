import  java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber;
        int numberOfOrgans;
        int difference;
        System.out.println("Enter the firstNumber: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the difference: ");
        difference = scanner.nextInt();
      do {
          System.out.println("Enter the number of organs in the series: ");
          numberOfOrgans = scanner.nextInt();
      }
        while (numberOfOrgans <= 0);

        series(firstNumber,numberOfOrgans,difference);
    }
    public static void series(int firstNumber, int numberOfOrgans, int difference) {
        System.out.print("The invoice series is: ");
        for (int i = 1; i <= numberOfOrgans; i++) {
            System.out.print(firstNumber + ",");
            firstNumber = firstNumber + difference;
        }
    }
}