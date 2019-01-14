package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Player {

    static final String VERSION = "0.14";

    public static int betRequest(JsonElement request) {
        try{
            JsonObject gameInfo = request.getAsJsonObject();

            int round = gameInfo.get("round").getAsInt();
            int pot = gameInfo.get("pot").getAsInt();

            JsonArray players = gameInfo.getAsJsonArray("players");

            JsonElement playerElement = players.get(0);
            JsonObject player = playerElement.getAsJsonObject();

            JsonArray hole_cards = player.getAsJsonArray("hole_cards");

            List<Card> inHand = getCards(hole_cards);

            JsonArray communityCards = gameInfo.getAsJsonArray("community_cards");

            List<Card> onDesk = getCards(communityCards);

            System.err.println("ALL LEAN STUFF");
            System.err.println(inHand);
            System.err.println(onDesk);

            for (int i = 0; i < inHand.size(); i++) {
                Card card = inHand.get(i);

                int rankIndex = RankType.getIndex(card.getRank());
                if (rankIndex >= 10){
                    return 1000;
                }
            }
            return 0;
        }
        catch (Exception e){
            System.err.println("~~ALL LEAN BUG~~");
            e.printStackTrace();
            System.err.println(e);
            System.err.println("~~BUG END~~");
            return 10;
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

    public static void showdown(JsonElement game) {
    }
}
