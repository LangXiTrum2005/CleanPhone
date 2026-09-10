package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kg1 extends lf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg1 f16441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zq1 f16442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f16443d;

    public kg1(lg1 lg1Var, zq1 zq1Var, Integer num) {
        this.f16441b = lg1Var;
        this.f16442c = zq1Var;
        this.f16443d = num;
    }

    public static kg1 k(lg1 lg1Var, Integer num) throws GeneralSecurityException {
        zq1 zq1VarA;
        xf1 xf1Var = lg1Var.f16987b;
        if (xf1Var == xf1.f21855f) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zq1VarA = zq1.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (xf1Var != xf1.f21856g) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(xf1Var.f21864b));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zq1VarA = zq1.a(new byte[0]);
        }
        return new kg1(lg1Var, zq1VarA, num);
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final /* synthetic */ ff1 b() {
        return this.f16441b;
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final Integer g() {
        return this.f16443d;
    }

    @Override // com.google.android.gms.internal.ads.lf1
    public final zq1 j() {
        return this.f16442c;
    }
}
