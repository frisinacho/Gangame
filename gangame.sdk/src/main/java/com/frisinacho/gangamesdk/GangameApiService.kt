package com.frisinacho.gangamesdk

import com.frisinacho.gangamesdk.serializer.TopGameDeserializer
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GangameApiService(val apiConfig: GangameApiConfig) {

    val apiClient: RetrofitGangameApi

    init {
        val gson = GsonBuilder()
                .registerTypeAdapter(TopGame::class.java, TopGameDeserializer())
                .create()

        val apiClientConfig =
                Retrofit.Builder()
                .baseUrl(Routes.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))

        apiConfig.setupConfig(apiClientConfig)

        apiClient = apiClientConfig.build().create(RetrofitGangameApi::class.java)
    }
}