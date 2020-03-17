package WT;

import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand = new ArrayList<>();


    Player() {
        addCard();
    }

    void addCard() {

        if (!BlackJackApplication.cards.getCard(BlackJackApplication.deckPosition).getCardType().equals("Ace")) {
            hand.add(0,BlackJackApplication.cards.getCard(BlackJackApplication.deckPosition));
        } else {
            hand.add(BlackJackApplication.cards.getCard(BlackJackApplication.deckPosition));
        }
        BlackJackApplication.deckPosition++;
        if (BlackJackApplication.deckPosition>51) {
            BlackJackApplication.deckPosition = 0;
            BlackJackApplication.cards.shuffleDeck();
        }
        //sorts Ace as last card so getValueOfHand function works it during adding
    }

    Card getCard(int i) {
        return hand.get(i);
    }

    void addSpecificCard(Card card) {
        hand.add(card);
    }


    int getValueOfHand() {
        int value = 0;
        int acesLeftToCount;
        for (Card card: hand) {
            if(card.getCardType().equals("Ace")) {
                acesLeftToCount = hand.size() - hand.indexOf(card);
                if (value + card.getCardValue() + (acesLeftToCount-1) > 21) {
                    value ++;
                } else {
                    value += card.getCardValue();
                }

            } else {
                value += card.getCardValue();
            }


        }
        return value;
    }

    void emptyHand(){
        hand.clear();
    }

    @Override
    public String toString() {

        String string = "";
        for (Card card : hand){
            string += card + "\n";
        }
        string += getValueOfHand();
        return string;
    }

}
