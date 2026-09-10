package com.thinkup.core.common.o0m.o;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 {
    static volatile Executor m;
    static com.thinkup.core.common.o0m.o.o.n o = new o0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static int f42150n = 4096;

    private m0() {
    }

    private static void o(int i2) {
        if (i2 < 2048 || i2 > 65535) {
            return;
        }
        f42150n = i2;
    }

    public static void o(com.thinkup.core.common.o0m.o.o.n nVar) {
        o = nVar;
    }

    public static void o(Executor executor) {
        if (executor != null) {
            m = executor;
        }
    }

    public static Executor o() {
        if (m == null) {
            synchronized (m0.class) {
                try {
                    if (m == null) {
                        m = Executors.newCachedThreadPool();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return m;
    }
}
