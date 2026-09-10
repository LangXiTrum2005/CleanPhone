package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ck1 {
    static {
        int i10 = pn1.zza;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        fk1 fk1Var = fk1.f14452a;
        ui1 ui1Var = ui1.f20803b;
        ui1Var.b(fk1.f14452a);
        ui1Var.a(fk1.f14453b);
        ui1Var.b(wj1.f21527a);
        int i10 = yj1.f22289f;
        if (!jc1.e(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        w50 w50Var = kk1.f16471a;
        vi1 vi1Var = vi1.f21181b;
        vi1Var.c(kk1.f16473c);
        vi1Var.d(kk1.f16474d);
        vi1Var.a(kk1.f16475e);
        vi1Var.b(kk1.f16476f);
        ui1Var.a(yj1.f22284a);
        ui1Var.a(yj1.f22285b);
        ti1 ti1Var = ti1.f20404b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", gk1.f14891a);
        hz hzVar = new hz(17);
        hzVar.d(32);
        hzVar.h(16);
        ak1 ak1Var = ak1.f12056e;
        hzVar.f15436e = ak1Var;
        zj1 zj1Var = zj1.f22643d;
        hzVar.f15435d = zj1Var;
        map.put("HMAC_SHA256_128BITTAG_RAW", hzVar.p());
        hz hzVar2 = new hz(17);
        hzVar2.d(32);
        hzVar2.h(32);
        ak1 ak1Var2 = ak1.f12053b;
        hzVar2.f15436e = ak1Var2;
        hzVar2.f15435d = zj1Var;
        map.put("HMAC_SHA256_256BITTAG", hzVar2.p());
        hz hzVar3 = new hz(17);
        hzVar3.d(32);
        hzVar3.h(32);
        hzVar3.f15436e = ak1Var;
        hzVar3.f15435d = zj1Var;
        map.put("HMAC_SHA256_256BITTAG_RAW", hzVar3.p());
        hz hzVar4 = new hz(17);
        hzVar4.d(64);
        hzVar4.h(16);
        hzVar4.f15436e = ak1Var2;
        zj1 zj1Var2 = zj1.f22645f;
        hzVar4.f15435d = zj1Var2;
        map.put("HMAC_SHA512_128BITTAG", hzVar4.p());
        hz hzVar5 = new hz(17);
        hzVar5.d(64);
        hzVar5.h(16);
        hzVar5.f15436e = ak1Var;
        hzVar5.f15435d = zj1Var2;
        map.put("HMAC_SHA512_128BITTAG_RAW", hzVar5.p());
        hz hzVar6 = new hz(17);
        hzVar6.d(64);
        hzVar6.h(32);
        hzVar6.f15436e = ak1Var2;
        hzVar6.f15435d = zj1Var2;
        map.put("HMAC_SHA512_256BITTAG", hzVar6.p());
        hz hzVar7 = new hz(17);
        hzVar7.d(64);
        hzVar7.h(32);
        hzVar7.f15436e = ak1Var;
        hzVar7.f15435d = zj1Var2;
        map.put("HMAC_SHA512_256BITTAG_RAW", hzVar7.p());
        map.put("HMAC_SHA512_512BITTAG", gk1.f14892b);
        hz hzVar8 = new hz(17);
        hzVar8.d(64);
        hzVar8.h(64);
        hzVar8.f15436e = ak1Var;
        hzVar8.f15435d = zj1Var2;
        map.put("HMAC_SHA512_512BITTAG_RAW", hzVar8.p());
        ti1Var.b(Collections.unmodifiableMap(map));
        qi1 qi1Var = qi1.f19092b;
        qi1Var.a(yj1.f22288e, bk1.class);
        si1.f19978b.a(yj1.f22287d, bk1.class);
        ei1 ei1Var = ei1.f13985d;
        ei1Var.c(yj1.f22286c, i10, true);
        if (uh1.a()) {
            return;
        }
        ej1 ej1Var = uj1.f20807a;
        if (!jc1.e(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        vi1Var.c(hk1.f15318a);
        vi1Var.d(hk1.f15319b);
        vi1Var.a(hk1.f15320c);
        vi1Var.b(hk1.f15321d);
        qi1Var.a(pf1.l, vj1.class);
        ui1Var.a(uj1.f20807a);
        ui1Var.a(uj1.f20808b);
        HashMap map2 = new HashMap();
        vj1 vj1Var = gk1.f14893c;
        map2.put("AES_CMAC", vj1Var);
        map2.put("AES256_CMAC", vj1Var);
        ay0 ay0Var = new ay0(8);
        ay0Var.c(32);
        ay0Var.f(16);
        ay0Var.f12539d = af1.f12024r;
        map2.put("AES256_CMAC_RAW", ay0Var.m());
        ti1Var.b(Collections.unmodifiableMap(map2));
        ei1Var.a(uj1.f20809c, true);
    }
}
