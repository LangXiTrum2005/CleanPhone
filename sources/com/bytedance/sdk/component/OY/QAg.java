package com.bytedance.sdk.component.OY;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class QAg implements ThreadFactory {
    public static final String THREAD_GROUP_NAME_PRE = "csj_g_";
    public static final String THREAD_NAME_PRE = "csj_";
    protected final String LD;
    protected final ThreadGroup Lxb;
    private final AtomicInteger ZU;
    protected int lk;

    public QAg(String str) {
        this(5, str);
    }

    public Thread Lxb(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadLxb = Lxb(this.Lxb, runnable, this.LD + this.ZU.getAndIncrement());
        if (threadLxb.isDaemon()) {
            threadLxb.setDaemon(false);
        }
        int i = this.lk;
        if (i > 10 || i <= 0) {
            this.lk = 5;
        }
        threadLxb.setPriority(this.lk);
        return threadLxb;
    }

    public QAg(int i, String str) {
        this.ZU = new AtomicInteger(1);
        this.lk = i;
        this.Lxb = new ThreadGroup(THREAD_GROUP_NAME_PRE.concat(String.valueOf(str)));
        this.LD = THREAD_NAME_PRE.concat(String.valueOf(str));
    }
}
