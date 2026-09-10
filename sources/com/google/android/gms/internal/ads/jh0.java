package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w11 f16095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f16096b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f16097c = new AtomicBoolean(false);

    public jh0(w11 w11Var) {
        this.f16095a = w11Var;
    }

    public final void a(ji jiVar) {
        this.f16097c.set(true);
        synchronized (jiVar.f16100a) {
            try {
                if (jiVar.f16101b == null) {
                    jiVar.f16101b = new hi();
                }
                hi hiVar = jiVar.f16101b;
                synchronized (hiVar.f15296c) {
                    hiVar.f15300g.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        w11 w11Var = this.f16095a;
        w11Var.getClass();
        cn.d0.w(w11Var.f21365a, null, new m11(w11Var, null, 3), 3);
    }

    public final void b() {
        if (this.f16096b.get()) {
            w11 w11Var = this.f16095a;
            w11Var.getClass();
            v71.h(w11Var.f21365a, w11Var.f21366b, new m11(w11Var, null, 5));
        }
    }

    public final void c() {
        if (this.f16096b.get()) {
            w11 w11Var = this.f16095a;
            w11Var.getClass();
            v71.h(w11Var.f21365a, w11Var.f21366b, new m11(w11Var, null, 0));
        }
    }

    public final void d() {
        if (this.f16096b.getAndSet(false)) {
            w11 w11Var = this.f16095a;
            w11Var.getClass();
            v71.h(w11Var.f21365a, w11Var.f21366b, new m11(w11Var, null, 4));
        }
    }
}
