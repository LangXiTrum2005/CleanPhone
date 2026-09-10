package com.bytedance.sdk.component.lr.ri.ri.ri;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class di extends com.bytedance.sdk.component.lr.ri.ka {
    private ExecutorService ri;
    private List<com.bytedance.sdk.component.lr.ri.lr> lr = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.lr.ri.lr> ik = new CopyOnWriteArrayList();
    private AtomicInteger ka = new AtomicInteger(64);

    public di() {
        if (this.ri == null) {
            this.ri = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.lr.ri.ri.ri.di.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public List<com.bytedance.sdk.component.lr.ri.lr> ik() {
        return this.lr;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public List<com.bytedance.sdk.component.lr.ri.lr> ka() {
        return this.ik;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public ExecutorService lr() {
        return this.ri;
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public void ri(int i) {
        this.ka.set(i);
    }

    @Override // com.bytedance.sdk.component.lr.ri.ka
    public int ri() {
        return this.ka.get();
    }
}
