package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f13055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13056i;

    public c6(np0 np0Var, np0 np0Var2, boolean z10) throws ab {
        this.f13056i = np0Var;
        this.f13055h = np0Var2;
        this.f13052e = z10;
        np0Var2.E(12);
        this.f13048a = np0Var2.h();
        np0Var.E(12);
        this.f13054g = np0Var.h();
        v71.m("first_chunk must be 1", np0Var.b() == 1);
        this.f13049b = -1;
    }

    public boolean a() {
        l1.q qVar = (l1.q) this.f13055h;
        l1.q qVar2 = (l1.q) this.f13056i;
        int i10 = this.f13049b + 1;
        this.f13049b = i10;
        if (i10 == this.f13048a) {
            return false;
        }
        this.f13051d = this.f13052e ? qVar.F() : qVar.B();
        if (this.f13049b == this.f13053f) {
            this.f13050c = qVar2.D();
            qVar2.N(4);
            int i11 = this.f13054g - 1;
            this.f13054g = i11;
            this.f13053f = i11 > 0 ? qVar2.D() - 1 : -1;
        }
        return true;
    }

    public boolean b() {
        np0 np0Var = (np0) this.f13055h;
        int i10 = this.f13049b + 1;
        this.f13049b = i10;
        if (i10 == this.f13048a) {
            return false;
        }
        this.f13051d = this.f13052e ? np0Var.j() : np0Var.P();
        if (this.f13049b == this.f13053f) {
            np0 np0Var2 = (np0) this.f13056i;
            this.f13050c = np0Var2.h();
            np0Var2.G(4);
            int i11 = this.f13054g - 1;
            this.f13054g = i11;
            this.f13053f = i11 > 0 ? (-1) + np0Var2.h() : -1;
        }
        return true;
    }

    public c6(l1.q qVar, l1.q qVar2, boolean z10) throws i1.e0 {
        this.f13056i = qVar;
        this.f13055h = qVar2;
        this.f13052e = z10;
        qVar2.M(12);
        this.f13048a = qVar2.D();
        qVar.M(12);
        this.f13054g = qVar.D();
        n2.b.e("first_chunk must be 1", qVar.m() == 1);
        this.f13049b = -1;
    }
}
