package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes7.dex */
public class DefaultSimpleLock implements SimpleLock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f44471a;

    public DefaultSimpleLock(ReentrantLock reentrantLock) {
        this.f44471a = reentrantLock;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.f44471a.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public final void unlock() {
        this.f44471a.unlock();
    }
}
