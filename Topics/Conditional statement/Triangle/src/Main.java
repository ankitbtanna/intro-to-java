import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        boolean s12v3 = side1 + side2 > side3;
        boolean s13v2 = side1 + side3 > side2;
        boolean s23v1 = side2 + side3 > side1;

        if (s12v3 && s13v2 && s23v1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}