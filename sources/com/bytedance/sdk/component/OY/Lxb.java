package com.bytedance.sdk.component.OY;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.sLN;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class Lxb extends ThreadPoolExecutor {
    private String Lxb;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.OY.Lxb$Lxb, reason: collision with other inner class name */
    public static class C0049Lxb {
        private RejectedExecutionHandler OY;
        private String Lxb = "io";
        private int LD = 1;
        private long lk = 30;
        private TimeUnit ZU = TimeUnit.SECONDS;
        private int JXs = Integer.MAX_VALUE;
        private BlockingQueue<Runnable> lc = null;
        private ThreadFactory ebl = null;
        private int QAg = 5;

        public C0049Lxb LD(int i) {
            this.QAg = i;
            return this;
        }

        public C0049Lxb Lxb(String str) {
            this.Lxb = str;
            return this;
        }

        public C0049Lxb Lxb(int i) {
            this.LD = i;
            return this;
        }

        public C0049Lxb Lxb(long j) {
            this.lk = j;
            return this;
        }

        public C0049Lxb Lxb(TimeUnit timeUnit) {
            this.ZU = timeUnit;
            return this;
        }

        public C0049Lxb Lxb(BlockingQueue<Runnable> blockingQueue) {
            this.lc = blockingQueue;
            return this;
        }

        public C0049Lxb Lxb(ThreadFactory threadFactory) {
            this.ebl = threadFactory;
            return this;
        }

        public C0049Lxb Lxb(RejectedExecutionHandler rejectedExecutionHandler) {
            this.OY = rejectedExecutionHandler;
            return this;
        }

        public Lxb Lxb() {
            if (this.ebl == null) {
                this.ebl = JXs.Lxb().createThreadFactory(this.QAg, this.Lxb);
            }
            if (this.OY == null) {
                this.OY = lc.OY();
            }
            if (this.lc == null) {
                this.lc = new LinkedBlockingQueue();
            }
            return new Lxb(this.Lxb, this.LD, this.JXs, this.lk, this.ZU, this.lc, this.ebl, this.OY);
        }
    }

    public Lxb(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.Lxb = str;
    }

    private void Lxb(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            Lxb(runnable, e);
        } catch (Throwable th) {
            Lxb(runnable, th);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue<Runnable> queue;
        super.afterExecute(runnable, th);
        if (!lc.ebl() || TextUtils.isEmpty(this.Lxb) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.Lxb;
        str.getClass();
        switch (str) {
            case "io":
                Lxb(queue, 2);
                break;
            case "log":
                Lxb(queue, 4);
                break;
            case "aidl":
                Lxb(queue, 2);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        BlockingQueue<Runnable> queue;
        if (runnable instanceof OY) {
            Lxb(new LD((OY) runnable, this));
        } else {
            Lxb(new LD(new OY("unknown") { // from class: com.bytedance.sdk.component.OY.Lxb.1
                @Override // java.lang.Runnable
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (!lc.ebl() || TextUtils.isEmpty(this.Lxb) || (queue = getQueue()) == null) {
            return;
        }
        String str = this.Lxb;
        str.getClass();
        switch (str) {
            case "io":
                Lxb(queue, lc.Lxb + 2, getCorePoolSize() * 2);
                break;
            case "log":
                Lxb(queue, 8, 8);
                break;
            case "aidl":
                Lxb(queue, 5, 5);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public void shutdown() {
        if ("io".equals(this.Lxb) || "aidl".equals(this.Lxb)) {
            return;
        }
        super.shutdown();
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return ("io".equals(this.Lxb) || "aidl".equals(this.Lxb)) ? Collections.emptyList() : super.shutdownNow();
    }

    private void Lxb(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        Lxb(runnable, (Throwable) outOfMemoryError);
    }

    private void Lxb(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                sLN.Lxb("", "try exc failed", th2);
            }
        }
    }

    private void Lxb(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() > 0) {
            return;
        }
        try {
            setCorePoolSize(i);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private void Lxb(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() == i || blockingQueue == null || blockingQueue.size() < i2) {
            return;
        }
        try {
            setCorePoolSize(i);
            getCorePoolSize();
            getMaximumPoolSize();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public String Lxb() {
        return this.Lxb;
    }
}
