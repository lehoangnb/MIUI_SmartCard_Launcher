package com.lehoang.tsmclient.launcher

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val btnSetting = findViewById<Button>(R.id.setting)
        btnSetting.setOnClickListener {
            val url = "https://tsmclient.miui.com?action=uni_settings&type=0&source_channel=wallet"
            val tsmclient = Intent(Intent.ACTION_VIEW)
            tsmclient.setPackage("com.miui.tsmclient")
            tsmclient.data = Uri.parse(url)
            startActivity(tsmclient)
        }

        val btnOpen = findViewById<Button>(R.id.open_tsmclient)
        btnOpen.setOnClickListener {
            val url = "tsmclient://swiping"
            val tsmclient = Intent(Intent.ACTION_VIEW)
            //tsmclient.setPackage("com.miui.tsmclient")
            tsmclient.data = Uri.parse(url)
            startActivity(tsmclient)
        }
    }
}