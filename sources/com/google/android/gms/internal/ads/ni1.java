package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ni1 extends jc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kj1 f17836b;

    public ni1(kj1 kj1Var) {
        int i10 = li1.f17010b[v0.i.c(kj1Var.f16462a)];
        this.f17836b = kj1Var;
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final ff1 b() {
        kj1 kj1Var = this.f17836b;
        return new mi1((String) kj1Var.f16463b, (on1) kj1Var.f16466e);
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final Integer g() {
        return (Integer) this.f17836b.f16467f;
    }

    public final zq1 j() {
        kj1 kj1Var = this.f17836b;
        on1 on1Var = (on1) kj1Var.f16466e;
        Integer num = (Integer) kj1Var.f16467f;
        on1 on1Var2 = (on1) kj1Var.f16466e;
        if (on1Var.equals(on1.RAW)) {
            return zq1.a(new byte[0]);
        }
        if (on1Var2.equals(on1.TINK)) {
            return wi1.b(num.intValue());
        }
        if (on1Var2.equals(on1.LEGACY) || on1Var2.equals(on1.CRUNCHY)) {
            return wi1.a(num.intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
