package org.leanpoker.player;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class Player {

    static final String VERSION = "0.1";

    public static int betRequest(JsonElement request) {
        JsonObject object = request.getAsJsonObject();
        System.err.println(object.toString());
        return 0;

    }

    public static void showdown(JsonElement game) {
    }
}
