package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class fg1 extends lf1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hg1 f14405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo0 f14406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zq1 f14407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f14408e;

    public fg1(hg1 hg1Var, uo0 uo0Var, zq1 zq1Var, Integer num) {
        this.f14405b = hg1Var;
        this.f14406c = uo0Var;
        this.f14407d = zq1Var;
        this.f14408e = num;
    }

    public static fg1 k(tf1 tf1Var, uo0 uo0Var, Integer num) throws GeneralSecurityException {
        zq1 zq1VarB;
        String str = tf1Var.f20372b;
        zq1 zq1Var = (zq1) uo0Var.f20839b;
        tf1 tf1Var2 = tf1.f20367h;
        if (tf1Var != tf1Var2 && num == null) {
            throw new GeneralSecurityException(q4.a.j(new StringBuilder(str.length() + 62), "For given Variant ", str, " the value of idRequirement must be non-null"));
        }
        if (tf1Var == tf1Var2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zq1Var.f22697a.length != 32) {
            int length = zq1Var.f22697a.length;
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(length).length() + 74), "ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", length));
        }
        hg1 hg1Var = new hg1(tf1Var);
        if (tf1Var == tf1Var2) {
            zq1VarB = wi1.f21526a;
        } else if (tf1Var == tf1.f20366g) {
            zq1VarB = wi1.a(num.intValue());
        } else {
            if (tf1Var != tf1.f20365f) {
                throw new IllegalStateException("Unknown Variant: ".concat(str));
            }
            zq1VarB = wi1.b(num.intValue());
        }
        return new fg1(hg1Var, uo0Var, zq1VarB, num);
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final /* synthetic */ ff1 b() {
        return this.f14405b;
    }

    @Override // com.google.android.gms.internal.ads.jc1
    public final Integer g() {
        return this.f14408e;
    }

    @Override // com.google.android.gms.internal.ads.lf1
    public final zq1 j() {
        return this.f14407d;
    }
}
