package com.personal.sunnyweather.network

import com.personal.sunnyweather.MyApplication
import com.personal.sunnyweather.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author wang
 * @description:retrofit2 网络请求接口
 * @date :2023/5/24
 */
interface PlaceService {
    @GET("v2/place?token=${MyApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}