package com.bykv.vk.openvk.preload.geckox.f;

import com.bykv.vk.openvk.preload.geckox.utils.FileLock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Lock> f12971a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ReentrantLock f12972b = new ReentrantLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f12973c;
    private FileLock d;

    private b(String str, FileLock fileLock) {
        this.f12973c = str;
        this.d = fileLock;
    }

    public static b a(String str) throws Exception {
        f12972b.lock();
        try {
            FileLock fileLockA = FileLock.a(str);
            Map<String, Lock> map = f12971a;
            Lock reentrantLock = map.get(str);
            if (reentrantLock == null) {
                reentrantLock = new ReentrantLock();
                map.put(str, reentrantLock);
            }
            reentrantLock.lock();
            return new b(str, fileLockA);
        } catch (Exception e2) {
            f12972b.unlock();
            throw e2;
        }
    }

    public final void a() {
        try {
            this.d.a();
            this.d.b();
            Lock lock = f12971a.get(this.f12973c);
            if (lock != null) {
                lock.unlock();
            }
        } finally {
            f12972b.unlock();
        }
    }
}
