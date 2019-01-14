package org.leanpoker.player;

import java.util.*;

public class PlayLogic {
    static int mainHandMatch = 0;
    static int mainHandSuit;
    static int offHandMatch = 0;
    static int secHandSuit;

//    public static int playMaker(List<Card> deck, List<Card> hand, HandType bestHand, int pot) {
//
//        if (bestHand.equals(10)) { // Royal Flush //
//            return Math.max(pot, 200);
//
//
//        } else if (bestHand.equals(9)) { //Straight Flush//
//
//
//            List<RankType> straightFlush = new LinkedList<>();
//            List<SuitType> winningSuit = new LinkedList<>();
//
//            for (Card card : deck) {
//                winningSuit.add(card.getSuit());
//                straightFlush.add(card.getRank());
//            }
//
//            for (Card card : hand) {
//                winningSuit.add(card.getSuit());
//                straightFlush.add(card.getRank());
//            }
//
//            Collections.sort(winningSuit);
//            Collections.sort(straightFlush);
//
//            int[] winnerSuit = new int[4];
//            winnerSuit[0] = Collections.frequency(winningSuit, SuitType.HEARTS);
//            winnerSuit[1] = Collections.frequency(winningSuit, SuitType.DIAMONDS);
//            winnerSuit[2] = Collections.frequency(winningSuit, SuitType.SPADES);
//            winnerSuit[3] = Collections.frequency(winningSuit, SuitType.CLUBS);
//
//            int SUIT = maxValue(winnerSuit);
//
//
//        } else if (bestHand.equals(8)) {
//            // POKER //
//        } else if (bestHand.equals(7)) {
//            //FULL HOUSE //
//        } else if (bestHand.equals(6)) {
//            // flush //
//        } else if (bestHand.equals(5)) {
//            // straight //
//        } else if (bestHand.equals(4)) {
//            // drill //
//        } else if (bestHand.equals(3)) {
//            // Two Pairs //
//        } else if (bestHand.equals(2)) {
//            // Pair //
//        } else {
//            return 0;
//        }
//        return 0;
//    }


    public static int playMaker_basic(List<Card> deck, List<Card> hand, int pot, int currentBuyIn) {

        int card1 = RankType.getIndex(hand.get(0).getRank());
        int card2 = RankType.getIndex(hand.get(1).getRank());
        List<Card> allCards = new ArrayList<>();
        boolean suited = hand.get(0).getSuit().equals(hand.get(1).getSuit());
        int distanceOfHand = Math.abs(RankType.getIndex(hand.get(0).getRank()) - RankType.getIndex(hand.get(1).getRank()));
        int intmatchValueCard1;

        for (Card card: deck) {
            if (RankType.getIndex(card.getRank()) == card1) {
                PlayLogic.mainHandMatch += 1;
            }
            if (RankType.getIndex(card.getRank()) == card2) {
                PlayLogic.offHandMatch += 1;
            }
        }

        if (suited && mainHandMatch > 3) {
            PlayLogic.mainHandMatch = 0;
            PlayLogic.offHandMatch = 0;
            return Math.max(currentBuyIn*2, pot);
        }

        if (suited && mainHandMatch > 2) {
            PlayLogic.mainHandMatch = 0;
            PlayLogic.offHandMatch = 0;
            return Math.max(currentBuyIn*3, pot*2);
        }

        if (distanceOfHand == 0 && card1 > 10) {
            PlayLogic.mainHandMatch = 0;
            PlayLogic.offHandMatch = 0;
            return Math.max(pot * 2, currentBuyIn * 20);
        }

        if (suited && distanceOfHand == 1 && card1 > 10 || suited && distanceOfHand == 1 && card2 > 10) {
            PlayLogic.mainHandMatch = 0;
            PlayLogic.offHandMatch = 0;
            return Math.max(pot, currentBuyIn);
        }

        if (suited && distanceOfHand < 3 && card1 > 10 || suited && distanceOfHand < 3 && card2 > 10) {
            PlayLogic.mainHandMatch = 0;
            PlayLogic.offHandMatch = 0;
            return Math.max(pot / 2, currentBuyIn * 2);
        }

        if (suited && card1 > 10 || suited && card2 > 10) {
            PlayLogic.mainHandMatch = 0;
            PlayLogic.offHandMatch = 0;
            return Math.min(pot / 3, currentBuyIn);
        }

        if (suited) {
            if (currentBuyIn / pot < 0.5) {
                PlayLogic.mainHandMatch = 0;
                PlayLogic.offHandMatch = 0;
                return currentBuyIn;
            }
        }



        return 0;

    }


}




