package com.inmobi.media;

import A.RunnableC0883c;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C2941b extends G3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f23453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RunnableC2924a f23454c;
    public final AtomicBoolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f23455e;
    public final Handler f;
    public ScheduledExecutorService g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2941b(long j, H3 listener) {
        super(listener);
        Intrinsics.f(listener, "listener");
        this.f23453b = j;
        this.f23454c = new RunnableC2924a(this);
        this.d = new AtomicBoolean(false);
        this.f23455e = new AtomicBoolean(false);
        this.f = new Handler(Looper.getMainLooper());
    }

    public static final StackTraceElement[] a(C2941b c2941b) {
        c2941b.getClass();
        return Looper.getMainLooper().getThread().getStackTrace();
    }

    public static final void b(C2941b this$0) {
        Intrinsics.f(this$0, "this$0");
        if (this$0.d.getAndSet(true)) {
            return;
        }
        ScheduledExecutorService scheduledExecutorService = this$0.g;
        if (scheduledExecutorService == null || scheduledExecutorService.scheduleAtFixedRate(this$0.f23454c, 0L, this$0.f23453b, TimeUnit.MILLISECONDS) == null) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new K5("ANRWatchDog"));
            this$0.g = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
            if (scheduledExecutorServiceNewSingleThreadScheduledExecutor != null) {
                scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(this$0.f23454c, 0L, this$0.f23453b, TimeUnit.MILLISECONDS);
            }
        }
    }

    @Override // com.inmobi.media.G3
    public final void a() {
        Ie.f22893a.execute(new RunnableC0883c(this, 12));
    }

    @Override // com.inmobi.media.G3
    public final void b() {
        if (this.d.getAndSet(false)) {
            this.d.set(false);
            this.f23455e.set(false);
            ScheduledExecutorService scheduledExecutorService = this.g;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdown();
            }
            this.g = null;
        }
    }
}
