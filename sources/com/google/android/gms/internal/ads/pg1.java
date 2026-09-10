package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pg1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f18646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f18647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f18648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f18649d;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f18646a = new zi1(og1.class, tt0.f20510u);
        f18647b = new xi1(zq1VarA, tt0.f20507r);
        f18648c = new hi1(ng1.class, tt0.f20508s);
        f18649d = new fi1(zq1VarA, tt0.f20509t);
    }

    public static on1 a(sf1 sf1Var) throws GeneralSecurityException {
        if (sf1.f19961k.equals(sf1Var)) {
            return on1.TINK;
        }
        if (sf1.l.equals(sf1Var)) {
            return on1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(sf1Var)));
    }

    public static nn1 b(og1 og1Var) {
        byte[] bArrB = ((wm1) ((lj1) vi1.f21181b.h(og1Var.f18270d)).f17037c).b();
        try {
            ks1 ks1Var = ks1.f16518a;
            int i10 = tr1.f20473a;
            wm1 wm1VarC = wm1.C(bArrB, ks1.f16519b);
            mn1 mn1VarC = nn1.C();
            String str = og1Var.f18268b;
            mn1VarC.b();
            ((nn1) mn1VarC.f19193b).E(str);
            mn1VarC.b();
            ((nn1) mn1VarC.f19193b).F(wm1VarC);
            return (nn1) mn1VarC.e();
        } catch (et1 e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
        }
    }

    public static og1 c(nn1 nn1Var, on1 on1Var) throws GeneralSecurityException {
        af1 af1Var;
        sf1 sf1Var = sf1.l;
        Object obj = af1.f12020n;
        af1 af1Var2 = af1.f12019m;
        af1 af1Var3 = af1.l;
        af1 af1Var4 = af1.f12017j;
        af1 af1Var5 = af1.f12018k;
        af1 af1Var6 = af1.f12016i;
        vm1 vm1VarD = wm1.D();
        vm1VarD.h(nn1Var.A().z());
        vm1VarD.i(nn1Var.A().A());
        vm1VarD.j(on1.RAW);
        ff1 ff1VarH = jd1.h(((wm1) vm1VarD.e()).b());
        if (ff1VarH instanceof bg1) {
            af1Var = af1Var6;
        } else if (ff1VarH instanceof hg1) {
            af1Var = af1Var5;
        } else if (ff1VarH instanceof wg1) {
            af1Var = af1Var4;
        } else if (ff1VarH instanceof uf1) {
            af1Var = af1Var3;
        } else if (ff1VarH instanceof yf1) {
            af1Var = af1Var2;
        } else {
            if (!(ff1VarH instanceof eg1)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(ff1VarH.toString()));
            }
            af1Var = obj;
        }
        int iOrdinal = on1Var.ordinal();
        if (iOrdinal == 1) {
            sf1Var = sf1.f19961k;
        } else if (iOrdinal != 3) {
            int iZza = on1Var.zza();
            throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iZza).length() + 34), "Unable to parse OutputPrefixType: ", iZza));
        }
        String strZ = nn1Var.z();
        mf1 mf1Var = (mf1) ff1VarH;
        if (strZ == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (mf1Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (mf1Var.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((af1Var.equals(af1Var6) && (mf1Var instanceof bg1)) || ((af1Var.equals(af1Var5) && (mf1Var instanceof hg1)) || ((af1Var.equals(af1Var4) && (mf1Var instanceof wg1)) || ((af1Var.equals(af1Var3) && (mf1Var instanceof uf1)) || ((af1Var.equals(af1Var2) && (mf1Var instanceof yf1)) || (af1Var.equals(obj) && (mf1Var instanceof eg1))))))) {
            return new og1(sf1Var, strZ, af1Var, mf1Var);
        }
        String str = af1Var.f12026b;
        String strValueOf = String.valueOf(mf1Var);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        d5.u.r(sb2, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb2.append(".");
        throw new GeneralSecurityException(sb2.toString());
    }
}
