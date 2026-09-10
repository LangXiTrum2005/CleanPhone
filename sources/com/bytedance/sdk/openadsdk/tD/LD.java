package com.bytedance.sdk.openadsdk.tD;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class LD {
    private Lxb JXs;
    private OY LD;
    private int ZU;
    private ScheduledExecutorService Lxb = null;
    private long lk = 0;

    public interface Lxb {
    }

    public LD(OY oy, int i) {
        this.LD = oy;
        this.ZU = i;
    }

    public boolean LD() {
        ScheduledExecutorService scheduledExecutorService = this.Lxb;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void Lxb(long j) {
        this.lk = j;
    }

    public void Lxb(int i) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.Lxb = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.tD.LD.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = LD.this.lk;
                if (System.currentTimeMillis() - LD.this.lk > LD.this.ZU) {
                    LD.this.Lxb.shutdown();
                    if (LD.this.LD != null) {
                        LD.this.LD.LD(0, "Automatic detection of stuck");
                    }
                    if (LD.this.JXs != null) {
                        Lxb unused2 = LD.this.JXs;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void Lxb() {
        ScheduledExecutorService scheduledExecutorService = this.Lxb;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
