package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 implements m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o2 f13003f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h3 f13004g;

    public c3(int i10, int i11, String str) {
        this.f12998a = i10;
        this.f12999b = i11;
        this.f13000c = str;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final boolean d(n2 n2Var) {
        int i10 = this.f12999b;
        int i11 = this.f12998a;
        ps1.c0((i11 == -1 || i10 == -1) ? false : true);
        np0 np0Var = new np0(i10);
        ((h2) n2Var).m(np0Var.f17880a, 0, i10, false);
        return np0Var.L() == i11;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void e(long j10, long j11) {
        if (j10 == 0 || this.f13002e == 1) {
            this.f13002e = 1;
            this.f13001d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final int f(n2 n2Var, q2 q2Var) {
        int i10 = this.f13002e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        h3 h3Var = this.f13004g;
        h3Var.getClass();
        int iE = h3Var.e(n2Var, 1024, true);
        if (iE != -1) {
            this.f13001d += iE;
            return 0;
        }
        this.f13002e = 2;
        this.f13004g.c(0L, 1, this.f13001d, 0, null);
        this.f13001d = 0;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void g(o2 o2Var) {
        this.f13003f = o2Var;
        h3 h3VarE = o2Var.e(1024, 4);
        this.f13004g = h3VarE;
        i12 i12Var = new i12();
        String str = this.f13000c;
        i12Var.d(str);
        i12Var.e(str);
        h3VarE.f(new g22(i12Var));
        this.f13003f.zzv();
        this.f13003f.o(new d3());
        this.f13002e = 1;
    }

    @Override // com.google.android.gms.internal.ads.m2
    public final void zzf() {
    }
}
