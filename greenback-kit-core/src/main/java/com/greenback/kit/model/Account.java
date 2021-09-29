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

  