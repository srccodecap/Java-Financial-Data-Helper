package com.greenback.kit.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class ConnectIntentComplete {

    private Map<String,String> parameters;
    private ConnectIntentCompleteAction action;

    public Map<String, String> getParameters() {
        return parameters;
    }

    public ConnectIntentComplete setParameters(Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    
    public ConnectIntentCompleteAction getAction() {
        return action;
    }

    public ConnectIntentComplete setAction(ConnectIntentCompleteAction ac