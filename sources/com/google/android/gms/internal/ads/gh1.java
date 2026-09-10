package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f14857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f14858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f14859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f14860d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f14857a = new zi1(hg1.class, xg1.f21888t);
        f14858b = new xi1(zq1VarA, xg1.f21885q);
        f14859c = new hi1(fg1.class, xg1.f21886r);
        f14860d = new fi1(zq1VarA, xg1.f21887s);
    }

    public static on1 a(tf1 tf1Var) throws GeneralSecurityException {
        if (tf1.f20365f.equals(tf1Var)) {
            return on1.TINK;
        }
        if (tf1.f20366g.equals(tf1Var)) {
            return on1.CRUNCHY;
        }
        if (tf1.f20367h.equals(tf1Var)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(tf1Var.f20372b));
    }

    public static tf1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return tf1.f20365f;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tf1.f20367h;
            }
            if (iOrdinal != 4) {
                int iZza = on1Var.zza();
                throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return tf1.f20366g;
    }
}
