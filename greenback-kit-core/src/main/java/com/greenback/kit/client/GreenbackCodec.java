package com.greenback.kit.client;

import com.greenback.kit.model.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface GreenbackCodec {

    String prettyPrint(Object value) throws IOException;
    
    Map<String,Object> toFlattenedMap(Object value) throws IOException;
    
    byte[] writeBytes(Object value) throws IOException;
    
    User readUser(InputStream input) throws IOException;
    
    Paginated<User> readUsers(InputStream input) throws IOException;

    TeamMember readTeamMember(InputStream input) throws IOException;

    Paginated<TeamMember> readTeamMembers(InputStream input) throws IOException;

    Entitlements readEntitlements(InputStream input) throws IOException;

    Connect readConnect(InputStream input) throws IOException;
    
    Paginated<Connect> readConnects(InputStream input) throws IOException;

    ConnectIntent readConnectIntent(InputStream input) throws IOException;
    
    Account readAccount(InputStream input) throws IOException;

    Paginated<Account> readAccounts(InputStream input) throws IOException;

    Vision readVision(InputStream input) throws IOException;
    
    Paginated<Vision> readVisions(InputStream input) throws IOException;
    
    Message readMessage(InputStr