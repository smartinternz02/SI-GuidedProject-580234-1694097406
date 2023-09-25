package com.mohith.foodapp
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
class MealViewModel : ViewModel() {
    private var MealLiveData = MutableLiveData<List<Data>>()
    fun getMeals() {
        RetrofitInstance.api.getData("507","180").enqueue(object : Callback<MealList> {
            override fun onResponse(call: Call<MealList>, response: Response<MealList>) {
                if (response.body() != null) {
                    MealLiveData.value = response.body()!!.Data
                } else {
                    return
                }
            }

            override fun onFailure(call: Call<MealList>, t: Throwable) {
                Log.d("TAG", t.message.toString())
            }

        })
    }
    fun ObserveMealLiveData(): LiveData<List<Data>> {
        return MealLiveData
    }
}