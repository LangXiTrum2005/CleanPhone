package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rp1 {
    static {
        int i10 = pn1.zza;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        bp1 bp1Var = bp1.f12842a;
        ui1 ui1Var = ui1.f20803b;
        ui1Var.b(bp1.f12842a);
        ui1Var.a(bp1.f12843b);
        ui1Var.b(cp1.f13226a);
        ui1Var.a(cp1.f13227b);
        int i10 = uo1.f20845f;
        if (!jc1.e(i10)) {
            throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto module is not available.");
        }
        zi1 zi1Var = up1.f20850a;
        vi1 vi1Var = vi1.f21181b;
        vi1Var.c(up1.f20850a);
        vi1Var.d(up1.f20851b);
        vi1Var.a(up1.f20852c);
        vi1Var.b(up1.f20853d);
        vi1Var.a(up1.f20854e);
        vi1Var.b(up1.f20855f);
        ti1 ti1Var = ti1.f20404b;
        HashMap map = new HashMap();
        map.put("ECDSA_P256", ap1.f12480a);
        map.put("ECDSA_P256_IEEE_P1363", ap1.f12483d);
        uw uwVar = new uw(18);
        uwVar.f20921e = sf1.f19962m;
        uwVar.f20920d = qo1.f19148c;
        uwVar.f20919c = tf1.f20370k;
        uwVar.f20918b = xf1.f21862n;
        map.put("ECDSA_P256_RAW", uwVar.r());
        map.put("ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX", ap1.f12485f);
        map.put("ECDSA_P384", ap1.f12481b);
        map.put("ECDSA_P384_IEEE_P1363", ap1.f12484e);
        uw uwVar2 = new uw(18);
        uwVar2.f20921e = sf1.f19964o;
        qo1 qo1Var = qo1.f19149d;
        uwVar2.f20920d = qo1Var;
        tf1 tf1Var = tf1.l;
        uwVar2.f20919c = tf1Var;
        xf1 xf1Var = xf1.f21860k;
        uwVar2.f20918b = xf1Var;
        map.put("ECDSA_P384_SHA512", uwVar2.r());
        uw uwVar3 = new uw(18);
        uwVar3.f20921e = sf1.f19963n;
        uwVar3.f20920d = qo1Var;
        uwVar3.f20919c = tf1Var;
        uwVar3.f20918b = xf1Var;
        map.put("ECDSA_P384_SHA384", uwVar3.r());
        map.put("ECDSA_P521", ap1.f12482c);
        map.put("ECDSA_P521_IEEE_P1363", ap1.f12486g);
        ti1Var.b(Collections.unmodifiableMap(map));
        ui1Var.a(uo1.f20840a);
        ui1Var.a(uo1.f20841b);
        qi1 qi1Var = qi1.f19092b;
        qi1Var.a(uo1.f20844e, ro1.class);
        ei1 ei1Var = ei1.f13985d;
        ei1Var.c(uo1.f20842c, i10, true);
        ei1Var.c(uo1.f20843d, i10, false);
        int i11 = jp1.f16131f;
        if (!jc1.e(i11)) {
            throw new GeneralSecurityException("Can not use RSA SSA PKCS1 in FIPS-mode, as BoringCrypto module is not available.");
        }
        vi1Var.c(bq1.f12849a);
        vi1Var.d(bq1.f12850b);
        vi1Var.a(bq1.f12851c);
        vi1Var.b(bq1.f12852d);
        vi1Var.a(bq1.f12853e);
        vi1Var.b(bq1.f12854f);
        HashMap map2 = new HashMap();
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4", ap1.f12487h);
        BigInteger bigInteger = gp1.f14925e;
        dp1 dp1Var = new dp1();
        dp1Var.f13620c = ep1.f14042b;
        dp1Var.a(3072);
        BigInteger bigInteger2 = gp1.f14925e;
        dp1Var.f13619b = bigInteger2;
        fp1 fp1Var = fp1.f14504e;
        dp1Var.f13621d = fp1Var;
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_RAW", dp1Var.b());
        map2.put("RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX", ap1.f12488i);
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4", ap1.f12489j);
        dp1 dp1Var2 = new dp1();
        dp1Var2.f13620c = ep1.f14044d;
        dp1Var2.a(4096);
        dp1Var2.f13619b = bigInteger2;
        dp1Var2.f13621d = fp1Var;
        map2.put("RSA_SSA_PKCS1_4096_SHA512_F4_RAW", dp1Var2.b());
        ti1Var.b(map2);
        ui1Var.a(jp1.f16126a);
        ui1Var.a(jp1.f16127b);
        qi1Var.a(jp1.f16130e, gp1.class);
        ei1Var.c(jp1.f16128c, i11, true);
        ei1Var.c(jp1.f16129d, i11, false);
        int i12 = qp1.f19160f;
        if (!jc1.e(i12)) {
            throw new GeneralSecurityException("Can not use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        vi1Var.c(eq1.f14050a);
        vi1Var.d(eq1.f14051b);
        vi1Var.a(eq1.f14052c);
        vi1Var.b(eq1.f14053d);
        vi1Var.a(eq1.f14054e);
        vi1Var.b(eq1.f14055f);
        HashMap map3 = new HashMap();
        BigInteger bigInteger3 = np1.f17883g;
        kp1 kp1Var = new kp1();
        lp1 lp1Var = lp1.f17093b;
        kp1Var.f16504c = lp1Var;
        kp1Var.f16505d = lp1Var;
        kp1Var.b(32);
        kp1Var.a(3072);
        BigInteger bigInteger4 = np1.f17883g;
        kp1Var.f16503b = bigInteger4;
        mp1 mp1Var = mp1.f17508b;
        kp1Var.f16507f = mp1Var;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4", kp1Var.c());
        kp1 kp1Var2 = new kp1();
        kp1Var2.f16504c = lp1Var;
        kp1Var2.f16505d = lp1Var;
        kp1Var2.b(32);
        kp1Var2.a(3072);
        kp1Var2.f16503b = bigInteger4;
        mp1 mp1Var2 = mp1.f17511e;
        kp1Var2.f16507f = mp1Var2;
        map3.put("RSA_SSA_PSS_3072_SHA256_F4_RAW", kp1Var2.c());
        map3.put("RSA_SSA_PSS_3072_SHA256_SHA256_32_F4", ap1.f12490k);
        kp1 kp1Var3 = new kp1();
        lp1 lp1Var2 = lp1.f17095d;
        kp1Var3.f16504c = lp1Var2;
        kp1Var3.f16505d = lp1Var2;
        kp1Var3.b(64);
        kp1Var3.a(4096);
        kp1Var3.f16503b = bigInteger4;
        kp1Var3.f16507f = mp1Var;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4", kp1Var3.c());
        kp1 kp1Var4 = new kp1();
        kp1Var4.f16504c = lp1Var2;
        kp1Var4.f16505d = lp1Var2;
        kp1Var4.b(64);
        kp1Var4.a(4096);
        kp1Var4.f16503b = bigInteger4;
        kp1Var4.f16507f = mp1Var2;
        map3.put("RSA_SSA_PSS_4096_SHA512_F4_RAW", kp1Var4.c());
        map3.put("RSA_SSA_PSS_4096_SHA512_SHA512_64_F4", ap1.l);
        ti1Var.b(Collections.unmodifiableMap(map3));
        ui1Var.a(qp1.f19155a);
        ui1Var.a(qp1.f19156b);
        qi1Var.a(qp1.f19159e, np1.class);
        ei1Var.c(qp1.f19157c, i12, true);
        ei1Var.c(qp1.f19158d, i12, false);
        if (uh1.a()) {
            return;
        }
        ej1 ej1Var = yo1.f22338a;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        vi1Var.c(xp1.f21957a);
        vi1Var.d(xp1.f21958b);
        vi1Var.a(xp1.f21959c);
        vi1Var.b(xp1.f21960d);
        vi1Var.a(xp1.f21961e);
        vi1Var.b(xp1.f21962f);
        HashMap map4 = new HashMap();
        map4.put("ED25519", new wo1(vo1.f21222b));
        vo1 vo1Var = vo1.f21225e;
        map4.put("ED25519_RAW", new wo1(vo1Var));
        map4.put("ED25519WithRawOutput", new wo1(vo1Var));
        ti1Var.b(Collections.unmodifiableMap(map4));
        qi1Var.a(yo1.f22343f, wo1.class);
        si1.f19978b.a(yo1.f22342e, wo1.class);
        ui1Var.a(yo1.f22338a);
        ui1Var.a(yo1.f22339b);
        ei1Var.a(yo1.f22340c, true);
        ei1Var.a(yo1.f22341d, false);
    }
}
