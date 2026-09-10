package com.bytedance.sdk.component.mj.lr;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class fi implements ThreadFactory {
    public static volatile boolean ik;
    private final AtomicInteger ka = new AtomicInteger(1);
    protected final String lr;
    protected final ThreadGroup ri;

    public fi(String str) {
        this.ri = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.lr = ri(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (ik) {
            return null;
        }
        Thread threadRi = ri(this.ri, runnable, this.lr + "_" + this.ka.getAndIncrement());
        if (threadRi.isDaemon()) {
            threadRi.setDaemon(false);
        }
        return threadRi;
    }

    public Thread ri(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String ri(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
