package com.smartdigimkt.h8;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile Executor f35758b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static com.smartdigimkt.i8.c f35757a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static int f35759c = 4096;

    private h() {
    }

    public static void a(int i2) {
        if (i2 < 2048 || i2 > 65535) {
            return;
        }
        f35759c = i2;
    }

    public static void a(com.smartdigimkt.i8.c cVar) {
        f35757a = cVar;
    }

    public static void a(Executor executor) {
        if (executor != null) {
            f35758b = executor;
        }
    }

    public static Executor a() {
        if (f35758b == null) {
            synchronized (h.class) {
                try {
                    if (f35758b == null) {
                        f35758b = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f35758b;
    }
}
