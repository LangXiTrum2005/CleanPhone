package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 extends jc1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk1 f17468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo0 f17469c;

    public mk1(nk1 nk1Var, uo0 uo0Var) {
        this.f17468b = nk1Var;
        this.f17469c = uo0Var;
    }

    public static mk1 j(nk1 nk1Var, uo0 uo0Var) throws GeneralSecurityException {
        if (nk1Var.f17860a == ((zq1) uo0Var.f20839b).f22697a.length) {
            return new mk1(nk1Var, uo0Var);
        }
        throw new GeneralSecurityException("Key size mismatch");
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final /* synthetic */ ff1 b() {
        return this.f17468b;
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final Integer g() {
        return null;
    }
}
