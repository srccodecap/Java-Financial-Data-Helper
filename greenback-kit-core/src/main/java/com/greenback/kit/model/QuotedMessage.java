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
  