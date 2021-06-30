import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Takes input for n number of parts
        int number = scanner.nextInt();

        // Initialize the inventory of larger, smaller and perfect parts
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        // input number variable
        int number2 = 0;

        for (int i = 0; i < number; i++) {
            // scan the input
            number2 = scanner.nextInt();

            if (number2 == 0) {
                perfect++;
            }

            if (number2 == -1) {
                smaller++;
            }

            if (number2 == 1) {
                larger++;
            }
        }

        System.out.print(perfect + " ");
        System.out.print(larger + " ");
        System.out.print(smaller);
    }
}