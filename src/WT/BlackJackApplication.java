package WT;

import java.util.Scanner;

public class BlackJackApplication {

    static Scanner reader = new Scanner(System.in);
    static Deck cards = new Deck();
    static int deckPosition;

    enum choice {
        yes, no, card, pass, quit;
    }

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
             - system out van array: dus for (String kaart : Kaarten) { System.out.println(kaart); }


             -------------Maybe use enums to scan for common entry

    [[[[[[[[[[[[[Requirements 2]]]]]]]]]]]]]
            -Scanner voor options:
                -Card
                    - Person class. Drawn card enters array called Hand
                    - Counter to follow which card was drawn last from deck, starting at 0
                    - Add value to the value counter of a person
                        - Already apply Ace worth of 1 or 11
                            - To run through hand values. If ace in there count differently
                -Pass
                    - No more cards are drawn
                -Quit
                    - Quit exits entire game
                -After having passed and round finished, new game begins automatically.
                    - if deck counter reaches the 52 (51 of array) you want to grab a new shuffled deck and copy it over the current deck.
                    - Empty player hands. players.clear


      */



    public static void main (String[] args) {

        new BlackJackApplication().start();
    }

    void start() {

        System.out.print("This is BlackJack. Do you want to play? Enter yes or no: ");
        boolean choiceYN = stringScannerYesNo();
        if (choiceYN) {
            System.out.println("Beginning program");
            cards.shuffleDeck();
            playRound();
        } else {
            System.out.println("No BlackJack");
        }

        //System.out.print("How much would you like to bet?: ");
        //System.out.println(intScanner());

    }



    void playRound() {
        while (true) {
            Player p1 = new Player();
            String choice;
            System.out.println(p1);
            while (true) {
                choice = choiceRound();
                if (choice.equals("Card")) {
                    p1.addCard();
                    System.out.println(p1);
                }
                if (choice.equals("Pass")) {
                    System.out.println("Final hand" + p1);
                    break;
                }
                if (choice.equals("Quit")) {
                    return;
                }
            }
        }

    }


    String choiceRound() {
        String choice = "";
        System.out.println("Do you want a card, pass or quit playing?");
        String input = reader.next();
        while (!input.equalsIgnoreCase("Card")&& !input.equalsIgnoreCase("Pass") && !input.equalsIgnoreCase("Quit")) {
            System.out.print("Enter a valid argument.\nDo you want a card, pass or quit playing");
            input = reader.next();
        }
        if (input.equalsIgnoreCase("Card")) {
            choice = "Card";
        }
        if (input.equalsIgnoreCase("Pass")) {
            choice = "Pass";
        }
        if (input.equalsIgnoreCase("Quit")) {
            choice = "Quit";
        }
        return choice;
    }



    Boolean stringScannerYesNo() {
        boolean yesorno = false;

        String input = reader.next();
        while (!input.equalsIgnoreCase("yes")&& !input.equalsIgnoreCase("no")) {
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
