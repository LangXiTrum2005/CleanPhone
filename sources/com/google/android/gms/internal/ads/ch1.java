package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f13164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f13165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f13166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f13167d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f13164a = new zi1(bg1.class, xg1.l);
        f13165b = new xi1(zq1VarA, xg1.f21878i);
        f13166c = new hi1(zf1.class, xg1.f21879j);
        f13167d = new fi1(zq1VarA, xg1.f21880k);
    }

    public static on1 a(af1 af1Var) throws GeneralSecurityException {
        if (af1.f12013f.equals(af1Var)) {
            return on1.TINK;
        }
        if (af1.f12014g.equals(af1Var)) {
            return on1.CRUNCHY;
        }
        if (af1.f12015h.equals(af1Var)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(af1Var)));
    }

    public static af1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return af1.f12013f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return af1.f12015h;
            }
            if (iOrdinal != 4) {
                int iZza = on1Var.zza();
                throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return af1.f12014g;
    }
}
