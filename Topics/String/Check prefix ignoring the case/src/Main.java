import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.toLowerCase();

        char firstCharacter = input.charAt(0);

        System.out.println(firstCharacter == 'j');
    }
}