package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fe implements he {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f23463d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final na.r f23464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb f23466c;

    public fe(na.r rVar) {
        tb tbVar = tb.f23989c;
        this.f23464a = rVar;
        this.f23465b = Math.max(5, 10);
        this.f23466c = tbVar;
    }

    @Override // com.google.android.gms.internal.measurement.he
    public final void zza() {
        synchronized (fe.class) {
            try {
                if (!f23463d) {
                    ae aeVar = new ae(this, 3);
                    long j10 = this.f23465b;
                    TimeUnit timeUnit = TimeUnit.MINUTES;
                    ta.q0 q0Var = (ta.q0) this.f23464a.get();
                    com.google.android.gms.internal.ads.q1 q1Var = new com.google.android.gms.internal.ads.q1(this, aeVar, q0Var, j10);
                    ta.t0 t0Var = (ta.t0) q0Var;
                    t0Var.getClass();
                    ta.x0 x0Var = new ta.x0(Executors.callable(q1Var, null));
                    ta.r0 r0Var = new ta.r0(x0Var, t0Var.f50653b.schedule(x0Var, j10, timeUnit));
                    r0Var.addListener(new ae(r0Var, 1), ta.c0.f50592a);
                    f23463d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
