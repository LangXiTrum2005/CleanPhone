package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.arytenoidectomy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleJobRunner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0003'()B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/vungle/ads/internal/task/cutely;", "Lcom/vungle/ads/internal/task/marial;", "Lcom/vungle/ads/internal/task/saneness;", "creator", "Ljava/util/concurrent/Executor;", "executor", "Lcom/vungle/ads/internal/task/impromptu;", "threadPriorityHelper", "<init>", "(Lcom/vungle/ads/internal/task/saneness;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/task/impromptu;)V", "", "executePendingJobs", "()V", "Lcom/vungle/ads/internal/task/dern;", "jobInfo", "execute", "(Lcom/vungle/ads/internal/task/dern;)V", "", "getPendingJobSize$vungle_ads_release", "()I", "getPendingJobSize", "", "tag", "cancelPendingJob", "(Ljava/lang/String;)V", "Lcom/vungle/ads/internal/task/saneness;", "Ljava/util/concurrent/Executor;", "Lcom/vungle/ads/internal/task/impromptu;", "", "Lcom/vungle/ads/internal/task/cutely$saneness;", "pendingJobs", "Ljava/util/List;", "Ljava/lang/Runnable;", "pendingRunnable", "Ljava/lang/Runnable;", "", "nextCheck", "J", "Companion", "attabal", "saneness", "dern", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class cutely implements marial {
    private final com.vungle.ads.internal.task.saneness creator;
    private final Executor executor;
    private long nextCheck;
    private final List<saneness> pendingJobs;
    private final Runnable pendingRunnable;
    private final impromptu threadPriorityHelper;
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = cutely.class.getSimpleName();

    /* JADX INFO: compiled from: VungleJobRunner.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/task/cutely$dern;", "Ljava/lang/Runnable;", "Ljava/lang/ref/WeakReference;", "Lcom/vungle/ads/internal/task/cutely;", "runner", "<init>", "(Ljava/lang/ref/WeakReference;)V", "", "run", "()V", "Ljava/lang/ref/WeakReference;", "getRunner", "()Ljava/lang/ref/WeakReference;", "setRunner", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class dern implements Runnable {
        private WeakReference<cutely> runner;

        public dern(WeakReference<cutely> runner) {
            Intrinsics.checkNotNullParameter(runner, "runner");
            this.runner = runner;
        }

        public final WeakReference<cutely> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            cutely cutelyVar = this.runner.get();
            if (cutelyVar != null) {
                cutelyVar.executePendingJobs();
            }
        }

        public final void setRunner(WeakReference<cutely> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.runner = weakReference;
        }
    }

    /* JADX INFO: compiled from: VungleJobRunner.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/vungle/ads/internal/task/cutely$saneness;", "", "", "uptimeMillis", "Lcom/vungle/ads/internal/task/dern;", "info", "<init>", "(JLcom/vungle/ads/internal/task/dern;)V", "J", "getUptimeMillis", "()J", "Lcom/vungle/ads/internal/task/dern;", "getInfo", "()Lcom/vungle/ads/internal/task/dern;", "setInfo", "(Lcom/vungle/ads/internal/task/dern;)V", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class saneness {
        private com.vungle.ads.internal.task.dern info;
        private final long uptimeMillis;

        public saneness(long j, com.vungle.ads.internal.task.dern dernVar) {
            this.uptimeMillis = j;
            this.info = dernVar;
        }

        public final com.vungle.ads.internal.task.dern getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(com.vungle.ads.internal.task.dern dernVar) {
            this.info = dernVar;
        }
    }

    public cutely(com.vungle.ads.internal.task.saneness creator, Executor executor, impromptu impromptuVar) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = impromptuVar;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new dern(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jMin = Long.MAX_VALUE;
            for (saneness sanenessVar : this.pendingJobs) {
                if (jUptimeMillis >= sanenessVar.getUptimeMillis()) {
                    this.pendingJobs.remove(sanenessVar);
                    com.vungle.ads.internal.task.dern info = sanenessVar.getInfo();
                    if (info != null) {
                        this.executor.execute(new wireman(info, this.creator, this, this.threadPriorityHelper));
                    }
                } else {
                    jMin = Math.min(jMin, sanenessVar.getUptimeMillis());
                }
            }
            if (jMin != Long.MAX_VALUE && jMin != this.nextCheck) {
                Handler handler2 = handler;
                handler2.removeCallbacks(this.pendingRunnable);
                handler2.postAtTime(this.pendingRunnable, TAG, jMin);
            }
            this.nextCheck = jMin;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.task.marial
    public synchronized void cancelPendingJob(String tag) {
        try {
            Intrinsics.checkNotNullParameter(tag, "tag");
            ArrayList arrayList = new ArrayList();
            for (saneness sanenessVar : this.pendingJobs) {
                com.vungle.ads.internal.task.dern info = sanenessVar.getInfo();
                if (Intrinsics.wireman(info != null ? info.getJobTag() : null, tag)) {
                    arrayList.add(sanenessVar);
                }
            }
            this.pendingJobs.removeAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.task.marial
    public synchronized void execute(com.vungle.ads.internal.task.dern jobInfo) {
        try {
            Intrinsics.checkNotNullParameter(jobInfo, "jobInfo");
            com.vungle.ads.internal.task.dern dernVarCopy = jobInfo.copy();
            if (dernVarCopy != null) {
                String jobTag = dernVarCopy.getJobTag();
                long delay = dernVarCopy.getDelay();
                dernVarCopy.setDelay(0L);
                if (dernVarCopy.getUpdateCurrent()) {
                    for (saneness sanenessVar : this.pendingJobs) {
                        com.vungle.ads.internal.task.dern info = sanenessVar.getInfo();
                        if (Intrinsics.wireman(info != null ? info.getJobTag() : null, jobTag)) {
                            arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
                            String TAG2 = TAG;
                            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                            companion.d(TAG2, "replacing pending job with new " + jobTag);
                            this.pendingJobs.remove(sanenessVar);
                        }
                    }
                }
                this.pendingJobs.add(new saneness(SystemClock.uptimeMillis() + delay, dernVarCopy));
                executePendingJobs();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
