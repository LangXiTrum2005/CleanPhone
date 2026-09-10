package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wd1 extends vd1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ListenableFuture f21495h;

    public wd1(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.f21495h = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.uc1, com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f21495h.addListener(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.uc1, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f21495h.cancel(z10);
    }

    @Override // com.google.android.gms.internal.ads.uc1, java.util.concurrent.Future
    public final Object get() {
        return this.f21495h.get();
    }

    @Override // com.google.android.gms.internal.ads.uc1, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21495h.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.uc1, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21495h.isDone();
    }

    @Override // com.google.android.gms.internal.ads.uc1
    public final String toString() {
        return this.f21495h.toString();
    }

    @Override // com.google.android.gms.internal.ads.uc1, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f21495h.get(j10, timeUnit);
    }
}
