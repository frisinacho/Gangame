package com.frisinacho.gangame.data

import com.frisinacho.gangame.TopGame

object  TopGameMapper {

    fun fromSdk(topGame: com.frisinacho.gangamesdk.TopGame, position: Int): TopGame{
        return TopGame(
                topGame.title,
                topGame.owners,
                topGame.steamRating,
                topGame.publisher,
                topGame.price,
                position,
                topGame.thumb
        )
    }
}