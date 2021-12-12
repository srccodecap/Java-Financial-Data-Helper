package com.greenback.kit.model;

import java.time.Instant;
import java.util.List;

public class AutoExportParameters {
    private String query;
    private List<TransactionType> types;
    private Instant minTransactedAt;
    private Instant maxTransactedAt;
    private Integer limit;
    private Integer errorLimit;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<TransactionType> getTypes() {
        return types;
    }

    public void setTypes(List<TransactionType> types) {
        this.types = types;
    }

    public Instant getMinTransactedAt() {
        return minTransactedAt;
    }

    public void setMinTransactedAt(Instant minTransactedAt) {
        this.minTransactedAt = minTransactedAt;
    }

    public Instant getMaxTransactedAt() {
        return maxTransactedAt;
    }

    public void setMaxTransactedAt(Instant maxTransactedAt) {
        this.maxTransactedAt = maxTransactedAt;
    }

    public