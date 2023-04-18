package com.example.menuexample.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.menuexample.R
import com.example.menuexample.models.User

class UserCustomAdapter(private val context: Activity, private val list: List<User>) : BaseAdapter() {
    //BaseAdapter ile gelen yapılar
    override fun getCount(): Int {
        println("List size: ${list.size}")
        return list.size
    }

    override fun getItem(position: Int): Any {
        println("Position: ${list.get(position)}")
        return list.get(position)
    }

    override fun getItemId(position: Int): Long {
        println("ItemId: ${position.toLong()}")
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item,null,true)
        val r_title = rootView.findViewById<TextView>(R.id.r_title)
        val r_email = rootView.findViewById<TextView>(R.id.r_email)
        val r_age = rootView.findViewById<TextView>(R.id.r_yas)
        val r_image = rootView.findViewById<ImageView>(R.id.r_image)

        val user = list.get(position)

        r_title.text = "${user.first} ${user.last}"
        r_email.text = user.email
        r_age.text = user.age.toString()
        Glide.with(context).load(user.image).into(r_image)
        return rootView
    }
}

