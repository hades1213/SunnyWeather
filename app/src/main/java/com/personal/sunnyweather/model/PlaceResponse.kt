package com.personal.sunnyweather.model

import com.google.gson.annotations.SerializedName

/**
 * @author wang
 * @description:数据类
 * @date :2023/5/24
 */

data class PlaceResponse(val status: String, val places: List<Place>)


//@SerializedName 注解：重命名参数
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)