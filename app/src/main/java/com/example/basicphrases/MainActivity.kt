package com.example.basicphrases

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import java.security.cert.X509CRL

class MainActivity : AppCompatActivity() {

    fun click(androidView: View)
    {
        var play=(androidView as Button)
        Log.i("Position",play.getTag().toString())

        var audio=MediaPlayer.create(this,resources.getIdentifier(play.getTag().toString(),"raw",packageName))
        audio.start()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}