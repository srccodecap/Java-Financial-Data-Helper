package com.greenback.kit.model;

public class Sync extends GreenbackObject {
 
    private String referenceId;
    private String accountId;
    private SyncType type;
    private String triggeredBy;
    private String message;
    private Double progress;
    private ProcessingStatus status;
    private GreenbackError error;
    private SyncRequest request;
    private SyncSummary summary;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public ProcessingStatus getStatus() {
        return status;
    }

    public void setStatus(ProcessingStatus status) {
        this.status = status;
    }
    
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

