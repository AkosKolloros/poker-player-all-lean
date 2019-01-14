package org.leanpoker.player;

import com.google.gson.JsonElement;

public class Player {

    static final String VERSION = "0.12";
    static final PlayLogic playerLogic = null;

    public static int betRequest(JsonElement request) {
        Logic playerLogic = new CurrentLogic(request);
        return playerLogic.act();

    }

    public static void showdown(JsonElement game) {
    }
}
