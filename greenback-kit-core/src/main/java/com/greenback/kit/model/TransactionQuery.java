package com.greenback.kit.model;

import static com.greenback.kit.util.Utils.toIterable;
import java.time.Instant;

public class TransactionQuery extends DocumentQuery<TransactionQuery> {
    
    protected Iterable<TransactionArchetype> archetypes;
    protected Iterable<TransactionType> types;
    protected String query;
    protected Instant minTransa