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

    public