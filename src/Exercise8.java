import java.util.Scanner;
public class Exercise8 {
    public static void main(String[] args) {
        int screenPrinting = userNumber();
        screen(screenPrinting);
    }

    public static int userNumber() {
        Scanner scanner = new Scanner(System.in);
        int TheSelectedNumber;
        do {
            System.out.println("Type a number between 5 and 20: ");
            TheSelectedNumber = scanner.nextInt();
        }
        while (TheSelectedNumber < 5 || TheSelectedNumber > 20);
        return TheSelectedNumber;
    }

    public static void screen ( int number ){
        for (int i = 1; i <= number ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
