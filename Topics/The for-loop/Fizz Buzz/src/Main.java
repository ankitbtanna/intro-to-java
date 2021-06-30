import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        for (int i = number1; i <= number2; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }

            if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
            }

            if (i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
            }

            if (i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}