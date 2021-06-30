import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int firstNumber = input % 10;
        int secondAndThirdNumber = input / 10;
        int secondNumber = secondAndThirdNumber % 10;
        int thirdNumber = secondAndThirdNumber / 10;

        if (firstNumber != 0) {
            System.out.print(firstNumber);
            System.out.print(secondNumber);
            System.out.print(thirdNumber);
        } else {
            if (secondNumber != 0) {
                System.out.print(secondNumber);
                System.out.print(thirdNumber);
            } else {
                if (thirdNumber != 0) {
                    System.out.print(thirdNumber);
                }
            }
        }
    }
}