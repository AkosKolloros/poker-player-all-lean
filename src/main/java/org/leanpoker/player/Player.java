package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "0.9";

    public static int betRequest(JsonElement request) {
        try{
            JsonObject gameInfo = request.getAsJsonObject();

            int round = gameInfo.get("round").getAsInt();
            int pot = gameInfo.get("pot").getAsInt();

            JsonArray players = gameInfo.getAsJsonArray("players");

            JsonElement playerElement = players.get(0);
            JsonObject player = playerElement.getAsJsonObject();

            JsonArray hole_cards = player.getAsJsonArray("hole_cards");

            Card firstHand = new Card(hole_cards.get(0).getAsJsonArray().get(1).getAsString(), hole_cards.get(0).getAsJsonArray().get(0).getAsString());
            Card secondHand = new Card(hole_cards.get(1).getAsJsonArray().get(1).getAsString(), hole_cards.get(1).getAsJsonArray().get(0).getAsString());

            JsonArray communityCards = gameInfo.getAsJsonArray("community_cards");
            if (communityCards.size() == 3){
                Card firstCommunity = new Card(communityCards.get(0).getAsJsonArray().get(1).getAsString(), communityCards.get(0).getAsJsonArray().get(0).getAsString());
                Card secondCommunity = new Card(communityCards.get(1).getAsJsonArray().get(1).getAsString(), communityCards.get(1).getAsJsonArray().get(0).getAsString());
                Card thirdCommunity = new Card(communityCards.get(2).getAsJsonArray().get(1).getAsString(), communityCards.get(2).getAsJsonArray().get(0).getAsString());
            }
            else if (communityCards.size() == 4){
                Card firstCommunity = new Card(communityCards.get(0).getAsJsonArray().get(1).getAsString(), communityCards.get(0).getAsJsonArray().get(0).getAsString());
                Card secondCommunity = new Card(communityCards.get(1).getAsJsonArray().get(1).getAsString(), communityCards.get(1).getAsJsonArray().get(0).getAsString());
                Card thirdCommunity = new Card(communityCards.get(2).getAsJsonArray().get(1).getAsString(), communityCards.get(2).getAsJsonArray().get(0).getAsString());
                Card fourthCommunity = new Card(communityCards.get(3).getAsJsonArray().get(1).getAsString(), communityCards.get(3).getAsJsonArray().get(0).getAsString());

            }
            else if (communityCards.size() == 5){
                Card firstCommunity = new Card(communityCards.get(0).getAsJsonArray().get(1).getAsString(), communityCards.get(0).getAsJsonArray().get(0).getAsString());
                Card secondCommunity = new Card(communityCards.get(1).getAsJsonArray().get(1).getAsString(), communityCards.get(1).getAsJsonArray().get(0).getAsString());
                Card thirdCommunity = new Card(communityCards.get(2).getAsJsonArray().get(1).getAsString(), communityCards.get(2).getAsJsonArray().get(0).getAsString());
                Card fourthCommunity = new Card(communityCards.get(3).getAsJsonArray().get(1).getAsString(), communityCards.get(3).getAsJsonArray().get(0).getAsString());
                Card fifthCommunity = new Card(communityCards.get(4).getAsJsonArray().get(1).getAsString(), communityCards.get(4).getAsJsonArray().get(0).getAsString());

            }

            System.err.println("ALL LEAN");
            System.err.println(hole_cards.get(0));

            return 1000;
        }
        catch (Exception e){
            return 1000;
        }

    }

    public static void showdown(JsonElement game) {
    }
}
