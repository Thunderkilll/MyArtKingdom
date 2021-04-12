package com.vagrok.myartkingdom.adapters

import android.graphics.Paint.STRIKE_THRU_TEXT_FLAG
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.vagrok.myartkingdom.Models.Art
import com.vagrok.myartkingdom.R

class ArtAdapter (
    private val arts: MutableList<Art>
) : RecyclerView.Adapter<ArtAdapter.ArtViewHolder>() {

    class ArtViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtViewHolder {

        return ArtViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_art,
                parent,
                false
            )
        )
    }

    fun addTodo(art: Art) {
        arts.add(art)
        notifyItemInserted(arts.size - 1)
    }

    fun deleteDoneArt() {
     //delete the current article
        notifyDataSetChanged()
    }

    private fun toggleStrikeThrough(tvDescription: TextView, image: String) {

        tvDescription.paintFlags = tvDescription.paintFlags or STRIKE_THRU_TEXT_FLAG

    }

    override fun onBindViewHolder(holder: ArtViewHolder, position: Int) {
        val curArt = arts[position]


        holder.itemView.apply {

            val tvDescription : TextView = findViewById(R.id.tvDescription)
            val imgArt : ImageView = findViewById(R.id.imgArt)
            tvDescription.text = curArt.description
            imgArt.setImageDrawable(getResources().getDrawable(R.drawable.img18))




            }
        }


    override fun getItemCount(): Int {
        return arts.size
    }
}
