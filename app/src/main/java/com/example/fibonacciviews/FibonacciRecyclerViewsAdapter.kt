package com.example.fibonacciviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FibonacciRecyclerViewsAdapter (val fibonacciSeries:List<Int>):
    RecyclerView.Adapter<FibonacciRecyclerViewsAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.fibonacci_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(fibonacciSeries[position])
    }

    override fun getItemCount(): Int {
        return fibonacciSeries.size
    }
class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    val textView: TextView = view.findViewById(R.id.tvFibonacci)

    fun bind(fibonacciNumber: Int) {
        textView.text = fibonacciNumber.toString()
    }
}

}

