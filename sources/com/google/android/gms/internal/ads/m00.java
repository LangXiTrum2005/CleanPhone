package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class m00 implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final le1 f17183a = new le1();

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f17183a.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f17183a.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.f17183a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f17183a.f13503a instanceof nc1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f17183a.isDone();
    }

    public final boolean zzc(@Nullable Object obj) {
        boolean zC = this.f17183a.c(obj);
        if (!zC) {
            zzt.zzh().e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zC;
    }

    public final boolean zzd(Throwable th2) {
        boolean zD = this.f17183a.d(th2);
        if (!zD) {
            zzt.zzh().e("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zD;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f17183a.get(j10, timeUnit);
    }
}
