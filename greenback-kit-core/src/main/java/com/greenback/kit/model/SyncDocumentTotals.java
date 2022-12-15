
package com.greenback.kit.model;

import java.time.Instant;

public class SyncDocumentTotals {
    
    private Integer total;
    private Integer created;
    private Integer updated;
    private Integer staged;
    private Integer ignored;
    private Integer warnings;
    private Integer errors;
    private Instant warnedAt;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public Integer getUpdated() {
        return updated;
    }

    public void setUpdated(Integer updated) {
        this.updated = updated;
    }

    public Integer getStaged() {
        return staged;
    }

    public void setStaged(Integer staged) {
        this.staged = staged;
    }

    public Integer getIgnored() {
        return ignored;
    }

    public void setIgnored(Integer ignored) {
        this.ignored = ignored;
    }
    
    public Integer getWarnings() {
        return warnings;
    }

    public void setWarnings(Integer warnings) {
        this.warnings = warnings;
    }

    public Integer getErrors() {
        return errors;
    }

    public void setErrors(Integer errors) {
        this.errors = errors;
    }
    
    public Instant getWarnedAt() {
        return warnedAt;
    }

    public void setWarnedAt(Instant warnedAt) {
        this.warnedAt = warnedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (total != null) {
            sb.append("total=").append(total);
        }
        if (created != null) {
            if (sb.length() > 0) { sb.append(", "); }
            sb.append("created=").append(created);
        }
        if (updated != null) {
            if (sb.length() > 0) { sb.append(", "); }
            sb.append("updated=").append(updated);
        }
        if (staged != null) {
            if (sb.length() > 0) { sb.append(", "); }
            sb.append("staged=").append(staged);
        }
        if (ignored != null) {
            if (sb.length() > 0) { sb.append(", "); }
            sb.append("ignored=").append(ignored);
        }
        if (warnings != null) {
            if (sb.length() > 0) { sb.append(", "); }
            sb.append("warnings=").append(warnings);
        }
        if (errors != null) {
            if (sb.length() > 0) { sb.append(", "); }
            sb.append("errors=").append(errors);
        }
        return sb.toString();
    }

    // helpers
    