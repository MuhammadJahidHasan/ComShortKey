package com.jahid_hasan.positve.comkeyshort;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by jahid_hasan on 7/20/17.
 */

public class Linux extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcontent);


        //for custom title bar activity


        LinearLayout linear = (LinearLayout) findViewById(R.id.linear8);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.linux_custom);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        //for abmob add

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        try {
            WebView webView = null;
            webView = (WebView) findViewById(R.id.webview);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("file:///android_asset/linux.html");
        } catch (Exception e) {
            // TODO: handle exception
            this.finish();
        }

    }
}