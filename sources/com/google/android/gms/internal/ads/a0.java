package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11792b;

    public /* synthetic */ a0(long j10, int i10, boolean z10) {
        this.f11791a = i10;
        this.f11792b = j10;
    }

    public static a0 b(n2.l lVar, l1.q qVar) {
        lVar.peekFully(qVar.f44813a, 0, 8);
        qVar.M(0);
        int iM = qVar.m();
        return new a0(qVar.q(), iM, false);
    }

    public static a0 c(n2 n2Var, np0 np0Var) {
        n2Var.v(np0Var.f17880a, 0, 8);
        np0Var.E(0);
        int iB = np0Var.b();
        return new a0(np0Var.a(), iB, false);
    }

    public boolean a() {
        int i10 = this.f11791a;
        return i10 == 0 || i10 == 1;
    }

    public a0(int i10, long j10) {
        go.k.i(j10 >= 0);
        this.f11791a = i10;
        this.f11792b = j10;
    }
}
