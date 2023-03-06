
package com.greenback.kit.model;

import java.time.Instant;
import java.util.List;

public class Transaction extends Document {
 
    private TransactionArchetype archetype;
    private TransactionType type;
    private String currencyCode;
    private String altReferenceId;
    private String displayReferenceId;
    private String accountId;
    private String contactId;
    private TransactionStatus status;
    private List<Attachment> attachments;
    private PostalAddress billingAddress;
    private PostalAddress shippingAddress;
    private PostalAddress storeAddress;
    private List<Item> items;
    private List<Payment> payments;
    private List<Payment> deposits;
    private List<ExchangeRate> exchangeRates;
    private TransactionTotals totals;
    private Instant transactedAt;
    private Instant dueAt;
    
    // expandable
    private Account account;
    private Contact contact;
    private TransactionExport export;

    public TransactionArchetype getArchetype() {
        return archetype;
    }

    public void setArchetype(TransactionArchetype archetype) {
        this.archetype = archetype;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAltReferenceId() {
        return altReferenceId;
    }

    public void setAltReferenceId(String altReferenceId) {
        this.altReferenceId = altReferenceId;
    }

    public String getDisplayReferenceId() {
        return displayReferenceId;
    }

    public void setDisplayReferenceId(String displayReferenceId) {
        this.displayReferenceId = displayReferenceId;
    }

    public String getAccountId() {
        return accountId;