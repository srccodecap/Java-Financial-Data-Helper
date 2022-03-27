package com.greenback.kit.model;

import java.util.Map;
import java.util.Set;

public class Document extends GreenbackObject {
 
    protected String referenceId;
    protected DocumentMeta meta;
    protected Set<DocumentFlag> flags;
    protected Map<String,S