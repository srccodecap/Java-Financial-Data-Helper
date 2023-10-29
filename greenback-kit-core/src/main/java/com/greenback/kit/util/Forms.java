package com.greenback.kit.util;

import com.greenback.kit.model.Form;
import com.greenback.kit.model.FormField;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;

public class Forms {
 
    static public FormField findFieldByName(
            Form form,
            String name) {
        
        if (form == null || form.getFields() == null || form.getFields().isEmpty()) {
            return null;
        }
        
        return form.getFields().stream()
       