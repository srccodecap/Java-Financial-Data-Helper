
package com.greenback.kit.client.impl;

import com.fizzed.crux.uri.MutableUri;
import com.greenback.kit.model.AutoExportQuery;
import com.greenback.kit.client.GreenbackClient;
import com.greenback.kit.client.GreenbackCodec;
import static com.greenback.kit.client.impl.ClientHelper.toExpandQueryParameter;
import static com.greenback.kit.client.impl.ClientHelper.toInstantParameter;
import static com.greenback.kit.client.impl.ClientHelper.toListQueryParameter;
import static com.greenback.kit.client.impl.ClientHelper.toStreamingPaginated;
import static com.greenback.kit.client.impl.ClientHelper.toValue;
import com.greenback.kit.model.*;
import com.greenback.kit.util.Bytes;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import static java.util.Optional.ofNullable;

abstract public class AbstractGreenbackClient implements GreenbackClient {
    
    protected final String baseUrl;
    protected final GreenbackCodec codec;
    protected final String accessToken;

    protected AbstractGreenbackClient(
            String baseUrl,
            GreenbackCodec codec,
            String accessToken) {
        
        Objects.requireNonNull(baseUrl, "baseUrl was null");
        Objects.requireNonNull(codec, "codec was null");
        Objects.requireNonNull(accessToken, "accessToken was null");
        
        this.codec = codec;
        this.baseUrl = baseUrl;
        this.accessToken = accessToken;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }
    
    @Override
    public GreenbackCodec getCodec() {
        return this.codec;
    }
    
    protected MutableUri buildBaseUrl() {
        final MutableUri url = new MutableUri(this.baseUrl);
        // protect against someone include params on the base url that get included
        url.setQuery(null);
        url.fragment(null);
        return url;
    }

    protected Map<String,String> toQueryMap(Object value) throws IOException {
        final Map<String,String> map = new LinkedHashMap<>();

        if (value != null) {
            final Map<String,Object> flattenedMap = this.codec.toFlattenedMap(value);
            if (flattenedMap != null) {
                flattenedMap.forEach((k,v) -> {
                    map.put(k, ClientHelper.toStringParameter(v));
                });
            }
        }

        return map;
    }
    
    //
    // Users
    //
    
    @Override
    public User getUserById(
            String userId,
            Iterable<String> expands) throws IOException {

        Objects.requireNonNull(userId, "userId was null");
        
        final String url = this.buildBaseUrl()
            .path("v2/users")
            .rel(userId)
            .queryIfPresent("expands", ofNullable(toListQueryParameter(expands)))
            .toString();
        
        return toValue(() -> this.getUserByUrl(url));
    }
    
    abstract protected User getUserByUrl(
            String url) throws IOException;

    @Override
    public Paginated<TeamMember> getTeamMembersByTeamId(
            String teamId) throws IOException {

        Objects.requireNonNull(teamId, "teamId was null");

        final String url = this.buildBaseUrl()
            .path("v2/teams")
            .rel(teamId)
            .rel("members")
            .toString();

        return toStreamingPaginated(url, v -> this.getTeamMembersByUrl(v));
    }

    abstract protected Paginated<TeamMember> getTeamMembersByUrl(
        String url) throws IOException;

    @Override
    public Entitlements getEntitlements() throws IOException {

        final String url = this.buildBaseUrl()
            .path("v2/entitlements")
            .toString();

        return toValue(() -> this.getEntitlementsByUrl(url));
    }

    abstract protected Entitlements getEntitlementsByUrl(
        String url) throws IOException;

    //
    // Connects
    //
    
    @Override
    public Paginated<Connect> getConnects(
            ConnectQuery connectQuery) throws IOException {

        final String url = this.buildBaseUrl()
            .path("v2/connects")
            .query(this.toQueryMap(connectQuery))
            .toString();
        
        return toStreamingPaginated(url, v -> this.getConnectsByUrl(v));
    }
    
    @Override
    public Connect getConnectByLabel(
            String connectLabel,
            Iterable<String> expands) throws IOException {

        final String url = this.buildBaseUrl()
            .path("v2/connects")
            .rel(connectLabel)
            .queryIfPresent("expands", toExpandQueryParameter(expands))
            .toString();
        
        return toValue(() -> this.getConnectByUrl(url));
    }
    
    abstract protected Paginated<Connect> getConnectsByUrl(
            String url) throws IOException;
    
    abstract protected Connect getConnectByUrl(
            String url) throws IOException;
    
    //
    // Connect Intents
    //
    
    @Override
    public ConnectIntent beginConnectIntent(
            String connectLabel) throws IOException {

        Objects.requireNonNull(connectLabel, "connectLabel was null");
        
        final String url = this.buildBaseUrl()
            .path("v2/connects")
            .rel(connectLabel)
            .rel("begin")
            .toString();
        
        return toValue(() -> this.getConnectIntentByUrl(url));
    }
    
    @Override
    public ConnectIntent reconnectAccountIntent(
            String accountId) throws IOException {

        Objects.requireNonNull(accountId, "accountId was null");
        
        final String url = this.buildBaseUrl()
            .path("v2/accounts")
            .rel(accountId)
            .rel("reconnect")
            .toString();
        
        return toValue(() -> this.getConnectIntentByUrl(url));
    }
    
    @Override
    public ConnectIntent authorizeConnectIntent(
            String token,
            ConnectIntentAuthorize request) throws IOException {

        Objects.requireNonNull(token, "token was null");
        Objects.requireNonNull(request, "request was null");
        
        final String url = this.buildBaseUrl()
            .path("v2/connect_intents")
            .rel(token)
            .toString();
        
        return toValue(() -> this.postConnectIntentRequestByUrl(url, request));
    }
    
    @Override
    public ConnectIntent completeConnectIntent(
            String token,
            ConnectIntentComplete request) throws IOException {

        Objects.requireNonNull(token, "token was null");
        Objects.requireNonNull(request, "request was null");
        
        final String url = this.buildBaseUrl()
            .path("v2/connect_intents")
            .rel(token)
            .rel("complete")
            .toString();
        
        return toValue(() -> this.postConnectIntentRequestByUrl(url, request));
    }
    
    abstract protected ConnectIntent getConnectIntentByUrl(
            String url) throws IOException;
    
    abstract protected ConnectIntent postConnectIntentRequestByUrl(
            String url,
            Object request) throws IOException;
    
    //
    // Accounts
    //
    
    @Override
    public Account createAccount(
            Account account) throws IOException {

        Objects.requireNonNull(account, "account was null");
        
        final String url = this.buildBaseUrl()
            .path("v2/accounts")
            .toString();
        
        return this.postAccountByUrl(url, account);
    }
    
    @Override
    public Account updateAccount(
            Account account) throws IOException {

        Objects.requireNonNull(account, "account was null");
        Objects.requireNonNull(account.getId(), "account id was null");
        
        final String url = this.buildBaseUrl()
            .path("v2/accounts")
            .rel(account.getId())
            .toString();
        
        return this.postAccountByUrl(url, account);
    }
    
    @Override
    public Paginated<Account> getAccounts(
            AccountQuery accountQuery) throws IOException {

        final String url = this.buildBaseUrl()
            .path("v2/accounts")
            .query(this.toQueryMap(accountQuery))
            .toString();
        
        return this.getAccountsByUrl(url);
    }
    