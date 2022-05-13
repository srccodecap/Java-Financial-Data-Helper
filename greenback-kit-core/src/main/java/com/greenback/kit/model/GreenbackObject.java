package com.greenback.kit.model;

import java.time.Instant;

public class GreenbackObject {
 
    protected String id;
    protected Instant createdAt;
    protected Instant updatedAt;

    public String getId() {
        return id;
    }

    public void setId(Strin