package WT;

import java.util.Scanner;

public class BlackJackApplication {

    static Scanner reader = new Scanner(System.in);

    //input arguments that are not reliant on case
    //final static String yesArgument = "^(?i)yes$";
    //final static String noArgument = "^(?i)no$";

    /*[[[[[[[[[[[Requirements 1]]]]]]]]]]]]
            - System.out : Instructies (done)
            - Scanner : input van de persoon (done)
            - if y -> begin spel / n -> stop spel
            - Kaarten Array:
            - Kaarten worden random getoond:
            -optie 1: Lijst met kaarten waar een kaart random wordt uitgepakt wanneer gevraagd
                -optie 2: lijst met kaarten wordt geschud en dan volledig geprint
                    -of array die twee ints krijgt en die kaarten dan omwisseld
                    -of array die uit 1 ongeschudde pile pakt en naar geschudde pile overzet.!!!!! -> op dit moment lievelings optie
             - system out van array: dus for (String kaart : Kaarten) { System.out.println(kaart); } */

    public static void main (String[] args) {

        new BlackJackApplication().start();
    }

    void start() {

        System.out.print("This is BlackJack. Do you want to play? Enter yes or no: ");
        boolean choiceYN = stringScannerYesNo();
        if (choiceYN) {
            System.out.println("Beginning program");
            Deck cards = new Deck();
            cards.shuffleDeck();
            System.out.println(cards);
        } else {
            System.out.println("No BlackJack");
        }

        //System.out.print("How much would you like to bet?: ");
        //System.out.println(intScanner());





    }

    Boolean stringScannerYesNo() {
        boolean yesorno = false;
        String input = reader.next();
        while (!input.equalsIgnoreCase("yes") && !input.equalsIgnoreCase("no")) {
                System.out.print("Enter a valid argument.\nThis is BlackJack. Do you want to play? Enter yes or no: ");
                input = reader.next();
        }
        if (input.equalsIgnoreCase("yes")) {
            yesorno = true;
        } // no remains false, so no need for extra code to check

        return yesorno;
    }

    Integer intScanner() {
        boolean good = false;
        int input = 0;

        do {
            if (reader.hasNextInt()) {
                input = Integer.parseInt(reader.next());
                good = true;
            } else {
                System.out.print("Enter an integer value: ");
                reader.next();
            }
        } while (!good);

        return input;

    }



}
