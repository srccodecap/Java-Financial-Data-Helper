package com.greenback.kit.model;

import java.util.Map;
import java.util.Set;

public class Document extends GreenbackObject {
 
    protected String referenceId;
    protected DocumentMeta meta;
    protected Set<DocumentFlag> flags;
    protected Map<String,String> attributes;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public DocumentMeta getMeta() {
        return meta;
    }

    public void setMeta(DocumentMeta meta) {
   