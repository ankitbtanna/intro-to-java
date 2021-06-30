import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int quantity = s.nextInt();
        int number = 0;

        for (int i = 0; i < quantity; i++) {
            int test = s.nextInt();
            if (test % 4 == 0 && test > number) {
                number = test;
            }
        }
        System.out.println(number);
    }
}