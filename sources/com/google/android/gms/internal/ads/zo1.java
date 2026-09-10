package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zo1 extends tp1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wo1 f22682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq1 f22683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zq1 f22684d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f22685e;

    public zo1(wo1 wo1Var, zq1 zq1Var, zq1 zq1Var2, Integer num) {
        this.f22682b = wo1Var;
        this.f22683c = zq1Var;
        this.f22684d = zq1Var2;
        this.f22685e = num;
    }

    public static zo1 k(vo1 vo1Var, zq1 zq1Var, Integer num) throws GeneralSecurityException {
        zq1 zq1VarA;
        String str = vo1Var.f21226a;
        byte[] bArr = zq1Var.f22697a;
        wo1 wo1Var = new wo1(vo1Var);
        vo1 vo1Var2 = vo1.f21225e;
        if (!vo1Var.equals(vo1Var2) && num == null) {
            throw new GeneralSecurityException(q4.a.j(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (vo1Var.equals(vo1Var2) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bArr.length != 32) {
            int length = bArr.length;
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(length).length() + 65), "Ed25519 key must be constructed with key of length 32 bytes, not ", length));
        }
        if (vo1Var == vo1Var2) {
            zq1VarA = wi1.f21526a;
        } else if (vo1Var == vo1.f21223c || vo1Var == vo1.f21224d) {
            zq1VarA = wi1.a(num.intValue());
        } else {
            if (vo1Var != vo1.f21222b) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            zq1VarA = wi1.b(num.intValue());
        }
        return new zo1(wo1Var, zq1Var, zq1VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final /* synthetic */ ff1 b() {
        return this.f22682b;
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final Integer g() {
        return this.f22685e;
    }

    @Override // com.google.android.gms.internal.ads.tp1
    public final zq1 j() {
        return this.f22684d;
    }
}
