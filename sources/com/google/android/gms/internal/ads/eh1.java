package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f13979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f13980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f13981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f13982d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f13979a = new zi1(eg1.class, xg1.f21884p);
        f13980b = new xi1(zq1VarA, xg1.f21881m);
        f13981c = new hi1(cg1.class, xg1.f21882n);
        f13982d = new fi1(zq1VarA, xg1.f21883o);
    }

    public static on1 a(sf1 sf1Var) throws GeneralSecurityException {
        if (sf1.f19958h.equals(sf1Var)) {
            return on1.TINK;
        }
        if (sf1.f19959i.equals(sf1Var)) {
            return on1.CRUNCHY;
        }
        if (sf1.f19960j.equals(sf1Var)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(sf1Var)));
    }

    public static sf1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return sf1.f19958h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return sf1.f19960j;
            }
            if (iOrdinal != 4) {
                int iZza = on1Var.zza();
                throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return sf1.f19959i;
    }
}
