package com.google.android.gms.internal.measurement;

import android.os.SystemClock;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y7 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c8 f24174d;

    public y7(c8 c8Var, boolean z10) {
        Objects.requireNonNull(c8Var);
        this.f24174d = c8Var;
        this.f24171a = System.currentTimeMillis();
        this.f24172b = SystemClock.elapsedRealtime();
        this.f24173c = z10;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        c8 c8Var = this.f24174d;
        if (c8Var.f23357e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            c8Var.d(e10, false, this.f24173c);
            b();
        }
    }

    public void b() {
    }
}
