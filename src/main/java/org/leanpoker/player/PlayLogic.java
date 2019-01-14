package org.leanpoker.player;

import java.util.*;

public class PlayLogic {
    private static int mainHandVal;
    private static int mainHandSuit;
    private static int secHandVal;
    private static int secHandSuit;

    public static int playMaker(List<Card> deck, List<Card> hand, HandType bestHand, int pot) {

        if (bestHand.equals(10)) { // Royal Flush //
            return Math.max(pot, 200);


        } else if (bestHand.equals(9)) { //Straight Flush//


            List<RankType> straightFlush = new LinkedList<>();
            List<SuitType> winningSuit = new LinkedList<>();

            for (Card card : deck) {
                winningSuit.add(card.getSuit());
                straightFlush.add(card.getRank());
            }

            for (Card card : hand) {
                winningSuit.add(card.getSuit());
                straightFlush.add(card.getRank());
            }

            Collections.sort(winningSuit);
            Collections.sort(straightFlush);

            int[] winnerSuit = new int[4];
            winnerSuit[0] = Collections.frequency(winningSuit, SuitType.HEARTS);
            winnerSuit[1] = Collections.frequency(winningSuit, SuitType.DIAMONDS);
            winnerSuit[2] = Collections.frequency(winningSuit, SuitType.SPADES);
            winnerSuit[3] = Collections.frequency(winningSuit, SuitType.CLUBS);

            int SUIT = maxValue(winnerSuit);


        } else if (bestHand.equals(8)) {
            // POKER //
        } else if (bestHand.equals(7)) {
            //FULL HOUSE //
        } else if (bestHand.equals(6)) {
            // flush //
        } else if (bestHand.equals(5)) {
            // straight //
        } else if (bestHand.equals(4)) {
            // drill //
        } else if (bestHand.equals(3)) {
            // Two Pairs //
        } else if (bestHand.equals(2)) {
            // Pair //
        } else {
            return 0;
        }
        return 0;
    }


    public static int playMaker_basic(List<Card> deck, List<Card> hand, int pot) {

        boolean suited = hand.get(0).getSuit().equals(hand.get(1).getSuit());
        int distanceOfHand = Math.abs(RankType.getIndex(hand.get(0).getRank()) - RankType.getIndex(hand.get(1).getRank()));

        int card1 = RankType.getIndex(hand.get(0).getRank());
        int card2 = RankType.getIndex(hand.get(1).getRank());
        int suit1 = SuitType.getIndex(hand.get(0).getSuit());
        int suit2 = SuitType.getIndex(hand.get(1).getSuit());


        try {
            int card3 = RankType.getIndex(deck.get(0).getRank());
            int suit3 = SuitType.getIndex(deck.get(0).getSuit());
        } catch (Exception e) {
            throw e;
        }

        try {
            int card4 = RankType.getIndex(deck.get(1).getRank());
            int suit4 = SuitType.getIndex(deck.get(1).getSuit());
        } catch (Exception e) {
            throw e;
        }

        try {
            int card5 = RankType.getIndex(deck.get(2).getRank());
            int suit5 = SuitType.getIndex(deck.get(2).getSuit());
        } catch (Exception e) {
            throw e;
        }

        try {
            int card6 = RankType.getIndex(deck.get(3).getRank());
            int suit6 = SuitType.getIndex(deck.get(3).getSuit());
        } catch (Exception e) {
            throw e;
        }

        try {
            int card7 = RankType.getIndex(deck.get(4).getRank());
            int suit7 = SuitType.getIndex(deck.get(4).getSuit());
        } catch (Exception e) {
            throw e;
        }




        return 0;
}


    private static int maxValue(int[] ints) {
        int max = ints[0];
        for (int ktr = 0; ktr < ints.length; ktr++) {
            if (ints[ktr] > max) {
                max = ints[ktr];
            }
        }
        return max;
    }
}




