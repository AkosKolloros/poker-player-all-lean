package org.leanpoker.player;

import java.util.*;

public class PlayLogic {
    private int winningSuit;


    public static int playMaker(List<Card> deck, List<Card> hand, HandType bestHand, int pot) {
        if (bestHand.equals(10)) { // Royal Flush //
            return Math.max(pot, 200);


        } else if (bestHand.equals(9)) { //Straight Flush //
            List straightFlush = new LinkedList<>();
            List winningSuit = new LinkedList<>();
            for (Card card: deck) {
                winningSuit.add(card.getSuit());
            }


        }

    }

}
}
