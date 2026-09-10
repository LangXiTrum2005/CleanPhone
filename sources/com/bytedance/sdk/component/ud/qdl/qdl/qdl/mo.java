package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class mo extends com.bytedance.sdk.component.ud.qdl.mml {
    private ExecutorService qdl;
    private List<com.bytedance.sdk.component.ud.qdl.ud> ud = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.ud.qdl.ud> lnr = new CopyOnWriteArrayList();
    private AtomicInteger mml = new AtomicInteger(64);

    public mo() {
        if (this.qdl == null) {
            this.qdl = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.ud.qdl.qdl.qdl.mo.1
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

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public List<com.bytedance.sdk.component.ud.qdl.ud> lnr() {
        return this.ud;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public List<com.bytedance.sdk.component.ud.qdl.ud> mml() {
        return this.lnr;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public void qdl(int i2) {
        this.mml.set(i2);
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public ExecutorService ud() {
        return this.qdl;
    }

    @Override // com.bytedance.sdk.component.ud.qdl.mml
    public int qdl() {
        return this.mml.get();
    }
}
