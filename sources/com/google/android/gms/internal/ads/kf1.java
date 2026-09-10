package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kf1 {
    static {
        int i10 = pn1.zza;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        nf1 nf1Var = nf1.f17806a;
        ui1 ui1Var = ui1.f20803b;
        ui1Var.b(nf1.f17806a);
        ui1Var.a(nf1.f17807b);
        ck1.a();
        int i10 = rf1.f19583e;
        if (!jc1.e(i10)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zi1 zi1Var = zg1.f22604a;
        vi1 vi1Var = vi1.f21181b;
        vi1Var.c(zg1.f22604a);
        vi1Var.d(zg1.f22605b);
        vi1Var.a(zg1.f22606c);
        vi1Var.b(zg1.f22607d);
        ui1Var.a(rf1.f19579a);
        ti1 ti1Var = ti1.f20404b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", qg1.f19076e);
        v90 v90Var = new v90();
        v90Var.b(16);
        v90Var.f(32);
        v90Var.i(16);
        v90Var.h(16);
        sf1 sf1Var = sf1.f19955e;
        v90Var.f21139e = sf1Var;
        tf1 tf1Var = tf1.f20364e;
        v90Var.f21140f = tf1Var;
        map.put("AES128_CTR_HMAC_SHA256_RAW", v90Var.j());
        map.put("AES256_CTR_HMAC_SHA256", qg1.f19077f);
        v90 v90Var2 = new v90();
        v90Var2.b(32);
        v90Var2.f(32);
        v90Var2.i(32);
        v90Var2.h(16);
        v90Var2.f21139e = sf1Var;
        v90Var2.f21140f = tf1Var;
        map.put("AES256_CTR_HMAC_SHA256_RAW", v90Var2.j());
        ti1Var.b(Collections.unmodifiableMap(map));
        si1 si1Var = si1.f19978b;
        si1Var.a(rf1.f19581c, uf1.class);
        qi1 qi1Var = qi1.f19092b;
        qi1Var.a(rf1.f19582d, uf1.class);
        ei1 ei1Var = ei1.f13985d;
        ei1Var.c(rf1.f19580b, i10, true);
        int i11 = ag1.f12032e;
        if (!jc1.e(i11)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        vi1Var.c(ch1.f13164a);
        vi1Var.d(ch1.f13165b);
        vi1Var.a(ch1.f13166c);
        vi1Var.b(ch1.f13167d);
        ui1Var.a(ag1.f12028a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", qg1.f19072a);
        hz hzVar = new hz(16);
        hzVar.g();
        hzVar.d(16);
        hzVar.j();
        af1 af1Var = af1.f12015h;
        hzVar.f15436e = af1Var;
        map2.put("AES128_GCM_RAW", hzVar.o());
        map2.put("AES256_GCM", qg1.f19073b);
        hz hzVar2 = new hz(16);
        hzVar2.g();
        hzVar2.d(32);
        hzVar2.j();
        hzVar2.f15436e = af1Var;
        map2.put("AES256_GCM_RAW", hzVar2.o());
        ti1Var.b(Collections.unmodifiableMap(map2));
        si1Var.a(ag1.f12030c, bg1.class);
        qi1Var.a(ag1.f12031d, bg1.class);
        ei1Var.c(ag1.f12029b, i11, true);
        if (uh1.a()) {
            return;
        }
        ej1 ej1Var = wf1.f21506a;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        vi1Var.c(ah1.f12034a);
        vi1Var.d(ah1.f12035b);
        vi1Var.a(ah1.f12036c);
        vi1Var.b(ah1.f12037d);
        ui1Var.a(wf1.f21506a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", qg1.f19074c);
        uw uwVar = new uw(16);
        uwVar.i(16);
        uwVar.d(16);
        uwVar.m();
        xf1 xf1Var = xf1.f21854e;
        uwVar.f20918b = xf1Var;
        map3.put("AES128_EAX_RAW", uwVar.q());
        map3.put("AES256_EAX", qg1.f19075d);
        uw uwVar2 = new uw(16);
        uwVar2.i(16);
        uwVar2.d(32);
        uwVar2.m();
        uwVar2.f20918b = xf1Var;
        map3.put("AES256_EAX_RAW", uwVar2.q());
        ti1Var.b(Collections.unmodifiableMap(map3));
        qi1Var.a(wf1.f21508c, yf1.class);
        ei1Var.a(wf1.f21507b, true);
        ej1 ej1Var2 = dg1.f13521a;
        sf1 sf1Var2 = sf1.f19960j;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        vi1Var.c(eh1.f13979a);
        vi1Var.d(eh1.f13980b);
        vi1Var.a(eh1.f13981c);
        vi1Var.b(eh1.f13982d);
        HashMap map4 = new HashMap();
        sf1 sf1Var3 = sf1.f19958h;
        map4.put("AES128_GCM_SIV", new eg1(16, sf1Var3));
        map4.put("AES128_GCM_SIV_RAW", new eg1(16, sf1Var2));
        map4.put("AES256_GCM_SIV", new eg1(32, sf1Var3));
        map4.put("AES256_GCM_SIV_RAW", new eg1(32, sf1Var2));
        ti1Var.b(Collections.unmodifiableMap(map4));
        si1Var.a(qf1.f19048c, eg1.class);
        qi1Var.a(pf1.f18628e, eg1.class);
        ui1Var.a(dg1.f13521a);
        ei1Var.a(dg1.f13522b, true);
        ej1 ej1Var3 = gg1.f14854a;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        vi1Var.c(gh1.f14857a);
        vi1Var.d(gh1.f14858b);
        vi1Var.a(gh1.f14859c);
        vi1Var.b(gh1.f14860d);
        ui1Var.a(gg1.f14854a);
        qi1Var.a(pf1.f18629f, hg1.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new hg1(tf1.f20365f));
        map5.put("CHACHA20_POLY1305_RAW", new hg1(tf1.f20367h));
        ti1Var.b(Collections.unmodifiableMap(map5));
        ei1Var.a(gg1.f14855b, true);
        ej1 ej1Var4 = ig1.f15739a;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        vi1Var.c(mg1.f17441a);
        vi1Var.d(mg1.f17442b);
        vi1Var.a(mg1.f17443c);
        vi1Var.b(mg1.f17444d);
        ui1Var.a(ig1.f15739a);
        qi1Var.a(ig1.f15741c, lg1.class);
        ei1Var.a(ig1.f15740b, true);
        ki1 ki1Var = jg1.f16092a;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        vi1Var.c(pg1.f18646a);
        vi1Var.d(pg1.f18647b);
        vi1Var.a(pg1.f18648c);
        vi1Var.b(pg1.f18649d);
        qi1Var.a(jg1.f16093b, og1.class);
        ui1Var.a(jg1.f16094c);
        ei1Var.a(jg1.f16092a, true);
        ej1 ej1Var5 = vg1.f21167a;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        vi1Var.c(rh1.f19594a);
        vi1Var.d(rh1.f19595b);
        vi1Var.a(rh1.f19596c);
        vi1Var.b(rh1.f19597d);
        ui1Var.a(vg1.f21167a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new wg1(xf1.f21857h));
        map6.put("XCHACHA20_POLY1305_RAW", new wg1(xf1.f21859j));
        ti1Var.b(Collections.unmodifiableMap(map6));
        qi1Var.a(vg1.f21170d, wg1.class);
        si1Var.a(vg1.f21169c, wg1.class);
        ei1Var.a(vg1.f21168b, true);
        ej1 ej1Var6 = sg1.f19970a;
        vi1Var.c(ph1.f18658a);
        vi1Var.d(ph1.f18659b);
        vi1Var.a(ph1.f18660c);
        vi1Var.b(ph1.f18661d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", qg1.f19078g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", qg1.f19079h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", qg1.f19080i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", qg1.f19081j);
        ti1Var.b(Collections.unmodifiableMap(map7));
        ui1Var.a(sg1.f19970a);
        qi1Var.a(pf1.f18632i, tg1.class);
    }
}
