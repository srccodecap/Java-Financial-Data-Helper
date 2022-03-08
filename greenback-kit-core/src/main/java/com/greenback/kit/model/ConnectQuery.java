package com.greenback.kit.model;

import static com.greenback.kit.util.Utils.toIterable;
import java.time.Instant;

public class ConnectQuery extends Query<ConnectQuery> {
    
    protected Iterable<String> labels;
    protected Iterable<ConnectState> states;
    protected Iterable<ConnectType> types;
    protected Instant minCreatedAt;
    protected Instant maxCreatedAt;
    protected Instant minUpdatedAt;
    protected Instant maxUpdatedAt;

    public Iterable<String> getLabels() {
        return labels;
    }

    public ConnectQuery setLabels(Iterable<String> labels) {
        this.labels = labels;
        return this;
    }
    
    public Iterable<ConnectState> getStates() {
        return states;
    }

    public ConnectQuery setStates(Iterable<ConnectState> states) {
        