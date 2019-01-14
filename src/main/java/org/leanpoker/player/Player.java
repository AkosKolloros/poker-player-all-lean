package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "0.2";

    public static int betRequest(JsonElement request) {
        JsonObject object = request.getAsJsonObject();
        JsonElement betIndex = object.get("bet_index");
        String StringIndex = betIndex.getAsString();
        System.err.println("ALL LEAN");
        System.err.println(StringIndex);

        JsonArray players = object.getAsJsonArray("players");
        String playersAsString = players.getAsString();
        System.err.println("ALL LEAN 2");
        System.err.println(playersAsString);

        JsonElement cards = object.get("community_cards");
        String cardsString = cards.getAsString();
        System.err.println("ALL LEAN 3");
        System.err.println(cardsString);

        return 500;

    }

    public static void showdown(JsonElement game) {
    }
}
