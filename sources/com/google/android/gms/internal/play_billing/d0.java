package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f24254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f24255b;

    public d0(u0 u0Var, s0 s0Var) {
        this.f24254a = u0Var;
        this.f24255b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24254a.f24401a != this) {
            return;
        }
        s0 s0Var = this.f24255b;
        if (l0.f24400g.N(this.f24254a, this, u0.f(s0Var))) {
            u0.h(this.f24254a);
        }
    }
}
