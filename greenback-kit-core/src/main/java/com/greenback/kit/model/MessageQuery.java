package com.greenback.kit.model;

import java.time.Instant;

public class MessageQuery extends DocumentQuery<MessageQuery> {
    
    protected String query;
    protected Instant minPostedAt;          // start
    protected Instant maxPostedAt;          // end

    public String getQuery() {
        return query;
    }

    public MessageQuery setQuery(String query) {
        this.query = query;
        return this;
    }

    publ