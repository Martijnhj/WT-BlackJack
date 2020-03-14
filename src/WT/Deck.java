package WT;

import java.util.Random;

class Deck {
    private Card[] deck = new Card[52];
    private Random r = new Random();

    Deck() {

        for (int i = 1; i<53; i++) {
            if (i<=13) {
                deck[i-1] = new Card("Clubs", i);
            } else if (i<=26) {
                deck[i-1] = new Card("Diamonds", (i-13));
            } else if (i<=39) {
                deck[i-1] = new Card("Hearts", (i-26));
            } else if (i<=52) {
                deck[i-1] = new Card("Spades", (i-39));
            }
        }

    }

    void shuffleDeck() { //this takes a lot of computing

        for (int i=0; i<100; i++) {
            int x1 = r.nextInt(52);
            int x2 = r.nextInt(52);
            Card card1 = deck[x1];
            Card card2 = deck[x2];
            deck[x1] = card2;
            deck[x2] = card1;
        }
    }

    @Override
    public String toString() {
        String fullDeck = "";
            for (Card card : deck) {
                fullDeck += card + "\n";
            }
        return fullDeck;

    }

}
