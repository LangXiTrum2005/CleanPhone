package com.google.common.util.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
abstract class ForwardingLock implements Lock {
    public abstract Lock a();

    @Override // java.util.concurrent.locks.Lock
    public final void lock() {
        a().lock();
    }

    @Override // java.util.concurrent.locks.Lock
    public final void lockInterruptibly() throws InterruptedException {
        a().lockInterruptibly();
    }

    @Override // java.util.concurrent.locks.Lock
    public Condition newCondition() {
        return a().newCondition();
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock() {
        return a().tryLock();
    }

    @Override // java.util.concurrent.locks.Lock
    public final void unlock() {
        a().unlock();
    }

    @Override // java.util.concurrent.locks.Lock
    public final boolean tryLock(long j, TimeUnit timeUnit) {
        return a().tryLock(j, timeUnit);
    }
}
