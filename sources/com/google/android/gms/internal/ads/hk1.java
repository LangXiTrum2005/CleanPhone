package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f15318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f15319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f15320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f15321d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f15318a = new zi1(vj1.class, tj1.f20415i);
        f15319b = new xi1(zq1VarA, tj1.f20412f);
        f15320c = new hi1(sj1.class, tj1.f20413g);
        f15321d = new fi1(zq1VarA, tj1.f20414h);
    }

    public static on1 a(af1 af1Var) throws GeneralSecurityException {
        if (af1.f12021o.equals(af1Var)) {
            return on1.TINK;
        }
        if (af1.f12022p.equals(af1Var)) {
            return on1.CRUNCHY;
        }
        if (af1.f12024r.equals(af1Var)) {
            return on1.RAW;
        }
        if (af1.f12023q.equals(af1Var)) {
            return on1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(af1Var)));
    }

    public static af1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return af1.f12021o;
        }
        if (iOrdinal == 2) {
            return af1.f12023q;
        }
        if (iOrdinal == 3) {
            return af1.f12024r;
        }
        if (iOrdinal == 4) {
            return af1.f12022p;
        }
        int iZza = on1Var.zza();
        throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }
}
