package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ka implements ja, v3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f16393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f16394g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f16395h;

    public ka(o2 o2Var, h3 h3Var, ma maVar, String str, int i10) throws ab {
        this.f16392e = o2Var;
        this.f16393f = h3Var;
        this.f16394g = maVar;
        int i11 = maVar.f17360a;
        int i12 = maVar.f17361b;
        int i13 = maVar.f17363d * i11;
        int i14 = maVar.f17362c;
        int i15 = i13 / 8;
        if (i14 != i15) {
            throw ab.a(null, l1.d.j(new StringBuilder(String.valueOf(i15).length() + 28 + String.valueOf(i14).length()), i15, "Expected block size: ", i14, "; got: "));
        }
        int i16 = i12 * i15;
        int i17 = i16 * 8;
        int iMax = Math.max(i15, i16 / 10);
        this.f16388a = iMax;
        i12 i12Var = new i12();
        i12Var.d("audio/wav");
        i12Var.e(str);
        i12Var.f15506h = i17;
        i12Var.f15507i = i17;
        i12Var.f15512o = iMax;
        i12Var.F = i11;
        int i18 = maVar.f17364e;
        i12Var.G = i18 == 0 ? -1 : i18 << 2;
        i12Var.H = i12;
        i12Var.I = i10;
        this.f16395h = new g22(i12Var);
    }

    @Override // com.google.android.gms.internal.ads.ja
    public void a(int i10, long j10) {
        ((o2) this.f16392e).o(new oa((ma) this.f16394g, 1, i10, j10));
        ((h3) this.f16393f).f((g22) this.f16395h);
    }

    @Override // v3.b
    public void b(int i10, long j10) {
        v3.e eVar = new v3.e((ta1) this.f16394g, 1, i10, j10);
        ((n2.m) this.f16392e).u(eVar);
        n2.a0 a0Var = (n2.a0) this.f16393f;
        a0Var.b((i1.p) this.f16395h);
        a0Var.e(eVar.f52479e);
    }

    @Override // com.google.android.gms.internal.ads.ja
    public void c(long j10) {
        this.f16389b = j10;
        this.f16390c = 0;
        this.f16391d = 0L;
    }

    @Override // v3.b
    public boolean d(n2.l lVar, long j10) {
        Object obj;
        int i10;
        int i11;
        long j11 = j10;
        while (true) {
            obj = this.f16393f;
            if (j11 <= 0 || (i10 = this.f16390c) >= (i11 = this.f16388a)) {
                break;
            }
            int iC = ((n2.a0) obj).c(lVar, (int) Math.min(i11 - i10, j11), true);
            if (iC == -1) {
                j11 = 0;
            } else {
                this.f16390c += iC;
                j11 -= (long) iC;
            }
        }
        ta1 ta1Var = (ta1) this.f16394g;
        int i12 = ta1Var.f20276c;
        int i13 = this.f16390c / i12;
        if (i13 > 0) {
            long j12 = this.f16389b;
            long j13 = this.f16391d;
            long j14 = ta1Var.f20275b;
            String str = l1.y.f44830a;
            long jU = j12 + l1.y.U(j13, 1000000L, j14, RoundingMode.DOWN);
            int i14 = i13 * i12;
            int i15 = this.f16390c - i14;
            ((n2.a0) obj).a(jU, 1, i14, i15, null);
            this.f16391d += (long) i13;
            this.f16390c = i15;
        }
        return j11 <= 0;
    }

    @Override // v3.b
    public void e(long j10) {
        this.f16389b = j10;
        this.f16390c = 0;
        this.f16391d = 0L;
    }

    @Override // com.google.android.gms.internal.ads.ja
    public boolean f(n2 n2Var, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f16390c) < (i11 = this.f16388a)) {
            int iE = ((h3) this.f16393f).e(n2Var, (int) Math.min(i11 - i10, j11), true);
            if (iE == -1) {
                j11 = 0;
            } else {
                this.f16390c += iE;
                j11 -= (long) iE;
            }
        }
        ma maVar = (ma) this.f16394g;
        int i12 = this.f16390c;
        int i13 = maVar.f17362c;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jV = this.f16389b + uu0.v(this.f16391d, 1000000L, maVar.f17361b, RoundingMode.DOWN);
            int i15 = i14 * i13;
            int i16 = this.f16390c - i15;
            ((h3) this.f16393f).c(jV, 1, i15, i16, null);
            this.f16391d += (long) i14;
            this.f16390c = i16;
        }
        return j11 <= 0;
    }

    public ka(n2.m mVar, n2.a0 a0Var, ta1 ta1Var, String str, int i10) throws i1.e0 {
        this.f16392e = mVar;
        this.f16393f = a0Var;
        this.f16394g = ta1Var;
        int i11 = ta1Var.f20274a;
        int i12 = ta1Var.f20275b;
        int i13 = (ta1Var.f20277d * i11) / 8;
        int i14 = ta1Var.f20276c;
        if (i14 == i13) {
            int i15 = i12 * i13;
            int i16 = i15 * 8;
            int iMax = Math.max(i13, i15 / 10);
            this.f16388a = iMax;
            i1.o oVar = new i1.o();
            oVar.l = i1.d0.n("audio/wav");
            oVar.f42600m = i1.d0.n(str);
            oVar.f42596h = i16;
            oVar.f42597i = i16;
            oVar.f42601n = iMax;
            oVar.E = i11;
            oVar.F = i12;
            oVar.G = i10;
            this.f16395h = new i1.p(oVar);
            return;
        }
        throw i1.e0.a(null, "Expected block size: " + i13 + "; got: " + i14);
    }
}
