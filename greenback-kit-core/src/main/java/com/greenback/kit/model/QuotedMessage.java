package com.greenback.kit.model;

import java.time.Instant;
import java.util.List;

public class QuotedMessage {
    
    private String subject;
    private EmailAddress from;
    private List<EmailAddress> replyTo;
    private List<EmailAddress> to;
    private List<EmailAddress> cc;
    private Instant postedAt;

    public EmailAddress getFrom() {
        return from;
    }

    public void setFrom(EmailAddress from) {
        this.from = from;
    }

    public List<EmailAddress> getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(List<EmailAddress> replyTo) {
        this.replyTo = replyTo;
    }

    public List<EmailAddress> getTo() {
        return to;
    }

    public void setTo(List<EmailAddress> to) {
        this.to = to;
    }