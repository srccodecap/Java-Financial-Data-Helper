package com.greenback.kit.model;

public class Pagination {
 
    private Long limit;
    private Long count;
    private Long totalCount;
    private String previous;
    private String next;

    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public Long getCount() {
        return c