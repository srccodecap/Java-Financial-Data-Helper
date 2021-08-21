package com.greenback.kit.client.impl;

import com.fizzed.crux.uri.MutableUri;
import com.greenback.kit.client.GreenbackCodec;
import com.greenback.kit.model.GreenbackException;
import com.greenback.kit.model.Paginated;
import com.greenback.kit.model.Query;
import com.greenback.kit.util.IoFunction;
import com.greenback.kit.util.StreamingPaginated;
import static com.greenback.kit.util.Utils.toStringList;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.joining;
import java.util.stream.StreamSupport;

public class ClientHelper {
 
    private static final DateTimeFormatter DTF_ISO_WITH_MILLIS = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'")
        .withZone(ZoneId.of("UTC"));
    
    static public Map<String,String> toQueryMap(
                GreenbackCodec codec,
                Object value) throws IOException {
        
        Objects.requireNonNull(codec, "codec was null");
        
        final Map<String,String> map = new LinkedHashMap<>();

        if (value != null) {
            final Map<String,Object> flattenedMap = codec.toFlattenedMap(value);
            if (flattenedMap != null) {
                flattenedMap.forEach((k,v) -> {
                    map.put(k, ClientHelper.toStringParameter(v));
                });
            }
        }

        return map;
    }
    
    static public String toStringParameter(Object value) {
        if (value instanceof Iterable) {
            return toStringList((Iterable)value);
        } else if (value instanceof Instant) {
            return toInstantParameter((Instant)value);
        } else {
            return Objects.toString(value, "");
        }
    }
    
    static public String toInstantParameter(
            Instant instant) {
   