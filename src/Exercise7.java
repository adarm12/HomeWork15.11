import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selectedDay;
        int earlyArrivalTime;
        int lateArrivalTime;
        System.out.println("Enter the selected day: ");
        selectedDay = scanner.nextInt();
        if (selectedDay == 7 || selectedDay == 6) {
            System.out.println("On Fridays and Saturdays the offices are closed: ");
        }
        if (selectedDay > 7 || selectedDay < 0) {
            System.out.println("Weekdays are Sunday through Saturday ");
        }
        if (selectedDay == 3) {
            System.out.println("What is the earliest hour you can arrive?: ");
            earlyArrivalTime = scanner.nextInt();
            System.out.println("What is the latest hour you can arrive?: ");
            lateArrivalTime = scanner.nextInt();
            if (earlyArrivalTime >= 8 || lateArrivalTime <= 12) {
                if (earlyArrivalTime > lateArrivalTime) {
                    System.out.println("The selected hours are invalid: ");
                }
                if (lateArrivalTime > earlyArrivalTime) {
                    if (earlyArrivalTime < 8 || lateArrivalTime > 12) {
                        System.out.println("Opening hours 8-12: ");
                    } else {
                        System.out.println("OK: ");
                    }
                }
            }
            if (lateArrivalTime > 23 || earlyArrivalTime < 0) {
                System.out.println("The offices are now closed, opening hours 8-12: ");
            }
        }
        if (selectedDay == 1 || selectedDay == 2 || selectedDay == 4 || selectedDay == 5) {
            System.out.println("What is the earliest hour you can arrive?: ");
            earlyArrivalTime = scanner.nextInt();
            System.out.println("What is the latest hour you can arrive?: ");
            lateArrivalTime = scanner.nextInt();
            if (earlyArrivalTime >= 9 || lateArrivalTime <= 17) {
                if (earlyArrivalTime > lateArrivalTime) {
                    System.out.println("The selected hours are invalid: ");
                }
                if (lateArrivalTime > earlyArrivalTime) {
                    if (earlyArrivalTime < 9 || lateArrivalTime > 17) {
                        System.out.println("Opening hours 9-17: ");
                    } else {
                        System.out.println("OK: ");
                    }
                }
            }
            if (lateArrivalTime > 23 || earlyArrivalTime < 0) {
                System.out.println("The offices are now closed, opening hours 9-17: ");
            }
        }
    }
}


