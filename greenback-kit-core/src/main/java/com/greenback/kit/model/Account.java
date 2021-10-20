package com.greenback.kit.model;

import java.util.Map;

public class Account extends GreenbackObject {
 
    private String userId;
    private String connectId;
    private String referenceId;
    private AccountType type;
    private AccountState state;
    private AccountConnectionState connectionState;
    private Integer consecutiveErrors;
    private String defaultName;
    private String overlayName;
    
    // expandable
    
    private Connect connect;
    private Map<String,Sync> syncs;

    public String getUserId() {
        return userId;
    }

    public Account setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getConnectId() {
        return connectId;
    }

    public Account setConnectId(String connectId) {
        this.connectId = connectId;
        return this;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public Account setReferenceId(String referenceId) {
        this.referenceId = referenceId;
        return this;
    }
    
    public AccountType getType() {
        return type;
    }

    public Account setType(AccountType type) {
        this.type = type;
        return this;
    }
    
    public String getDefaultName() {
        return defaultName;
    }

    public Account setDefaultName(String defaultName) {
        this.defaultName = defaultName;
        return this;
    }

    public String getOverlayName() {
        return overlayName;
    }

    public Account setOverlayName(String overlayName) {
        this.overlayName = overlayName;
        return this;
    }

    public AccountState getState() {
        return state;
    }

    public Account setState(AccountState state) {
        this.state = state;
        return this;
    }

    public AccountConnectionState getConnectionState() {
        return connectionState;
    }

    public Account setConnectionState(AccountConnectionState connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    public Integer getConsecutiveErrors() {
        return consecutiveErrors;
    }

    public Account setConsecutiveErrors(Integer consecutiveErrors) {
        this.consecutiveErrors = consecutiveErrors;
        return this;
    }

    // helpers
    
//    public String getName() {
//        return maybe(this.overlayName).orElse(this.defaultName);
//    }
//    
//    public GBSync getPendingSync() {
//        return maybe(this.syncs)
//            .map(v -> v.get("pending"))
//            .orElse(null);
//    }
//    
//    public GBSync getLastSync() {
//        retur