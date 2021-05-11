package com.greenback.kit.client;

import com.greenback.kit.model.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface GreenbackCodec {

    String prettyPrint(Object value) throws IOException;
    
   