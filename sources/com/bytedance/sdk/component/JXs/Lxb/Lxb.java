package com.bytedance.sdk.component.JXs.Lxb;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb implements ThreadFactory {
    private final AtomicInteger LD = new AtomicInteger(1);
    private final ThreadGroup Lxb;

    public Lxb(String str) {
        this.Lxb = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.Lxb, runnable, "tt_img_" + this.LD.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
