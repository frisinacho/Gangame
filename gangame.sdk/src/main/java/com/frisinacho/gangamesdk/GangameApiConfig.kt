package com.frisinacho.gangamesdk

import retrofit2.Retrofit

interface GangameApiConfig {
    fun setupConfig(builder: Retrofit.Builder)
}