package com.bytedance.sdk.component.mj.lr;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.inmobi.media.core.config.models.CrashConfig;
import demilitarize.impromptu;
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

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ThreadPoolExecutor implements AutoCloseable {
    private boolean fi;
    private int ik;
    private int ka;
    private int lr;
    private final String ri;

    public static class ri {
        private String ri = "cache";
        private int lr = 4;
        private int ik = 100;
        private int ka = 0;
        private long fi = CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL;
        private boolean di = false;
        private TimeUnit xha = TimeUnit.MILLISECONDS;
        private boolean mj = false;
        private BlockingQueue<Runnable> jbs = new PriorityBlockingQueue();
        private ThreadFactory qt = null;

        public ri fi(int i) {
            return this;
        }

        public ri ka(int i) {
            return this;
        }

        public ri ik(int i) {
            this.ka = i;
            return this;
        }

        public ri lr(int i) {
            this.ik = i;
            return this;
        }

        public ri ri(String str) {
            this.ri = str;
            return this;
        }

        public ri lr(boolean z) {
            this.mj = z;
            return this;
        }

        public ri ri(int i) {
            this.lr = i;
            return this;
        }

        public ri ri(long j) {
            this.fi = j;
            return this;
        }

        public ri ri(boolean z) {
            this.di = z;
            return this;
        }

        public xha ri() {
            if (this.qt == null) {
                this.qt = new fi(this.ri);
            }
            if (this.lr < 0) {
                this.lr = 8;
            }
            if (this.lr == 0) {
                this.jbs = new SynchronousQueue();
            }
            if (this.jbs == null) {
                this.jbs = new LinkedBlockingQueue();
            }
            if (this.ik > 100) {
                this.ik = 100;
            }
            int i = this.ik;
            int i2 = this.lr;
            if (i < i2) {
                this.ik = i2;
            }
            return new xha(this);
        }
    }

    private void ik() {
        try {
            if (this.lr != 0 && getCorePoolSize() > this.lr && getQueue().size() == 0) {
                setCorePoolSize(this.lr);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void lr() {
        try {
            if (this.lr != 0 && getCorePoolSize() < this.ik) {
                int size = getQueue().size();
                if (getActiveCount() < this.lr || size < this.ka) {
                    return;
                }
                setCorePoolSize(this.ik);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        boolean z = runnable instanceof ik;
        if (z) {
            ((ik) runnable).setAfterTimestamp(SystemClock.elapsedRealtime());
        }
        super.afterExecute(runnable, th);
        if (z) {
            ik ikVar = (ik) runnable;
            ikVar.getName();
            ikVar.getPriority();
            ikVar.getSubmitTimestamp();
            ikVar.getBeforeTimestamp();
            ikVar.getAfterTimestamp();
        }
        ik();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof ik) {
            ((ik) runnable).setBeforeTimestamp(SystemClock.elapsedRealtime());
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.lang.AutoCloseable
    public /* synthetic */ void close() {
        impromptu.attabal(this);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bytedance.sdk.component.mj.lr.ri riVarRi;
        if (!(runnable instanceof ik)) {
            runnable = new ik("unknown", runnable) { // from class: com.bytedance.sdk.component.mj.lr.xha.2
                @Override // java.lang.Runnable
                public void run() {
                    Runnable target = getTarget();
                    if (target != null) {
                        target.run();
                    }
                }
            };
        }
        if (!"cache".equals(this.ri)) {
            String name = Thread.currentThread().getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(fi.ri(this.ri)) && (riVarRi = ka.ri()) != null) {
                riVarRi.ri(this, (ik) runnable);
            }
        }
        ((ik) runnable).setSubmitTimestamp(SystemClock.elapsedRealtime());
        try {
            super.execute(runnable);
            lr();
        } catch (Throwable th) {
            ri(runnable, th);
        }
    }

    public void ri(ri riVar) {
        try {
            if (riVar.lr >= 0 && this.lr != riVar.lr) {
                int i = riVar.lr;
                this.lr = i;
                setCorePoolSize(i);
            }
            this.ik = riVar.ik;
            this.ka = riVar.ka;
            allowCoreThreadTimeOut(riVar.di);
            this.fi = riVar.mj;
        } catch (Throwable th) {
            th.getMessage();
        }
        String unused = riVar.ri;
        int unused2 = riVar.lr;
        int unused3 = riVar.ik;
        long unused4 = riVar.fi;
        int unused5 = riVar.ka;
        boolean unused6 = riVar.mj;
        BlockingQueue unused7 = riVar.jbs;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("aidl".equals(this.ri)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return "aidl".equals(this.ri) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        int priority;
        String name;
        runnable.getClass();
        final RunnableFuture runnableFutureNewTaskFor = newTaskFor(runnable, null);
        if (runnable instanceof ik) {
            ik ikVar = (ik) runnable;
            priority = ikVar.getPriority();
            name = ikVar.getName();
        } else {
            priority = 6;
            name = "";
        }
        if (priority == 0 || TextUtils.isEmpty(name)) {
            new RuntimeException();
        }
        execute(new ik(name, priority) { // from class: com.bytedance.sdk.component.mj.lr.xha.1
            @Override // java.lang.Runnable
            public void run() {
                runnableFutureNewTaskFor.run();
            }
        });
        return runnableFutureNewTaskFor;
    }

    private xha(ri riVar) {
        super(riVar.lr, Integer.MAX_VALUE, riVar.fi, riVar.xha, (BlockingQueue<Runnable>) riVar.jbs, riVar.qt);
        this.fi = false;
        String unused = riVar.ri;
        int unused2 = riVar.lr;
        int unused3 = riVar.ik;
        long unused4 = riVar.fi;
        int unused5 = riVar.ka;
        boolean unused6 = riVar.mj;
        BlockingQueue unused7 = riVar.jbs;
        this.ri = riVar.ri;
        this.lr = riVar.lr;
        this.ik = riVar.ik;
        this.ka = riVar.ka;
        allowCoreThreadTimeOut(riVar.di);
        this.fi = riVar.mj;
    }

    private void ri(Runnable runnable, Throwable th) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                Handler handlerLr = ka.lr();
                if (handlerLr != null) {
                    handlerLr.post(runnable);
                    return;
                }
                return;
            }
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    public boolean ri() {
        return this.fi;
    }
}
