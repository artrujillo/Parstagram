package com.example.atrujillo.parstagram;

import android.app.Application;
import com.parse.Parse;

public class ParseApp extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

        final Parse.Configuration configuration = new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.appId))
                .clientKey(getString(R.string.master_key))
                .server(getString(R.string.server))
                .build();

        Parse.initialize(configuration);
    }

}
