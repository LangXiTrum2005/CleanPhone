package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uv0 implements ListenableFuture {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListenableFuture f20915c;

    public uv0(ListenableFuture listenableFuture, Object obj, String str) {
        this.f20913a = obj;
        this.f20914b = str;
        this.f20915c = listenableFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        this.f20915c.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f20915c.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f20915c.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f20915c.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f20915c.isDone();
    }

    public final String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String str = this.f20914b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
        sb2.append(str);
        sb2.append("@");
        sb2.append(iIdentityHashCode);
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f20915c.get(j10, timeUnit);
    }
}
