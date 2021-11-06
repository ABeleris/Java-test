package gr.aueb.elearn.ch1;

import java.util.Scanner;

/**
 * Metatrepei euros to dollar
 * @author abele
 * @version 0.1
 */
public class EurosToDollars {

    public static void main(String[] Args){
        final int EUR_TO_USD_CENTS = 110;
        Scanner in = new Scanner(System.in);

        System.out.println("Parakalo dose to poso se euro");
        int euros = in.nextInt();
        int centUs = euros * EUR_TO_USD_CENTS;
        int dollars = centUs/100;
        int cents = centUs%100;
        System.out.printf("to synolo ton cents einai %d \n", centUs);
        System.out.printf("exete %02d dollaria kai %d cents", dollars, cents);
    }
}
