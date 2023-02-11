package com.greenback.kit.model;

public class TeamMember extends GreenbackObject {

    private String teamId;
    private String userId;
    private TeamMemberRole role;
    private TeamMemberState state;
    private User team;
    private User user;

    public String getTeamId() {
        return teamId;
    }

    public TeamMember setTeamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public TeamMember setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    publi