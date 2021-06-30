import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> nums = List.of(scan.nextLine().split("\\s+"));
        nums.forEach(System.out::println);
    }
}