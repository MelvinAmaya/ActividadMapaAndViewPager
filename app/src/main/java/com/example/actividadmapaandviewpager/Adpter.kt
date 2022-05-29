package com.example.actividadmapaandviewpager

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.actividadmapaandviewpager.databinding.ItemBinding

class ViewPagerAdapter(
    private val context: Context,
    private val labelList: MutableList<String>,
    private val colorList: MutableList<String>
) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewPagerHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerHolder, position: Int) {
        val label = labelList[position]
        val color = colorList[position]
        val posicion =position
        holder.bind(label, color,posicion)
    }

    override fun getItemCount(): Int {
        return labelList.size
    }

    class ViewPagerHolder(private var itemHolderBinding: ItemBinding) :
        RecyclerView.ViewHolder(itemHolderBinding.root) {
        fun bind(label: String, color: String,position: Int) {
            itemHolderBinding.txtTitulo.text = label
            itemHolderBinding.imageView.setImageResource(R.drawable.logoo)
            itemHolderBinding.root.setBackgroundColor(Color.parseColor(color))
           // if(position ==2)
            //{
            //    itemHolderBinding.btnMapa.isVisible=true
            //    itemHolderBinding.btnMapa.setOnClickListener {
             //       itemHolderBinding.btnMapa.setBackgroundColor(Color.parseColor(color))
             //   }
            //}

        }
    }
}