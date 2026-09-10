package com.google.common.util.concurrent;

import com.google.common.collect.ForwardingDeque;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // com.google.common.collect.ForwardingDeque, com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public abstract BlockingDeque x();

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection) {
        return w().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj, long j, TimeUnit timeUnit) {
        return w().offer(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final boolean offerFirst(Object obj, long j, TimeUnit timeUnit) {
        return w().offerFirst(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final boolean offerLast(Object obj, long j, TimeUnit timeUnit) {
        return w().offerLast(obj, j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final Object poll(long j, TimeUnit timeUnit) {
        return w().poll(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object pollFirst(long j, TimeUnit timeUnit) {
        return w().pollFirst(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object pollLast(long j, TimeUnit timeUnit) {
        return w().pollLast(j, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final void put(Object obj) throws InterruptedException {
        w().put(obj);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final void putFirst(Object obj) throws InterruptedException {
        w().putFirst(obj);
    }

    @Override // java.util.concurrent.BlockingDeque
    public final void putLast(Object obj) throws InterruptedException {
        w().putLast(obj);
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int remainingCapacity() {
        return w().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public final Object take() {
        return w().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object takeFirst() {
        return w().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public final Object takeLast() {
        return w().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public final int drainTo(Collection collection, int i2) {
        return w().drainTo(collection, i2);
    }
}
