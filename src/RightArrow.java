import java.util.Scanner; 

public class RightArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      int baseChar; 
      int headChar;

      System.out.println("Enter base character:");
      baseChar = scnr.nextInt();
      System.out.println("Enter head character:");
      headChar = scnr.nextInt();

      System.out.println("     " + headChar);
      System.out.println("     " + headChar + headChar);
      System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar);
      System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar + headChar);
      System.out.println("" + baseChar + baseChar + baseChar + baseChar + baseChar + headChar + headChar + headChar);
      System.out.println("     " + headChar + headChar);
      System.out.println("     " + headChar);

   }
}
