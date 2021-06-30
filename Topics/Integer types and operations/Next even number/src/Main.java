import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int naturalNumber = scanner.nextInt();

        if (naturalNumber % 2 == 0) {
            System.out.println(naturalNumber + 2);
        } else {
            System.out.println(naturalNumber + 1);
        }
    }
}