package com.greenback.kit.model;

import java.util.List;

public class TransactionExport extends GreenbackObject {
 
    protected String transactionId;
    protected String accountId;
    protected String triggeredBy;
    protected TransactionExportMode mode;
    protected AccountingMethod accountingMethod;
    protected List<TransactionExportStep> steps;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getTriggeredBy() {
        return triggeredBy;
    }

    public void setTriggeredBy(String triggeredBy) {
        this.triggeredBy = triggeredBy;
    }

    public TransactionExportMode getMode() {
        return mode;
    }

    public void setMode(TransactionExportMode mode) {
        this.mode = mode;
    }

    public Accountin