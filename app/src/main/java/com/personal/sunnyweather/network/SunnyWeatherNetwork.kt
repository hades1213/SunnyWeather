package com.personal.sunnyweather.network

import retrofit2.Call
import retrofit2.await
import kotlin.coroutines.suspendCoroutine

/**
 * @author wang
 * @description: 网络层
 * @date :2023/5/25
 */
object SunnyWeatherNetwork {

    //创建service
    private val placeService = ServiceCreator.create<PlaceService>()

    //网络请求
    suspend fun searchPlace(query: String) = placeService.searchPlaces(query).await()



//    private suspend fun <T> Call<T>.await(): T {
//        return suspendCoroutine { continuation ->
//
//        }
//    }
}