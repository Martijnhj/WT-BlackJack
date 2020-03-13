package WT;

import java.util.Scanner;

public class BlackJackApplication {



    /*[[[[[[[[[[[Requirements 1]]]]]]]]]]]]
            - System.out : Instructies
            - Scanner : input van de persoon
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

        System.out.print("This is BlackJack. Do you want to play?: ");
        Scanner reader = new Scanner(System.in);

    }

}
