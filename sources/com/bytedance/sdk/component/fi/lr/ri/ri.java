package com.bytedance.sdk.component.fi.lr.ri;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class ri implements ThreadFactory {
    private final AtomicInteger lr = new AtomicInteger(1);
    private final ThreadGroup ri;

    public ri(String str) {
        this.ri = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.ri, runnable, "tt_img_" + this.lr.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
