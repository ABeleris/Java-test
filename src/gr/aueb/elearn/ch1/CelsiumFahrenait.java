package gr.aueb.elearn.ch1;

import java.util.Scanner;

public class CelsiumFahrenait {

    public static void main(String[] Args){

        Scanner in = new Scanner(System.in);
        System.out.println("Dose vathmous se farenait");
        int Far = in.nextInt();
        long Cel = 5* (Far-32)/9;
        System.out.printf("H thermokrasia se kelsiou einai: %d\t", Cel);
        in.close();
    }
}
