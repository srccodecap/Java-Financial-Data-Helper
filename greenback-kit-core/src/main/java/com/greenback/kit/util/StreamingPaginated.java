package com.greenback.kit.util;

import com.greenback.kit.model.Paginated;
import com.greenback.kit.util.IoFunction;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import static java.util.Optional.ofNullable;
import java.util.concurrent.atomic.AtomicReference;

public class StreamingPaginated<T> extends Paginated<T> {

    private IoFunction<Paginated<T>,Paginated