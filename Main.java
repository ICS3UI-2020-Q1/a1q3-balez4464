import java.util.Scanner;

/**This program will tell you how mcuh all the things you schoose to buy cost with tax too
 *
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner input = new Scanner(System.in);

    //constants for price of each thing
    double CHARGER_COST = 34.99;
    double MOTHER_BOARD = 127.50;
    double MICE = 18.00;

    //asking user how much quantity of each thing he wants
    System.out.println("How many chromebook chargers?");
    int chargerQuant = input.nextInt();
    System.out.println("How many motherboards?");
    int motherQuant = input.nextInt(); 
    System.out.println("How many mice?");
    int miceQuant = input.nextInt();

    //calculates subtotal
    double costNoTax = (CHARGER_COST * chargerQuant) + (MOTHER_BOARD * motherQuant) + (MICE * miceQuant);
    //tells user subtotal
    System.out.println("Subtotal=" + " $" + costNoTax);

    //calculates tax
    double tax = (costNoTax * 0.13);
    //tells user tax
    System.out.println("Taxes =" + " $" + costNoTax * 0.13);

    //calculates total with Taxes
    double total = (costNoTax + tax);
    //tell user their final total
    System.out.println("Total =" + " $" + total);
  }
}
