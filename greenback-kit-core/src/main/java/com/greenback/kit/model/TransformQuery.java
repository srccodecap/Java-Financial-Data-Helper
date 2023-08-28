package com.greenback.kit.model;

import java.time.Instant;

public class TransformQuery extends Query<TransformQuery> {

    protected Iterable<String> accountIds;
    protected Iterable<TransformState> states;
    protected Instant minCreatedAt;
    protected Instant maxCreatedAt;
    protected Instant minUpdatedAt;
    protected Instant maxUpdatedAt;

    public Iterable<String> getAccountIds() {
        return accountIds;
    }

    public TransformQuery setAccountIds(Iterable<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    public Iterable<TransformState> getStates() {
        return states;
    }

    public TransformQuery setStates(Iterable<TransformState> states) {
        this.states = states;
        return this;
    }

    public In