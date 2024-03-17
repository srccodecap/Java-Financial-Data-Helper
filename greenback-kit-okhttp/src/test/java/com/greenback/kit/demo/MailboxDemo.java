package com.greenback.kit.demo;

import com.greenback.kit.client.GreenbackClient;
import com.greenback.kit.client.GreenbackConstants;
import com.greenback.kit.jackson.JacksonGreenbackCodec;
import com.greenback.kit.model.Message;
import com.greenback.kit.model.MessageRequest;
import com.greenback.kit.model.Vision;
import com.greenback.kit.model.VisionRequest;
import com.greenback.kit.okhttp.OkHttpGreenbackClient;
import com.greenback.kit.okhttp.OkHttpHelper;
import java.io.File;
import static java.util.Optional.ofNullable;
import java.util.Properties;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailboxDemo {
    static private final Logger log = LoggerFactory.getLogger(MailboxDemo.class);
 
    static