package com.mohith.foodapp
import com.mohith.foodapp.MealList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
interface Api {

    @GET("Fetch_ProductList_By_PartnerId_SubCatId?")
    fun getData(@Query("SubCatId") Sid:String , @Query("PartnerId") Pid:String ):Call<MealList>

}
