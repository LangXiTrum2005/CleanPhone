package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ph1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f18658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f18659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f18660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f18661d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        f18658a = new zi1(tg1.class, xg1.f21892x);
        f18659b = new xi1(zq1VarA, xg1.f21889u);
        f18660c = new hi1(rg1.class, xg1.f21890v);
        f18661d = new fi1(zq1VarA, xg1.f21891w);
    }

    public static on1 a(tf1 tf1Var) throws GeneralSecurityException {
        if (tf1Var.equals(tf1.f20368i)) {
            return on1.TINK;
        }
        if (tf1Var.equals(tf1.f20369j)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(tf1Var.f20372b));
    }

    public static tf1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return tf1.f20368i;
        }
        if (iOrdinal == 3) {
            return tf1.f20369j;
        }
        int iZza = on1Var.zza();
        throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }
}
