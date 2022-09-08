
package com.greenback.kit.model;

public class PostalAddress {
    
    private String name;
    private String line1;
    private String line2;
    private String city;
    // ISO 3166-2 state, province, region
    // https://en.wikipedia.org/wiki/ISO_3166-2
    private String regionCode;
    private String postalCode;
    private String countryCode;
    // for addresses that aren't able to be accurately parsed into the component fields above
    private String rawAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {