package com.bytedance.sdk.openadsdk.uq;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lr {
    private ri fi;
    private int ka;
    private mj lr;
    private ScheduledExecutorService ri = null;
    private long ik = 0;

    public interface ri {
    }

    public lr(mj mjVar, int i) {
        this.lr = mjVar;
        this.ka = i;
    }

    public boolean lr() {
        ScheduledExecutorService scheduledExecutorService = this.ri;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService.isShutdown();
        }
        return true;
    }

    public void ri(long j) {
        this.ik = j;
    }

    public void ri(int i) {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.ri = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(new Runnable() { // from class: com.bytedance.sdk.openadsdk.uq.lr.1
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                long unused = lr.this.ik;
                if (System.currentTimeMillis() - lr.this.ik > lr.this.ka) {
                    lr.this.ri.shutdown();
                    if (lr.this.lr != null) {
                        lr.this.lr.lr(0, "Automatic detection of stuck");
                    }
                    if (lr.this.fi != null) {
                        ri unused2 = lr.this.fi;
                    }
                }
            }
        }, 0L, i, TimeUnit.MILLISECONDS);
    }

    public void ri() {
        ScheduledExecutorService scheduledExecutorService = this.ri;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }
}
