package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.RSAKeyGenParameterSpec;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pf1 implements di1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18625b = new pf1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18626c = new pf1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18627d = new pf1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18628e = new pf1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18629f = new pf1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18630g = new pf1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18631h = new pf1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18632i = new pf1(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18633j = new pf1(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18634k = new pf1(9);
    public static final /* synthetic */ pf1 l = new pf1(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18635m = new pf1(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18636n = new pf1(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18637o = new pf1(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18638p = new pf1(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ pf1 f18639q = new pf1(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18640a;

    public /* synthetic */ pf1(int i10) {
        this.f18640a = i10;
    }

    @Override // com.google.android.gms.internal.ads.di1
    public final jc1 a(ff1 ff1Var, Integer num) throws GeneralSecurityException {
        int i10 = 0;
        switch (this.f18640a) {
            case 0:
                uf1 uf1Var = (uf1) ff1Var;
                ej1 ej1Var = rf1.f19579a;
                int i11 = uf1Var.f20764a;
                if (i11 != 16 && i11 != 32) {
                    throw new GeneralSecurityException("AES key size must be 16 or 32 bytes");
                }
                hz hzVar = new hz(15);
                hzVar.f15433b = uf1Var;
                hzVar.f15436e = num;
                hzVar.f15434c = uo0.k(i11);
                hzVar.f15435d = uo0.k(uf1Var.f20765b);
                return hzVar.n();
            case 1:
                yf1 yf1Var = (yf1) ff1Var;
                ej1 ej1Var2 = wf1.f21506a;
                int i12 = yf1Var.f22228a;
                if (i12 == 24) {
                    throw new GeneralSecurityException("192 bit AES EAX Parameters are not valid");
                }
                ay0 ay0Var = new ay0(3, false);
                ay0Var.f12537b = yf1Var;
                ay0Var.f12539d = num;
                ay0Var.f12538c = uo0.k(i12);
                return ay0Var.i();
            case 2:
                bg1 bg1Var = (bg1) ff1Var;
                ej1 ej1Var3 = ag1.f12028a;
                int i13 = bg1Var.f12775a;
                if (i13 == 24) {
                    throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
                }
                ay0 ay0Var2 = new ay0(4, false);
                ay0Var2.f12537b = bg1Var;
                ay0Var2.f12539d = num;
                ay0Var2.f12538c = uo0.k(i13);
                return ay0Var2.j();
            case 3:
                eg1 eg1Var = (eg1) ff1Var;
                ej1 ej1Var4 = dg1.f13521a;
                ay0 ay0Var3 = new ay0(5, false);
                ay0Var3.f12537b = eg1Var;
                ay0Var3.f12539d = num;
                ay0Var3.f12538c = uo0.k(eg1Var.f13966a);
                return ay0Var3.k();
            case 4:
                ej1 ej1Var5 = gg1.f14854a;
                return fg1.k(((hg1) ff1Var).f15282a, uo0.k(32), num);
            case 5:
                ej1 ej1Var6 = ig1.f15739a;
                return kg1.k((lg1) ff1Var, num);
            case 6:
                ki1 ki1Var = jg1.f16092a;
                return ng1.k((og1) ff1Var, num);
            case 7:
                return rg1.k((tg1) ff1Var, uo0.k(32), num);
            case 8:
                ej1 ej1Var7 = vg1.f21167a;
                return ug1.k(((wg1) ff1Var).f21512a, uo0.k(32), num);
            case 9:
                qi1 qi1Var = qi1.f19092b;
                wm1 wm1Var = (wm1) ((oi1) ff1Var).f18280a.f17037c;
                ei1 ei1Var = ei1.f13985d;
                ki1 ki1VarD = ei1Var.d(wm1Var.z());
                if (!((Boolean) ei1Var.f13987b.get(wm1Var.z())).booleanValue()) {
                    throw new GeneralSecurityException("Creating new keys is not allowed.");
                }
                cs1 cs1VarA = wm1Var.A();
                ki1VarD.getClass();
                vm1 vm1VarD = wm1.D();
                vm1VarD.h(ki1VarD.f16452a);
                vm1VarD.i(cs1VarA);
                vm1VarD.j(on1.RAW);
                wm1 wm1Var2 = (wm1) vm1VarD.e();
                lj1 lj1Var = new lj1(i10, wm1Var2, rj1.b(wm1Var2.z()));
                vi1 vi1Var = vi1.f21181b;
                kj1 kj1Var = (kj1) vi1Var.f(qi1.f19092b.b(vi1Var.g(lj1Var), null));
                tm1 tm1VarC = um1.C();
                String str = (String) kj1Var.f16463b;
                tm1VarC.b();
                ((um1) tm1VarC.f19193b).E(str);
                cs1 cs1Var = (cs1) kj1Var.f16465d;
                tm1VarC.b();
                ((um1) tm1VarC.f19193b).F(cs1Var);
                int i14 = kj1Var.f16462a;
                tm1VarC.b();
                ((um1) tm1VarC.f19193b).G(i14);
                um1 um1Var = (um1) tm1VarC.e();
                return new ni1(kj1.t(um1Var.z(), um1Var.A(), um1Var.B(), wm1Var.B(), num));
            case 10:
                vj1 vj1Var = (vj1) ff1Var;
                ej1 ej1Var8 = uj1.f20807a;
                int i15 = vj1Var.f21189a;
                if (i15 != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                ay0 ay0Var4 = new ay0(7, false);
                ay0Var4.f12537b = vj1Var;
                ay0Var4.f12538c = uo0.k(i15);
                ay0Var4.f12539d = num;
                return ay0Var4.l();
            case 11:
                bk1 bk1Var = (bk1) ff1Var;
                ej1 ej1Var9 = yj1.f22284a;
                ay0 ay0Var5 = new ay0(9, false);
                ay0Var5.f12537b = bk1Var;
                ay0Var5.f12538c = uo0.k(bk1Var.f12814a);
                ay0Var5.f12539d = num;
                return ay0Var5.n();
            case 12:
                ro1 ro1Var = (ro1) ff1Var;
                ej1 ej1Var10 = uo1.f20840a;
                ECParameterSpec eCParameterSpec = ro1Var.f19631b.f19152b;
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) qq1.f19167f.f19169a.zza("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                ECPublicKey eCPublicKey = (ECPublicKey) keyPairGenerateKeyPair.getPublic();
                ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairGenerateKeyPair.getPrivate();
                ay0 ay0Var6 = new ay0(10, false);
                ay0Var6.f12537b = ro1Var;
                ay0Var6.f12539d = num;
                ay0Var6.f12538c = eCPublicKey.getW();
                to1 to1VarO = ay0Var6.o();
                iw0 iw0Var = new iw0(9);
                iw0Var.f15864b = to1VarO;
                iw0Var.f15865c = new wv0(eCPrivateKey.getS(), 7);
                return iw0Var.s();
            case 13:
                wo1 wo1Var = (wo1) ff1Var;
                ej1 ej1Var11 = yo1.f22338a;
                byte[] bArrA = mj1.a(32);
                if (bArrA.length != 32) {
                    throw new IllegalArgumentException("Given secret seed length is not 32");
                }
                return xo1.k(zo1.k(wo1Var.f21561a, zq1.a(Arrays.copyOf(pi1.m(pi1.v(bArrA)), 32)), num), new uo0(zq1.a(Arrays.copyOf(bArrA, bArrA.length)), 13));
            case 14:
                gp1 gp1Var = (gp1) ff1Var;
                ej1 ej1Var12 = jp1.f16126a;
                KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) qq1.f19167f.f19169a.zza("RSA");
                keyPairGenerator2.initialize(new RSAKeyGenParameterSpec(gp1Var.f14926a, new BigInteger(1, gp1Var.f14927b.toByteArray())));
                KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
                RSAPublicKey rSAPublicKey = (RSAPublicKey) keyPairGenerateKeyPair2.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey = (RSAPrivateCrtKey) keyPairGenerateKeyPair2.getPrivate();
                ay0 ay0Var7 = new ay0(11, false);
                ay0Var7.f12537b = gp1Var;
                ay0Var7.f12538c = rSAPublicKey.getModulus();
                ay0Var7.f12539d = num;
                ip1 ip1VarP = ay0Var7.p();
                a8 a8Var = new a8(false);
                a8Var.f11925a = ip1VarP;
                wv0 wv0Var = new wv0(rSAPrivateCrtKey.getPrimeP(), 7);
                wv0 wv0Var2 = new wv0(rSAPrivateCrtKey.getPrimeQ(), 7);
                a8Var.f11927c = wv0Var;
                a8Var.f11928d = wv0Var2;
                a8Var.f11926b = new wv0(rSAPrivateCrtKey.getPrivateExponent(), 7);
                wv0 wv0Var3 = new wv0(rSAPrivateCrtKey.getPrimeExponentP(), 7);
                wv0 wv0Var4 = new wv0(rSAPrivateCrtKey.getPrimeExponentQ(), 7);
                a8Var.f11929e = wv0Var3;
                a8Var.f11930f = wv0Var4;
                a8Var.f11931g = new wv0(rSAPrivateCrtKey.getCrtCoefficient(), 7);
                return a8Var.g();
            default:
                np1 np1Var = (np1) ff1Var;
                ej1 ej1Var13 = qp1.f19155a;
                KeyPairGenerator keyPairGenerator3 = (KeyPairGenerator) qq1.f19167f.f19169a.zza("RSA");
                keyPairGenerator3.initialize(new RSAKeyGenParameterSpec(np1Var.f17884a, new BigInteger(1, np1Var.f17885b.toByteArray())));
                KeyPair keyPairGenerateKeyPair3 = keyPairGenerator3.generateKeyPair();
                RSAPublicKey rSAPublicKey2 = (RSAPublicKey) keyPairGenerateKeyPair3.getPublic();
                RSAPrivateCrtKey rSAPrivateCrtKey2 = (RSAPrivateCrtKey) keyPairGenerateKeyPair3.getPrivate();
                ay0 ay0Var8 = new ay0(12, false);
                ay0Var8.f12537b = np1Var;
                ay0Var8.f12538c = rSAPublicKey2.getModulus();
                ay0Var8.f12539d = num;
                pp1 pp1VarQ = ay0Var8.q();
                a8 a8Var2 = new a8(false);
                a8Var2.f11925a = pp1VarQ;
                wv0 wv0Var5 = new wv0(rSAPrivateCrtKey2.getPrimeP(), 7);
                wv0 wv0Var6 = new wv0(rSAPrivateCrtKey2.getPrimeQ(), 7);
                a8Var2.f11927c = wv0Var5;
                a8Var2.f11928d = wv0Var6;
                a8Var2.f11926b = new wv0(rSAPrivateCrtKey2.getPrivateExponent(), 7);
                wv0 wv0Var7 = new wv0(rSAPrivateCrtKey2.getPrimeExponentP(), 7);
                wv0 wv0Var8 = new wv0(rSAPrivateCrtKey2.getPrimeExponentQ(), 7);
                a8Var2.f11929e = wv0Var7;
                a8Var2.f11930f = wv0Var8;
                a8Var2.f11931g = new wv0(rSAPrivateCrtKey2.getCrtCoefficient(), 7);
                return a8Var2.h();
        }
    }
}
