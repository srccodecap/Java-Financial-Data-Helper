package com.greenback.kit.model;

import com.greenback.kit.vision.VisionAnnotations;
import com.greenback.kit.vision.VisionTransactionMatcher;
import java.util.List;

public class Vision extends GreenbackObject {

    private String name;
    private ProcessingStatus status;
    private VisionAnnotations annotations;
    priva