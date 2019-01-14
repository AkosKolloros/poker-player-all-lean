package org.leanpoker.player;

public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(String suit, String rank) {
    }

    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return rank;
    }
}
