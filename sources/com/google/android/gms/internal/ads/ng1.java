package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ng1 extends lf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final og1 f17823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq1 f17824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f17825d;

    public ng1(og1 og1Var, zq1 zq1Var, Integer num) {
        this.f17823b = og1Var;
        this.f17824c = zq1Var;
        this.f17825d = num;
    }

    public static ng1 k(og1 og1Var, Integer num) throws GeneralSecurityException {
        zq1 zq1VarB;
        sf1 sf1Var = og1Var.f18267a;
        if (sf1Var == sf1.l) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zq1VarB = wi1.f21526a;
        } else {
            if (sf1Var != sf1.f19961k) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(sf1Var)));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zq1VarB = wi1.b(num.intValue());
        }
        return new ng1(og1Var, zq1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final /* synthetic */ ff1 b() {
        return this.f17823b;
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final Integer g() {
        return this.f17825d;
    }

    @Override // com.google.android.gms.internal.ads.lf1
    public final zq1 j() {
        return this.f17824c;
    }
}
