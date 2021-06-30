import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isAPositive = a > 0 && b <= 0 && c <= 0;
        boolean isBPositive = a <= 0 && b > 0 && c <= 0;
        boolean isCPositive = a <= 0 && b <= 0 && c > 0;

        boolean isAny = isAPositive || isBPositive || isCPositive;

        System.out.println(isAny);
    }
}