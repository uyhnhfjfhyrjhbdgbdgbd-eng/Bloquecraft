package com.bloquecraft.game

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : Activity() {
    private lateinit var gameView: WebView

    @Suppress("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.decorView.systemUiVisibility = (
            View.SYSTEM_UI_FLAG_FULLSCREEN
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
        )
        gameView = WebView(this)
        gameView.setBackgroundColor(android.graphics.Color.rgb(135, 206, 235))
        gameView.webViewClient = WebViewClient()
        gameView.webChromeClient = WebChromeClient()
        gameView.settings.apply {
            javaScriptEnabled = true
            domStorageEnabled = true
            cacheMode = WebSettings.LOAD_DEFAULT
            allowFileAccess = true
            mediaPlaybackRequiresUserGesture = false
        }
        setContentView(gameView)
        gameView.loadUrl("file:///android_asset/index.html")
    }

    override fun onBackPressed() {
        if (gameView.canGoBack()) gameView.goBack() else super.onBackPressed()
    }

    override fun onDestroy() {
        gameView.destroy()
        super.onDestroy()
    }
}
