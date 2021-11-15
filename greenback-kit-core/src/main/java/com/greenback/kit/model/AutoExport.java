package com.greenback.kit.model;

import java.util.List;
import java.time.Instant;

public class AutoExport extends GreenbackObject {
    private String userId;
    private String accountingAccountId;
    private AutoExportParameters parameters;
    private AutoExportFrequency frequency;
    private AutoExportState state;
    private List<String> accountIds;
    private Instant lastRunAt;

    // from expands
    private Account accountingAccount;
    private List<Account> accounts;
    private ExportRun lastRun;
    private ExportRun pendingRun;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountingAccountId() {
        return accountingAccountId;
    }

    public void setAccountingAccountId(String accountingAccountId) {
        this.accountingAccountId = accountingAccountId;
    }

    public AutoExportParameters getParameters() {
        return parameters;
    }

    public void setParameters(AutoExportParameters parameters) {
        this.parameters = parameters;
    }

    public AutoExportFrequency getFrequency() {
        return frequency;
    }

    public void setFrequency(AutoExportFrequency frequency) {
        this.frequency = frequency;
    }

    public AutoExportState getState() {
        return state;