package com.thumbs.android.thumbsAndroid.ui.shake

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.thumbs.android.thumbsAndroid.R
import kotlinx.android.synthetic.main.activity_death.*
import org.w3c.dom.Text

class DeathActivity : AppCompatActivity() {

    var textView: TextView?  = null
    var button: Button?  = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_death)

        //textView = count
        button = btn_revive
    }




}