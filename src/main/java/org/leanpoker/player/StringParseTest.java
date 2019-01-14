package org.leanpoker.player;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class StringParseTest {
    public static void main(String[] args) {
        JsonParser parser = new JsonParser();
        JsonObject o = parser.parse(
                "{\"community_cards\": [" +
                        "        {\n" +
                        "        \"rank\": \"4\",\n" +
                        "        \"suit\": \"spades\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "        \"rank\": \"A\",\n" +
                        "        \"suit\": \"hearts\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "        \"rank\": \"6\",\n" +
                        "        \"suit\": \"clubs\"\n" +
                        "        }\n" +
                        "]}").getAsJsonObject();

        JsonArray jsonArray = o.getAsJsonArray("community_cards");
        System.err.println(jsonArray.get(0));
    }
}




