package com.google.android.gms.internal.ads;

import android.os.Build;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj1 implements fj1, yi1, ii1, gi1, aj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20408b = new tj1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20409c = new tj1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20410d = new tj1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20411e = new tj1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20412f = new tj1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20413g = new tj1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20414h = new tj1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20415i = new tj1(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20416j = new tj1(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20417k = new tj1(9);
    public static final /* synthetic */ tj1 l = new tj1(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20418m = new tj1(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20419n = new tj1(13);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20420o = new tj1(14);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20421p = new tj1(15);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20422q = new tj1(16);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20423r = new tj1(17);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20424s = new tj1(18);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20425t = new tj1(19);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20426u = new tj1(20);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20427v = new tj1(21);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20428w = new tj1(22);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20429x = new tj1(23);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20430y = new tj1(24);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ tj1 f20431z = new tj1(25);
    public static final /* synthetic */ tj1 A = new tj1(26);
    public static final /* synthetic */ tj1 B = new tj1(27);
    public static final /* synthetic */ tj1 C = new tj1(28);
    public static final /* synthetic */ tj1 D = new tj1(29);

    public /* synthetic */ tj1(int i10) {
        this.f20432a = i10;
    }

    @Override // com.google.android.gms.internal.ads.fj1, com.google.android.gms.internal.ads.ii1
    public kj1 c(jc1 jc1Var) throws GeneralSecurityException {
        switch (this.f20432a) {
            case 5:
                sj1 sj1Var = (sj1) jc1Var;
                zi1 zi1Var = hk1.f15318a;
                qk1 qk1VarD = rk1.D();
                vj1 vj1Var = sj1Var.f19982b;
                uk1 uk1VarA = vk1.A();
                int i10 = vj1Var.f21190b;
                uk1VarA.b();
                ((vk1) uk1VarA.f19193b).C(i10);
                vk1 vk1Var = (vk1) uk1VarA.e();
                qk1VarD.b();
                ((rk1) qk1VarD.f19193b).G(vk1Var);
                byte[] bArrB = ((zq1) sj1Var.f19983c.f20839b).b();
                as1 as1VarD = cs1.D(bArrB, 0, bArrB.length);
                qk1VarD.b();
                ((rk1) qk1VarD.f19193b).F(as1VarD);
                return kj1.t("type.googleapis.com/google.crypto.tink.AesCmacKey", ((rk1) qk1VarD.e()).a(), 2, hk1.a(sj1Var.f19982b.f21191c), sj1Var.f19985e);
            case 9:
                xj1 xj1Var = (xj1) jc1Var;
                w50 w50Var = kk1.f16471a;
                nm1 nm1VarD = om1.D();
                bk1 bk1Var = xj1Var.f21912b;
                rm1 rm1VarB = sm1.B();
                int i11 = bk1Var.f12815b;
                rm1VarB.b();
                ((sm1) rm1VarB.f19193b).E(i11);
                mm1 mm1Var = (mm1) kk1.f16472b.a(bk1Var.f12817d);
                rm1VarB.b();
                ((sm1) rm1VarB.f19193b).D(mm1Var);
                sm1 sm1Var = (sm1) rm1VarB.e();
                nm1VarD.b();
                ((om1) nm1VarD.f19193b).G(sm1Var);
                byte[] bArrB2 = ((zq1) xj1Var.f21913c.f20839b).b();
                as1 as1VarD2 = cs1.D(bArrB2, 0, bArrB2.length);
                nm1VarD.b();
                ((om1) nm1VarD.f19193b).H(as1VarD2);
                return kj1.t("type.googleapis.com/google.crypto.tink.HmacKey", ((om1) nm1VarD.e()).a(), 2, (on1) kk1.f16471a.a(xj1Var.f21912b.f12816c), xj1Var.f21915e);
            case 24:
                to1 to1Var = (to1) jc1Var;
                return kj1.t("type.googleapis.com/google.crypto.tink.EcdsaPublicKey", up1.f(to1Var).a(), 4, up1.a(to1Var.f20450b.f19633d), to1Var.f20453e);
            default:
                so1 so1Var = (so1) jc1Var;
                zi1 zi1Var2 = up1.f20850a;
                int iD = up1.d(so1Var.f20014b.f20450b.f19631b);
                dm1 dm1VarD = em1.D();
                to1 to1Var2 = so1Var.f20014b;
                gm1 gm1VarF = up1.f(to1Var2);
                dm1VarD.b();
                ((em1) dm1VarD.f19193b).F(gm1VarF);
                byte[] bArrI = jd1.i((BigInteger) so1Var.f20015c.f21612b, iD);
                as1 as1Var = cs1.f13248b;
                as1 as1VarD3 = cs1.D(bArrI, 0, bArrI.length);
                dm1VarD.b();
                ((em1) dm1VarD.f19193b).G(as1VarD3);
                return kj1.t("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey", ((em1) dm1VarD.e()).a(), 3, up1.a(to1Var2.f20450b.f19633d), to1Var2.f20453e);
        }
    }

    @Override // com.google.android.gms.internal.ads.gi1
    public jc1 d(kj1 kj1Var) throws GeneralSecurityException {
        switch (this.f20432a) {
            case 6:
                zi1 zi1Var = hk1.f15318a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var = (cs1) kj1Var.f16465d;
                    ks1 ks1Var = ks1.f16518a;
                    int i10 = tr1.f20473a;
                    rk1 rk1VarC = rk1.C(cs1Var, ks1.f16519b);
                    if (rk1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    ay0 ay0Var = new ay0(8);
                    ay0Var.c(rk1VarC.A().q());
                    ay0Var.f(rk1VarC.B().z());
                    ay0Var.f12539d = hk1.b((on1) kj1Var.f16466e);
                    vj1 vj1VarM = ay0Var.m();
                    ay0 ay0Var2 = new ay0(7, false);
                    ay0Var2.f12537b = vj1VarM;
                    ay0Var2.f12538c = new uo0(zq1.a(rk1VarC.A().h()), 13);
                    ay0Var2.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var2.l();
                } catch (et1 | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            case 10:
                w50 w50Var = kk1.f16471a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var2 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var2 = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    om1 om1VarC = om1.C(cs1Var2, ks1.f16519b);
                    if (om1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    hz hzVar = new hz(17);
                    hzVar.d(om1VarC.B().q());
                    hzVar.h(om1VarC.A().A());
                    hzVar.f15435d = (zj1) kk1.f16472b.b(om1VarC.A().z());
                    hzVar.f15436e = (ak1) kk1.f16471a.b((on1) kj1Var.f16466e);
                    bk1 bk1VarP = hzVar.p();
                    ay0 ay0Var3 = new ay0(9, false);
                    ay0Var3.f12537b = bk1VarP;
                    ay0Var3.f12538c = new uo0(zq1.a(om1VarC.B().h()), 13);
                    ay0Var3.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var3.n();
                } catch (et1 | IllegalArgumentException unused2) {
                    throw new GeneralSecurityException("Parsing HmacKey failed");
                }
            case 25:
                zi1 zi1Var2 = up1.f20850a;
                String str = (String) kj1Var.f16463b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.EcdsaPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    cs1 cs1Var3 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var3 = ks1.f16518a;
                    int i12 = tr1.f20473a;
                    gm1 gm1VarD = gm1.D(cs1Var3, ks1.f16519b);
                    if (gm1VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    uw uwVar = new uw(18);
                    uwVar.f20921e = up1.b(gm1VarD.A().z());
                    uwVar.f20919c = up1.h(gm1VarD.A().E());
                    uwVar.f20920d = up1.g(gm1VarD.A().D());
                    uwVar.f20918b = up1.c((on1) kj1Var.f16466e);
                    ro1 ro1VarR = uwVar.r();
                    ay0 ay0Var4 = new ay0(10, false);
                    ay0Var4.f12537b = ro1VarR;
                    ay0Var4.f12538c = new ECPoint(new BigInteger(1, gm1VarD.B().h()), new BigInteger(1, gm1VarD.C().h()));
                    ay0Var4.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var4.o();
                } catch (et1 | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
                }
            default:
                zi1 zi1Var3 = up1.f20850a;
                String str2 = (String) kj1Var.f16463b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    cs1 cs1Var4 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var4 = ks1.f16518a;
                    int i13 = tr1.f20473a;
                    em1 em1VarC = em1.C(cs1Var4, ks1.f16519b);
                    if (em1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    gm1 gm1VarA = em1VarC.A();
                    if (gm1VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    uw uwVar2 = new uw(18);
                    uwVar2.f20921e = up1.b(gm1VarA.A().z());
                    uwVar2.f20919c = up1.h(gm1VarA.A().E());
                    uwVar2.f20920d = up1.g(gm1VarA.A().D());
                    uwVar2.f20918b = up1.c((on1) kj1Var.f16466e);
                    ro1 ro1VarR2 = uwVar2.r();
                    ay0 ay0Var5 = new ay0(10, false);
                    ay0Var5.f12537b = ro1VarR2;
                    ay0Var5.f12538c = new ECPoint(new BigInteger(1, gm1VarA.B().h()), new BigInteger(1, gm1VarA.C().h()));
                    ay0Var5.f12539d = (Integer) kj1Var.f16467f;
                    to1 to1VarO = ay0Var5.o();
                    iw0 iw0Var = new iw0(9);
                    iw0Var.f15864b = to1VarO;
                    iw0Var.f15865c = new wv0(new BigInteger(1, em1VarC.B().h()), 7);
                    return iw0Var.s();
                } catch (et1 | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.yi1
    public ff1 g(lj1 lj1Var) throws GeneralSecurityException {
        switch (this.f20432a) {
            case 4:
                zi1 zi1Var = hk1.f15318a;
                wm1 wm1Var = (wm1) lj1Var.f17037c;
                if (!wm1Var.z().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var.z())));
                }
                try {
                    cs1 cs1VarA = wm1Var.A();
                    ks1 ks1Var = ks1.f16518a;
                    int i10 = tr1.f20473a;
                    tk1 tk1VarB = tk1.B(cs1VarA, ks1.f16519b);
                    ay0 ay0Var = new ay0(8);
                    ay0Var.c(tk1VarB.z());
                    ay0Var.f(tk1VarB.A().z());
                    ay0Var.f12539d = hk1.b(wm1Var.B());
                    return ay0Var.m();
                } catch (et1 e10) {
                    throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
                }
            case 8:
                w50 w50Var = kk1.f16471a;
                wm1 wm1Var2 = (wm1) lj1Var.f17037c;
                if (!wm1Var2.z().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var2.z())));
                }
                try {
                    cs1 cs1VarA2 = wm1Var2.A();
                    ks1 ks1Var2 = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    qm1 qm1VarC = qm1.C(cs1VarA2, ks1.f16519b);
                    if (qm1VarC.B() != 0) {
                        int iB = qm1VarC.B();
                        throw new GeneralSecurityException(l1.d.k(new StringBuilder(String.valueOf(iB).length() + 47), "Parsing HmacParameters failed: unknown Version ", iB));
                    }
                    hz hzVar = new hz(17);
                    hzVar.d(qm1VarC.A());
                    hzVar.h(qm1VarC.z().A());
                    hzVar.f15435d = (zj1) kk1.f16472b.b(qm1VarC.z().z());
                    hzVar.f15436e = (ak1) kk1.f16471a.b(wm1Var2.B());
                    return hzVar.p();
                } catch (et1 e11) {
                    throw new GeneralSecurityException("Parsing HmacParameters failed: ", e11);
                }
            case 23:
                zi1 zi1Var2 = up1.f20850a;
                wm1 wm1Var3 = (wm1) lj1Var.f17037c;
                if (!wm1Var3.z().equals("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to EcdsaProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var3.z())));
                }
                try {
                    cs1 cs1VarA3 = wm1Var3.A();
                    ks1 ks1Var3 = ks1.f16518a;
                    int i12 = tr1.f20473a;
                    am1 am1VarA = am1.A(cs1VarA3, ks1.f16519b);
                    uw uwVar = new uw(18);
                    uwVar.f20921e = up1.b(am1VarA.z().z());
                    uwVar.f20919c = up1.h(am1VarA.z().E());
                    uwVar.f20920d = up1.g(am1VarA.z().D());
                    uwVar.f20918b = up1.c(wm1Var3.B());
                    return uwVar.r();
                } catch (et1 e12) {
                    throw new GeneralSecurityException("Parsing EcdsaParameters failed: ", e12);
                }
            default:
                zi1 zi1Var3 = xp1.f21957a;
                wm1 wm1Var4 = (wm1) lj1Var.f17037c;
                if (!wm1Var4.z().equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var4.z())));
                }
                try {
                    cs1 cs1VarA4 = wm1Var4.A();
                    ks1 ks1Var4 = ks1.f16518a;
                    int i13 = tr1.f20473a;
                    if (hm1.A(cs1VarA4, ks1.f16519b).z() == 0) {
                        return new wo1((vo1) xp1.f21963g.b(wm1Var4.B()));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (et1 e13) {
                    throw new GeneralSecurityException("Parsing Ed25519Parameters failed: ", e13);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.aj1
    public lj1 h(ff1 ff1Var) throws GeneralSecurityException {
        switch (this.f20432a) {
            case 7:
                vj1 vj1Var = (vj1) ff1Var;
                zi1 zi1Var = hk1.f15318a;
                vm1 vm1VarD = wm1.D();
                vm1VarD.h("type.googleapis.com/google.crypto.tink.AesCmacKey");
                sk1 sk1VarC = tk1.C();
                uk1 uk1VarA = vk1.A();
                int i10 = vj1Var.f21190b;
                uk1VarA.b();
                ((vk1) uk1VarA.f19193b).C(i10);
                vk1 vk1Var = (vk1) uk1VarA.e();
                sk1VarC.b();
                ((tk1) sk1VarC.f19193b).E(vk1Var);
                int i11 = vj1Var.f21189a;
                sk1VarC.b();
                ((tk1) sk1VarC.f19193b).D(i11);
                vm1VarD.i(((tk1) sk1VarC.e()).a());
                vm1VarD.j(hk1.a(vj1Var.f21191c));
                return lj1.f((wm1) vm1VarD.e());
            case 11:
                bk1 bk1Var = (bk1) ff1Var;
                w50 w50Var = kk1.f16471a;
                vm1 vm1VarD2 = wm1.D();
                vm1VarD2.h("type.googleapis.com/google.crypto.tink.HmacKey");
                pm1 pm1VarD = qm1.D();
                rm1 rm1VarB = sm1.B();
                int i12 = bk1Var.f12815b;
                rm1VarB.b();
                ((sm1) rm1VarB.f19193b).E(i12);
                mm1 mm1Var = (mm1) kk1.f16472b.a(bk1Var.f12817d);
                rm1VarB.b();
                ((sm1) rm1VarB.f19193b).D(mm1Var);
                sm1 sm1Var = (sm1) rm1VarB.e();
                pm1VarD.b();
                ((qm1) pm1VarD.f19193b).F(sm1Var);
                int i13 = bk1Var.f12814a;
                pm1VarD.b();
                ((qm1) pm1VarD.f19193b).G(i13);
                vm1VarD2.i(((qm1) pm1VarD.e()).a());
                vm1VarD2.j((on1) kk1.f16471a.a(bk1Var.f12816c));
                return lj1.f((wm1) vm1VarD2.e());
            default:
                ro1 ro1Var = (ro1) ff1Var;
                zi1 zi1Var2 = up1.f20850a;
                vm1 vm1VarD3 = wm1.D();
                vm1VarD3.h("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
                zl1 zl1VarB = am1.B();
                cm1 cm1VarE = up1.e(ro1Var);
                zl1VarB.b();
                ((am1) zl1VarB.f19193b).C(cm1VarE);
                vm1VarD3.i(((am1) zl1VarB.e()).a());
                vm1VarD3.j(up1.a(ro1Var.f19633d));
                return lj1.f((wm1) vm1VarD3.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.fj1, com.google.android.gms.internal.ads.ii1
    public Object c(jc1 jc1Var) throws GeneralSecurityException {
        KeyFactory keyFactory;
        KeyFactory keyFactory2;
        KeyFactory keyFactory3;
        hf1 hf1VarB;
        int i10 = this.f20432a;
        on1 on1Var = on1.LEGACY;
        switch (i10) {
            case 0:
                sj1 sj1Var = (sj1) jc1Var;
                ej1 ej1Var = uj1.f20807a;
                if (sj1Var.f19982b.f21189a == 32) {
                    return new vq1(sj1Var);
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            case 1:
                ik1 ik1Var = new ik1();
                if (jc1.e(2)) {
                    return ik1Var;
                }
                throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
            case 2:
                return new vq1((xj1) jc1Var);
            case 3:
                kj1 kj1Var = ((ni1) jc1Var).f17836b;
                int[] iArr = li1.f17010b;
                int i11 = kj1Var.f16462a;
                Integer num = (Integer) kj1Var.f16467f;
                int i12 = iArr[v0.i.c(i11)];
                int iOrdinal = ((on1) kj1Var.f16466e).ordinal();
                if (iOrdinal == 1) {
                    wi1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    wi1.a(num.intValue()).b();
                } else if (iOrdinal == 3) {
                    wi1.f21526a.b();
                } else {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                    wi1.a(num.intValue()).b();
                }
                return new lk1();
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            default:
                pp1 pp1Var = (pp1) jc1Var;
                w50 w50Var = yq1.f22350a;
                try {
                    return fq1.d(pp1Var);
                } catch (NoSuchProviderException unused) {
                    KeyFactory keyFactory4 = (KeyFactory) qq1.f19168g.f19169a.zza("RSA");
                    BigInteger bigInteger = pp1Var.f18758c;
                    np1 np1Var = pp1Var.f18757b;
                    RSAPublicKey rSAPublicKey = (RSAPublicKey) keyFactory4.generatePublic(new RSAPublicKeySpec(bigInteger, np1Var.f17885b));
                    w50 w50Var2 = yq1.f22350a;
                    return new xq1(rSAPublicKey, (sq1) w50Var2.a(np1Var.f17887d), (sq1) w50Var2.a(np1Var.f17888e), np1Var.f17889f, pp1Var.f18759d.b(), np1Var.f17886c.equals(mp1.f17510d) ? yq1.f22352c : yq1.f22351b);
                }
            case 13:
                so1 so1Var = (so1) jc1Var;
                Provider providerD = v71.d();
                sq1 sq1Var = (sq1) vp1.f21233i.a(so1Var.f20014b.f20450b.f19632c);
                w50 w50Var3 = vp1.f21234j;
                to1 to1Var = so1Var.f20014b;
                ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec((BigInteger) so1Var.f20015c.f21612b, vc1.f((mq1) vp1.f21235k.a(to1Var.f20450b.f19631b)));
                if (providerD != null) {
                    keyFactory = KeyFactory.getInstance("EC", providerD);
                } else {
                    keyFactory = (KeyFactory) qq1.f19168g.f19169a.zza("EC");
                }
                to1Var.f20452d.b();
                yp1 yp1Var = new yp1();
                if (jc1.e(2)) {
                    ic1.f(sq1Var);
                    sq1Var.toString().concat("withECDSA");
                    return yp1Var;
                }
                throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
            case 14:
                to1 to1Var2 = (to1) jc1Var;
                byte[] bArr = vp1.f21231g;
                Provider providerD2 = v71.d();
                w50 w50Var4 = vp1.f21235k;
                ro1 ro1Var = to1Var2.f20450b;
                ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(to1Var2.f20451c, vc1.f((mq1) w50Var4.a(ro1Var.f19631b)));
                if (providerD2 != null) {
                    keyFactory2 = KeyFactory.getInstance("EC", providerD2);
                } else {
                    keyFactory2 = (KeyFactory) qq1.f19168g.f19169a.zza("EC");
                }
                return new vp1((ECPublicKey) keyFactory2.generatePublic(eCPublicKeySpec), (sq1) vp1.f21233i.a(ro1Var.f19632c), (nq1) vp1.f21234j.a(ro1Var.f19630a), to1Var2.f20452d.b(), ro1Var.f19633d.equals(xf1.f21861m) ? vp1.f21232h : vp1.f21231g, providerD2);
            case 15:
                xo1 xo1Var = (xo1) jc1Var;
                if (jc1.e(1)) {
                    try {
                        return yp1.a(xo1Var);
                    } catch (GeneralSecurityException unused2) {
                        uo0 uo0Var = xo1Var.f21948c;
                        zo1 zo1Var = xo1Var.f21947b;
                        byte[] bArrB = ((zq1) uo0Var.f20839b).b();
                        zo1Var.f22684d.b();
                        yp1 yp1Var2 = new yp1();
                        if (jc1.e(1)) {
                            if (bArrB.length == 32) {
                                pi1.m(pi1.v(bArrB));
                                return yp1Var2;
                            }
                            throw new IllegalArgumentException("Given private key's length is not 32");
                        }
                        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 16:
                zo1 zo1Var2 = (zo1) jc1Var;
                if (jc1.e(1)) {
                    try {
                        return zp1.b(zo1Var2);
                    } catch (GeneralSecurityException unused3) {
                        return new aq1(zo1Var2.f22683c.b(), zo1Var2.f22684d.b(), zo1Var2.f22682b.f21561a.equals(vo1.f21224d) ? new byte[]{0} : new byte[0]);
                    }
                }
                throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
            case 17:
                kj1 kj1Var2 = ((ni1) jc1Var).f17836b;
                int i13 = li1.f17010b[v0.i.c(kj1Var2.f16462a)];
                aq1.c(kj1Var2);
                ((on1) kj1Var2.f16466e).equals(on1Var);
                return new yp1();
            case 18:
                kj1 kj1Var3 = ((ni1) jc1Var).f17836b;
                int i14 = li1.f17010b[v0.i.c(kj1Var3.f16462a)];
                return new aq1((hf1) ei1.f13985d.b(hf1.class, (String) kj1Var3.f16463b).a((cs1) kj1Var3.f16465d), aq1.c(kj1Var3), ((on1) kj1Var3.f16466e).equals(on1Var) ? new byte[]{0} : new byte[0]);
            case 19:
                hp1 hp1Var = (hp1) jc1Var;
                int i15 = rj1.f19601a;
                if (Objects.equals(System.getProperty("java.vendor"), "The Android Project")) {
                    (!Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT)).getClass();
                }
                Provider providerD3 = v71.d();
                if (providerD3 != null) {
                    keyFactory3 = KeyFactory.getInstance("RSA", providerD3);
                } else {
                    keyFactory3 = (KeyFactory) qq1.f19168g.f19169a.zza("RSA");
                }
                ip1 ip1Var = hp1Var.f15353b;
                BigInteger bigInteger2 = ip1Var.f15814c;
                gp1 gp1Var = ip1Var.f15813b;
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyFactory3.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger2, gp1Var.f14927b, (BigInteger) hp1Var.f15354c.f21612b, (BigInteger) hp1Var.f15355d.f21612b, (BigInteger) hp1Var.f15356e.f21612b, (BigInteger) hp1Var.f15357f.f21612b, (BigInteger) hp1Var.f15358g.f21612b, (BigInteger) hp1Var.f15359h.f21612b));
                if (providerD3 != null) {
                    hf1VarB = dq1.c(ip1Var, providerD3);
                } else {
                    hf1VarB = wq1.b(ip1Var);
                }
                cq1 cq1Var = new cq1(rSAPrivateCrtKey, gp1Var.f14929d, ip1Var.f15815d.b(), gp1Var.f14928c.equals(fp1.f14503d) ? cq1.f13234h : cq1.f13233g, hf1VarB, providerD3);
                String str = cq1Var.f13237b;
                Provider provider = cq1Var.f13241f;
                Signature signature = provider != null ? Signature.getInstance(str, provider) : (Signature) qq1.f19165d.f19169a.zza(str);
                signature.initSign(cq1Var.f13236a);
                byte[] bArr2 = cq1.f13235i;
                signature.update(bArr2);
                byte[] bArr3 = cq1Var.f13239d;
                if (bArr3.length > 0) {
                    signature.update(bArr3);
                }
                byte[] bArrSign = signature.sign();
                byte[] bArr4 = cq1Var.f13238c;
                if (bArr4.length > 0) {
                    bArrSign = jc1.f(bArr4, bArrSign);
                }
                try {
                    cq1Var.f13240e.a(bArrSign, bArr2);
                    return cq1Var;
                } catch (GeneralSecurityException e10) {
                    throw new IllegalStateException("RSA signature computation error", e10);
                }
            case 20:
                return wq1.b((ip1) jc1Var);
            case 21:
                op1 op1Var = (op1) jc1Var;
                try {
                    return yp1.b(op1Var);
                } catch (NoSuchProviderException unused4) {
                    KeyFactory keyFactory5 = (KeyFactory) qq1.f19168g.f19169a.zza("RSA");
                    pp1 pp1Var2 = op1Var.f18319b;
                    pp1 pp1Var3 = op1Var.f18319b;
                    BigInteger bigInteger3 = pp1Var2.f18758c;
                    np1 np1Var2 = pp1Var3.f18757b;
                    np1 np1Var3 = pp1Var3.f18757b;
                    RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyFactory5.generatePrivate(new RSAPrivateCrtKeySpec(bigInteger3, np1Var2.f17885b, (BigInteger) op1Var.f18320c.f21612b, (BigInteger) op1Var.f18321d.f21612b, (BigInteger) op1Var.f18322e.f21612b, (BigInteger) op1Var.f18323f.f21612b, (BigInteger) op1Var.f18324g.f21612b, (BigInteger) op1Var.f18325h.f21612b));
                    w50 w50Var5 = yq1.f22350a;
                    sq1 sq1Var2 = (sq1) w50Var5.a(np1Var3.f17887d);
                    sq1 sq1Var3 = (sq1) w50Var5.a(np1Var3.f17888e);
                    pp1Var3.f18759d.b();
                    yp1 yp1Var3 = new yp1();
                    if (!uh1.a()) {
                        ic1.f(sq1Var2);
                        if (sq1Var2.equals(sq1Var3)) {
                            ic1.i(rSAPrivateCrtKey2.getModulus().bitLength());
                            ic1.k(rSAPrivateCrtKey2.getPublicExponent());
                            return yp1Var3;
                        }
                        throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
                    }
                    throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
                }
        }
    }
}
