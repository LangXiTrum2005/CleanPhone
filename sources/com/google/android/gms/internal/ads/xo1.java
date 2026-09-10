package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xo1 extends sp1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zo1 f21947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo0 f21948c;

    public xo1(zo1 zo1Var, uo0 uo0Var) {
        this.f21947b = zo1Var;
        this.f21948c = uo0Var;
    }

    public static xo1 k(zo1 zo1Var, uo0 uo0Var) throws GeneralSecurityException {
        zq1 zq1Var = (zq1) uo0Var.f20839b;
        if (zq1Var.f22697a.length != 32) {
            int length = zq1Var.f22697a.length;
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (Arrays.equals(zo1Var.f22683c.b(), pi1.m(pi1.v(zq1Var.b())))) {
            return new xo1(zo1Var, uo0Var);
        }
        throw new GeneralSecurityException("Ed25519 keys mismatch");
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final ff1 b() {
        return this.f21947b.f22682b;
    }

    @Override // com.google.android.gms.internal.ads.sp1
    public final /* synthetic */ tp1 j() {
        return this.f21947b;
    }
}
