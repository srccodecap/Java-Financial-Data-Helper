package com.greenback.kit.okhttp;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public class OkHttpHelper {
 
    static public OkHttpClient build() {
        return new OkHttpClient.Builder()
            .readTimeout(130, TimeUnit.SECONDS)     // some API calls like exports can take 2 mins
            .callTimeout(140, TimeUnit.SECONDS)
            .build();
    }
  