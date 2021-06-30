import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        int totalDesks = 0;

        totalDesks = group1 / 2 + group2 / 2 + group3 / 2;

        if (group1 % 2 == 1) {
            totalDesks++;
        }

        if (group2 % 2 == 1) {
            totalDesks++;
        }

        if (group3 % 2 == 1) {
            totalDesks++;
        }

        System.out.println(totalDesks);
    }
}