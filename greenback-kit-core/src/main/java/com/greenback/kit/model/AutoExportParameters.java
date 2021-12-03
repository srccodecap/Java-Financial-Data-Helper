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

    public L