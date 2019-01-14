package org.leanpoker.player;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RequestTest {

    static JsonParser parser = new JsonParser();
    static JsonObject request;

    public static void main(String[] args) {
        parseJsonObjectFromString();
        testGetHand();
    }

    public static void testGetHand(){
        JsonArray communityCards = request.getAsJsonArray("community_cards");
        System.out.println(communityCards.get(0));
    }

    public static void testCard() {
        Card card = new Card("spades", "A");
        System.out.println(card);
        System.out.println(card.getSuit());
    }

    public static void parseJsonObjectFromString() {
        request = parser.parse(
                "{\n" +
                        "        \"tournament_id\":\"550d1d68cd7bd10003000003\",\n" +
                        "\n" +
                        "        \"game_id\":\"550da1cb2d909006e90004b1\",\n" +
                        "\n" +
                        "        \"round\":0,\n" +
                        "\n" +
                        "        \"bet_index\":0,\n" +
                        "\n" +
                        "        \"small_blind\": 10,\n" +
                        "\n" +
                        "        \"current_buy_in\": 320,\n" +
                        "\n" +
                        "        \"pot\": 400,\n" +
                        "\n" +
                        "        \"minimum_raise\": 240,\n" +
                        "\n" +
                        "        \"dealer\": 1,\n" +
                        "\n" +
                        "        \"orbits\": 7,\n" +
                        "\n" +
                        "        \"in_action\": 1,\n" +
                        "\n" +
                        "        \"players\": [\n" +
                        "        {\n" +
                        "\n" +
                        "        \"id\": 0,\n" +
                        "\n" +
                        "        \"name\": \"Albert\",\n" +
                        "\n" +
                        "        \"status\": \"active\",\n" +
                        "\n" +
                        "        \"version\": \"Default random player\",\n" +
                        "\n" +
                        "        \"stack\": 1010,\n" +
                        "\n" +
                        "        \"bet\": 320\n" +
                        "        },\n" +
                        "        {\n" +
                        "        \"id\": 1,\n" +
                        "        \"name\": \"Bob\",\n" +
                        "        \"status\": \"active\",\n" +
                        "        \"version\": \"Default random player\",\n" +
                        "        \"stack\": 1590,\n" +
                        "        \"bet\": 80,\n" +
                        "        \"hole_cards\": [\n" +
                        "        {\n" +
                        "        \"rank\": \"6\",\n" +
                        "        \"suit\": \"hearts\"\n" +
                        "        },\n" +
                        "        {\n" +
                        "        \"rank\": \"K\",\n" +
                        "        \"suit\": \"spades\"\n" +
                        "        }\n" +
                        "        ]\n" +
                        "        },\n" +
                        "        {\n" +
                        "        \"id\": 2,\n" +
                        "        \"name\": \"Chuck\",\n" +
                        "        \"status\": \"out\",\n" +
                        "        \"version\": \"Default random player\",\n" +
                        "        \"stack\": 0,\n" +
                        "        \"bet\": 0\n" +
                        "        }\n" +
                        "        ],\n" +
                        "        \"community_cards\": [\n" +
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
                        "        ]\n" +
                        "}").getAsJsonObject();
    }
}




