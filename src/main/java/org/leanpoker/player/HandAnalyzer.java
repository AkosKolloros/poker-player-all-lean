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
        Card secoundCard = inHand.get(1);
        if(firsCard.getRank().equals(secoundCard.getRank())){
            return true;
        }else{
            return false;
        }
    }


}
