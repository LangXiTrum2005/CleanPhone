package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Provider;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg1 implements ii1, gi1, aj1, yi1, fj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21871b = new xg1(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21872c = new xg1(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21873d = new xg1(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21874e = new xg1(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21875f = new xg1(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21876g = new xg1(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21877h = new xg1(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21878i = new xg1(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21879j = new xg1(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21880k = new xg1(9);
    public static final /* synthetic */ xg1 l = new xg1(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21881m = new xg1(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21882n = new xg1(12);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21883o = new xg1(13);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21884p = new xg1(14);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21885q = new xg1(15);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21886r = new xg1(16);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21887s = new xg1(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21888t = new xg1(18);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21889u = new xg1(19);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21890v = new xg1(20);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21891w = new xg1(21);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21892x = new xg1(22);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21893y = new xg1(23);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ xg1 f21894z = new xg1(24);
    public static final /* synthetic */ xg1 A = new xg1(25);
    public static final /* synthetic */ xg1 B = new xg1(26);
    public static final /* synthetic */ xg1 C = new xg1(27);
    public static final /* synthetic */ xg1 D = new xg1(28);
    public static final /* synthetic */ xg1 E = new xg1(29);

    public /* synthetic */ xg1(int i10) {
        this.f21895a = i10;
    }

    @Override // com.google.android.gms.internal.ads.fj1, com.google.android.gms.internal.ads.ii1
    public Object c(jc1 jc1Var) throws GeneralSecurityException {
        sj1 sj1Var = (sj1) jc1Var;
        ej1 ej1Var = uj1.f20807a;
        if (sj1Var.f19982b.f21189a != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        Provider providerD = v71.d();
        if (providerD != null) {
            try {
                return ik1.a(sj1Var, providerD);
            } catch (GeneralSecurityException unused) {
            }
        }
        return new ik1();
    }

    @Override // com.google.android.gms.internal.ads.gi1
    public jc1 d(kj1 kj1Var) throws GeneralSecurityException {
        int i10 = 16;
        switch (this.f21895a) {
            case 1:
                zi1 zi1Var = zg1.f22604a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var = (cs1) kj1Var.f16465d;
                    ks1 ks1Var = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    yk1 yk1VarC = yk1.C(cs1Var, ks1.f16519b);
                    if (yk1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (yk1VarC.A().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (yk1VarC.B().z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    v90 v90Var = new v90();
                    v90Var.b(yk1VarC.A().B().q());
                    v90Var.f(yk1VarC.B().B().q());
                    v90Var.h(yk1VarC.A().A().z());
                    v90Var.i(yk1VarC.B().A().A());
                    v90Var.f21139e = zg1.c(yk1VarC.B().A().z());
                    v90Var.f21140f = zg1.b((on1) kj1Var.f16466e);
                    uf1 uf1VarJ = v90Var.j();
                    hz hzVar = new hz(15);
                    hzVar.f15433b = uf1VarJ;
                    hzVar.f15434c = new uo0(zq1.a(yk1VarC.A().B().h()), 13);
                    hzVar.f15435d = new uo0(zq1.a(yk1VarC.B().B().h()), 13);
                    hzVar.f15436e = (Integer) kj1Var.f16467f;
                    return hzVar.n();
                } catch (et1 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            case 5:
                zi1 zi1Var2 = ah1.f12034a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var2 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var2 = ks1.f16518a;
                    int i12 = tr1.f20473a;
                    il1 il1VarC = il1.C(cs1Var2, ks1.f16519b);
                    if (il1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    uw uwVar = new uw(16);
                    uwVar.d(il1VarC.B().q());
                    uwVar.i(il1VarC.A().z());
                    uwVar.m();
                    uwVar.f20918b = ah1.b((on1) kj1Var.f16466e);
                    yf1 yf1VarQ = uwVar.q();
                    ay0 ay0Var = new ay0(3, false);
                    ay0Var.f12537b = yf1VarQ;
                    ay0Var.f12538c = new uo0(zq1.a(il1VarC.B().h()), 13);
                    ay0Var.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var.i();
                } catch (et1 unused2) {
                    throw new GeneralSecurityException("Parsing AesEaxKey failed");
                }
            case 9:
                zi1 zi1Var3 = ch1.f13164a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var3 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var3 = ks1.f16518a;
                    int i13 = tr1.f20473a;
                    ol1 ol1VarB = ol1.B(cs1Var3, ks1.f16519b);
                    if (ol1VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    hz hzVar2 = new hz(i10);
                    hzVar2.d(ol1VarB.A().q());
                    hzVar2.g();
                    hzVar2.j();
                    hzVar2.f15436e = ch1.b((on1) kj1Var.f16466e);
                    bg1 bg1VarO = hzVar2.o();
                    ay0 ay0Var2 = new ay0(4, false);
                    ay0Var2.f12537b = bg1VarO;
                    ay0Var2.f12538c = new uo0(zq1.a(ol1VarB.A().h()), 13);
                    ay0Var2.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var2.j();
                } catch (et1 unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case 13:
                zi1 zi1Var4 = eh1.f13979a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var4 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var4 = ks1.f16518a;
                    int i14 = tr1.f20473a;
                    sl1 sl1VarB = sl1.B(cs1Var4, ks1.f16519b);
                    if (sl1VarB.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    int iQ = sl1VarB.A().q();
                    if (iQ != 16 && iQ != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iQ)));
                    }
                    eg1 eg1Var = new eg1(iQ, eh1.b((on1) kj1Var.f16466e));
                    ay0 ay0Var3 = new ay0(5, false);
                    ay0Var3.f12537b = eg1Var;
                    ay0Var3.f12538c = new uo0(zq1.a(sl1VarB.A().h()), 13);
                    ay0Var3.f12539d = (Integer) kj1Var.f16467f;
                    return ay0Var3.k();
                } catch (et1 unused4) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case 17:
                zi1 zi1Var5 = gh1.f14857a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var5 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var5 = ks1.f16518a;
                    int i15 = tr1.f20473a;
                    wl1 wl1VarB = wl1.B(cs1Var5, ks1.f16519b);
                    if (wl1VarB.z() == 0) {
                        return fg1.k(gh1.b((on1) kj1Var.f16466e), new uo0(zq1.a(wl1VarB.A().h()), 13), (Integer) kj1Var.f16467f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (et1 unused5) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            case 21:
                zi1 zi1Var6 = ph1.f18658a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var6 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var6 = ks1.f16518a;
                    int i16 = tr1.f20473a;
                    ho1 ho1VarC = ho1.C(cs1Var6, ks1.f16519b);
                    if (ho1VarC.z() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (ho1VarC.B().q() == 32) {
                        return rg1.k(tg1.b(ph1.b((on1) kj1Var.f16466e), ho1VarC.A().z()), new uo0(zq1.a(ho1VarC.B().h()), 13), (Integer) kj1Var.f16467f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (et1 unused6) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
            default:
                zi1 zi1Var7 = rh1.f19594a;
                if (!((String) kj1Var.f16463b).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
                }
                try {
                    cs1 cs1Var7 = (cs1) kj1Var.f16465d;
                    ks1 ks1Var7 = ks1.f16518a;
                    int i17 = tr1.f20473a;
                    no1 no1VarB = no1.B(cs1Var7, ks1.f16519b);
                    if (no1VarB.z() == 0) {
                        return ug1.k(rh1.b((on1) kj1Var.f16466e), new uo0(zq1.a(no1VarB.A().h()), 13), (Integer) kj1Var.f16467f);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (et1 unused7) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.yi1
    public ff1 g(lj1 lj1Var) throws GeneralSecurityException {
        int i10 = 16;
        switch (this.f21895a) {
            case 3:
                zi1 zi1Var = ah1.f12034a;
                wm1 wm1Var = (wm1) lj1Var.f17037c;
                if (!wm1Var.z().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var.z())));
                }
                try {
                    cs1 cs1VarA = wm1Var.A();
                    ks1 ks1Var = ks1.f16518a;
                    int i11 = tr1.f20473a;
                    kl1 kl1VarB = kl1.B(cs1VarA, ks1.f16519b);
                    uw uwVar = new uw(16);
                    uwVar.d(kl1VarB.A());
                    uwVar.i(kl1VarB.z().z());
                    uwVar.m();
                    uwVar.f20918b = ah1.b(wm1Var.B());
                    return uwVar.q();
                } catch (et1 e10) {
                    throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
                }
            case 7:
                zi1 zi1Var2 = ch1.f13164a;
                wm1 wm1Var2 = (wm1) lj1Var.f17037c;
                if (!wm1Var2.z().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var2.z())));
                }
                try {
                    cs1 cs1VarA2 = wm1Var2.A();
                    ks1 ks1Var2 = ks1.f16518a;
                    int i12 = tr1.f20473a;
                    ql1 ql1VarB = ql1.B(cs1VarA2, ks1.f16519b);
                    if (ql1VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    hz hzVar = new hz(i10);
                    hzVar.d(ql1VarB.z());
                    hzVar.g();
                    hzVar.j();
                    hzVar.f15436e = ch1.b(wm1Var2.B());
                    return hzVar.o();
                } catch (et1 e11) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e11);
                }
            case 11:
                zi1 zi1Var3 = eh1.f13979a;
                wm1 wm1Var3 = (wm1) lj1Var.f17037c;
                if (!wm1Var3.z().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var3.z())));
                }
                try {
                    cs1 cs1VarA3 = wm1Var3.A();
                    ks1 ks1Var3 = ks1.f16518a;
                    int i13 = tr1.f20473a;
                    ul1 ul1VarB = ul1.B(cs1VarA3, ks1.f16519b);
                    if (ul1VarB.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    int iZ = ul1VarB.z();
                    if (iZ == 16 || iZ == 32) {
                        return new eg1(iZ, eh1.b(wm1Var3.B()));
                    }
                    throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(iZ)));
                } catch (et1 e12) {
                    throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e12);
                }
            case 15:
                zi1 zi1Var4 = gh1.f14857a;
                wm1 wm1Var4 = (wm1) lj1Var.f17037c;
                if (!wm1Var4.z().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var4.z())));
                }
                try {
                    cs1 cs1VarA4 = wm1Var4.A();
                    ks1 ks1Var4 = ks1.f16518a;
                    int i14 = tr1.f20473a;
                    yl1.z(cs1VarA4, ks1.f16519b);
                    return new hg1(gh1.b(wm1Var4.B()));
                } catch (et1 e13) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e13);
                }
            case 19:
                zi1 zi1Var5 = ph1.f18658a;
                wm1 wm1Var5 = (wm1) lj1Var.f17037c;
                if (!wm1Var5.z().equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var5.z())));
                }
                try {
                    cs1 cs1VarA5 = wm1Var5.A();
                    ks1 ks1Var5 = ks1.f16518a;
                    int i15 = tr1.f20473a;
                    jo1 jo1VarB = jo1.B(cs1VarA5, ks1.f16519b);
                    if (jo1VarB.z() == 0) {
                        return tg1.b(ph1.b(wm1Var5.B()), jo1VarB.A().z());
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (et1 e14) {
                    throw new GeneralSecurityException("Parsing XAesGcmParameters failed: ", e14);
                }
            default:
                zi1 zi1Var6 = rh1.f19594a;
                wm1 wm1Var6 = (wm1) lj1Var.f17037c;
                if (!wm1Var6.z().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: ".concat(String.valueOf(wm1Var6.z())));
                }
                try {
                    cs1 cs1VarA6 = wm1Var6.A();
                    ks1 ks1Var6 = ks1.f16518a;
                    int i16 = tr1.f20473a;
                    if (oo1.A(cs1VarA6, ks1.f16519b).z() == 0) {
                        return new wg1(rh1.b(wm1Var6.B()));
                    }
                    throw new GeneralSecurityException("Only version 0 parameters are accepted");
                } catch (et1 e15) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e15);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.aj1
    public lj1 h(ff1 ff1Var) {
        switch (this.f21895a) {
            case 2:
                uf1 uf1Var = (uf1) ff1Var;
                zi1 zi1Var = zg1.f22604a;
                vm1 vm1VarD = wm1.D();
                vm1VarD.h("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zk1 zk1VarC = al1.C();
                dl1 dl1VarB = el1.B();
                fl1 fl1VarA = gl1.A();
                int i10 = uf1Var.f20766c;
                fl1VarA.b();
                ((gl1) fl1VarA.f19193b).C(i10);
                gl1 gl1Var = (gl1) fl1VarA.e();
                dl1VarB.b();
                ((el1) dl1VarB.f19193b).D(gl1Var);
                int i11 = uf1Var.f20764a;
                dl1VarB.b();
                ((el1) dl1VarB.f19193b).E(i11);
                el1 el1Var = (el1) dl1VarB.e();
                zk1VarC.b();
                ((al1) zk1VarC.f19193b).D(el1Var);
                pm1 pm1VarD = qm1.D();
                sm1 sm1VarD = zg1.d(uf1Var);
                pm1VarD.b();
                ((qm1) pm1VarD.f19193b).F(sm1VarD);
                int i12 = uf1Var.f20765b;
                pm1VarD.b();
                ((qm1) pm1VarD.f19193b).G(i12);
                qm1 qm1Var = (qm1) pm1VarD.e();
                zk1VarC.b();
                ((al1) zk1VarC.f19193b).E(qm1Var);
                vm1VarD.i(((al1) zk1VarC.e()).a());
                vm1VarD.j(zg1.a(uf1Var.f20768e));
                return lj1.f((wm1) vm1VarD.e());
            case 6:
                yf1 yf1Var = (yf1) ff1Var;
                zi1 zi1Var2 = ah1.f12034a;
                vm1 vm1VarD2 = wm1.D();
                vm1VarD2.h("type.googleapis.com/google.crypto.tink.AesEaxKey");
                jl1 jl1VarC = kl1.C();
                ll1 ll1VarA = ml1.A();
                int i13 = yf1Var.f22229b;
                ll1VarA.b();
                ((ml1) ll1VarA.f19193b).C(i13);
                ml1 ml1Var = (ml1) ll1VarA.e();
                jl1VarC.b();
                ((kl1) jl1VarC.f19193b).D(ml1Var);
                int i14 = yf1Var.f22228a;
                jl1VarC.b();
                ((kl1) jl1VarC.f19193b).E(i14);
                vm1VarD2.i(((kl1) jl1VarC.e()).a());
                vm1VarD2.j(ah1.a(yf1Var.f22230c));
                return lj1.f((wm1) vm1VarD2.e());
            case 10:
                bg1 bg1Var = (bg1) ff1Var;
                zi1 zi1Var3 = ch1.f13164a;
                vm1 vm1VarD3 = wm1.D();
                vm1VarD3.h("type.googleapis.com/google.crypto.tink.AesGcmKey");
                pl1 pl1VarC = ql1.C();
                int i15 = bg1Var.f12775a;
                pl1VarC.b();
                ((ql1) pl1VarC.f19193b).D(i15);
                vm1VarD3.i(((ql1) pl1VarC.e()).a());
                vm1VarD3.j(ch1.a(bg1Var.f12776b));
                return lj1.f((wm1) vm1VarD3.e());
            case 14:
                eg1 eg1Var = (eg1) ff1Var;
                zi1 zi1Var4 = eh1.f13979a;
                vm1 vm1VarD4 = wm1.D();
                vm1VarD4.h("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                tl1 tl1VarC = ul1.C();
                int i16 = eg1Var.f13966a;
                tl1VarC.b();
                ((ul1) tl1VarC.f19193b).D(i16);
                vm1VarD4.i(((ul1) tl1VarC.e()).a());
                vm1VarD4.j(eh1.a(eg1Var.f13967b));
                return lj1.f((wm1) vm1VarD4.e());
            case 18:
                zi1 zi1Var5 = gh1.f14857a;
                vm1 vm1VarD5 = wm1.D();
                vm1VarD5.h("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                vm1VarD5.i(yl1.A().a());
                vm1VarD5.j(gh1.a(((hg1) ff1Var).f15282a));
                return lj1.f((wm1) vm1VarD5.e());
            case 22:
                tg1 tg1Var = (tg1) ff1Var;
                zi1 zi1Var6 = ph1.f18658a;
                vm1 vm1VarD6 = wm1.D();
                vm1VarD6.h("type.googleapis.com/google.crypto.tink.XAesGcmKey");
                io1 io1VarC = jo1.C();
                ko1 ko1VarA = lo1.A();
                int i17 = tg1Var.f20381b;
                ko1VarA.b();
                ((lo1) ko1VarA.f19193b).C(i17);
                lo1 lo1Var = (lo1) ko1VarA.e();
                io1VarC.b();
                ((jo1) io1VarC.f19193b).D(lo1Var);
                vm1VarD6.i(((jo1) io1VarC.e()).a());
                vm1VarD6.j(ph1.a(tg1Var.f20380a));
                return lj1.f((wm1) vm1VarD6.e());
            default:
                zi1 zi1Var7 = rh1.f19594a;
                vm1 vm1VarD7 = wm1.D();
                vm1VarD7.h("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
                vm1VarD7.i(oo1.B().a());
                vm1VarD7.j(rh1.a(((wg1) ff1Var).f21512a));
                return lj1.f((wm1) vm1VarD7.e());
        }
    }

    @Override // com.google.android.gms.internal.ads.ii1
    public kj1 c(jc1 jc1Var) {
        switch (this.f21895a) {
            case 0:
                of1 of1Var = (of1) jc1Var;
                zi1 zi1Var = zg1.f22604a;
                xk1 xk1VarD = yk1.D();
                bl1 bl1VarC = cl1.C();
                fl1 fl1VarA = gl1.A();
                int i10 = of1Var.f18250b.f20766c;
                fl1VarA.b();
                ((gl1) fl1VarA.f19193b).C(i10);
                gl1 gl1Var = (gl1) fl1VarA.e();
                bl1VarC.b();
                ((cl1) bl1VarC.f19193b).E(gl1Var);
                byte[] bArrB = ((zq1) of1Var.f18251c.f20839b).b();
                as1 as1VarD = cs1.D(bArrB, 0, bArrB.length);
                bl1VarC.b();
                ((cl1) bl1VarC.f19193b).F(as1VarD);
                cl1 cl1Var = (cl1) bl1VarC.e();
                xk1VarD.b();
                ((yk1) xk1VarD.f19193b).F(cl1Var);
                nm1 nm1VarD = om1.D();
                uf1 uf1Var = of1Var.f18250b;
                sm1 sm1VarD = zg1.d(uf1Var);
                nm1VarD.b();
                ((om1) nm1VarD.f19193b).G(sm1VarD);
                byte[] bArrB2 = ((zq1) of1Var.f18252d.f20839b).b();
                as1 as1VarD2 = cs1.D(bArrB2, 0, bArrB2.length);
                nm1VarD.b();
                ((om1) nm1VarD.f19193b).H(as1VarD2);
                om1 om1Var = (om1) nm1VarD.e();
                xk1VarD.b();
                ((yk1) xk1VarD.f19193b).G(om1Var);
                return kj1.t("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey", ((yk1) xk1VarD.e()).a(), 2, zg1.a(uf1Var.f20768e), of1Var.f18254f);
            case 4:
                vf1 vf1Var = (vf1) jc1Var;
                zi1 zi1Var2 = ah1.f12034a;
                hl1 hl1VarD = il1.D();
                yf1 yf1Var = vf1Var.f21162b;
                ll1 ll1VarA = ml1.A();
                int i11 = yf1Var.f22229b;
                ll1VarA.b();
                ((ml1) ll1VarA.f19193b).C(i11);
                ml1 ml1Var = (ml1) ll1VarA.e();
                hl1VarD.b();
                ((il1) hl1VarD.f19193b).F(ml1Var);
                byte[] bArrB3 = ((zq1) vf1Var.f21163c.f20839b).b();
                as1 as1VarD3 = cs1.D(bArrB3, 0, bArrB3.length);
                hl1VarD.b();
                ((il1) hl1VarD.f19193b).G(as1VarD3);
                return kj1.t("type.googleapis.com/google.crypto.tink.AesEaxKey", ((il1) hl1VarD.e()).a(), 2, ah1.a(vf1Var.f21162b.f22230c), vf1Var.f21165e);
            case 8:
                zf1 zf1Var = (zf1) jc1Var;
                zi1 zi1Var3 = ch1.f13164a;
                nl1 nl1VarC = ol1.C();
                byte[] bArrB4 = ((zq1) zf1Var.f22599c.f20839b).b();
                as1 as1VarD4 = cs1.D(bArrB4, 0, bArrB4.length);
                nl1VarC.b();
                ((ol1) nl1VarC.f19193b).E(as1VarD4);
                return kj1.t("type.googleapis.com/google.crypto.tink.AesGcmKey", ((ol1) nl1VarC.e()).a(), 2, ch1.a(zf1Var.f22598b.f12776b), zf1Var.f22601e);
            case 12:
                cg1 cg1Var = (cg1) jc1Var;
                zi1 zi1Var4 = eh1.f13979a;
                rl1 rl1VarC = sl1.C();
                byte[] bArrB5 = ((zq1) cg1Var.f13160c.f20839b).b();
                as1 as1VarD5 = cs1.D(bArrB5, 0, bArrB5.length);
                rl1VarC.b();
                ((sl1) rl1VarC.f19193b).E(as1VarD5);
                return kj1.t("type.googleapis.com/google.crypto.tink.AesGcmSivKey", ((sl1) rl1VarC.e()).a(), 2, eh1.a(cg1Var.f13159b.f13967b), cg1Var.f13162e);
            case 16:
                fg1 fg1Var = (fg1) jc1Var;
                zi1 zi1Var5 = gh1.f14857a;
                vl1 vl1VarC = wl1.C();
                byte[] bArrB6 = ((zq1) fg1Var.f14406c.f20839b).b();
                as1 as1VarD6 = cs1.D(bArrB6, 0, bArrB6.length);
                vl1VarC.b();
                ((wl1) vl1VarC.f19193b).E(as1VarD6);
                return kj1.t("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", ((wl1) vl1VarC.e()).a(), 2, gh1.a(fg1Var.f14405b.f15282a), fg1Var.f14408e);
            case 20:
                rg1 rg1Var = (rg1) jc1Var;
                zi1 zi1Var6 = ph1.f18658a;
                go1 go1VarD = ho1.D();
                byte[] bArrB7 = ((zq1) rg1Var.f19587c.f20839b).b();
                as1 as1VarD7 = cs1.D(bArrB7, 0, bArrB7.length);
                go1VarD.b();
                ((ho1) go1VarD.f19193b).F(as1VarD7);
                ko1 ko1VarA = lo1.A();
                tg1 tg1Var = rg1Var.f19586b;
                int i12 = tg1Var.f20381b;
                ko1VarA.b();
                ((lo1) ko1VarA.f19193b).C(i12);
                lo1 lo1Var = (lo1) ko1VarA.e();
                go1VarD.b();
                ((ho1) go1VarD.f19193b).E(lo1Var);
                return kj1.t("type.googleapis.com/google.crypto.tink.XAesGcmKey", ((ho1) go1VarD.e()).a(), 2, ph1.a(tg1Var.f20380a), rg1Var.f19589e);
            case 24:
                ug1 ug1Var = (ug1) jc1Var;
                zi1 zi1Var7 = rh1.f19594a;
                mo1 mo1VarC = no1.C();
                byte[] bArrB8 = ((zq1) ug1Var.f20788c.f20839b).b();
                as1 as1VarD8 = cs1.D(bArrB8, 0, bArrB8.length);
                mo1VarC.b();
                ((no1) mo1VarC.f19193b).E(as1VarD8);
                return kj1.t("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((no1) mo1VarC.e()).a(), 2, rh1.a(ug1Var.f20787b.f21512a), ug1Var.f20790e);
            default:
                kj1 kj1Var = ((ni1) jc1Var).f17836b;
                int i13 = li1.f17010b[v0.i.c(kj1Var.f16462a)];
                return kj1Var;
        }
    }
}
