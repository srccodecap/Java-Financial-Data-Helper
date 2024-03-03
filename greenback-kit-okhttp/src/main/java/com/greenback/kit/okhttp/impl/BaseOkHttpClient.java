package com.greenback.kit.okhttp.impl;

import com.greenback.kit.client.impl.ClientDeserializeHandler;
import com.greenback.kit.model.GreenbackException;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public interface BaseOkHttpClient {
 
    public OkHttpClient getHttpClient();
    
    public String getAccessToken();
        
    default public <T> T execute(
            Request.Builder request