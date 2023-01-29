import java.util.Scanner;

public class NumSquared {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int userNum;
      int userNumSquared;

      System.out.println("Enter a number:");
      userNum = scnr.nextInt();

      userNumSquared = userNum * userNum;

      System.out.println("Number Squared is: " + userNumSquared);
   }
}