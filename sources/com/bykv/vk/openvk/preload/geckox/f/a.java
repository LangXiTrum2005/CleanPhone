package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f12968a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileLock f12969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12970c;

    private a(String str, FileLock fileLock) {
        this.f12970c = str;
        this.f12969b = fileLock;
    }

    public static a a(String str) throws Exception {
        Map<String, Lock> map = f12968a;
        synchronized (map) {
            try {
                Lock reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                if (!reentrantLock.tryLock()) {
                    return null;
                }
                try {
                    FileLock fileLockC = FileLock.c(str);
                    if (fileLockC == null) {
                        reentrantLock.unlock();
                        return null;
                    }
                    return new a(str, fileLockC);
                } catch (Exception e2) {
                    reentrantLock.lock();
                    com.bykv.vk.openvk.preload.geckox.utils.a.a(new RuntimeException(e2));
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Map<String, Lock> map = f12968a;
        synchronized (map) {
            try {
                try {
                    this.f12969b.a();
                    this.f12969b.b();
                    map.get(this.f12970c).unlock();
                } catch (Throwable th) {
                    f12968a.get(this.f12970c).unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
