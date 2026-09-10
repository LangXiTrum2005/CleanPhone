package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rz1 extends h32 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ih f19741c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz1(sz1 sz1Var, ci ciVar) {
        super(ciVar);
        Objects.requireNonNull(sz1Var);
        this.f19741c = new ih();
    }

    @Override // com.google.android.gms.internal.ads.h32, com.google.android.gms.internal.ads.ci
    public final ug d(int i10, ug ugVar, boolean z10) {
        ci ciVar = this.f15101b;
        ug ugVarD = ciVar.d(i10, ugVar, z10);
        if (!ciVar.b(ugVarD.f20772c, this.f19741c, 0L).b()) {
            ugVarD.f20774e = true;
            return ugVarD;
        }
        Object obj = ugVar.f20770a;
        Object obj2 = ugVar.f20771b;
        int i11 = ugVar.f20772c;
        long j10 = ugVar.f20773d;
        vw vwVar = vw.f21303b;
        ugVarD.a(obj, obj2, i11, j10, true);
        return ugVarD;
    }
}
