package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Comparator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y42 extends k implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f22130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f22132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f22133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f22134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f22135k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f22136m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f22137n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f22138o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f22139p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f22140q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f22141r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f22142s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f22143t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f22144u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f22145v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f22146w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f22147x;

    public y42(int i10, ni niVar, int i11, h hVar, int i12, boolean z10, c cVar) {
        int i13;
        int iF;
        int iHashCode;
        int iF2;
        boolean z11;
        super(i10, niVar, i11);
        this.f22132h = hVar;
        boolean z12 = hVar.f15010z;
        ca1 ca1Var = hVar.f15796p;
        ca1 ca1Var2 = hVar.l;
        int i14 = 1;
        int i15 = true != z12 ? 16 : 24;
        this.f22131g = m.e(this.f16231d.f14668d);
        this.f22133i = ux1.s(i12, false);
        int i16 = 0;
        while (true) {
            i13 = Integer.MAX_VALUE;
            if (i16 >= ca1Var2.size()) {
                iF = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iF = m.f(this.f16231d, (String) ca1Var2.get(i16), false);
                if (iF > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.f22135k = i16;
        this.f22134j = iF;
        int i17 = this.f16231d.f14670f;
        this.l = (i17 == 0 || i17 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f22136m = m.g(this.f16231d, hVar.f15793m);
        g22 g22Var = this.f16231d;
        int i18 = g22Var.f14670f;
        this.f22137n = i18 == 0 || (i18 & 1) != 0;
        this.f22140q = 1 == (g22Var.f14669e & 1);
        String str = g22Var.f14678o;
        this.f22147x = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals(MimeTypes.AUDIO_E_AC3_JOC) : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i19 = g22Var.G;
        this.f22141r = i19;
        this.f22142s = g22Var.I;
        int i20 = g22Var.f14674j;
        this.f22143t = i20;
        this.f22130f = (i20 == -1 || i20 <= hVar.f15795o) && (i19 == -1 || i19 <= hVar.f15794n) && cVar.zza(g22Var);
        String str2 = uu0.f20901a;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i21 = 0; i21 < strArrSplit.length; i21++) {
            strArrSplit[i21] = uu0.p(strArrSplit[i21]);
        }
        int i22 = 0;
        while (true) {
            if (i22 >= strArrSplit.length) {
                iF2 = 0;
                i22 = Integer.MAX_VALUE;
                break;
            } else {
                iF2 = m.f(this.f16231d, strArrSplit[i22], false);
                if (iF2 > 0) {
                    break;
                } else {
                    i22++;
                }
            }
        }
        this.f22138o = i22;
        this.f22139p = iF2;
        for (int i23 = 0; i23 < ca1Var.size(); i23++) {
            String str3 = this.f16231d.f14678o;
            if (str3 != null && str3.equals(ca1Var.get(i23))) {
                i13 = i23;
                break;
            }
        }
        this.f22144u = i13;
        this.f22145v = (i12 & 384) == 128;
        this.f22146w = (i12 & 64) == 64;
        h hVar2 = this.f22132h;
        if (ux1.s(i12, hVar2.B) && ((z11 = this.f22130f) || hVar2.f15009y)) {
            hVar2.f15797q.getClass();
            if (ux1.s(i12, false) && z11 && this.f16231d.f14674j != -1 && ((hVar2.C || !z10) && (i15 & i12) != 0)) {
                i14 = 2;
            }
        } else {
            i14 = 0;
        }
        this.f22129e = i14;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final int a() {
        return this.f22129e;
    }

    @Override // com.google.android.gms.internal.ads.k
    public final /* bridge */ /* synthetic */ boolean b(k kVar) {
        String str;
        int i10;
        y42 y42Var = (y42) kVar;
        this.f22132h.getClass();
        g22 g22Var = this.f16231d;
        int i11 = g22Var.G;
        if (i11 == -1) {
            return false;
        }
        g22 g22Var2 = y42Var.f16231d;
        return i11 == g22Var2.G && (str = g22Var.f14678o) != null && TextUtils.equals(str, g22Var2.f14678o) && (i10 = g22Var.I) != -1 && i10 == g22Var2.I && this.f22145v == y42Var.f22145v && this.f22146w == y42Var.f22146w;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(y42 y42Var) {
        boolean z10 = this.f22133i;
        boolean z11 = this.f22130f;
        Comparator fb1Var = (z11 && z10) ? m.f17170k : new fb1();
        v91 v91VarD = v91.f21141a.d(z10, y42Var.f22133i);
        Integer numValueOf = Integer.valueOf(this.f22135k);
        Integer numValueOf2 = Integer.valueOf(y42Var.f22135k);
        wa1 wa1Var = wa1.f21479c;
        v91 v91VarA = v91VarD.a(numValueOf, numValueOf2, wa1Var).b(this.f22134j, y42Var.f22134j).b(this.l, y42Var.l).a(Integer.valueOf(this.f22136m), Integer.valueOf(y42Var.f22136m), wa1Var).d(this.f22140q, y42Var.f22140q).d(this.f22137n, y42Var.f22137n).a(Integer.valueOf(this.f22138o), Integer.valueOf(y42Var.f22138o), wa1Var).b(this.f22139p, y42Var.f22139p).d(z11, y42Var.f22130f).a(Integer.valueOf(this.f22144u), Integer.valueOf(y42Var.f22144u), wa1Var);
        this.f22132h.getClass();
        v91 v91VarA2 = v91VarA.d(this.f22145v, y42Var.f22145v).d(this.f22146w, y42Var.f22146w).d(this.f22147x, y42Var.f22147x).a(Integer.valueOf(this.f22141r), Integer.valueOf(y42Var.f22141r), fb1Var).a(Integer.valueOf(this.f22142s), Integer.valueOf(y42Var.f22142s), fb1Var);
        if (Objects.equals(this.f22131g, y42Var.f22131g)) {
            v91VarA2 = v91VarA2.a(Integer.valueOf(this.f22143t), Integer.valueOf(y42Var.f22143t), fb1Var);
        }
        return v91VarA2.e();
    }
}
