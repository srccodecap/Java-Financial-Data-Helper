package com.greenback.kit.model;

import com.greenback.kit.vision.VisionAnnotations;
import com.greenback.kit.vision.VisionTransactionMatcher;
import java.util.List;

public class Vision extends GreenbackObject {

    private String name;
    private ProcessingStatus status;
    private VisionAnnotations annotations;
    private VisionTransactionMatcher transactionMatcher;
    private List<Attachment> attachments;
    
    // expandable
    private List<Transaction> transactions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProcessingStatus getStatus() {
        return status;
    }

    public void setStatus(ProcessingStatus status) {
        this.status = status;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attac