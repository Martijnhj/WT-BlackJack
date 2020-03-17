package WT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;

public class BlackJackApplication {

    Scanner reader = new Scanner(System.in);
    static Deck cards = new Deck();
    static int deckPosition;
    ArrayList<Player> playersAtTable = new ArrayList<>();
    String choice;


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


      [[[[[[[[[[[[[Requirements 3]]]]]]]]]]]]]
              - Regels volgen
                -Begin twee kaarten
                - A's kan 1 of 11 punten zijn. Als boven 21 gaat veranderd dit in 1: 4 + A = 15 (5)
                - Niet op tijd passen is beurt over/quit/speler is af
                    -kan een timer importen. dan na x aantal seconden gaat een boolean naar true waardoor optie geskipped wordt
                - Geen invoer dat programma doet vastlopen



      [[[[[[[[[[extra]]]]]]]]]]]]
        - Better visibility of table UI
        - multiple rounds
        - abilty to quit as 1 person

        - Betting? table doesn't know how much money someone has, so before round someone enters betting number.


      */



    public static void main (String[] args) {
        new BlackJackApplication().start();
    }

    void start(){

        System.out.print("This is BlackJack. Do you want to play? Enter yes or no: ");
        boolean choiceYN = stringScannerYesNo();
        if (choiceYN) {
            System.out.println("Beginning program");
            cards.shuffleDeck();
            gameLogic();
        } else {
            System.out.println("No BlackJack");
        }

        //System.out.print("How much would you like to bet?: ");
        //System.out.println(intScanner());

    }

    void gameLogic(){
        Player dealer = new Player();
        System.out.print("How many players will be playing?: ");
        int amountPlayers = intScanner();
        for (int i=0;i<amountPlayers;i++) {
            playersAtTable.add(new Player());
        }
        for (Player player : playersAtTable) {
            player.addCard();
        }
        Card hiddenCard = cards.getCard(deckPosition);
        deckPosition++;
        for (Player player: playersAtTable) {
            System.out.println("Player " + (playersAtTable.indexOf(player) + 1));
            System.out.println(player + "\n");
        }
        System.out.println("Dealer");
        System.out.println(dealer.getCard(0));
        System.out.println("Hidden card");
        System.out.println(dealer.getValueOfHand() + "\n");

        playRoundPerson();

        dealer.addSpecificCard(hiddenCard);
        System.out.println("Dealer\n" + dealer);
        while (dealer.getValueOfHand()<17) {
            dealer.addCard();
            System.out.println("Dealer\n" + dealer);
        }

        System.out.println("Winners are: ");
        for (Player player: playersAtTable) {
            if (player.getValueOfHand() > dealer.getValueOfHand() && player.getValueOfHand() <= 21 && dealer.getValueOfHand() <=21) {
                System.out.println("Player " + (playersAtTable.indexOf(player) + 1));
            } else if (dealer.getValueOfHand() > 21 && player.getValueOfHand()<=21) {
                System.out.println("Player " + (playersAtTable.indexOf(player) + 1));
            }
        }



        /*
            go's round giving everyone 1 card + dealer. Then go's round again giving everyone the second card with the dealer placing their's upside down.
         */
    }



    void playRoundPerson(){
        for (Player player : playersAtTable) {
            System.out.println("Player " + (playersAtTable.indexOf(player) + 1));
            System.out.println(player);
            while (true) {
                System.out.println("Enter valid option");
                try {
                    timedScanner();
                } catch (IOException e) {
                    //Can never happen
                }

                if (choice.equalsIgnoreCase("Card")) {
                    player.addCard();
                    System.out.println(player);
                }
                if (choice.equalsIgnoreCase("Pass") || choice.equals("")) {//or taking too long to decide
                    System.out.println("Final hand\n" + player + "\n");
                    break;
                }
                if (player.getValueOfHand()>21) {
                    System.out.println("You bust");
                    break;
                }
                if (choice.equalsIgnoreCase("Quit")) {
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

    void timedScanner() throws IOException {

        int x = 10;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long startTime = System.currentTimeMillis();
        while ((System.currentTimeMillis() - startTime) < x * 1000
                && !in.ready()) {
        }

        if (in.ready()) {
            choice = in.readLine();
        } else {
            System.out.println("You did not enter data");
            choice = "";
        }
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
