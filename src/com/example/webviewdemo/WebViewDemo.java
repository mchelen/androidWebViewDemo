package com.example.webviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebViewDemo extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("http://www.google.com");
    }
}
