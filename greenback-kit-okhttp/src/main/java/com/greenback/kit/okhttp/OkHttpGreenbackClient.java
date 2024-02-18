
package com.greenback.kit.okhttp;

import com.greenback.kit.client.GreenbackCodec;
import com.greenback.kit.client.impl.AbstractGreenbackClient;
import com.greenback.kit.model.*;
import com.greenback.kit.okhttp.impl.BaseOkHttpClient;
import com.greenback.kit.util.Bytes;
import java.io.IOException;
import static java.util.Optional.ofNullable;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class OkHttpGreenbackClient extends AbstractGreenbackClient implements BaseOkHttpClient {
        
    protected final OkHttpClient httpClient;
    
    public OkHttpGreenbackClient(
            OkHttpClient httpClient,
            String baseUrl,
            GreenbackCodec codec,
            String accessToken) {
        
        super(baseUrl, codec, accessToken);
        this.httpClient = httpClient;
    }

    @Override
    public OkHttpClient getHttpClient() {
        return this.httpClient;
    }

    @Override
    public String getAccessToken() {
        return accessToken;
    }
    
    @Override
    protected User getUserByUrl(String url) throws IOException {
        
        final Request.Builder requestBuilder = new Request.Builder()
            .url(url);
        
        return this.execute(requestBuilder, this.codec::readUser);
    }

    @Override
    protected Paginated<TeamMember> getTeamMembersByUrl(String url) throws IOException {

        final Request.Builder requestBuilder = new Request.Builder()
            .url(url);

        return this.execute(requestBuilder, this.codec::readTeamMembers);
    }

    @Override
    protected Entitlements getEntitlementsByUrl(String url) throws IOException {

        final Request.Builder requestBuilder = new Request.Builder()
            .url(url);

        return this.execute(requestBuilder, this.codec::readEntitlements);
    }

    @Override
    protected Paginated<Connect> getConnectsByUrl(String url) throws IOException {
        
        final Request.Builder requestBuilder = new Request.Builder()
            .url(url);
        
        return this.execute(requestBuilder, this.codec::readConnects);
    }
    
    @Override
    protected Connect getConnectByUrl(String url) throws IOException {
        
        final Request.Builder requestBuilder = new Request.Builder()
            .url(url);
        
        return this.execute(requestBuilder, this.codec::readConnect);
    }
    
    @Override
    protected ConnectIntent getConnectIntentByUrl(
            String url) throws IOException {
        
        final Request.Builder requestBuilder = new Request.Builder()
            .url(url);
        
        return this.execute(requestBuilder, this.codec::readConnectIntent);
    }
    
    @Override
    protected ConnectIntent postConnectIntentRequestByUrl(
            String url,