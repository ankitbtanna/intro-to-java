import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        boolean isFirstInBetweenSecondAndThird = firstNumber >= secondNumber && firstNumber <= thirdNumber;
        boolean isFirstInBetweenThirdAndSecond = firstNumber >= thirdNumber && firstNumber <= secondNumber;
        System.out.println(isFirstInBetweenSecondAndThird || isFirstInBetweenThirdAndSecond);
    }
}