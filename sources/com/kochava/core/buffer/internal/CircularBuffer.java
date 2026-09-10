package com.kochava.core.buffer.internal;

import java.util.concurrent.ArrayBlockingQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class CircularBuffer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue f28009a = new ArrayBlockingQueue(Math.max(1, 5));
}
