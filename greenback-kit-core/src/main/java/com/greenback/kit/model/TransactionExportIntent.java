package com.greenback.kit.model;

import java.util.List;

public class TransactionExportIntent {
 
    private String targetId;
    private Form form;
    private List<TransactionMatch> matches;

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public Form getForm() {
        return form;
    }

  