package com.ironsource;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class M5 implements Hf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f26543a;

    public M5(ScheduledExecutorService executor) {
        kotlin.jvm.internal.n.f(executor, "executor");
        this.f26543a = executor;
    }

    @Override // com.ironsource.Hf
    public Hf.a a(long j10, Runnable runnable) {
        kotlin.jvm.internal.n.f(runnable, "runnable");
        return new vh(this.f26543a.schedule(runnable, j10, TimeUnit.MILLISECONDS));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ScheduledFuture scheduledFuture) {
        scheduledFuture.cancel(false);
    }
}
