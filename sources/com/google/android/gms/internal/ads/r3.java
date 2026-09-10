package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3 f19311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h3 f19312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f19315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f19317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f19321k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long[] f19322m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f19323n;

    public r3(int i10, q3 q3Var, h3 h3Var) {
        int i11 = q3Var.f18906d;
        this.f19311a = q3Var;
        int iA = q3Var.a();
        boolean z10 = true;
        if (iA != 1) {
            if (iA == 2) {
                iA = 2;
            } else {
                z10 = false;
            }
        }
        ps1.v(z10);
        int i12 = ((i10 / 10) + 48) | (((i10 % 10) + 48) << 8);
        this.f19313c = (iA == 2 ? 1667497984 : 1651965952) | i12;
        this.f19315e = uu0.v(i11, ((long) q3Var.f18904b) * 1000000, q3Var.f18905c, RoundingMode.DOWN);
        this.f19312b = h3Var;
        this.f19314d = iA == 2 ? 1650720768 | i12 : -1;
        this.l = -1L;
        this.f19322m = new long[512];
        this.f19323n = new int[512];
        this.f19316f = i11;
    }

    public final z2 a(long j10) {
        if (this.f19321k == 0) {
            b3 b3Var = new b3(0L, this.l);
            return new z2(b3Var, b3Var);
        }
        int i10 = (int) (j10 / ((this.f19315e * ((long) 1)) / ((long) this.f19316f)));
        int iQ = uu0.q(this.f19323n, i10, true, true);
        if (this.f19323n[iQ] == i10) {
            b3 b3VarB = b(iQ);
            return new z2(b3VarB, b3VarB);
        }
        b3 b3VarB2 = b(iQ);
        int i11 = iQ + 1;
        return i11 < this.f19322m.length ? new z2(b3VarB2, b(i11)) : new z2(b3VarB2, b3VarB2);
    }

    public final b3 b(int i10) {
        return new b3(((this.f19315e * ((long) 1)) / ((long) this.f19316f)) * ((long) this.f19323n[i10]), this.f19322m[i10]);
    }
}
