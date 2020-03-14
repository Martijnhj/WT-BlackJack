package WT;

class Card {

private String type; //Schoppen, harten etc
private int value;
private String card; //1, 2, boer

    Card(String type, int id) {
        this.type = type;

        if (id == 1) {
            this.value = 11;
            this.card = "Ace";
        } else if (id <=10) {
            this.value = id;
            this.card = Integer.toString(id);
        }

        if (id == 11) {
            this.value = 10;
            this.card = "Jack";
        }

        if (id == 12) {
            this.value = 10;
            this.card = "Queen";
        }

        if (id == 13) {
            this.value = 10;
            this.card = "King";
        }

    }

    String getType() {
        return this.type;
    }

    String getCard() {
        return this.card;
    }


    @Override
    public String toString() {
        return this.card + " of " + this.type;
    }
}
