package org.leanpoker.player;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "0.7";

    public static int betRequest(JsonElement request) {
        JsonObject object = request.getAsJsonObject();
        System.err.println("ALL LEAN");
        System.err.println(object);




        return 501;

    }

    public static void showdown(JsonElement game) {
    }
}
