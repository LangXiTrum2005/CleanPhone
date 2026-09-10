package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends k implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f15450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f15451k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f15452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f15453n;

    public i(int i10, ni niVar, int i11, h hVar, int i12, String str, String str2) {
        int iF;
        super(i10, niVar, i11);
        int i13 = 0;
        this.f15446f = ux1.s(i12, false);
        int i14 = this.f16231d.f14669e;
        hVar.getClass();
        ca1 ca1Var = hVar.f15798r;
        this.f15447g = 1 == (i14 & 1);
        this.f15448h = (i14 & 2) != 0;
        ca1 ca1VarU = str2 != null ? ca1.u(str2) : ca1Var.isEmpty() ? ca1.u("") : ca1Var;
        int i15 = 0;
        while (true) {
            if (i15 >= ca1VarU.size()) {
                iF = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iF = m.f(this.f16231d, (String) ca1VarU.get(i15), false);
                if (iF > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f15449i = i15;
        this.f15450j = iF;
        int i16 = str2 != null ? 1088 : 0;
        int i17 = this.f16231d.f14670f;
        int iBitCount = (i17 == 0 || i17 != i16) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        this.f15451k = iBitCount;
        g22 g22Var = this.f16231d;
        this.f15453n = (1088 & g22Var.f14670f) != 0;
        int iG = m.g(g22Var, hVar.f15799s);
        this.l = iG;
        int iF2 = m.f(this.f16231d, str, m.e(str) == null);
        this.f15452m = iF2;
        boolean z10 = iF > 0 || (ca1Var.isEmpty() && iBitCount > 0) || ((ca1Var.isEmpty() && iG != Integer.MAX_VALUE) || this.f15447g || (this.f15448h && iF2 > 0));
        if (ux1.s(i12, hVar.B) && z10) {
            i13 = 1;
        }
        this.f15445e = i13;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int a() {
        return this.f15445e;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final /* bridge */ /* synthetic */ boolean b(k kVar) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        v91 v91VarD = v91.f21141a.d(this.f15446f, iVar.f15446f);
        Integer numValueOf = Integer.valueOf(this.f15449i);
        Integer numValueOf2 = Integer.valueOf(iVar.f15449i);
        wa1 wa1Var = wa1.f21478b;
        wa1 wa1Var2 = wa1.f21479c;
        v91 v91VarA = v91VarD.a(numValueOf, numValueOf2, wa1Var2);
        int i10 = iVar.f15450j;
        int i11 = this.f15450j;
        v91 v91VarB = v91VarA.b(i11, i10);
        int i12 = iVar.f15451k;
        int i13 = this.f15451k;
        v91 v91VarD2 = v91VarB.b(i13, i12).a(Integer.valueOf(this.l), Integer.valueOf(iVar.l), wa1Var2).d(this.f15447g, iVar.f15447g);
        Boolean boolValueOf = Boolean.valueOf(this.f15448h);
        Boolean boolValueOf2 = Boolean.valueOf(iVar.f15448h);
        if (i11 != 0) {
            wa1Var = wa1Var2;
        }
        v91 v91VarB2 = v91VarD2.a(boolValueOf, boolValueOf2, wa1Var).b(this.f15452m, iVar.f15452m);
        if (i13 == 0) {
            v91VarB2 = v91VarB2.c(this.f15453n, iVar.f15453n);
        }
        return v91VarB2.e();
    }
}
