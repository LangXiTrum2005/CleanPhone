package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f19594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f19595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f19596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f19597d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f19594a = new zi1(wg1.class, xg1.B);
        f19595b = new xi1(zq1VarA, xg1.f21893y);
        f19596c = new hi1(ug1.class, xg1.f21894z);
        f19597d = new fi1(zq1VarA, xg1.A);
    }

    public static on1 a(xf1 xf1Var) throws GeneralSecurityException {
        if (xf1.f21857h.equals(xf1Var)) {
            return on1.TINK;
        }
        if (xf1.f21858i.equals(xf1Var)) {
            return on1.CRUNCHY;
        }
        if (xf1.f21859j.equals(xf1Var)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(xf1Var.f21864b));
    }

    public static xf1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return xf1.f21857h;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return xf1.f21859j;
            }
            if (iOrdinal != 4) {
                int iZza = on1Var.zza();
                throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return xf1.f21858i;
    }
}
