package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f17441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f17442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f17443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f17444d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        f17441a = new zi1(lg1.class, tt0.f20506q);
        f17442b = new xi1(zq1VarA, tt0.f20503n);
        f17443c = new hi1(kg1.class, tt0.f20504o);
        f17444d = new fi1(zq1VarA, tt0.f20505p);
    }

    public static on1 a(xf1 xf1Var) throws GeneralSecurityException {
        if (xf1.f21855f.equals(xf1Var)) {
            return on1.TINK;
        }
        if (xf1.f21856g.equals(xf1Var)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(xf1Var.f21864b));
    }

    public static xf1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return xf1.f21855f;
        }
        if (iOrdinal == 3) {
            return xf1.f21856g;
        }
        int iZza = on1Var.zza();
        throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }
}
