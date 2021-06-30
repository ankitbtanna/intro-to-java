import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long firstNumber = scanner.nextLong();
        long secondNumber = scanner.nextLong();

        long multiplication = 1;

        for (long i = firstNumber; i < secondNumber; i++) {
            multiplication *= i;
        }

        System.out.println(multiplication);
    }
}