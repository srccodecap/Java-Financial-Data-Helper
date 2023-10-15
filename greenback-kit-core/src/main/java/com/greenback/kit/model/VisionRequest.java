package com.greenback.kit.model;

import com.greenback.kit.util.Bytes;
import java.io.File;
import java.util.Objects;

public class VisionRequest {
 
    private Boolean async;
    private Bytes document;

    public Boolean getAsync() {
        return async;
    }

    public VisionRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }

    public Bytes getDocument() {
        return document;
    }

    public VisionReque