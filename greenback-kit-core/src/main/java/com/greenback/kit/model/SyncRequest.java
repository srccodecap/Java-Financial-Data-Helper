package com.greenback.kit.model;

import java.time.Instant;
import java.util.List;
import java.util.Map;

public class SyncRequest {

    private Instant from;
    private Instant to;
    private Integer limit;
    private Boolean reuseProfile;
    private Map<String,String> attributes;
    private List<String> includeIds;
    private List<String> excludeIds;
    // read only
    private Instant initial;
    // for previewing what the sync would do
    private Boolean preview;
    
    public Instant getFrom() {
        return from;
    }

    public SyncRequest setFrom(Instant from) {
        this.from = from;
        return this;
    }

    public Instant getTo() {
    