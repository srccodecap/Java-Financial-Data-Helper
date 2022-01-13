package com.greenback.kit.model;

import java.util.Set;

public class Connect extends GreenbackObject {
 
    private String label;
    private ConnectType type;
    private String name;
    private ConnectState state;
    private Set<String> tags;
    private String logoUrl;
    private String contactId;
    private ConnectAuthStrategy authStrategy;
    private