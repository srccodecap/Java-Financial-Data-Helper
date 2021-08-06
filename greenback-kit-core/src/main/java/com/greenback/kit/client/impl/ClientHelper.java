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
import static java.util.stream.Collectors.joining