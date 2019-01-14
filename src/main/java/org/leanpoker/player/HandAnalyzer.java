package org.leanpoker.player;

import java.util.List;

public class HandAnalyzer {
    List<Card> onTable;
    List<Card> inHand;

    public HandAnalyzer(List<Card> onTable, List<Card> inHand) {
        this.onTable = onTable;
        this.inHand = inHand;
    }

    public boolean isPair(){
        Card firsCard = inHand.get(0);
        Card secondCard = inHand.get(1);
        if(firsCard.getRank().equals(secondCard.getRank())){
            return true;
        }else{
            for (Card card : inHand) {
                for (Card cardOnTable : onTable) {
                    if(card.getRank().equals(cardOnTable.getRank())){
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public boolean isDrill(){
        Card firsCard = inHand.get(0);
        Card secondCard = inHand.get(1);
        Card thirdCard = onTable.get(0);
        if(firsCard.getRank().equals(secondCard.getRank()) && firsCard.getRank().equals(thirdCard.getRank())){
            return true;
        }else{
            for (Card card : inHand) {
                for (Card cardOnTable : onTable) {
                    for (Card cardOnTable2 : onTable) {
                    if(card.getRank().equals(cardOnTable.getRank()) && card.getRank().equals(cardOnTable2.getRank())){
                        return true;
                    }
                }
                }
            }
            return false;
        }
    }


}
