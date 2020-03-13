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
            - Kaart word een object: Kaart kaart = new Kaart();
                   - Zou dit kunnen doen door te kiezen van lijst waarden, en daar dan random een waarde in te vullen bij new kaart
                            Lijst met randomized {1,2,3,4,5,6,7,8,9,10,10,10,11} keer 4. Als je dan dat in vult krijg je een kaart die daar bij past random welke kleur
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

     */

}
