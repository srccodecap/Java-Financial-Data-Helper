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
      