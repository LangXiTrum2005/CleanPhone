package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingQueue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BlockingQueue x();

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection, int i2) {
        return w().drainTo(collection, i2);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        return w().offer(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object poll(long j, TimeUnit timeUnit) {
        return w().poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final void put(Object obj) throws InterruptedException {
        w().put(obj);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return w().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final Object take() {
        return w().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection) {
        return w().drainTo(collection);
    }
}
