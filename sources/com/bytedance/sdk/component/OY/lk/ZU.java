package com.bytedance.sdk.component.OY.lk;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ZU implements ThreadFactory {
    protected final String LD;
    protected final ThreadGroup Lxb;
    private final AtomicInteger lk = new AtomicInteger(1);

    public ZU(String str) {
        this.Lxb = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.LD = Lxb(str);
    }

    public Thread Lxb(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadLxb = Lxb(this.Lxb, runnable, this.LD + "_" + this.lk.getAndIncrement());
        if (threadLxb.isDaemon()) {
            threadLxb.setDaemon(false);
        }
        return threadLxb;
    }

    public static String Lxb(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
