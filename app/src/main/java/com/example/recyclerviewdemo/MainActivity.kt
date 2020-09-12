package com.example.recyclerviewdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songsObject = mutableListOf<Model>()
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        songsObject.add(Model("Lorem Ipsum is simply dummy text ", "Lorem ipsum dolor sit amet, consectetur adipiscing elit"))
        recyclerview.adapter = MyAdapter(songsObject)
        recyclerview.layoutManager = LinearLayoutManager(this)
    }
}
