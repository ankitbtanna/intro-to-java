import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigitNumber = scanner.nextInt();

        int firstNumber = threeDigitNumber / 100;
        int secondAndThirdNumber = threeDigitNumber % 100;

        if (secondAndThirdNumber == 0) {
            System.out.println(firstNumber);
        } else {
            int secondNumber = secondAndThirdNumber / 10;
            int thirdNumber = secondAndThirdNumber % 10;
            System.out.println(firstNumber + secondNumber + thirdNumber);
        }
    }
}