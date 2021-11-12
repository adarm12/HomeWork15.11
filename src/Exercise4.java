import  java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;
        double root; // הגדרת משתנה לתוצאה שבתוך השורש
        double result; // הגדרת משתנה לתוצאה הסופית של התרגיל
        System.out.println("Enter the a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the c: ");
        c = scanner.nextDouble();
        root = (b*b)-(4*a*c);
        if (root<0) { // מקרה שבו השורש שלילי
            System.out.println("No solution found");
        }
        if (root==0) { // מקרה שבו השורש שווה לאפס
            result=-b/(2*a);
            System.out.println("There is only one solution" +result);
            System.out.println("The result is " +result);
        }
        if (root>1) { // מקרה שבו יש שני פתרונות
            System.out.println("There are two solutions");
            root = Math.sqrt(root);
            result = (-b+root)/(2*a);
            System.out.println("The first result x1 is " +result);
            result = (-b-root)/(2*a);
            System.out.println("The second result x2 is " +result);
        }
    }
}
