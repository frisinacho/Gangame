package com.frisinacho.gangamesdk

import okhttp3.Interceptor

class MockResponseInterceptor: Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val response = getResponseFor(request.url().toString())
    }

    private fun getResponseFor(ursl: String): String {

    }
}