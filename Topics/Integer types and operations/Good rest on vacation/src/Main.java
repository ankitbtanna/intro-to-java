import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int costOfFlight = scanner.nextInt();
        int costOfOneNight = scanner.nextInt();

        int totalFoodCost = numberOfDays * foodCostPerDay;
        int totalFlightCost = costOfFlight * 2;
        int totalHotelCost = costOfOneNight * (numberOfDays - 1);

        int totalCost = totalFlightCost + totalHotelCost + totalFoodCost;

        System.out.println(totalCost);
    }
}