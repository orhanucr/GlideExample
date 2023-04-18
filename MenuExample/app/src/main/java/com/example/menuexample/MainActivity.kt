package com.example.menuexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.ListView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.menuexample.adapter.UserCustomAdapter
import com.example.menuexample.services.UserServices

class MainActivity : AppCompatActivity() {

    lateinit var listView:ListView
    val userServices = UserServices()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.userList)
        val customAdapter = UserCustomAdapter(this, userServices.userResult())
        listView.adapter = customAdapter
    }


}