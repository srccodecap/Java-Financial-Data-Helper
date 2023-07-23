package com.greenback.kit.model;

import java.time.Instant;

public class TransactionStatus {

    private TransactionState state;
    private String message;
    private Instant updatedAt;

    public TransactionState getState() {
        return state;
    }

    public TransactionStatus setState(TransactionState state) {
        this.state = state;
        return this;
    }

    public String getMessa