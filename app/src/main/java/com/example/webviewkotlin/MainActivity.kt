package com.example.webviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        WebView.settings.javaScriptEnabled
        WebView.loadUrl("https://idn.sch.id/")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
       menuInflater.inflate(R.menu.menu_web_view, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when(item?.itemId){
        R.id.web1 -> {
            WebView.loadUrl("https://idn.sch.id/profil/")
            true
        }
        R.id.web2 -> {
            WebView.loadUrl("https://idn.sch.id/daftar/")
            true
        }
        R.id.web3 -> {
            WebView.loadUrl("https://idn.sch.id/galeri/")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }
    }
}
