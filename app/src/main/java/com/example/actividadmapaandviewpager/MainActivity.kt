package com.example.actividadmapaandviewpager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnMapa.setOnClickListener {
            val i = Intent(this,MapsActivity::class.java)
            startActivity(i)
        }

        val list: MutableList<String> = ArrayList()
        list.add("Creador: Melvin Josué Pereira Amaya.")
        list.add("Para visualizar el mapa precione el boton.")


        val colorList: MutableList<String> = ArrayList()
        colorList.add ("#0FAFC4")
        colorList.add("#11B689")

        viewPager.adapter = ViewPagerAdapter(this, list, colorList)

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                if (position == 0) {
                    btnMapa.isVisible=false
                }
                else if (position == 1) {
                    btnMapa.isVisible=true
                }
                super.onPageSelected(position)
            }
        })

    }
}