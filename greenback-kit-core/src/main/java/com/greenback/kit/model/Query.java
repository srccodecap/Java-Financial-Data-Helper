package com.greenback.kit.model;

import java.io.Serializable;

import static com.greenback.kit.util.Utils.toIterable;

public class Query<T> implements Serializable {
 
    protected Integer limit;
    protected Iterable<String> expands;
    protected String cursor;

    public Integer getLimit() {
        return limit;
    }

    @SuppressWarnings("unchecked")
    public T setLimit(Integer limit) {
        this.limit = limit;
        return (T)this;
    }
    
    public Iterable<Strin