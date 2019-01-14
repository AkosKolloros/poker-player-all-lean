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
        System.err.println("ASD");
        System.err.println(StringIndex);

        JsonObject players = object.getAsJsonObject("players");
        JsonObject myPlayer = players.getAsJsonObject("All lean");
        System.err.println("ASD2");
        System.err.println(myPlayer.toString());

        JsonElement cards = object.get("community_cards");
        System.err.println("ASD3");
        System.err.println(cards.toString());

        return 500;

    }

    public static void showdown(JsonElement game) {
    }
}
