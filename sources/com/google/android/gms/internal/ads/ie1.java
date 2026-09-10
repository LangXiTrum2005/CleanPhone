package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ie1 extends ps1 implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final uc1 f15723u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ScheduledFuture f15724v;

    public ie1(uc1 uc1Var, ScheduledFuture scheduledFuture) {
        super(27);
        this.f15723u = uc1Var;
        this.f15724v = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f15723u.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = this.f15723u.cancel(z10);
        if (zCancel) {
            this.f15724v.cancel(z10);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f15724v.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f15723u.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f15724v.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15723u.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f15723u.isDone();
    }

    @Override // com.google.android.gms.internal.ads.ps1
    public final /* synthetic */ Object z() {
        return this.f15723u;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f15723u.get(j10, timeUnit);
    }
}
