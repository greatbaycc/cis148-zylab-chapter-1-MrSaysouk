import java.util.Scanner;

public class HouseSummary {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int currentPrice; 
      int lastMonthsPrice;

      System.out.print("Enter current house price: ");
      currentPrice = scnr.nextInt();
      System.out.print("Enter last month's house price: ");
      lastMonthsPrice = scnr.nextInt();

      System.out.println("Current house listing price: $" + currentPrice);
      System.out.println("Last month's listing price: $" + lastMonthsPrice);
   }
}
