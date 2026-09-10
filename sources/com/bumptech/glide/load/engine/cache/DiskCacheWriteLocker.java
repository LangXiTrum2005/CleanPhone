package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.util.Preconditions;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class DiskCacheWriteLocker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12511a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WriteLockPool f12512b = new WriteLockPool();

    public static class WriteLock {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ReentrantLock f12513a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12514b;
    }

    public static class WriteLockPool {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f12515a = new ArrayDeque();
    }

    public final void a(String str) {
        WriteLock writeLock;
        synchronized (this) {
            try {
                Object obj = this.f12511a.get(str);
                Preconditions.c(obj, "Argument must not be null");
                writeLock = (WriteLock) obj;
                int i2 = writeLock.f12514b;
                if (i2 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + writeLock.f12514b);
                }
                int i3 = i2 - 1;
                writeLock.f12514b = i3;
                if (i3 == 0) {
                    WriteLock writeLock2 = (WriteLock) this.f12511a.remove(str);
                    if (!writeLock2.equals(writeLock)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + writeLock + ", but actually removed: " + writeLock2 + ", safeKey: " + str);
                    }
                    WriteLockPool writeLockPool = this.f12512b;
                    synchronized (writeLockPool.f12515a) {
                        try {
                            if (writeLockPool.f12515a.size() < 10) {
                                writeLockPool.f12515a.offer(writeLock2);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        writeLock.f12513a.unlock();
    }
}
