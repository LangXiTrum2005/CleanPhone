package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingObject;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {

    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        public final /* bridge */ /* synthetic */ Object w() {
            return null;
        }

        @Override // com.google.common.util.concurrent.ForwardingFuture
        /* JADX INFO: renamed from: x */
        public final Future w() {
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return w().cancel(z2);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return w().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return w().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return w().isDone();
    }

    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract Future w();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return w().get(j, timeUnit);
    }
}
