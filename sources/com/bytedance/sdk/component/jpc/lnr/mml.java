package com.bytedance.sdk.component.jpc.lnr;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class mml implements ThreadFactory {
    public static volatile boolean lnr;
    private final AtomicInteger mml = new AtomicInteger(1);
    protected final ThreadGroup qdl;
    protected final String ud;

    public mml(String str) {
        this.qdl = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.ud = qdl(str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (lnr) {
            return null;
        }
        Thread threadQdl = qdl(this.qdl, runnable, this.ud + "_" + this.mml.getAndIncrement());
        if (threadQdl.isDaemon()) {
            threadQdl.setDaemon(false);
        }
        return threadQdl;
    }

    public Thread qdl(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    public static String qdl(String str) {
        return "pag_".concat(String.valueOf(str));
    }
}
