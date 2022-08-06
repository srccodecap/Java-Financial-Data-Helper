package com.greenback.kit.model;

import java.util.Iterator;
import java.util.List;
import static java.util.Optional.ofNullable;

public class Paginated<T> extends Response implements Iterable<T> {
 
    private Pagination pagination;
    private List<T> values;
    
    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
   