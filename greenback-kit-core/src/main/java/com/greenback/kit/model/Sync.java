package com.greenback.kit.model;

public class Sync extends GreenbackObject {
 
    private String referenceId;
    private String accountId;
    private SyncType type;
    private String triggeredBy;
    private String message;
    private Double progress;
    private ProcessingStatus status;
    private GreenbackEr