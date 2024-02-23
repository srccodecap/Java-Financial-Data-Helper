package com.greenback.kit.okhttp;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

public class OkHttpHelper {
 
    static public OkHttpClient build() {
        return new OkHttpClient.Builder()
            .rea