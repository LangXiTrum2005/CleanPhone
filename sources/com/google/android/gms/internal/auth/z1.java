package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2 f22930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m0 f22931b;

    public z1() {
        a2 a2Var = a2.zzb;
        this.f22930a = a2Var;
        if (a2Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f22931b = a2Var.b();
    }

    public final m0 a() {
        if (!this.f22931b.g()) {
            return this.f22931b;
        }
        m0 m0Var = this.f22931b;
        m0Var.getClass();
        i1.f22844c.a(m0Var.getClass()).a(m0Var);
        m0Var.d();
        return this.f22931b;
    }

    public final Object clone() {
        z1 z1Var = (z1) this.f22930a.h(5);
        z1Var.f22931b = a();
        return z1Var;
    }
}
