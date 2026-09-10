package com.bytedance.sdk.component.jpc.lnr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.commons.core.configs.CrashConfig;
import com.smartdigimkt.q0.b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class mo extends ThreadPoolExecutor {
    private int lnr;
    private int mml;
    private boolean mzz;
    private final String qdl;
    private int ud;

    public static class qdl {
        private String qdl = b.O;
        private int ud = 4;
        private int lnr = 100;
        private int mml = 0;
        private long mzz = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private boolean mo = false;
        private TimeUnit wd = TimeUnit.MILLISECONDS;
        private boolean jpc = false;
        private BlockingQueue<Runnable> tvp = new PriorityBlockingQueue();
        private ThreadFactory to = null;

        public qdl mml(int i2) {
            return this;
        }

        public qdl mzz(int i2) {
            return this;
        }

        public qdl lnr(int i2) {
            this.mml = i2;
            return this;
        }

        public qdl qdl(String str) {
            this.qdl = str;
            return this;
        }

        public qdl ud(int i2) {
            this.lnr = i2;
            return this;
        }

        public qdl qdl(int i2) {
            this.ud = i2;
            return this;
        }

        public qdl ud(boolean z2) {
            this.jpc = z2;
            return this;
        }

        public qdl qdl(long j) {
            this.mzz = j;
            return this;
        }

        public qdl qdl(boolean z2) {
            this.mo = z2;
            return this;
        }

        public mo qdl() {
            if (this.to == null) {
                this.to = new mml(this.qdl);
            }
            if (this.ud < 0) {
                this.ud = 8;
            }
            if (this.ud == 0) {
                this.tvp = new SynchronousQueue();
            }
            if (this.tvp == null) {
                this.tvp = new LinkedBlockingQueue();
            }
            if (this.lnr > 100) {
                this.lnr = 100;
            }
            int i2 = this.lnr;
            int i3 = this.ud;
            if (i2 < i3) {
                this.lnr = i3;
            }
            return new mo(this);
        }
    }

    private void lnr() {
        try {
            if (this.ud != 0 && getCorePoolSize() > this.ud && getQueue().size() == 0) {
                setCorePoolSize(this.ud);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void ud() {
        try {
            if (this.ud != 0 && getCorePoolSize() < this.lnr) {
                int size = getQueue().size();
                if (getActiveCount() < this.ud || size < this.mml) {
                    return;
                }
                setCorePoolSize(this.lnr);
            }
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z2 = runnable instanceof ud;
        if (z2) {
            ((ud) runnable).lnr(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z2) {
            ud udVar = (ud) runnable;
            udVar.ud();
            udVar.qdl();
            udVar.lnr();
            udVar.mml();
            udVar.mzz();
        }
        lnr();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof ud) {
            ((ud) runnable).ud(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.jpc.lnr.qdl qdlVarQdl;
        if (!(runnable instanceof ud)) {
            runnable = new ud("unknown", runnable) { // from class: com.bytedance.sdk.component.jpc.lnr.mo.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable runnableMo = mo();
                    if (runnableMo != null) {
                        runnableMo.run();
                    }
                }
            };
        }
        if (!b.O.equals(this.qdl)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(mml.qdl(this.qdl)) && (qdlVarQdl = lnr.qdl()) != null) {
                qdlVarQdl.qdl(this, (ud) runnable);
            }
        }
        ((ud) runnable).qdl(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            ud();
        } catch (Throwable th) {
            qdl(runnable, th);
        }
    }

    public void qdl(qdl qdlVar) {
        try {
            if (qdlVar.ud >= 0 && this.ud != qdlVar.ud) {
                int i2 = qdlVar.ud;
                this.ud = i2;
                setCorePoolSize(i2);
            }
            this.lnr = qdlVar.lnr;
            this.mml = qdlVar.mml;
            allowCoreThreadTimeOut(qdlVar.mo);
            this.mzz = qdlVar.jpc;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = qdlVar.qdl;
        int unused2 = qdlVar.ud;
        int unused3 = qdlVar.lnr;
        long unused4 = qdlVar.mzz;
        int unused5 = qdlVar.mml;
        boolean unused6 = qdlVar.jpc;
        BlockingQueue unused7 = qdlVar.tvp;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.qdl)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.qdl) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int iQdl;
        String strUd;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof ud) {
            ud udVar = (ud) runnable;
            iQdl = udVar.qdl();
            strUd = udVar.ud();
        } else {
            iQdl = 6;
            strUd = "";
        }
        if (iQdl == 0 || TextUtils.isEmpty(strUd)) {
            new RuntimeException();
        }
        execute(new ud(iQdl, strUd) { // from class: com.bytedance.sdk.component.jpc.lnr.mo.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private mo(qdl qdlVar) {
        super(qdlVar.ud, Integer.MAX_VALUE, qdlVar.mzz, qdlVar.wd, (BlockingQueue<Runnable>) qdlVar.tvp, qdlVar.to);
        this.mzz = false;
        String unused = qdlVar.qdl;
        int unused2 = qdlVar.ud;
        int unused3 = qdlVar.lnr;
        long unused4 = qdlVar.mzz;
        int unused5 = qdlVar.mml;
        boolean unused6 = qdlVar.jpc;
        BlockingQueue unused7 = qdlVar.tvp;
        this.qdl = qdlVar.qdl;
        this.ud = qdlVar.ud;
        this.lnr = qdlVar.lnr;
        this.mml = qdlVar.mml;
        allowCoreThreadTimeOut(qdlVar.mo);
        this.mzz = qdlVar.jpc;
    }

    private void qdl(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerUd = lnr.ud();
                if (handlerUd != null) {
                    handlerUd.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean qdl() {
        return this.mzz;
    }
}
