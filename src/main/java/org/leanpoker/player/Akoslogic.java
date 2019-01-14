package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Akoslogic extends Logic {

    public Akoslogic(JsonElement request){
        super(request);
    }

    @Override
    public int act() {
        try{
            JsonObject gameInfo = request.getAsJsonObject();

            int round = gameInfo.get("round").getAsInt();
            int pot = gameInfo.get("pot").getAsInt();
            int minimumRaise = gameInfo.get("minimum_raise").getAsInt();
            int bigBlind = gameInfo.get("small_blind").getAsInt() * 2;

            JsonArray players = gameInfo.getAsJsonArray("players");

            JsonElement playerElement = players.get(0);
            JsonObject player = playerElement.getAsJsonObject();

            JsonArray hole_cards = player.getAsJsonArray("hole_cards");

            List<Card> inHand = getCards(hole_cards);

            JsonArray communityCards = gameInfo.getAsJsonArray("community_cards");

            List<Card> onDesk = getCards(communityCards);

            HandAnalyzer handAnalyzer = new HandAnalyzer(inHand, onDesk);

            System.err.println("ALL LEAN STUFF");

            System.err.println(inHand);
            System.err.println(onDesk);

            for (int i = 0; i < inHand.size(); i++) {
                Card card = inHand.get(i);
                int rankNumber = RankType.getIndex(card.getRank());
                if (handAnalyzer.isDrill()){
                    return minimumRaise * 3;
                }

                else if (handAnalyzer.isPair()){
                    return minimumRaise;
                }

                else if (rankNumber >= 11){
                    return bigBlind;
                }
            }
            return 0;
        }
        catch (Exception e){
            System.err.println("~~ALL LEAN BUG~~");
            e.printStackTrace();
            System.err.println(e);
            System.err.println("~~BUG END~~");
            return 9;
        }
    }

    private static List<Card> getCards(JsonArray jsonCards) {
        List<Card> cards = new ArrayList<>();
        for (int i = 0; i < jsonCards.size(); i++) {
            Card card = new Card(jsonCards.get(i).getAsJsonObject().get("suit").getAsString(), jsonCards.get(i).getAsJsonObject().get("rank").getAsString());
            cards.add(card);
        }
        return cards;
    }
}
