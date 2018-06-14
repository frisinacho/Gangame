package com.frisinacho.gangame

data class Deal(var title: String,
                var salePrice: Float,
                var normalPrice: Float,
                var metacriticScore: Int,
                var steamRating: Int,
                var thumb: String) {

    val FORMAT_PRICE = "$%.2f"

    fun salePriceFormatted() = String.format(FORMAT_PRICE, salePrice)
    fun normalPriceFormatted() = String.format(FORMAT_PRICE, normalPrice)
}

data class TopGame(var title: String,
                   var owners: Int,
                   var steamRating: Int,
                   var publisher: String,
                   var price: Float,
                   var position: Int,
                   var thumb: String)
