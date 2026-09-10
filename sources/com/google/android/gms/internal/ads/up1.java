package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class up1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f20850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f20851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f20852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f20853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hi1 f20854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fi1 f20855f;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        zq1 zq1VarA2 = rj1.a("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        f20850a = new zi1(ro1.class, tj1.C);
        f20851b = new xi1(zq1VarA, tj1.f20429x);
        f20852c = new hi1(to1.class, tj1.f20430y);
        f20853d = new fi1(zq1VarA2, tj1.f20431z);
        f20854e = new hi1(so1.class, tj1.A);
        f20855f = new fi1(zq1VarA, tj1.B);
    }

    public static on1 a(xf1 xf1Var) throws GeneralSecurityException {
        if (xf1.f21860k.equals(xf1Var)) {
            return on1.TINK;
        }
        if (xf1.l.equals(xf1Var)) {
            return on1.CRUNCHY;
        }
        if (xf1.f21862n.equals(xf1Var)) {
            return on1.RAW;
        }
        if (xf1.f21861m.equals(xf1Var)) {
            return on1.LEGACY;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(xf1Var.f21864b));
    }

    public static sf1 b(mm1 mm1Var) throws GeneralSecurityException {
        int iOrdinal = mm1Var.ordinal();
        if (iOrdinal == 2) {
            return sf1.f19963n;
        }
        if (iOrdinal == 3) {
            return sf1.f19962m;
        }
        if (iOrdinal == 4) {
            return sf1.f19964o;
        }
        int iZza = mm1Var.zza();
        throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 26), "Unable to parse HashType: ", iZza));
    }

    public static xf1 c(on1 on1Var) throws GeneralSecurityException {
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            return xf1.f21860k;
        }
        if (iOrdinal == 2) {
            return xf1.f21861m;
        }
        if (iOrdinal == 3) {
            return xf1.f21862n;
        }
        if (iOrdinal == 4) {
            return xf1.l;
        }
        int iZza = on1Var.zza();
        throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
    }

    public static int d(qo1 qo1Var) throws GeneralSecurityException {
        if (qo1.f19148c.equals(qo1Var)) {
            return 33;
        }
        if (qo1.f19149d.equals(qo1Var)) {
            return 49;
        }
        if (qo1.f19150e.equals(qo1Var)) {
            return 67;
        }
        throw new GeneralSecurityException("Unable to serialize CurveType ".concat(qo1Var.f19151a));
    }

    public static cm1 e(ro1 ro1Var) throws GeneralSecurityException {
        mm1 mm1Var;
        int i10;
        bm1 bm1VarA = cm1.A();
        sf1 sf1Var = ro1Var.f19632c;
        if (sf1.f19962m.equals(sf1Var)) {
            mm1Var = mm1.SHA256;
        } else if (sf1.f19963n.equals(sf1Var)) {
            mm1Var = mm1.SHA384;
        } else {
            if (!sf1.f19964o.equals(sf1Var)) {
                throw new GeneralSecurityException("Unable to serialize HashType ".concat(sf1Var.f19966b));
            }
            mm1Var = mm1.SHA512;
        }
        bm1VarA.b();
        ((cm1) bm1VarA.f19193b).C(mm1Var);
        qo1 qo1Var = ro1Var.f19631b;
        int i11 = 4;
        if (qo1.f19148c.equals(qo1Var)) {
            i10 = 4;
        } else if (qo1.f19149d.equals(qo1Var)) {
            i10 = 5;
        } else {
            if (!qo1.f19150e.equals(qo1Var)) {
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(qo1Var.f19151a));
            }
            i10 = 6;
        }
        bm1VarA.b();
        ((cm1) bm1VarA.f19193b).F(i10);
        tf1 tf1Var = ro1Var.f19630a;
        if (tf1.f20370k.equals(tf1Var)) {
            i11 = 3;
        } else if (!tf1.l.equals(tf1Var)) {
            throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(tf1Var.f20372b));
        }
        bm1VarA.b();
        ((cm1) bm1VarA.f19193b).G(i11);
        return (cm1) bm1VarA.e();
    }

    public static gm1 f(to1 to1Var) throws GeneralSecurityException {
        int iD = d(to1Var.f20450b.f19631b);
        ECPoint eCPoint = to1Var.f20451c;
        fm1 fm1VarE = gm1.E();
        cm1 cm1VarE = e(to1Var.f20450b);
        fm1VarE.b();
        ((gm1) fm1VarE.f19193b).H(cm1VarE);
        byte[] bArrI = jd1.i(eCPoint.getAffineX(), iD);
        as1 as1Var = cs1.f13248b;
        as1 as1VarD = cs1.D(bArrI, 0, bArrI.length);
        fm1VarE.b();
        ((gm1) fm1VarE.f19193b).I(as1VarD);
        byte[] bArrI2 = jd1.i(eCPoint.getAffineY(), iD);
        as1 as1VarD2 = cs1.D(bArrI2, 0, bArrI2.length);
        fm1VarE.b();
        ((gm1) fm1VarE.f19193b).J(as1VarD2);
        return (gm1) fm1VarE.e();
    }

    public static qo1 g(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 2) {
            return qo1.f19148c;
        }
        if (i11 == 3) {
            return qo1.f19149d;
        }
        if (i11 == 4) {
            return qo1.f19150e;
        }
        if (i10 != 1) {
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 35), "Unable to parse EllipticCurveType: ", i11));
        }
        bt1.a();
        throw null;
    }

    public static tf1 h(int i10) throws GeneralSecurityException {
        int i11 = i10 - 2;
        if (i11 == 1) {
            return tf1.f20370k;
        }
        if (i11 == 2) {
            return tf1.l;
        }
        if (i10 != 1) {
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 40), "Unable to parse EcdsaSignatureEncoding: ", i11));
        }
        bt1.a();
        throw null;
    }
}
