package org.leanpoker.player;

public class Card {

    private SuitType suit;
    private RankType rank;

    public Card(String suit, String rank) {
        this.suit = getSuitType(suit);
        this.rank = getRankType(rank);
    }

    public SuitType getSuit() {
        return suit;
    }

    public RankType getRank() {
        return rank;
    }

    private SuitType getSuitType(String suit) {
        SuitType suitType = null;
        switch (suit){
            case "hearts":
                suitType = SuitType.HARTS;
                break;
            case "spades":
                suitType = SuitType.SPADES;
                break;
            case "clubs":
                suitType = SuitType.CLUBS;
                break;
            case "diamonds":
                suitType = SuitType.DIAMONDS;
                break;
        }
        return suitType;
    }

    private RankType getRankType(String rank) {
        RankType rankType = null;
        switch (rank){
            case "2":
                rankType = RankType.TWO;
                break;
            case "3":
                rankType = RankType.THREE;
                break;
            case "4":
                rankType = RankType.FOUR;
                break;
            case "5":
                rankType = RankType.FIVE;
                break;
            case "6":
                rankType = RankType.SIX;
                break;
            case "7":
                rankType = RankType.SEVEN;
                break;
            case "8":
                rankType = RankType.EIGHT;
                break;
            case "9":
                rankType = RankType.NINE;
                break;
            case "10":
                rankType = RankType.TEN;
                break;
            case "J":
                rankType = RankType.JACK;
                break;
            case "Q":
                rankType = RankType.QUEEN;
                break;
            case "K":
                rankType = RankType.KING;
                break;
            case "A":
                rankType = RankType.ACE;
                break;
        }
        return rankType;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
