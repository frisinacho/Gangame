package com.frisinacho.gangamesdk

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GangameApiService {

    init {
        val apiClientBuilder =
                Retrofit.Builder()
                .baseUrl(Routes.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
    }
}