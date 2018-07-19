package com.frisinacho.gangamesdk

import com.google.gson.Gson
import org.junit.Test

class ModelUnitTest {

    val JSON_DEAL = "{" +
            "\"internalName\": \"TOKITORI\"," +
            "\"title\": \"Toki Tori\"," +
            "\"metacriticLink\": \"/game/pc/toki-tori\"," +
            "\"dealID\": \"Ws%2B0c2sUsDPpqLQB7ToTCNhVsyc5uBSRe50G3FFDt58%3D\"," +
            "\"storeID\": \"1\"," +
            "\"gameID\": \"574\"," +
            "\"salePrice\": \"0.49\"," +
            "\"normalPrice\": \"4.99\"," +
            "\"isOnSale\": \"1\"," +
            "\"savings\": \"90.180361\"," +
            "\"metacriticScore\": \"80\"," +
            "\"steamRatingText\": \"Very Positive\"," +
            "\"steamRatingPercent\": \"88\"," +
            "\"steamRatingCount\": \"1289\"," +
            "\"releaseDate\": 1264636800," +
            "\"lastChange\": 1499708988," +
            "\"dealRating\": \"9.2\"," +
            "\"thumb\": \"http://cdn.akamai.steamstatic.com/steam/apps/38700/capsule_sm_120.jpg?t=1488471030\"" +
            "}"

    @Test
    fun dealParsingTest() {
        val gson = Gson()
        val deal = gson.fromJson(JSON_DEAL, Deal::class.java)
    }

    @Test
    fun topGameParsingTest() {

    }
}