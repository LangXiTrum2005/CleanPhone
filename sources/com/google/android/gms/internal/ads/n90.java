package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f17723a;

    public n90(ju0 ju0Var) {
        AtomicLong atomicLong = new AtomicLong();
        this.f17723a = atomicLong;
        atomicLong.set(((ou0) ju0Var.f16195a.f20839b).f18379u.get());
    }

    public final void a(long j10) {
        this.f17723a.set(j10);
    }
}
