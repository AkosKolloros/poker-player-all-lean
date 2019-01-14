package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "0.8";

    public static int betRequest(JsonElement request) {
        try{
            JsonObject gameInfo = request.getAsJsonObject();


            JsonArray players = gameInfo.getAsJsonArray("players");

            JsonElement playerElement = players.get(0);
            JsonObject player = playerElement.getAsJsonObject();

            JsonArray hole_cards = player.getAsJsonArray("hole_cards");


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
