package com.greenback.kit.model;

public class ExchangeRate {
    
    private Double from;
    private Double rate;
    private String currencyCode;
    private Double to;
    private ExchangeRateType type;

    public Double getFrom() {
        return from;
    }

    public void setFrom(Double from) {
        this.from = from;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

  