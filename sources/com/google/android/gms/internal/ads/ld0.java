package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 implements o80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f16869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f16871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fx1 f16872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ne0 f16873e;

    public ld0(Map map, Map map2, Map map3, fx1 fx1Var, ne0 ne0Var) {
        this.f16869a = map;
        this.f16870b = map2;
        this.f16871c = map3;
        this.f16872d = fx1Var;
        this.f16873e = ne0Var;
    }

    @Override // com.google.android.gms.internal.ads.o80
    public final nm0 a(int i10, String str) {
        nm0 nm0VarA;
        nm0 nm0Var = (nm0) this.f16869a.get(str);
        if (nm0Var != null) {
            return nm0Var;
        }
        if (i10 != 1) {
            if (i10 != 4) {
                return null;
            }
            rn0 rn0Var = (rn0) this.f16871c.get(str);
            if (rn0Var != null) {
                return new om0(rn0Var, i6.f15607g);
            }
            nm0VarA = (nm0) this.f16870b.get(str);
            if (nm0VarA == null) {
                return null;
            }
        } else if (this.f16873e.f17784d == null || (nm0VarA = ((o80) this.f16872d.zzb()).a(i10, str)) == null) {
            return null;
        }
        return new om0(nm0VarA, i6.f15606f);
    }
}
