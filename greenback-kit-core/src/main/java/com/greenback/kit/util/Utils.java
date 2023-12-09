package com.greenback.kit.util;

import com.greenback.kit.model.Paginated;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import static java.util.Optional.ofNullable;
import java.util.Set;

public class Utils {
    
    static public String toStringList(Iterable<?> values) {
        final StringBuilder sb = new StringBuilder();
        
        if (values != null) {
            for (Object v : values) {
                if (sb.