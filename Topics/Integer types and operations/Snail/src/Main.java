import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int heightOfThePole = scanner.nextInt();
        int heightPerDay = scanner.nextInt();
        int heightPerNight = scanner.nextInt();

        System.out.println((heightOfThePole - heightPerNight - 1) / (heightPerDay - heightPerNight) + 1);
    }
}