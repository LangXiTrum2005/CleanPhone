package com.adjust.sdk.scheduler;

import com.adjust.sdk.Constants;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import w5.b;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryWrapper implements ThreadFactory {
    private String source;

    public ThreadFactoryWrapper(String str) {
        this.source = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
        threadNewThread.setPriority(9);
        threadNewThread.setName(Constants.THREAD_PREFIX + threadNewThread.getName() + "-" + this.source);
        threadNewThread.setDaemon(true);
        threadNewThread.setUncaughtExceptionHandler(new b());
        return threadNewThread;
    }
}
