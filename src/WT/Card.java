package WT;

class Card {

private Suit suit; //Schoppen, harten etc
private cardType card; //1, 2, boer

enum Suit{
    Clubs, Diamond, Hearts, Spades
}

enum cardType{
    Ace(11), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), Jack(10), Queen(10), King(10);
    int value;
    cardType(int value) {
        this.value = value;
    }
}

    Card(Suit suit , cardType card) {
        this.suit = suit;
        this.card = card;
    }

    String getCardType() {
        return this.card.name();
    }

    int getCardValue() {
        return this.card.value;
    }

    @Override
    public String toString() {
        return this.card + " of " + this.suit;
    }
}
