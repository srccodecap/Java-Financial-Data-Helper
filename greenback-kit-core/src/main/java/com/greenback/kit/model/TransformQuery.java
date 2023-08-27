package com.greenback.kit.model;

import java.time.Instant;

public class TransformQuery extends Query<TransformQuery> {

    protected Iterable<String> accountIds;
    protected Iterable<TransformState> states;
    protected Instant minCreatedAt;
    protected Instant maxCreatedAt;
    protected Instant minUpdatedAt;
    protected Instant maxUpdatedAt;

    public Iterable<String> getAccountIds()