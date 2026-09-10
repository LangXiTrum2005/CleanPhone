package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wp1 implements ii1, gi1, aj1, yi1, rq1, nt1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21565b = new wp1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21566c = new wp1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21567d = new wp1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21568e = new wp1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21569f = new wp1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21570g = new wp1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21571h = new wp1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21572i = new wp1(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21573j = new wp1(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21574k = new wp1(9);
    public static final /* synthetic */ wp1 l = new wp1(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21575m = new wp1(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21576n = new wp1(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21577o = new wp1(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21578p = new wp1(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21579q = new wp1(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ wp1 f21580r = new wp1(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21581a;

    public /* synthetic */ wp1(int i10) {
        this.f21581a = i10;
    }

    public static final at1 f(long j10, Object obj) {
        at1 at1Var = (at1) nu1.k(j10, obj);
        if (((sr1) at1Var).f20043a) {
            return at1Var;
        }
        int size = at1Var.size();
        at1 at1VarE = at1Var.e(size == 0 ? 10 : size + size);
        nu1.l(obj, j10, at1VarE);
        return at1VarE;
    }

    public static final lt1 i(Object obj, Object obj2) {
        lt1 lt1VarG = (lt1) obj;
        lt1 lt1Var = (lt1) obj2;
        if (!lt1Var.isEmpty()) {
            if (!lt1VarG.f17126a) {
                lt1VarG = lt1VarG.g();
            }
            lt1VarG.i();
            if (!lt1Var.isEmpty()) {
                lt1VarG.putAll(lt1Var);
            }
        }
        return lt1VarG;
    }

    @Override // com.google.android.gms.internal.ads.nt1
    public boolean a(Class cls) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.nt1
    public xt1 b(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // com.google.android.gms.internal.ads.ii1
    public kj1 c(jc1 jc1Var) {
        switch (this.f21581a) {
            case 0:
                zo1 zo1Var = (zo1) jc1Var;
                return kj1.t("type.googleapis.com/google.crypto.tink.Ed25519PublicKey", xp1.a(zo1Var).a(), 4, (on1) xp1.f21963g.a(zo1Var.f22682b.f21561a), zo1Var.f22685e);
            case 2:
                xo1 xo1Var = (xo1) jc1Var;
                zi1 zi1Var = xp1.f21957a;
                im1 im1VarD = jm1.D();
                lm1 lm1VarA = xp1.a(xo1Var.f21947b);
                im1VarD.b();
                ((jm1) im1VarD.f19193b).G(lm1VarA);
                byte[] bArrB = ((zq1) xo1Var.f21948c.f20839b).b();
                as1 as1VarD = cs1.D(bArrB, 0, bArrB.length);
                im1VarD.b();
                ((jm1) im1VarD.f19193b).F(as1VarD);
                as1 as1VarA = ((jm1) im1VarD.e()).a();
                w50 w50Var = xp1.f21963g;
                zo1 zo1Var2 = xo1Var.f21947b;
                return kj1.t("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey", as1VarA, 3, (on1) w50Var.a(zo1Var2.f22682b.f21561a), zo1Var2.f22685e);
            case 6:
                ip1 ip1Var = (ip1) jc1Var;
                return kj1.t("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey", bq1.a(ip1Var).a(), 4, (on1) bq1.f12855g.a(ip1Var.f15813b.f14928c), ip1Var.f15816e);
            case 8:
                hp1 hp1Var = (hp1) jc1Var;
                zi1 zi1Var2 = bq1.f12849a;
                un1 un1VarI = vn1.I();
                un1VarI.b();
                ((vn1) un1VarI.f19193b).K();
                xn1 xn1VarA = bq1.a(hp1Var.f15353b);
                un1VarI.b();
                ((vn1) un1VarI.f19193b).L(xn1VarA);
                byte[] bArrE = jd1.e((BigInteger) hp1Var.f15354c.f21612b);
                as1 as1Var = cs1.f13248b;
                as1 as1VarD2 = cs1.D(bArrE, 0, bArrE.length);
                un1VarI.b();
                ((vn1) un1VarI.f19193b).M(as1VarD2);
                byte[] bArrE2 = jd1.e((BigInteger) hp1Var.f15355d.f21612b);
                as1 as1VarD3 = cs1.D(bArrE2, 0, bArrE2.length);
                un1VarI.b();
                ((vn1) un1VarI.f19193b).N(as1VarD3);
                byte[] bArrE3 = jd1.e((BigInteger) hp1Var.f15356e.f21612b);
                as1 as1VarD4 = cs1.D(bArrE3, 0, bArrE3.length);
                un1VarI.b();
                ((vn1) un1VarI.f19193b).O(as1VarD4);
                byte[] bArrE4 = jd1.e((BigInteger) hp1Var.f15357f.f21612b);
                as1 as1VarD5 = cs1.D(bArrE4, 0, bArrE4.length);
                un1VarI.b();
                ((vn1) un1VarI.f19193b).P(as1VarD5);
                byte[] bArrE5 = jd1.e((BigInteger) hp1Var.f15358g.f21612b);
                as1 as1VarD6 = cs1.D(bArrE5, 0, bArrE5.length);
                un1VarI.b();
                ((vn1) un1VarI.f19193b).Q(as1VarD6);
                byte[] bArrE6 = jd1.e((BigInteger) hp1Var.f15359h.f21612b);
                as1 as1VarD7 = cs1.D(bArrE6, 0, bArrE6.length);
                un1VarI.b();
                ((vn1) un1VarI.f19193b).R(as1VarD7);
                as1 as1VarA2 = ((vn1) un1VarI.e()).a();
                w50 w50Var2 = bq1.f12855g;
                ip1 ip1Var2 = hp1Var.f15353b;
                return kj1.t("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey", as1VarA2, 3, (on1) w50Var2.a(ip1Var2.f15813b.f14928c), ip1Var2.f15816e);
            case 12:
                pp1 pp1Var = (pp1) jc1Var;
                return kj1.t("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey", eq1.b(pp1Var).a(), 4, (on1) eq1.f14056g.a(pp1Var.f18757b.f17886c), pp1Var.f18760e);
            default:
                op1 op1Var = (op1) jc1Var;
                zi1 zi1Var3 = eq1.f14050a;
                co1 co1VarI = do1.I();
                co1VarI.b();
                ((do1) co1VarI.f19193b).K();
                fo1 fo1VarB = eq1.b(op1Var.f18319b);
                co1VarI.b();
                ((do1) co1VarI.f19193b).L(fo1VarB);
                byte[] bArrE7 = jd1.e((BigInteger) op1Var.f18320c.f21612b);
                as1 as1Var2 = cs1.f13248b;
                as1 as1VarD8 = cs1.D(bArrE7, 0, bArrE7.length);
                co1VarI.b();
                ((do1) co1VarI.f19193b).M(as1VarD8);
                byte[] bArrE8 = jd1.e((BigInteger) op1Var.f18321d.f21612b);
                as1 as1VarD9 = cs1.D(bArrE8, 0, bArrE8.length);
                co1VarI.b();
                ((do1) co1VarI.f19193b).N(as1VarD9);
                byte[] bArrE9 = jd1.e((BigInteger) op1Var.f18322e.f21612b);
                as1 as1VarD10 = cs1.D(bArrE9, 0, bArrE9.length);
                co1VarI.b();
                ((do1) co1VarI.f19193b).O(as1VarD10);
                byte[] bArrE10 = jd1.e((BigInteger) op1Var.f18323f.f21612b);
                as1 as1VarD11 = cs1.D(bArrE10, 0, bArrE10.length);
                co1VarI.b();
                ((do1) co1VarI.f19193b).P(as1VarD11);
                byte[] bArrE11 = jd1.e((BigInteger) op1Var.f18324g.f21612b);
                as1 as1VarD12 = cs1.D(bArrE11, 0, bArrE11.length);
                co1VarI.b();
                ((do1) co1VarI.f19193b).Q(as1VarD12);
                byte[] bArrE12 = jd1.e((BigInteger) op1Var.f18325h.f21612b);
                as1 as1VarD13 = cs1.D(bArrE12, 0, bArrE12.length);
                co1VarI.b();
                ((do1) co1VarI.f19193b).R(as1VarD13);
                as1 as1VarA3 = ((do1) co1VarI.e()).a();
                w50 w50Var3 = eq1.f14056g;
                pp1 pp1Var2 = op1Var.f18319b;
                return kj1.t("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey", as1VarA3, 3, (on1) w50Var3.a(pp1Var2.f18757b.f17886c), pp1Var2.f18760e);
        }
    }

    @Override // com.google.android.gms.internal.ads.gi1
    public jc1 d(kj1 kj1Var) throws GeneralSecurityException {
        int i10 = 11;
        int i11 = 12;
        boolean z10 = false;
        switch (this.f21581a) {
            case 1:
                zi1 zi1Var = xp1.f21957a;
                String str = (String) kj1Var.f16463b;
                if (!str.equals("type.googleapis.com/google.crypto.tink.Ed25519PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str)));
                }
                try {
                    cs1 cs1Var = (cs1) kj1Var.f16465d;
                    ks1 ks1Var = ks1.f16518a;
                    int i12 = tr1.f20473a;
                    lm1 lm1VarB = lm1.B(cs1Var, ks1.f16519b);
                    if (lm1VarB.z() == 0) {
                        return zo1.k((vo1) xp1.f21963g.b((on1) kj1Var.f16466e), zq1.a(lm1VarB.A().h()), (Integer) kj1Var.f16467f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (et1 unused) {
                    throw new GeneralSecurityException("Parsing Ed25519PublicKey failed");
                }
            case 3:
                zi1 zi1Var2 = xp1.f21957a;
                String str2 = (String) kj1Var.f16463b;
                if (!str2.equals("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to Ed25519ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str2)));
                }
                try {
                    cs1 cs1Var2 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var2 = ks1.f16518a;
                    int i13 = tr1.f20473a;
                    jm1 jm1VarC = jm1.C(cs1Var2, ks1.f16519b);
                    if (jm1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    lm1 lm1VarB2 = jm1VarC.B();
                    if (lm1VarB2.z() == 0) {
                        return xo1.k(zo1.k((vo1) xp1.f21963g.b((on1) kj1Var.f16466e), zq1.a(lm1VarB2.A().h()), (Integer) kj1Var.f16467f), new uo0(zq1.a(jm1VarC.A().h()), 13));
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (et1 unused2) {
                    throw new GeneralSecurityException("Parsing Ed25519PrivateKey failed");
                }
            case 7:
                zi1 zi1Var3 = bq1.f12849a;
                String str3 = (String) kj1Var.f16463b;
                if (!str3.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePublicKey: ".concat(String.valueOf(str3)));
                }
                try {
                    cs1 cs1Var3 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var3 = ks1.f16518a;
                    int i14 = tr1.f20473a;
                    xn1 xn1VarD = xn1.D(cs1Var3, ks1.f16519b);
                    if (xn1VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger = new BigInteger(1, xn1VarD.B().h());
                    int iBitLength = bigInteger.bitLength();
                    BigInteger bigInteger2 = gp1.f14925e;
                    dp1 dp1Var = new dp1();
                    dp1Var.f13620c = (ep1) bq1.f12856h.b(xn1VarD.A().z());
                    dp1Var.f13619b = new BigInteger(1, xn1VarD.C().h());
                    dp1Var.a(iBitLength);
                    dp1Var.f13621d = (fp1) bq1.f12855g.b((on1) kj1Var.f16466e);
                    gp1 gp1VarB = dp1Var.b();
                    ay0 ay0Var = new ay0(i10, z10);
                    ay0Var.f12537b = gp1VarB;
                    ay0Var.f12538c = bigInteger;
                    ay0Var.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var.p();
                } catch (et1 | IllegalArgumentException unused3) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PublicKey failed");
                }
            case 9:
                zi1 zi1Var4 = bq1.f12849a;
                String str4 = (String) kj1Var.f16463b;
                if (!str4.equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str4)));
                }
                try {
                    cs1 cs1Var4 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var4 = ks1.f16518a;
                    int i15 = tr1.f20473a;
                    vn1 vn1VarH = vn1.H(cs1Var4, ks1.f16519b);
                    if (vn1VarH.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    xn1 xn1VarA = vn1VarH.A();
                    if (xn1VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger3 = new BigInteger(1, xn1VarA.B().h());
                    int iBitLength2 = bigInteger3.bitLength();
                    BigInteger bigInteger4 = new BigInteger(1, xn1VarA.C().h());
                    BigInteger bigInteger5 = gp1.f14925e;
                    dp1 dp1Var2 = new dp1();
                    dp1Var2.f13620c = (ep1) bq1.f12856h.b(xn1VarA.A().z());
                    dp1Var2.f13619b = bigInteger4;
                    dp1Var2.a(iBitLength2);
                    dp1Var2.f13621d = (fp1) bq1.f12855g.b((on1) kj1Var.f16466e);
                    gp1 gp1VarB2 = dp1Var2.b();
                    ay0 ay0Var2 = new ay0(i10, z10);
                    ay0Var2.f12537b = gp1VarB2;
                    ay0Var2.f12538c = bigInteger3;
                    ay0Var2.f12539d = (Integer) kj1Var.f16467f;
                    ip1 ip1VarP = ay0Var2.p();
                    a8 a8Var = new a8(z10);
                    a8Var.f11925a = ip1VarP;
                    wv0 wv0VarB = bq1.b(vn1VarH.C());
                    wv0 wv0VarB2 = bq1.b(vn1VarH.D());
                    a8Var.f11927c = wv0VarB;
                    a8Var.f11928d = wv0VarB2;
                    a8Var.f11926b = bq1.b(vn1VarH.B());
                    wv0 wv0VarB3 = bq1.b(vn1VarH.E());
                    wv0 wv0VarB4 = bq1.b(vn1VarH.F());
                    a8Var.f11929e = wv0VarB3;
                    a8Var.f11930f = wv0VarB4;
                    a8Var.f11931g = bq1.b(vn1VarH.G());
                    return a8Var.g();
                } catch (et1 | IllegalArgumentException unused4) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1PrivateKey failed");
                }
            case 13:
                zi1 zi1Var5 = eq1.f14050a;
                String str5 = (String) kj1Var.f16463b;
                if (!str5.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePublicKey: ".concat(String.valueOf(str5)));
                }
                try {
                    cs1 cs1Var5 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var5 = ks1.f16518a;
                    int i16 = tr1.f20473a;
                    fo1 fo1VarD = fo1.D(cs1Var5, ks1.f16519b);
                    if (fo1VarD.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger6 = new BigInteger(1, fo1VarD.B().h());
                    int iBitLength3 = bigInteger6.bitLength();
                    BigInteger bigInteger7 = np1.f17883g;
                    kp1 kp1Var = new kp1();
                    w50 w50Var = eq1.f14057h;
                    kp1Var.f16504c = (lp1) w50Var.b(fo1VarD.A().z());
                    kp1Var.f16505d = (lp1) w50Var.b(fo1VarD.A().A());
                    kp1Var.f16503b = new BigInteger(1, fo1VarD.C().h());
                    kp1Var.a(iBitLength3);
                    kp1Var.b(fo1VarD.A().B());
                    kp1Var.f16507f = (mp1) eq1.f14056g.b((on1) kj1Var.f16466e);
                    np1 np1VarC = kp1Var.c();
                    ay0 ay0Var3 = new ay0(i11, z10);
                    ay0Var3.f12537b = np1VarC;
                    ay0Var3.f12538c = bigInteger6;
                    ay0Var3.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var3.q();
                } catch (et1 | IllegalArgumentException unused5) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPublicKey failed");
                }
            default:
                zi1 zi1Var6 = eq1.f14050a;
                String str6 = (String) kj1Var.f16463b;
                if (!str6.equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parsePrivateKey: ".concat(String.valueOf(str6)));
                }
                try {
                    cs1 cs1Var6 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var6 = ks1.f16518a;
                    int i17 = tr1.f20473a;
                    do1 do1VarH = do1.H(cs1Var6, ks1.f16519b);
                    if (do1VarH.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    fo1 fo1VarA = do1VarH.A();
                    if (fo1VarA.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    BigInteger bigInteger8 = new BigInteger(1, fo1VarA.B().h());
                    int iBitLength4 = bigInteger8.bitLength();
                    BigInteger bigInteger9 = new BigInteger(1, fo1VarA.C().h());
                    BigInteger bigInteger10 = np1.f17883g;
                    kp1 kp1Var2 = new kp1();
                    w50 w50Var2 = eq1.f14057h;
                    kp1Var2.f16504c = (lp1) w50Var2.b(fo1VarA.A().z());
                    kp1Var2.f16505d = (lp1) w50Var2.b(fo1VarA.A().A());
                    kp1Var2.f16503b = bigInteger9;
                    kp1Var2.a(iBitLength4);
                    kp1Var2.b(fo1VarA.A().B());
                    kp1Var2.f16507f = (mp1) eq1.f14056g.b((on1) kj1Var.f16466e);
                    np1 np1VarC2 = kp1Var2.c();
                    ay0 ay0Var4 = new ay0(i11, z10);
                    ay0Var4.f12537b = np1VarC2;
                    ay0Var4.f12538c = bigInteger8;
                    ay0Var4.f12539d = (Integer) kj1Var.f16467f;
                    pp1 pp1VarQ = ay0Var4.q();
                    a8 a8Var2 = new a8(z10);
                    a8Var2.f11925a = pp1VarQ;
                    wv0 wv0VarC = eq1.c(do1VarH.C());
                    wv0 wv0VarC2 = eq1.c(do1VarH.D());
                    a8Var2.f11927c = wv0VarC;
                    a8Var2.f11928d = wv0VarC2;
                    a8Var2.f11926b = eq1.c(do1VarH.B());
                    wv0 wv0VarC3 = eq1.c(do1VarH.E());
                    wv0 wv0VarC4 = eq1.c(do1VarH.F());
                    a8Var2.f11929e = wv0VarC3;
                    a8Var2.f11930f = wv0VarC4;
                    a8Var2.f11931g = eq1.c(do1VarH.G());
                    return a8Var2.h();
                } catch (et1 | IllegalArgumentException unused6) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssPrivateKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.rq1
    public /* bridge */ /* synthetic */ Object e(String str, Provider provider) {
        switch (this.f21581a) {
            case 17:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 18:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 19:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 20:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 21:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 22:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    @Override // com.google.android.gms.internal.ads.yi1
    public ff1 g(lj1 lj1Var) throws GeneralSecurityException {
        switch (this.f21581a) {
            case 5:
                zi1 zi1Var = bq1.f12849a;
                wm1 wm1Var = (wm1) lj1Var.f17037c;
                if (!wm1Var.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPkcs1ProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var.z())));
                }
                try {
                    cs1 cs1VarA = wm1Var.A();
                    ks1 ks1Var = ks1.f16518a;
                    int i10 = tr1.f20473a;
                    rn1 rn1VarC = rn1.C(cs1VarA, ks1.f16519b);
                    BigInteger bigInteger = gp1.f14925e;
                    dp1 dp1Var = new dp1();
                    dp1Var.f13620c = (ep1) bq1.f12856h.b(rn1VarC.z().z());
                    dp1Var.f13619b = new BigInteger(1, rn1VarC.B().h());
                    dp1Var.a(rn1VarC.A());
                    dp1Var.f13621d = (fp1) bq1.f12855g.b(wm1Var.B());
                    return dp1Var.b();
                } catch (et1 e10) {
                    throw new GeneralSecurityException("Parsing RsaSsaPkcs1Parameters failed: ", e10);
                }
            default:
                zi1 zi1Var2 = eq1.f14050a;
                wm1 wm1Var2 = (wm1) lj1Var.f17037c;
                if (!wm1Var2.z().equals("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to RsaSsaPssProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var2.z())));
                }
                try {
                    cs1 cs1VarA2 = wm1Var2.A();
                    ks1 ks1Var2 = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    zn1 zn1VarC = zn1.C(cs1VarA2, ks1.f16519b);
                    BigInteger bigInteger2 = np1.f17883g;
                    kp1 kp1Var = new kp1();
                    w50 w50Var = eq1.f14057h;
                    kp1Var.f16504c = (lp1) w50Var.b(zn1VarC.z().z());
                    kp1Var.f16505d = (lp1) w50Var.b(zn1VarC.z().A());
                    kp1Var.f16503b = new BigInteger(1, zn1VarC.B().h());
                    kp1Var.a(zn1VarC.A());
                    kp1Var.b(zn1VarC.z().B());
                    kp1Var.f16507f = (mp1) eq1.f14056g.b(wm1Var2.B());
                    return kp1Var.c();
                } catch (et1 e11) {
                    throw new GeneralSecurityException("Parsing RsaSsaPssParameters failed: ", e11);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.aj1
    public lj1 h(ff1 ff1Var) {
        switch (this.f21581a) {
            case 4:
                zi1 zi1Var = xp1.f21957a;
                vm1 vm1VarD = wm1.D();
                vm1VarD.h("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
                vm1VarD.i(hm1.B().a());
                vm1VarD.j((on1) xp1.f21963g.a(((wo1) ff1Var).f21561a));
                return lj1.f((wm1) vm1VarD.e());
            case 10:
                gp1 gp1Var = (gp1) ff1Var;
                zi1 zi1Var2 = bq1.f12849a;
                vm1 vm1VarD2 = wm1.D();
                vm1VarD2.h("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
                qn1 qn1VarD = rn1.D();
                sn1 sn1VarA = tn1.A();
                mm1 mm1Var = (mm1) bq1.f12856h.a(gp1Var.f14929d);
                sn1VarA.b();
                ((tn1) sn1VarA.f19193b).C(mm1Var);
                tn1 tn1Var = (tn1) sn1VarA.e();
                qn1VarD.b();
                ((rn1) qn1VarD.f19193b).E(tn1Var);
                int i10 = gp1Var.f14926a;
                qn1VarD.b();
                ((rn1) qn1VarD.f19193b).F(i10);
                byte[] bArrE = jd1.e(gp1Var.f14927b);
                as1 as1Var = cs1.f13248b;
                as1 as1VarD = cs1.D(bArrE, 0, bArrE.length);
                qn1VarD.b();
                ((rn1) qn1VarD.f19193b).G(as1VarD);
                vm1VarD2.i(((rn1) qn1VarD.e()).a());
                vm1VarD2.j((on1) bq1.f12855g.a(gp1Var.f14928c));
                return lj1.f((wm1) vm1VarD2.e());
            default:
                np1 np1Var = (np1) ff1Var;
                zi1 zi1Var3 = eq1.f14050a;
                vm1 vm1VarD3 = wm1.D();
                vm1VarD3.h("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
                yn1 yn1VarD = zn1.D();
                bo1 bo1VarA = eq1.a(np1Var);
                yn1VarD.b();
                ((zn1) yn1VarD.f19193b).E(bo1VarA);
                int i11 = np1Var.f17884a;
                yn1VarD.b();
                ((zn1) yn1VarD.f19193b).F(i11);
                byte[] bArrE2 = jd1.e(np1Var.f17885b);
                as1 as1Var2 = cs1.f13248b;
                as1 as1VarD2 = cs1.D(bArrE2, 0, bArrE2.length);
                yn1VarD.b();
                ((zn1) yn1VarD.f19193b).G(as1VarD2);
                vm1VarD3.i(((zn1) yn1VarD.e()).a());
                vm1VarD3.j((on1) eq1.f14056g.a(np1Var.f17886c));
                return lj1.f((wm1) vm1VarD3.e());
        }
    }
}
