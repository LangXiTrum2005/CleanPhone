package com.bytedance.sdk.openadsdk.aaj;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ud {
    private int mml;
    private qdl mzz;
    private jpc ud;
    private ScheduledExecutorService qdl = null;
    private long lnr = 0;

    public interface qdl {
    }

    public ud(jpc jpcVar, int i2) {
        this.ud = jpcVar;
        this.mml = i2;
    }

    public void qdl(long j) {
        this.lnr = j;
    }

    public boolean ud() {
        ScheduledExecutorService scheduledExecutorService = this.qdl;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void qdl(int i2) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.qdl = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.aaj.ud.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = ud.this.lnr;
                if (System.currentTimeMillis() - ud.this.lnr > ud.this.mml) {
                    ud.this.qdl.shutdown();
                    if (ud.this.ud != null) {
                        ud.this.ud.ud(0, "Automatic detection of stuck");
                    }
                    if (ud.this.mzz != null) {
                        qdl unused2 = ud.this.mzz;
                    }
                }
            }
        }, 0L, i2, TimeUnit.MILLISECONDS);
    }

    public void qdl() {
        ScheduledExecutorService scheduledExecutorService = this.qdl;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
