package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m32 extends ci {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5 f17232b;

    public m32(f5 f5Var) {
        this.f17232b = f5Var;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int a() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final ih b(int i10, ih ihVar, long j10) {
        Object obj = ih.f15742m;
        ihVar.a(this.f17232b, false, true, null, C.TIME_UNSET);
        ihVar.f15752i = true;
        return ihVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final ug d(int i10, ug ugVar, boolean z10) {
        Integer num = z10 ? 0 : null;
        Object obj = z10 ? l32.f16697e : null;
        vw vwVar = vw.f21303b;
        ugVar.a(num, obj, 0, C.TIME_UNSET, true);
        return ugVar;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final int e(Object obj) {
        return obj == l32.f16697e ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final Object f(int i10) {
        return l32.f16697e;
    }
}
