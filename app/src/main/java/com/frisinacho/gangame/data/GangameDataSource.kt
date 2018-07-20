package com.frisinacho.gangame.data

import io.reactivex.Observable
import com.frisinacho.gangamesdk.Deal
import com.frisinacho.gangamesdk.GangameApiService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object GangameDataSource {
    val apiService = GangameApiService()

    fun getDeals(): Observable<ArrayList<Deal>>{
        return apiService.apiClient
                .getDealsObservable()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
    }
}