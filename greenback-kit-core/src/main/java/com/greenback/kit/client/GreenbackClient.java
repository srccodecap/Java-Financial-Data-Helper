package com.greenback.kit.client;

import com.greenback.kit.model.AutoExportQuery;
import com.greenback.kit.model.*;

import java.io.IOException;

public interface GreenbackClient {

    String getBaseUrl();
    
    GreenbackCodec getCodec();
    
    // Users
    
    default User getUserById(String userId) throws IOException {
        return this.getUserById(userId, null);
    }
    
    User getUserById(String userId, Iterable<String> expands) throws IOException;

    Entitlements getEntitlements() throws IOException;

    Paginated<TeamMember> getTeamMembersByTeamId(String teamId) throws IOException;

    // Connects
    
    Paginated<Connect> getConnects(ConnectQuery connectQuery) throws IOException;
    
    default Connect getConnectByLabel(String connectLabel) throws IOException {
        return this.getConnectByLabel(connectLabel, null);
    }
    
    Connect getConnectByLabel(String connectLabel, Iterable<String> expands) throws IOException;
    
    // Connect Intents
