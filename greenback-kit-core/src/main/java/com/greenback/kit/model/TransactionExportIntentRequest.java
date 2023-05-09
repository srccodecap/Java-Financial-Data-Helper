package com.greenback.kit.model;

import static com.greenback.kit.util.Utils.toIterable;
import java.time.Instant;
import java.util.Map;

public class TransactionExportIntentRequest {
 
    private String payment;
    private Boolean itemized;
    private Instant verifiedBy;
    private Map<String,String> parameters;
    private Iterable<String> expands;

    public String getPayment() {
        return payment;
    }

    public TransactionExportIntentRequest setPayment(String payment) {
        this.payment = payment;
        return this;
    }

    public Boolean getItemized() {
        return itemized;
    }

    public TransactionExportIntentRequest setItemized(Boolean itemized) {
        this.itemized = itemized;
       