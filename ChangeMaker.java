/**
 * ChangeMaker - Lab 2-4 - Program which prints out a statement telling the user how much change they will receive upon entering an amount of money.
 *
 * @author Andrew Albanese
 * @version 2016-01-26
 */
import java.util.Scanner;
public class ChangeMaker
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Display prompt for degrees of angle
        System.out.println("Enter amount due in cents: ");
        int centsDue = in.nextInt();
        System.out.println("Enter amount recieved in cents: ");
        int centsRecieved = in.nextInt();
        int centsChange = centsRecieved - centsDue;
     
        final int CENTS_PER_DOLLAR = 100;
        int dollars = centsChange / CENTS_PER_DOLLAR;
        System.out.println("\t" + " dollars: " + dollars);
        centsChange -=dollars * CENTS_PER_DOLLAR;
        
        final int CENTS_PER_QUARTER = 25;
        int quarters = centsChange / CENTS_PER_QUARTER;
        System.out.println("\t" + " quarters: " + quarters);
        centsChange -=quarters * CENTS_PER_QUARTER;
        
        final int CENTS_PER_DIME = 10;
        int dimes = centsChange / CENTS_PER_DIME;
        System.out.println(" dimes: " + dimes);
        
    } 
}