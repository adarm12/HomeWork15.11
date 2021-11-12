import  java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userResponse;
        double hour;
        int day;
        int start=5;
        while (start == 5) {
            System.out.println("Select 1 for senior employee Select 0 for minor employee: ");
            userResponse = scanner.nextInt();
            while (userResponse != 0 && userResponse != 1) {
                System.out.println("The selected number is invalid: ");
                System.out.println("Select 1 for senior employee Select 0 for minor employee: ");
                userResponse = scanner.nextInt();
            }
            System.out.println("Type the number of hours the employee has worked: ");
            hour = scanner.nextDouble();
            System.out.println("Enter the number of days the employee has reached the daily destination: ");
            day = scanner.nextInt();
            calculationOfSalary(userResponse, hour, day);
            System.out.println("To calculate the salary once more, press 9 ");
            start = scanner.nextInt();
        }
    }
    public static void calculationOfSalary(int userResponse, double hour, int day) {
        double salary;
        if (userResponse == 0) {
            salary = hour * 50 + day * 250;
        }
        else {
            salary = hour * 200 + day * 250;
        }
        System.out.println("The employee's salary is: " + salary);
    }
}
