package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "0.3";

    public static int betRequest(JsonElement request) {
        JsonObject object = request.getAsJsonObject();
        JsonElement betIndex = object.get("bet_index");
        String StringIndex = betIndex.getAsString();
        System.err.println("ALL LEAN");
        System.err.println(StringIndex);

        return 501;

    }

    public static void showdown(JsonElement game) {
    }
}
