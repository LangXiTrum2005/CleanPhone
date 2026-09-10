package com.bytedance.sdk.component.OY.lk;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bytedance.sdk.component.utils.sLN;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class lc extends ThreadPoolExecutor {
    private int JXs;
    private int LD;
    private final String Lxb;
    private LinkedHashMap<String, com.bytedance.sdk.component.OY.lk.Lxb.Lxb> OY;
    private int ZU;
    private boolean ebl;
    private int lc;
    private int lk;

    public static class Lxb {
        private String Lxb = "cache";
        private int LD = 4;
        private int lk = 100;
        private int ZU = 0;
        private long JXs = WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        private boolean lc = false;
        private TimeUnit ebl = TimeUnit.MILLISECONDS;
        private int OY = -1;
        private int QAg = 20;
        private boolean nBu = false;
        private BlockingQueue<Runnable> JVA = new PriorityBlockingQueue();
        private ThreadFactory sLN = null;

        public Lxb JXs(int i) {
            this.OY = i;
            return this;
        }

        public Lxb LD(int i) {
            this.lk = i;
            return this;
        }

        public Lxb Lxb(String str) {
            this.Lxb = str;
            return this;
        }

        public Lxb ZU(int i) {
            this.QAg = i;
            return this;
        }

        public Lxb lk(int i) {
            this.ZU = i;
            return this;
        }

        public Lxb LD(boolean z) {
            this.nBu = z;
            return this;
        }

        public Lxb Lxb(int i) {
            this.LD = i;
            return this;
        }

        public Lxb Lxb(long j) {
            this.JXs = j;
            return this;
        }

        public Lxb Lxb(boolean z) {
            this.lc = z;
            return this;
        }

        public lc Lxb() {
            if (this.sLN == null) {
                this.sLN = new ZU(this.Lxb);
            }
            if (this.LD < 0) {
                this.LD = 8;
            }
            if (this.LD == 0) {
                this.JVA = new SynchronousQueue();
            }
            if (this.JVA == null) {
                this.JVA = new LinkedBlockingQueue();
            }
            if (this.lk > 100) {
                this.lk = 100;
            }
            int i = this.lk;
            int i2 = this.LD;
            if (i < i2) {
                this.lk = i2;
            }
            if (this.QAg < 0) {
                this.QAg = 20;
            }
            if (this.QAg > 100) {
                this.QAg = 100;
            }
            return new lc(this);
        }
    }

    private void JXs() {
        try {
            if (this.ZU != 0 && getCorePoolSize() > this.ZU && getQueue().size() == 0) {
                setCorePoolSize(this.ZU);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void ZU() {
        try {
            if (this.ZU != 0 && getCorePoolSize() < this.JXs) {
                int size = getQueue().size();
                if (getActiveCount() < this.ZU || size < this.lc) {
                    return;
                }
                setCorePoolSize(this.JXs);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private boolean ebl() {
        return this.LD > 0;
    }

    private void lc() {
        if (getCompletedTaskCount() > this.LD) {
            JXs jXsLxb = lk.Lxb();
            if (jXsLxb != null) {
                jXsLxb.Lxb(this);
            }
            this.LD = -1;
        }
    }

    public String LD() {
        return this.Lxb;
    }

    public void Lxb(Lxb lxb) {
        try {
            if (lxb.LD >= 0 && this.ZU != lxb.LD) {
                int i = lxb.LD;
                this.ZU = i;
                setCorePoolSize(i);
            }
            this.JXs = lxb.lk;
            this.lc = lxb.ZU;
            allowCoreThreadTimeOut(lxb.lc);
            this.LD = lxb.OY;
            this.lk = lxb.QAg;
            this.ebl = lxb.nBu;
        } catch (Throwable th) {
            sLN.Lxb("PAGThreadPoolExecutor", th.getMessage());
        }
        String unused = lxb.Lxb;
        int unused2 = lxb.LD;
        int unused3 = lxb.lk;
        long unused4 = lxb.JXs;
        int unused5 = lxb.ZU;
        int unused6 = lxb.QAg;
        boolean unused7 = lxb.nBu;
        BlockingQueue unused8 = lxb.JVA;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof LD;
        if (z) {
            ((LD) runnable).lk(SystemClock.elapsedRealtime());
            try {
                if (ebl() && this.OY != null) {
                    Lxb((LD) runnable);
                    lc();
                }
            } catch (Exception e) {
                sLN.Lxb("PAGThreadPoolExecutor", e.getMessage());
            }
        }
        super.afterExecute(runnable, th);
        if (z) {
            LD ld = (LD) runnable;
            ld.LD();
            ld.Lxb();
            ld.lk();
            ld.ZU();
            ld.JXs();
        }
        JXs();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof LD) {
            ((LD) runnable).LD(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.OY.lk.Lxb lxbLD;
        if (!(runnable instanceof LD)) {
            runnable = new LD("unknown", runnable) { // from class: com.bytedance.sdk.component.OY.lk.lc.3
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableOY = OY();
                    if (runnableOY != null) {
                        runnableOY.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.Lxb)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(ZU.Lxb(this.Lxb)) && (lxbLD = lk.LD()) != null) {
                lxbLD.Lxb(this, (LD) runnable);
            }
        }
        ((LD) runnable).Lxb(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            ZU();
        } catch (Throwable th) {
            Lxb(runnable, th);
        }
    }

    public boolean lk() {
        return this.ebl;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.Lxb)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.Lxb) ? Collections.emptyList() : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int iLxb;
        String strLD;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof LD) {
            LD ld = (LD) runnable;
            iLxb = ld.Lxb();
            strLD = ld.LD();
        } else {
            iLxb = 6;
            strLD = "";
        }
        if (iLxb == 0 || TextUtils.isEmpty(strLD)) {
            new RuntimeException();
        }
        execute(new LD(iLxb, strLD) { // from class: com.bytedance.sdk.component.OY.lk.lc.2
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private lc(Lxb lxb) {
        super(lxb.LD, Integer.MAX_VALUE, lxb.JXs, lxb.ebl, (BlockingQueue<Runnable>) lxb.JVA, lxb.sLN);
        this.ebl = false;
        String unused = lxb.Lxb;
        int unused2 = lxb.LD;
        int unused3 = lxb.lk;
        long unused4 = lxb.JXs;
        int unused5 = lxb.ZU;
        int unused6 = lxb.QAg;
        boolean unused7 = lxb.nBu;
        BlockingQueue unused8 = lxb.JVA;
        this.Lxb = lxb.Lxb;
        this.ZU = lxb.LD;
        this.JXs = lxb.lk;
        this.lc = lxb.ZU;
        allowCoreThreadTimeOut(lxb.lc);
        this.LD = lxb.OY;
        this.lk = lxb.QAg;
        this.ebl = lxb.nBu;
        if (ebl()) {
            final int i = this.lk + 4;
            this.OY = new LinkedHashMap<String, com.bytedance.sdk.component.OY.lk.Lxb.Lxb>(i, 0.75f, true) { // from class: com.bytedance.sdk.component.OY.lk.lc.1
                @Override // java.util.LinkedHashMap
                public boolean removeEldestEntry(Map.Entry<String, com.bytedance.sdk.component.OY.lk.Lxb.Lxb> entry) {
                    return size() > i;
                }
            };
        }
    }

    private void Lxb(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerLk = lk.lk();
                if (handlerLk != null) {
                    handlerLk.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable th2) {
            sLN.Lxb("PAGThreadPoolExecutor", "try exc failed", th2);
        }
    }

    private void Lxb(LD ld) {
        LinkedHashMap<String, com.bytedance.sdk.component.OY.lk.Lxb.Lxb> linkedHashMap = this.OY;
        if (linkedHashMap != null) {
            com.bytedance.sdk.component.OY.lk.Lxb.Lxb lxb = linkedHashMap.get(ld.LD());
            if (lxb == null) {
                synchronized (linkedHashMap) {
                    try {
                        lxb = linkedHashMap.get(ld.LD());
                        if (lxb == null) {
                            lxb = new com.bytedance.sdk.component.OY.lk.Lxb.Lxb();
                            linkedHashMap.put(ld.LD(), lxb);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            lxb.Lxb(ld);
        }
    }

    public LinkedHashMap<String, com.bytedance.sdk.component.OY.lk.Lxb.Lxb> Lxb() {
        return this.OY;
    }
}
