package com.google.android.gms.internal.auth;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f22816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1 f22817b;

    public e1(p1 p1Var, j0 j0Var, c0 c0Var) {
        this.f22817b = p1Var;
        this.f22816a = c0Var;
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final void a(Object obj) {
        this.f22817b.getClass();
        o1 o1Var = ((m0) obj).zzc;
        if (o1Var.f22887d) {
            o1Var.f22887d = false;
        }
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final boolean b(m0 m0Var, m0 m0Var2) {
        this.f22817b.getClass();
        return m0Var.zzc.equals(m0Var2.zzc);
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final int c(m0 m0Var) {
        this.f22817b.getClass();
        return m0Var.zzc.hashCode();
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final void d(Object obj, Object obj2) {
        m1.a(this.f22817b, obj, obj2);
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final boolean e(Object obj) {
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final void f(Object obj, byte[] bArr, int i10, int i11, b2.d0 d0Var) {
        m0 m0Var = (m0) obj;
        if (m0Var.zzc == o1.f22883e) {
            m0Var.zzc = o1.a();
        }
        throw q4.a.h(obj);
    }

    @Override // com.google.android.gms.internal.auth.l1
    public final m0 zzd() {
        c0 c0Var = this.f22816a;
        return c0Var instanceof m0 ? ((m0) c0Var).b() : ((z1) ((m0) c0Var).h(5)).a();
    }
}
