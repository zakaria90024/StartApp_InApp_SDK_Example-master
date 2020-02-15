package com.startapp.StartAppAds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.startapp.android.publish.ads.banner.Banner;
import com.startapp.android.publish.ads.banner.BannerListener;
import com.startapp.android.publish.adsCommon.StartAppAd;
import com.startapp.android.publish.adsCommon.StartAppSDK;
import com.startapp.startappinterstitialexample.R;

public class myStartApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "201848149", false);
        setContentView(R.layout.activity_main);
        //Banner banner.loadAd(300, 50);
    }
//    public void btnOpenActivity (View view){
//        Intent nextActivity = new Intent(this, MainActivity.class);
//        startActivity(nextActivity);
//        StartAppAd.showAd(this);
//    }
//
//    public Context context;
//    Banner startAppBanner = new Banner(context, new BannerListener() {
//        @Override
//        public void onReceiveAd(View banner) {
//            // banner is ready. Add it to your view if needed
//            //banner.loadAd()
//
//        }
//        @Override
//        public void onFailedToReceiveAd(View banner) {
//
//        }
//        @Override
//        public void onClick(View banner) {
//        }
//    });
}
