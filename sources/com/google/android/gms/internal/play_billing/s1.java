package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s1 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f24468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t1 f24469b;

    public s1(t1 t1Var) {
        this.f24468a = t1Var;
        if (t1Var.m()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f24469b = (t1) t1Var.d(4);
    }

    public final t1 a() {
        t1 t1VarB = b();
        t1VarB.getClass();
        if (t1.c(t1VarB, true)) {
            return t1VarB;
        }
        throw new v2();
    }

    public final t1 b() {
        if (!this.f24469b.m()) {
            return this.f24469b;
        }
        t1 t1Var = this.f24469b;
        t1Var.getClass();
        p2.f24443c.a(t1Var.getClass()).b(t1Var);
        t1Var.j();
        return this.f24469b;
    }

    public final void c() {
        if (this.f24469b.m()) {
            return;
        }
        t1 t1Var = (t1) this.f24468a.d(4);
        p2.f24443c.a(t1Var.getClass()).c(t1Var, this.f24469b);
        this.f24469b = t1Var;
    }

    public final Object clone() {
        s1 s1Var = (s1) this.f24468a.d(5);
        s1Var.f24469b = b();
        return s1Var;
    }
}
