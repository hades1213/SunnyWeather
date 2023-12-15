package com.personal.sunnyweather.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author wang
 * @description:网络请求构造器
 * @date :2023/5/24
 */
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"
    private val retofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> create(serviceClass: Class<T>): T = retofit.create(serviceClass)

    //reified泛型实化
    inline fun <reified T> create(): T = create(T::class.java)
}