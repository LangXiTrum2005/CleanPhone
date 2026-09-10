package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class bp1 implements jj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bp1 f12842a = new bp1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ej1 f12843b = new ej1(ni1.class, gf1.class, tj1.f20423r);

    @Override // com.google.android.gms.internal.ads.jj1
    public final Object a(iw0 iw0Var, iw0 iw0Var2) {
        if (((Map) iw0Var.f15865c).get(pi1.class) != null) {
            throw new ClassCastException();
        }
        iw0Var.r();
        return new yp1();
    }

    @Override // com.google.android.gms.internal.ads.jj1
    public final Class zza() {
        return gf1.class;
    }

    @Override // com.google.android.gms.internal.ads.jj1
    public final Class zzb() {
        return gf1.class;
    }
}
