package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f22604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f22605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f22606c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f22607d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        f22604a = new zi1(uf1.class, xg1.f21873d);
        f22605b = new xi1(zq1VarA, tt0.f20513x);
        f22606c = new hi1(of1.class, xg1.f21871b);
        f22607d = new fi1(zq1VarA, xg1.f21872c);
    }

    public static on1 a(tf1 tf1Var) throws GeneralSecurityException {
        if (tf1.f20362c.equals(tf1Var)) {
            return on1.TINK;
        }
        if (tf1.f20363d.equals(tf1Var)) {
            return on1.CRUNCHY;
        }
        if (tf1.f20364e.equals(tf1Var)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(tf1Var)));
    }

    public static tf1 b(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return tf1.f20362c;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return tf1.f20364e;
            }
            if (iOrdinal != 4) {
                int iZza = on1Var.zza();
                throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
            }
        }
        return tf1.f20363d;
    }

    public static sf1 c(mm1 mm1Var) throws GeneralSecurityException {
        int iOrdinal = mm1Var.ordinal();
        if (iOrdinal == 1) {
            return sf1.f19953c;
        }
        if (iOrdinal == 2) {
            return sf1.f19956f;
        }
        if (iOrdinal == 3) {
            return sf1.f19955e;
        }
        if (iOrdinal == 4) {
            return sf1.f19957g;
        }
        if (iOrdinal == 5) {
            return sf1.f19954d;
        }
        int iZza = mm1Var.zza();
        throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 26), "Unable to parse HashType: ", iZza));
    }

    public static sm1 d(uf1 uf1Var) {
        mm1 mm1Var;
        rm1 rm1VarB = sm1.B();
        int i10 = uf1Var.f20767d;
        rm1VarB.b();
        ((sm1) rm1VarB.f19193b).E(i10);
        sf1 sf1Var = uf1Var.f20769f;
        if (sf1.f19953c.equals(sf1Var)) {
            mm1Var = mm1.SHA1;
        } else if (sf1.f19954d.equals(sf1Var)) {
            mm1Var = mm1.SHA224;
        } else if (sf1.f19955e.equals(sf1Var)) {
            mm1Var = mm1.SHA256;
        } else if (sf1.f19956f.equals(sf1Var)) {
            mm1Var = mm1.SHA384;
        } else {
            if (!sf1.f19957g.equals(sf1Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(sf1Var)));
            }
            mm1Var = mm1.SHA512;
        }
        rm1VarB.b();
        ((sm1) rm1VarB.f19193b).D(mm1Var);
        return (sm1) rm1VarB.e();
    }
}
