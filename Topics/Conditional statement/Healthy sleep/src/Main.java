import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = scanner.nextInt();
        int excess = scanner.nextInt();
        int hoursOfSleep = scanner.nextInt();

        if (hoursOfSleep < min) {
            System.out.println("Deficiency");
        }

        if (hoursOfSleep > excess) {
            System.out.println("Excess");
        }

        if (hoursOfSleep >= min && hoursOfSleep <= excess) {
            System.out.println("Normal");
        }
    }
}