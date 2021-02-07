package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("KzI2EdPQa9laAfxUwFv8BUv4PdieHJmA5KzvdzWy")
                .clientKey("vBB7yZAaQgFiSvCM8m7cE3kyXTczO57hUnJiWkmg")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
