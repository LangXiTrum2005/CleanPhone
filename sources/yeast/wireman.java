package yeast;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes5.dex */
public class wireman implements p002kotlin.reflect.jvm.internal.impl.storage.attabal {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Lock f39732saneness;

    public wireman(Lock lock) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.f39732saneness = lock;
    }

    public final Lock attabal() {
        return this.f39732saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.storage.attabal
    public void lock() {
        this.f39732saneness.lock();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.storage.attabal
    public void unlock() {
        this.f39732saneness.unlock();
    }

    public /* synthetic */ wireman(Lock lock, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ReentrantLock() : lock);
    }
}
