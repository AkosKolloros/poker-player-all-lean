package org.leanpoker.player;

public enum RankType{
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING,
    ACE;

    public static int getIndex(RankType type){
        int position = 0;
        for (int i = 0; i < RankType.values().length; i++) {
            if(type.equals(RankType.values()[i])){
                position = i + 1;
            }
        }
        return position;
    }
}
