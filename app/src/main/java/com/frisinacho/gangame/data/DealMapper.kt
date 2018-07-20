package com.frisinacho.gangame.data

import com.frisinacho.gangame.Deal

object DealMapper {

    fun fromSdk(deal: com.frisinacho.gangamesdk.Deal): Deal{
        return Deal(
                deal.title,
                deal.salePrice,
                deal.normalPrice,
                deal.metacriticScore,
                deal.steamRating,
                deal.thumb
        )
    }
}