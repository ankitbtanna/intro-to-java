import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int d = keyboard.nextInt();
        for (int i = 1; i <= 1000; i++) {
            if (isCubic(a, b, c, d, i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isCubic(int a, int b, int c, int d, int x) {
        boolean cubic = false;
        int output = a * x * x * x + b * x * x + c * x + d;
        if (output == 0) {
            cubic = true;
        }
        return cubic;
    }
}
