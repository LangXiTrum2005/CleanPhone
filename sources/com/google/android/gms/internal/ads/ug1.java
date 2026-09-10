package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ug1 extends lf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wg1 f20787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo0 f20788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zq1 f20789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f20790e;

    public ug1(wg1 wg1Var, uo0 uo0Var, zq1 zq1Var, Integer num) {
        this.f20787b = wg1Var;
        this.f20788c = uo0Var;
        this.f20789d = zq1Var;
        this.f20790e = num;
    }

    public static ug1 k(xf1 xf1Var, uo0 uo0Var, Integer num) throws GeneralSecurityException {
        zq1 zq1VarB;
        String str = xf1Var.f21864b;
        zq1 zq1Var = (zq1) uo0Var.f20839b;
        xf1 xf1Var2 = xf1.f21859j;
        if (xf1Var != xf1Var2 && num == null) {
            throw new GeneralSecurityException(q4.a.j(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (xf1Var == xf1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zq1Var.f22697a.length != 32) {
            int length = zq1Var.f22697a.length;
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(length).length() + 75), "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        wg1 wg1Var = new wg1(xf1Var);
        if (xf1Var == xf1Var2) {
            zq1VarB = wi1.f21526a;
        } else if (xf1Var == xf1.f21858i) {
            zq1VarB = wi1.a(num.intValue());
        } else {
            if (xf1Var != xf1.f21857h) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            zq1VarB = wi1.b(num.intValue());
        }
        return new ug1(wg1Var, uo0Var, zq1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final /* synthetic */ ff1 b() {
        return this.f20787b;
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final Integer g() {
        return this.f20790e;
    }

    @Override // com.google.android.gms.internal.ads.lf1
    public final zq1 j() {
        return this.f20789d;
    }
}
