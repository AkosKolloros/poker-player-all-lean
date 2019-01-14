package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "0.4";

    public static int betRequest(JsonElement request) {
        JsonObject object = request.getAsJsonObject();
        JsonElement betIndex = object.get("bet_index");
        String StringIndex = betIndex.getAsString();
        System.err.println("ALL LEAN");
        System.err.println(StringIndex);

        JsonElement community_cards = object.get("community_cards");
        JsonArray community_cardsAsJsonArray = community_cards.getAsJsonArray();
        String community_cardsAsString = "";
        for (int i = 0; i < community_cardsAsJsonArray.size(); i++) {
            community_cardsAsString += community_cardsAsJsonArray.get(i).toString();
        }
        System.err.println("ALL LEAN 2");
        System.err.println(community_cardsAsString);

        return 501;

    }

    public static void showdown(JsonElement game) {
    }
}
