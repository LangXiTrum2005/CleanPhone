package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ListenableFuture f21251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f21252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p9.a f21253c;

    public vq0(ListenableFuture listenableFuture, long j10, p9.a aVar) {
        this.f21251a = listenableFuture;
        this.f21253c = aVar;
        ((p9.b) aVar).getClass();
        this.f21252b = SystemClock.elapsedRealtime() + j10;
    }
}
