import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();

        String trimmedLine1 = line1.replaceAll("\\s", "");
        String trimmedLine2 = line2.replaceAll("\\s", "");

        System.out.println(trimmedLine1.equals(trimmedLine2));
    }
}