package com.example.habittracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.single_card.view.*

class HabitAdapter(val habits: List<Habit>) : RecyclerView.Adapter<HabitAdapter.HabitViewHolder>() {

    class HabitViewHolder(val cardView: View) : RecyclerView.ViewHolder(cardView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        // SS: for some reason, we have to pass false for attachToRoot, otherwise it crashes
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(view)
    }

    override fun getItemCount() = habits.size

    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        holder.cardView.tv_title.text = habits[position].title
        holder.cardView.tv_description.text = habits[position].description
        holder.cardView.iv_icon.setImageResource(habits[position].image)
    }

}
