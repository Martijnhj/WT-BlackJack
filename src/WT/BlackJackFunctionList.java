package WT;

public class BlackJackFunctionList {

    /*

        Nodig:

        [[[[1]]]]]
            - Beginscherm
                - Introductie
                - KeuzeScherm
            - Kaarten
                - Kaarten zitten 1 keer in het spel
                - Alle kaarten worden getoond
                - Nieuw spel: random volgorde
                - Liefst nu al Classes Card en Deck.
                    - Kaart word een object: Kaart kaart = new Kaart();
                        - Kan door 52 nummers door te lopen en voor elk getal een waarde en soort kaart toe te voegen.
                    - Deck leeg array waar kaarten in komen

        [[[[[2]]]]]]
            - Keuze tijdens spelen
                - 'k' : nieuwe kaart
                - 'p' : pass
                - 'q' : quit
                - keuzes printen wanneer dit aan bod komt
                (- optioneel idiot proof maken)
            - Bij 'k' krijgt speler een bovenste kaart van geschudde stapel
            - kaarten
                - punten worden toegekend aan soorten kaarten
                - A is een vaste 11 waarde
                - Boer, Vrouw, Heer 10
                - verder alles 1-10
            - Display van totaal aantal punten

        [[[[[[3]]]]]]]

            - Regels volgen
                -Begin twee kaarten
                - A's kan 1 of 11 punten zijn. Als boven 21 gaat veranderd dit in 1: 4 + A = 15 (5)
                - Niet op tijd passen is beurt over/quit/speler is af
                - Geen invoer dat programma doet vastlopen
                
        [[[[[Extra]]]]]]]
            - Tijd over?
                - Tegen pc spelen
                - Met meerdere spelers
                - Inzet van geld/ waarde





        [[[[[[[[[[[Requirements 1]]]]]]]]]]]]
            - System.out : Instructies
            - Scanner : input van de persoon
            - if y -> begin spel / n -> stop spel
            - Kaarten Array:
            - Kaarten worden random getoond:
                -optie 1: Lijst met kaarten waar een kaart random wordt uitgepakt wanneer gevraagd
                -optie 2: lijst met kaarten wordt geschud en dan volledig geprint
                    -of array die twee ints krijgt en die kaarten dan omwisseld
                    -of array die uit 1 ongeschudde pile pakt en naar geschudde pile overzet.!!!!! -> op dit moment lievelings optie
             - system out van array: dus for (String kaart : Kaarten) { System.out.println(kaart); }


        [[[[[[[[[[[[[Requirements 2]]]]]]]]]]]]]



            -Scanner voor options:
                -Card
                    - Person class. Drawn card enters array called Hand
                    - Counter to follow which card was drawn last from deck, starting at 0
                    - Add value to the value counter of a person
                -Pass
                    - No more cards are drawn
                -Quit
                    - Quit exits entire game
                -After having passed and round finished, new game begins automatically.
                    - if deck counter reaches the 52 (51 of array) you want to grab a new shuffled deck and copy it over the current deck.


     */

}
