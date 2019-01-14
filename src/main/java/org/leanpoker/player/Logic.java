package org.leanpoker.player;

import com.google.gson.JsonElement;

public abstract class Logic {
    JsonElement request;

    public Logic(JsonElement request) {
        this.request = request;
    }

    public abstract int act();
}
