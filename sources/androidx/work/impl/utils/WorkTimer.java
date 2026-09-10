package androidx.work.impl.utils;

import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.DelayMetCommandHandler;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class WorkTimer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f8827e = Logger.e("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f8828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8830c;
    public final Object d;

    /* JADX INFO: renamed from: androidx.work.impl.utils.WorkTimer$1, reason: invalid class name */
    public class AnonymousClass1 implements ThreadFactory {
        public int X;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.X);
            this.X = this.X + 1;
            return threadNewThread;
        }
    }

    public interface TimeLimitExceededListener {
        void a(String str);
    }

    public static class WorkTimerRunnable implements Runnable {
        public final WorkTimer X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final String f8831Y;

        public WorkTimerRunnable(WorkTimer workTimer, String str) {
            this.X = workTimer;
            this.f8831Y = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.X.d) {
                try {
                    if (((WorkTimerRunnable) this.X.f8829b.remove(this.f8831Y)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.X.f8830c.remove(this.f8831Y);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.a(this.f8831Y);
                        }
                    } else {
                        Logger.c().a("WrkTimerRunnable", "Timer with " + this.f8831Y + " is already marked as complete.", new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public WorkTimer() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.X = 0;
        this.f8829b = new HashMap();
        this.f8830c = new HashMap();
        this.d = new Object();
        this.f8828a = Executors.newSingleThreadScheduledExecutor(anonymousClass1);
    }

    public final void a(String str, DelayMetCommandHandler delayMetCommandHandler) {
        synchronized (this.d) {
            Logger.c().a(f8827e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, str);
            this.f8829b.put(str, workTimerRunnable);
            this.f8830c.put(str, delayMetCommandHandler);
            this.f8828a.schedule(workTimerRunnable, TTAdConstant.AD_MAX_EVENT_TIME, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.d) {
            try {
                if (((WorkTimerRunnable) this.f8829b.remove(str)) != null) {
                    Logger.c().a(f8827e, "Stopping timer for " + str, new Throwable[0]);
                    this.f8830c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
