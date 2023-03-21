package com.greenback.kit.model;

import java.util.List;

public class TransactionExport extends GreenbackObject {
 
    protected String transactionId;
    protected String accountId;
    protected String triggeredBy;
    protected TransactionExportMode mode;
    protected AccountingMethod accountingMethod;
    protected Lis