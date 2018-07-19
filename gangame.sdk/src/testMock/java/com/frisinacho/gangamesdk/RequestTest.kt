package com.frisinacho.gangamesdk

import org.junit.Assert
import org.junit.Test

class RequestTest {

    @Test
    fun dealsRequest_success(){
        val apiService = GangameApiService()
        val response = apiService.apiClient.getDeals().execute()

        Assert.assertTrue(response.isSuccessful)
    }
}