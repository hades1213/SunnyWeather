package com.personal.sunnyweather.repository

import androidx.lifecycle.liveData
import com.personal.sunnyweather.model.Place
import com.personal.sunnyweather.network.SunnyWeatherNetwork
import kotlinx.coroutines.Dispatchers

/**
 * @author wang
 * @description:仓库层  用来判断数据来源
 * @date :2023/5/25
 */
object Repository {

    fun searchPlaces(query: String) = liveData<String> {
        val result = try {
            val placeResponse = SunnyWeatherNetwork.searchPlace(query)
            if (placeResponse.status == "ok") {
                val place = placeResponse.places
                Result.success(place)
            } else {
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
    }
}