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
            Request.Builder requestBuilder,
            ClientDeserializeHandler<T> deserializeHandler) throws IOException {
        
        if (this.getAccessToken() != null) {
            requestBuilder.addHeader("Authorization", "Bearer " + this.getAccessToken());
        }
        
        requestBuilder.addHeader("Accept", "application/json");
        
        // make sure response is always closed
        try (Response response = this.getHttpClient().newCall(requestBuilder.build()).execute()) {
            String contentType = response.header("Content-Type");

            // we can only handle json
        