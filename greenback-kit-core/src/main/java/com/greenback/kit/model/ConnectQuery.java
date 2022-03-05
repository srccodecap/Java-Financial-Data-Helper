package com.greenback.kit.model;

import static com.greenback.kit.util.Utils.toIterable;
import java.time.Instant;

public class ConnectQuery extends Query<ConnectQuery> {
    
    protected Iterable<String> labels;
    protected Iterable<ConnectState> states;
    protected Iterable<ConnectType> types;
    protected Instant minCreatedAt;
    