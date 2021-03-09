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

    Entitlements getEntitlemen