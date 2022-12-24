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
    // 