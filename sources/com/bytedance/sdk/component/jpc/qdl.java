package com.bytedance.sdk.component.jpc;

import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class qdl extends ThreadPoolExecutor {
    private String qdl;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.jpc.qdl$qdl, reason: collision with other inner class name */
    public static class C0082qdl {
        private RejectedExecutionHandler jpc;
        private String qdl = "io";
        private int ud = 1;
        private long lnr = 30;
        private TimeUnit mml = TimeUnit.SECONDS;
        private int mzz = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> mo = null;
        private ThreadFactory wd = null;
        private int tvp = 5;

        public C0082qdl qdl(String str) {
            this.qdl = str;
            return this;
        }

        public C0082qdl ud(int i2) {
            this.tvp = i2;
            return this;
        }

        public C0082qdl qdl(int i2) {
            this.ud = i2;
            return this;
        }

        public C0082qdl qdl(long j) {
            this.lnr = j;
            return this;
        }

        public C0082qdl qdl(TimeUnit timeUnit) {
            this.mml = timeUnit;
            return this;
        }

        public C0082qdl qdl(BlockingQueue<Runnable> blockingQueue) {
            this.mo = blockingQueue;
            return this;
        }

        public C0082qdl qdl(ThreadFactory threadFactory) {
            this.wd = threadFactory;
            return this;
        }

        public C0082qdl qdl(RejectedExecutionHandler rejectedExecutionHandler) {
            this.jpc = rejectedExecutionHandler;
            return this;
        }

        public qdl qdl() {
            if (this.wd == null) {
                this.wd = mzz.qdl().createThreadFactory(this.tvp, this.qdl);
            }
            if (this.jpc == null) {
                this.jpc = mo.jpc();
            }
            if (this.mo == null) {
                this.mo = new LinkedBlockingQueue();
            }
            return new qdl(this.qdl, this.ud, this.mzz, this.lnr, this.mml, this.mo, this.wd, this.jpc);
        }
    }

    public qdl(String str, int i2, int i3, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i2, i3, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.qdl = str;
    }

    private void qdl(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e2) {
            qdl(runnable, e2);
        } catch (Throwable th) {
            qdl(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!mo.wd() || TextUtils.isEmpty(this.qdl) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.qdl;
        str.getClass();
        switch (str) {
            case "io":
                qdl(queue, 2);
                break;
            case "log":
                qdl(queue, 4);
                break;
            case "aidl":
                qdl(queue, 2);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof jpc) {
            qdl(new ud((jpc) runnable, this));
        } else {
            qdl(new ud(new jpc("unknown") { // from class: com.bytedance.sdk.component.jpc.qdl.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!mo.wd() || TextUtils.isEmpty(this.qdl) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.qdl;
        str.getClass();
        switch (str) {
            case "io":
                qdl(queue, mo.qdl + 2, getCorePoolSize() * 2);
                break;
            case "log":
                qdl(queue, 8, 8);
                break;
            case "aidl":
                qdl(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.qdl) || "aidl".equals(this.qdl)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return ("io".equals(this.qdl) || "aidl".equals(this.qdl)) ? Collections.EMPTY_LIST : super.shutdownNow();
    }

    private void qdl(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        qdl(runnable, (Throwable) outOfMemoryError);
    }

    private void qdl(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable unused) {
            }
        }
    }

    private void qdl(BlockingQueue<Runnable> blockingQueue, int i2) {
        if (getCorePoolSize() == i2 || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i2);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    private void qdl(BlockingQueue<Runnable> blockingQueue, int i2, int i3) {
        if (getCorePoolSize() == i2 || blockingQueue == null || blockingQueue.size() < i3) {
            return;
        }
        try {
            setCorePoolSize(i2);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public String qdl() {
        return this.qdl;
    }
}
