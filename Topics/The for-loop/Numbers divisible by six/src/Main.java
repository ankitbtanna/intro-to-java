import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();

        int sum = 0;
        int number = 0;
        for (int i = 0; i < quantity; i++) {
            number = scanner.nextInt();

            if (number % 6 == 0) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}