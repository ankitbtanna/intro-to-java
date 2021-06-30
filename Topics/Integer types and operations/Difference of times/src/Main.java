import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int hourDifference = hour2 - hour1;
        int minDifference = min2 - min1;
        int secondsDifference = seconds2 - seconds1;

        int totalSeconds = hourDifference * 60 * 60 + minDifference * 60 + secondsDifference;

        System.out.println(totalSeconds);
    }
}