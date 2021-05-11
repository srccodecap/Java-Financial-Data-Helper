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

    TeamMember readTeamMe