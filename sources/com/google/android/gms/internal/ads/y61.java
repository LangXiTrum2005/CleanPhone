package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d31 f22182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f22183b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22184c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22185d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Throwable f22186e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22187f;

    public y61(int i10, d31 d31Var) {
        this.f22187f = i10;
        this.f22182a = d31Var;
    }

    public final void a() {
        if (this.f22183b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f22184c = SystemClock.uptimeMillis();
    }

    public final void b(Throwable th2) {
        if (this.f22183b.get()) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f22186e = th2;
    }

    public final void c() {
        AtomicBoolean atomicBoolean = this.f22183b;
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Finished trace.");
        }
        this.f22185d = SystemClock.uptimeMillis();
        ((g31) this.f22182a).a(this.f22187f - 1, atomicBoolean.get() ? this.f22185d - this.f22184c : -1L, null, this.f22186e);
    }
}
