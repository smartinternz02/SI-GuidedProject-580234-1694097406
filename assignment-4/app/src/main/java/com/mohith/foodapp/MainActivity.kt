package com.mohith.foodapp
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.mohith.foodapp.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var ApiAdapter:ApiAdapter
    private lateinit var mealViewModel:MealViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        prepareRecyclerView()
        mealViewModel = ViewModelProvider(this)[MealViewModel::class.java]
        mealViewModel.getMeals()
        mealViewModel.ObserveMealLiveData().observe(this, Observer {
            ApiAdapter.setMealList(it)
        })
    }
    private fun prepareRecyclerView() {
        ApiAdapter = ApiAdapter()
        binding.rcv.apply {
            layoutManager = LinearLayoutManager(applicationContext)
            adapter = ApiAdapter
        }
    }
}
