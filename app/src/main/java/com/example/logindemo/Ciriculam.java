package com.example.logindemo;

import android.os.Bundle ;
import android.app.Activity;
import android.view.View ;
import android.webkit.WebView ;
import android.widget.Button;

public class Ciriculam extends Activity {
    @Override

    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState) ;
        setContentView(R.layout. activity_ciriculam ) ;

    }
    public void loadPage (View view) {
        Button comp=(Button)findViewById(R.id.computer);
        WebView webview = new WebView(this ) ;
        webview.getSettings().setJavaScriptEnabled( true ) ;
        setContentView(webview) ;

            webview.loadUrl("https://drive.google.com/file/d/1vReEwcAqVhN7AmMNLcqMjYyTOoD5jAJc/view?usp=sharing");

    }

}

