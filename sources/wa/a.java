package wa;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import jb.t1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    static {
        int i10 = t1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        eb.n nVar = eb.n.f40002b;
        nVar.c(d.f53013a);
        nVar.b(d.f53014b);
        fb.k.a();
        int i10 = g.f53042e;
        if (!defpackage.e.b(i10)) {
            throw new GeneralSecurityException("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        eb.s sVar = xa.a.f53678a;
        eb.o oVar = eb.o.f40004b;
        oVar.f(xa.a.f53678a);
        oVar.e(xa.a.f53679b);
        oVar.d(xa.a.f53680c);
        oVar.c(xa.a.f53681d);
        nVar.b(g.f53038a);
        eb.m mVar = eb.m.f40000b;
        HashMap map = new HashMap();
        map.put("AES128_CTR_HMAC_SHA256", e0.f53028e);
        com.google.android.gms.internal.consent_sdk.x xVarB = i.b();
        xVarB.u(16);
        xVarB.w(32);
        xVarB.A(16);
        xVarB.y(16);
        h hVar = h.f53047e;
        xVarB.f23264e = hVar;
        h hVar2 = h.f53052j;
        xVarB.f23265f = hVar2;
        map.put("AES128_CTR_HMAC_SHA256_RAW", xVarB.d());
        map.put("AES256_CTR_HMAC_SHA256", e0.f53029f);
        com.google.android.gms.internal.consent_sdk.x xVarB2 = i.b();
        xVarB2.u(32);
        xVarB2.w(32);
        xVarB2.A(32);
        xVarB2.y(16);
        xVarB2.f23264e = hVar;
        xVarB2.f23265f = hVar2;
        map.put("AES256_CTR_HMAC_SHA256_RAW", xVarB2.d());
        mVar.b(Collections.unmodifiableMap(map));
        eb.l lVar = eb.l.f39998b;
        lVar.a(g.f53040c, i.class);
        eb.k kVar = eb.k.f39996b;
        kVar.a(g.f53041d, i.class);
        eb.a aVar = eb.a.f39960d;
        aVar.e(g.f53039b, i10);
        int i11 = n.f53106e;
        if (!defpackage.e.b(i11)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        oVar.f(xa.e.f53688a);
        oVar.e(xa.e.f53689b);
        oVar.d(xa.e.f53690c);
        oVar.c(xa.e.f53691d);
        nVar.b(n.f53102a);
        HashMap map2 = new HashMap();
        map2.put("AES128_GCM", e0.f53024a);
        k5.g gVarB = o.b();
        gVarB.A();
        gVarB.B(16);
        gVarB.D();
        h hVar3 = h.f53057p;
        gVarB.f44328d = hVar3;
        map2.put("AES128_GCM_RAW", gVarB.m());
        map2.put("AES256_GCM", e0.f53025b);
        k5.g gVarB2 = o.b();
        gVarB2.A();
        gVarB2.B(32);
        gVarB2.D();
        gVarB2.f44328d = hVar3;
        map2.put("AES256_GCM_RAW", gVarB2.m());
        mVar.b(Collections.unmodifiableMap(map2));
        lVar.a(n.f53104c, o.class);
        kVar.a(n.f53105d, o.class);
        aVar.e(n.f53103b, i11);
        if (ab.a.a()) {
            return;
        }
        eb.x xVar = k.f53090a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        oVar.f(xa.c.f53683a);
        oVar.e(xa.c.f53684b);
        oVar.d(xa.c.f53685c);
        oVar.c(xa.c.f53686d);
        nVar.b(k.f53090a);
        HashMap map3 = new HashMap();
        map3.put("AES128_EAX", e0.f53026c);
        zc.u uVarB = l.b();
        uVarB.F(16);
        uVarB.G(16);
        uVarB.H();
        h hVar4 = h.f53054m;
        uVarB.f54882e = hVar4;
        map3.put("AES128_EAX_RAW", uVarB.m());
        map3.put("AES256_EAX", e0.f53027d);
        zc.u uVarB2 = l.b();
        uVarB2.F(16);
        uVarB2.G(32);
        uVarB2.H();
        uVarB2.f54882e = hVar4;
        map3.put("AES256_EAX_RAW", uVarB2.m());
        mVar.b(Collections.unmodifiableMap(map3));
        kVar.a(k.f53092c, l.class);
        aVar.d(k.f53091b);
        eb.x xVar2 = q.f53115a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        oVar.f(xa.g.f53700a);
        oVar.e(xa.g.f53701b);
        oVar.d(xa.g.f53702c);
        oVar.c(xa.g.f53703d);
        HashMap map4 = new HashMap();
        v6.c cVarB = r.b();
        cVarB.q(16);
        h hVar5 = h.f53058q;
        cVarB.f52488b = hVar5;
        map4.put("AES128_GCM_SIV", cVarB.n());
        v6.c cVarB2 = r.b();
        cVarB2.q(16);
        h hVar6 = h.f53060s;
        cVarB2.f52488b = hVar6;
        map4.put("AES128_GCM_SIV_RAW", cVarB2.n());
        v6.c cVarB3 = r.b();
        cVarB3.q(32);
        cVarB3.f52488b = hVar5;
        map4.put("AES256_GCM_SIV", cVarB3.n());
        v6.c cVarB4 = r.b();
        cVarB4.q(32);
        cVarB4.f52488b = hVar6;
        map4.put("AES256_GCM_SIV_RAW", cVarB4.n());
        mVar.b(Collections.unmodifiableMap(map4));
        lVar.a(q.f53117c, r.class);
        kVar.a(q.f53116b, r.class);
        nVar.b(q.f53115a);
        aVar.d(q.f53118d);
        eb.x xVar3 = t.f53125a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
        }
        oVar.f(xa.i.f53710a);
        oVar.e(xa.i.f53711b);
        oVar.d(xa.i.f53712c);
        oVar.c(xa.i.f53713d);
        nVar.b(t.f53125a);
        kVar.a(t.f53126b, u.class);
        HashMap map5 = new HashMap();
        map5.put("CHACHA20_POLY1305", new u(h.f53061t));
        map5.put("CHACHA20_POLY1305_RAW", new u(h.f53063v));
        mVar.b(Collections.unmodifiableMap(map5));
        aVar.d(t.f53127c);
        eb.x xVar4 = v.f53129a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        oVar.f(a0.f53002a);
        oVar.e(a0.f53003b);
        oVar.d(a0.f53004c);
        oVar.c(a0.f53005d);
        nVar.b(v.f53129a);
        kVar.a(v.f53131c, z.class);
        aVar.d(v.f53130b);
        eb.f fVar = x.f53137a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        oVar.f(d0.f53015a);
        oVar.e(d0.f53016b);
        oVar.d(d0.f53017c);
        oVar.c(d0.f53018d);
        kVar.a(x.f53138b, c0.class);
        nVar.b(x.f53139c);
        aVar.d(x.f53137a);
        eb.x xVar5 = j0.f53086a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        oVar.f(xa.q.f53728a);
        oVar.e(xa.q.f53729b);
        oVar.d(xa.q.f53730c);
        oVar.c(xa.q.f53731d);
        nVar.b(j0.f53086a);
        HashMap map6 = new HashMap();
        map6.put("XCHACHA20_POLY1305", new k0(h.I));
        map6.put("XCHACHA20_POLY1305_RAW", new k0(h.K));
        mVar.b(Collections.unmodifiableMap(map6));
        kVar.a(j0.f53089d, k0.class);
        lVar.a(j0.f53088c, k0.class);
        aVar.d(j0.f53087b);
        oVar.f(xa.o.f53721a);
        oVar.e(xa.o.f53722b);
        oVar.d(xa.o.f53723c);
        oVar.c(xa.o.f53724d);
        HashMap map7 = new HashMap();
        map7.put("XAES_256_GCM_192_BIT_NONCE", e0.f53030g);
        map7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", e0.f53031h);
        map7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", e0.f53032i);
        map7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", e0.f53033j);
        mVar.b(Collections.unmodifiableMap(map7));
        nVar.b(g0.f53044b);
        kVar.a(g0.f53043a, h0.class);
    }
}
