package com.greenback.kit.model;

public class Entitlements {

    private String dashboardExperience;     // this is an enum, but we'll do a string for now
    private Boolean personalWorkspace;
    private Boolean manageConnects;
    private Boolean onboardingWizard;
    private Boolean trialing;
    private Boolean showAccounts;
    private EntitlementFeaturePermission autoExport;
    private EntitlementFeaturePermission bulkExport;
    private EntitlementFeaturePermission mailboxDelivery;

    public String getDashboardExperience() {
        return dashboardExperience;
    }

    public Entitlements setDashboardExperience(String dashboa