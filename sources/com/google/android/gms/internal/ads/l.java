package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.unity3d.services.UnityAdsConstants;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f16591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f16592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f16593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f16594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f16595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f16596k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f16597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f16598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f16599o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f16600p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f16601q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f16603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f16604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f16605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f16606v;

    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:33:0x0051  */
    public l(int i10, ni niVar, int i11, h hVar, int i12, String str, boolean z10) {
        boolean z11;
        boolean z12;
        int i13;
        int iF;
        int i14;
        boolean z13;
        int i15;
        g22 g22Var;
        int i16;
        int i17;
        int i18;
        g22 g22Var2;
        int i19;
        int i20;
        int i21;
        super(i10, niVar, i11);
        this.f16591f = hVar;
        boolean z14 = hVar.f15008x;
        ca1 ca1Var = hVar.f15790i;
        ca1 ca1Var2 = hVar.f15792k;
        int i22 = 1;
        int i23 = true != z14 ? 16 : 24;
        if (!z10 || (((i19 = (g22Var2 = this.f16231d).f14685v) != -1 && i19 > hVar.f15782a) || ((i20 = g22Var2.f14686w) != -1 && i20 > hVar.f15783b))) {
            z11 = false;
        } else {
            float f10 = g22Var2.f14689z;
            if ((f10 == -1.0f || f10 <= hVar.f15784c) && ((i21 = g22Var2.f14674j) == -1 || i21 <= hVar.f15785d)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f16590e = z11;
        if (!z10 || (((i16 = (g22Var = this.f16231d).f14685v) != -1 && i16 < 0) || ((i17 = g22Var.f14686w) != -1 && i17 < 0))) {
            z12 = false;
        } else {
            float f11 = g22Var.f14689z;
            if ((f11 == -1.0f || f11 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && ((i18 = g22Var.f14674j) == -1 || i18 >= 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.f16592g = z12;
        this.f16593h = ux1.s(i12, false);
        g22 g22Var3 = this.f16231d;
        float f12 = g22Var3.f14689z;
        this.f16594i = f12 != -1.0f && f12 >= 10.0f;
        this.f16595j = g22Var3.f14674j;
        int i24 = g22Var3.f14685v;
        this.f16596k = (i24 == -1 || (i15 = g22Var3.f14686w) == -1) ? -1 : i24 * i15;
        int i25 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i25 >= ca1Var2.size()) {
                iF = 0;
                i25 = Integer.MAX_VALUE;
                break;
            } else {
                iF = m.f(this.f16231d, (String) ca1Var2.get(i25), false);
                if (iF > 0) {
                    break;
                } else {
                    i25++;
                }
            }
        }
        this.f16597m = i25;
        this.f16598n = iF;
        int i26 = this.f16231d.f14670f;
        this.f16599o = (i26 == 0 || i26 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i27 = this.f16231d.f14670f;
        this.f16601q = i27 == 0 || (i27 & 1) != 0;
        this.f16602r = m.f(this.f16231d, str, m.e(str) == null);
        for (int i28 = 0; i28 < ca1Var.size(); i28++) {
            String str2 = this.f16231d.f14678o;
            if (str2 != null && str2.equals(ca1Var.get(i28))) {
                i13 = i28;
                break;
            }
        }
        this.l = i13;
        this.f16600p = m.g(this.f16231d, hVar.f15791j);
        this.f16604t = (i12 & 384) == 128;
        this.f16605u = (i12 & 64) == 64;
        g22 g22Var4 = this.f16231d;
        String str3 = g22Var4.f14678o;
        if (str3 != null) {
            switch (str3) {
                case "video/dolby-vision":
                    i14 = 5;
                    break;
                case "video/av01":
                    i14 = 4;
                    break;
                case "video/hevc":
                    i14 = 3;
                    break;
                case "video/avc":
                    i14 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i14 = 2;
                    break;
                default:
                    i14 = 0;
                    break;
            }
        } else {
            i14 = 0;
        }
        this.f16606v = i14;
        if ((g22Var4.f14670f & Http2.INITIAL_MAX_FRAME_SIZE) != 0) {
            i22 = 0;
        } else {
            h hVar2 = this.f16591f;
            if (!ux1.s(i12, hVar2.B) || (!(z13 = this.f16590e) && !hVar2.f15007w)) {
                i22 = 0;
            } else if (ux1.s(i12, false) && this.f16592g && z13 && g22Var4.f14674j != -1 && (i23 & i12) != 0) {
                i22 = 2;
            }
        }
        this.f16603s = i22;
    }

    public static int c(l lVar, l lVar2) {
        v91 v91VarD = v91.f21141a.d(lVar.f16593h, lVar2.f16593h);
        Integer numValueOf = Integer.valueOf(lVar.f16597m);
        Integer numValueOf2 = Integer.valueOf(lVar2.f16597m);
        wa1 wa1Var = wa1.f21479c;
        v91 v91VarA = v91VarD.a(numValueOf, numValueOf2, wa1Var).b(lVar.f16598n, lVar2.f16598n).b(lVar.f16599o, lVar2.f16599o).a(Integer.valueOf(lVar.f16600p), Integer.valueOf(lVar2.f16600p), wa1Var).d(lVar.f16601q, lVar2.f16601q).b(lVar.f16602r, lVar2.f16602r).d(lVar.f16594i, lVar2.f16594i).d(lVar.f16590e, lVar2.f16590e).d(lVar.f16592g, lVar2.f16592g).a(Integer.valueOf(lVar.l), Integer.valueOf(lVar2.l), wa1Var);
        boolean z10 = lVar.f16604t;
        v91 v91VarD2 = v91VarA.d(z10, lVar2.f16604t);
        boolean z11 = lVar.f16605u;
        v91 v91VarD3 = v91VarD2.d(z11, lVar2.f16605u);
        if (z10 && z11) {
            v91VarD3 = v91VarD3.b(lVar.f16606v, lVar2.f16606v);
        }
        return v91VarD3.e();
    }

    public static int d(l lVar, l lVar2) {
        Comparator fb1Var = (lVar.f16590e && lVar.f16593h) ? m.f17170k : new fb1();
        lVar.f16591f.getClass();
        return t91.f(fb1Var.compare(Integer.valueOf(lVar.f16596k), Integer.valueOf(lVar2.f16596k))).a(Integer.valueOf(lVar.f16595j), Integer.valueOf(lVar2.f16595j), fb1Var).e();
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int a() {
        return this.f16603s;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final /* bridge */ /* synthetic */ boolean b(k kVar) {
        l lVar = (l) kVar;
        if (!Objects.equals(this.f16231d.f14678o, lVar.f16231d.f14678o)) {
            return false;
        }
        this.f16591f.getClass();
        return this.f16604t == lVar.f16604t && this.f16605u == lVar.f16605u;
    }
}
