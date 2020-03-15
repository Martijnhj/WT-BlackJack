package WT;

import java.util.Random;

class Deck {
    private Card[] deck = new Card[52];
    private Random r = new Random();

    Deck() {

        int i = 0;
        for (Card.Suit suit: Card.Suit.values()) {
            for (Card.cardType type : Card.cardType.values()) {
                deck[i] = new Card(suit, type);
                i++;
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
