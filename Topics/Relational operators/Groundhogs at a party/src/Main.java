import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeanutButterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        if (isWeekend) {
            boolean greaterThanEqualTo15 = 15 <= numberOfPeanutButterCups;
            boolean lessThanEqualTo25 = 25 >= numberOfPeanutButterCups;

            boolean isFunParty = greaterThanEqualTo15 && lessThanEqualTo25;
            System.out.println(isFunParty);
        }

        if (!isWeekend) {
            boolean greaterThanEqualTo10 = 10 <= numberOfPeanutButterCups;
            boolean lessThanEqualTo20 = 20 >= numberOfPeanutButterCups;

            boolean isFunParty = greaterThanEqualTo10 && lessThanEqualTo20;
            System.out.println(isFunParty);
        }
    }
}