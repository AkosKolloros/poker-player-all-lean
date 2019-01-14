package org.leanpoker.player;

import java.util.*;

public class PlayLogic {
    private int winningSuit;


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


        } else {
            System.out.println();
        }
        return 10;
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




