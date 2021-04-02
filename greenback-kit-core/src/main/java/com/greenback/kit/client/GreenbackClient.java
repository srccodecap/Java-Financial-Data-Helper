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
    
    ConnectIntent beginConnectIntent(String connectLabel) throws IOException;
    
    ConnectIntent reconnectAccountIntent(String accountId) throws IOException;
    
    ConnectIntent authorizeConnectIntent(
        String token,
        ConnectIntentAuthorize authorize) throws IOException;
    
    ConnectIntent completeConnectIntent(
        String token,
        ConnectIntentComplete complete) throws IOException;
    
    // Accounts
    
    Account createAccount(Account account) throws IOException;
    
    Account updateAccount(Account account) throws IOException;
    
    Paginated<Account> getAccounts(AccountQuery accountQuery) throws IOException;
    
    default Account getAccountById(String accountId) throws IOException {
        return this.getAccountById(accountId, null);
    }
    
    Account getAccountById(String accountId, Iterable<String> expands) throws IOException;

    Account deleteAccountById(String accountId) throws IOException;
    
    // Visions
    
    Vision createVision(VisionRequest visionRequest) throws IOException;
    
    default Vision getVisionById(String visionId) throws IOException {
        return this.getVisionById(visionId, null);
    }
    
    Vision getVisionById(String visionId, Iterable<String> expands) throws IOException;

    // Messages
    
    Paginated<Message> getMessages(MessageQuery messageQuery) throws IOException;
    
    default Message createMessage(MessageRequest messageRe