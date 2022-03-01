package com.example.uidemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html.fromHtml
import android.widget.TextView
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {1
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userFollowerDetail: TextView = findViewById(R.id.user_follower_detail)
        userFollowerDetail.text = fromHtml(getString(R.string.userFollowerDetail))

        val userFollowingDetail: TextView = findViewById(R.id.user_following_detail)
        userFollowingDetail.text = fromHtml(getString(R.string.userFollowingDetail))

        val materialToolbar: MaterialToolbar = findViewById(R.id.mt_toolbar)
        setSupportActionBar(materialToolbar)
    }
}