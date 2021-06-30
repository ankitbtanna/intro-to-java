import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        boolean isNumber1Number220 = number1 + number2 == 20;
        boolean isNumber1Number320 = number1 + number3 == 20;
        boolean isNumber2Number320 = number2 + number3 == 20;

        boolean isAnyNumberSumUpTo20 = isNumber1Number220 || isNumber2Number320 || isNumber1Number320;

        System.out.println(isAnyNumberSumUpTo20);
    }
}