package com.example.submission1

import android.graphics.Typeface
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()
{
    private lateinit var rvData: RecyclerView
    private var list: ArrayList<DataUser> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Custom Font
        val customText: Typeface = Typeface.createFromAsset(assets, "Fragmentcore.otf")
        textGithub.typeface = customText

        // Adapter
        rvData = cvActivity
        rvData.setHasFixedSize(true)
        list.addAll(Users.listDataUser)
        rvData.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val cardView = Adapter(list)
        rvData.adapter = cardView

    }
}
