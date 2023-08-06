package com.greenback.kit.model;

public class Transform extends GreenbackObject {
 
    private String accountId;
    private Long sortOrder;
    private TransformType type;
    private TransformState state;
    private String name;
    private Object matcher;
    private Object methods;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
       