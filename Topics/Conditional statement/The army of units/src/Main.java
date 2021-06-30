import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unitsOfArmy = scanner.nextInt();

        if (unitsOfArmy < 1) {
            System.out.println("no army");
        }

        if (unitsOfArmy >= 1 && unitsOfArmy <= 19) {
            System.out.println("pack");
        }

        if (unitsOfArmy >= 20 && unitsOfArmy <= 249) {
            System.out.println("throng");
        }

        if (unitsOfArmy >= 250 && unitsOfArmy <= 999) {
            System.out.println("zounds");
        }

        if (unitsOfArmy >= 1000) {
            System.out.println("legion");
        }
    }
}