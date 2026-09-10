package com.inmobi.media;

import A.RunnableC0883c;
import A.RunnableC0916x;
import A.ThreadFactoryC0917y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class O4 extends Fa {
    public final Object g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ScheduledExecutorService f23032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f23033i;
    public ExecutorService j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O4(Pa dao, C2930a5 listener, Ka networkHandler) {
        super(dao, listener, networkHandler);
        Intrinsics.f(dao, "dao");
        Intrinsics.f(listener, "listener");
        Intrinsics.f(networkHandler, "networkHandler");
        this.g = new Object();
    }

    public static final void a(O4 this$0, long j) {
        Intrinsics.f(this$0, "this$0");
        int high = this$0.f.getMaxBatchSize().getHigh();
        List listU = CollectionsKt.u(T1.a(this$0.f22822a, "priority = ? AND retry_count = 0 AND time_created < ?", new String[]{"high", String.valueOf(j)}, null, null, "time_created ASC", Integer.valueOf(high), 12));
        while (!listU.isEmpty() && this$0.d != Ca.STOPPED) {
            listU.size();
            Iterator it = listU.iterator();
            while (it.hasNext()) {
                this$0.a((C3338za) it.next(), this$0.j, new N4(this$0));
            }
            ArrayList arrayListU = CollectionsKt.u(T1.a(this$0.f22822a, "priority = ? AND retry_count = 0 AND time_created < ?", new String[]{"high", String.valueOf(j)}, null, null, "time_created ASC", null, 12));
            ArrayList arrayList = new ArrayList();
            for (Object obj : arrayListU) {
                if (!this$0.f22825e.containsKey(((C3338za) obj).f24160b)) {
                    arrayList.add(obj);
                }
            }
            listU = CollectionsKt.d0(arrayList, high);
        }
    }

    public static final Thread b(Runnable runnable) {
        Thread thread = new Thread(runnable, "TIM-HighPriorityParallelPing");
        thread.setDaemon(true);
        return thread;
    }

    public final void c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ExecutorService executorService = this.j;
        if (executorService != null) {
            executorService.execute(new RunnableC0916x(this, jCurrentTimeMillis, 0));
        }
    }

    public final void d() {
        synchronized (this.g) {
            ScheduledFuture scheduledFuture = this.f23033i;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                long high = this.f.getInterval().getHigh();
                if (high <= 0) {
                    return;
                }
                ScheduledExecutorService scheduledExecutorService = this.f23032h;
                this.f23033i = scheduledExecutorService != null ? scheduledExecutorService.scheduleWithFixedDelay(new RunnableC0883c(this, 7), 0L, high, TimeUnit.SECONDS) : null;
            }
        }
    }

    public final void e() {
        synchronized (this.g) {
            try {
                ScheduledFuture scheduledFuture = this.f23033i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                this.f23033i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        ExecutorService executorService = this.j;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public final void b() {
        Ca ca = Ca.PAUSED;
        if (a(ca)) {
            this.d = ca;
        }
        synchronized (this.g) {
            try {
                ScheduledFuture scheduledFuture = this.f23033i;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f23033i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        synchronized (this.g) {
            try {
                ScheduledExecutorService scheduledExecutorService = this.f23032h;
                if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
                    this.f23032h = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC0917y(0));
                }
                ExecutorService executorService = this.j;
                if (executorService == null || executorService.isShutdown()) {
                    this.j = Executors.newCachedThreadPool(new ThreadFactoryC0917y(1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Thread a(Runnable runnable) {
        Thread thread = new Thread(runnable, "TIM-HighPriorityPollingPing");
        thread.setDaemon(true);
        return thread;
    }

    public static final void a(O4 this$0) {
        Intrinsics.f(this$0, "this$0");
        try {
            if (this$0.d != Ca.STOPPED) {
                int high = this$0.f.getMaxBatchSize().getHigh();
                this$0.f22822a.a("time_created < ?", new String[]{String.valueOf(System.currentTimeMillis() - (((long) this$0.f.getExpiry().getHigh()) * 1000))});
                ArrayList arrayListU = CollectionsKt.u(this$0.f22822a.a(Integer.valueOf(high)));
                if (arrayListU.isEmpty() && T1.a(this$0.f22822a, "priority = ?", new String[]{"high"}, 12) == 0) {
                    this$0.b();
                    return;
                }
                arrayListU.size();
                Iterator it = arrayListU.iterator();
                while (it.hasNext()) {
                    this$0.a((C3338za) it.next(), this$0.j, new M4(this$0));
                }
            }
        } catch (Error | Exception unused) {
        }
    }
}
