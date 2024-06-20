package com.example.fibonacciviews

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonacciviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fibonacciSeriesGenerator= FibonacciSeriesGenerator()
        val fibonacciSeries = fibonacciSeriesGenerator.generateFibonacciSeries(100)
        binding.rvFibonacci.layoutManager = LinearLayoutManager(this)
        val fibonacciAdapter = FibonacciRecyclerViewsAdapter(fibonacciSeries)
        binding.rvFibonacci.adapter=fibonacciAdapter
        }
    }

class FibonacciSeriesGenerator{
    fun generateFibonacciSeries(num:Int):List<Int>{
        val fibonacci = mutableListOf(0,1)
        var a= 0
        var b= 1
        while (fibonacci.size<num){
            val sum = a+b
            if (sum <0){
                break
            }
            fibonacci.add(sum)
            a=b
            b=sum
        }
        return fibonacci
    }
}