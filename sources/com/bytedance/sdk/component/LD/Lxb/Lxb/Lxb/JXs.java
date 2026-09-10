package com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class JXs extends com.bytedance.sdk.component.LD.Lxb.ZU {
    private ExecutorService Lxb;
    private List<com.bytedance.sdk.component.LD.Lxb.LD> LD = new CopyOnWriteArrayList();
    private List<com.bytedance.sdk.component.LD.Lxb.LD> lk = new CopyOnWriteArrayList();
    private AtomicInteger ZU = new AtomicInteger(64);

    public JXs() {
        if (this.Lxb == null) {
            this.Lxb = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.LD.Lxb.Lxb.Lxb.JXs.1
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

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public ExecutorService LD() {
        return this.Lxb;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public void Lxb(int i) {
        this.ZU.set(i);
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public List<com.bytedance.sdk.component.LD.Lxb.LD> ZU() {
        return this.lk;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public List<com.bytedance.sdk.component.LD.Lxb.LD> lk() {
        return this.LD;
    }

    @Override // com.bytedance.sdk.component.LD.Lxb.ZU
    public int Lxb() {
        return this.ZU.get();
    }
}
