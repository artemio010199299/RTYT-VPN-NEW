package com.rtytvpn.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(7, 11, 20)
        window.navigationBarColor = Color.rgb(7, 11, 20)

        val screen = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(24, 24, 24, 24)
            setBackgroundColor(Color.rgb(7, 11, 20))
        }

        val title = TextView(this).apply {
            text = "RTYT VPN"
            textSize = 34f
            setTextColor(Color.rgb(56, 189, 248))
            gravity = Gravity.CENTER
        }

        val subtitle = TextView(this).apply {
            text = "PRIVATE CONNECTION"
            textSize = 14f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        val note = TextView(this).apply {
            text = "Preview build • VPN engine not configured"
            textSize = 12f
            setTextColor(Color.LTGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 18, 0, 0)
        }

        screen.addView(title)
        screen.addView(subtitle)
        screen.addView(note)
        setContentView(screen)
    }
}
