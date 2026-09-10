package fb;

import ea.f2;
import eb.o;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import jb.t1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k {
    static {
        int i10 = t1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() throws GeneralSecurityException {
        eb.n nVar = eb.n.f40002b;
        nVar.c(e.f40735c);
        nVar.b(e.f40736d);
        nVar.c(e.f40734b);
        int i10 = g.f40747f;
        if (!defpackage.e.b(i10)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        f2 f2Var = gb.c.f41814a;
        o oVar = o.f40004b;
        oVar.f(gb.c.f41816c);
        oVar.e(gb.c.f41817d);
        oVar.d(gb.c.f41818e);
        oVar.c(gb.c.f41819f);
        nVar.b(g.f40742a);
        nVar.b(g.f40743b);
        eb.m mVar = eb.m.f40000b;
        HashMap map = new HashMap();
        map.put("HMAC_SHA256_128BITTAG", n.f40763a);
        k5.g gVarB = j.b();
        gVarB.f44325a = 32;
        gVarB.f44326b = 16;
        i iVar = i.f40757e;
        gVarB.f44328d = iVar;
        h hVar = h.f40750d;
        gVarB.f44327c = hVar;
        map.put("HMAC_SHA256_128BITTAG_RAW", gVarB.d());
        k5.g gVarB2 = j.b();
        gVarB2.f44325a = 32;
        gVarB2.f44326b = 32;
        i iVar2 = i.f40754b;
        gVarB2.f44328d = iVar2;
        gVarB2.f44327c = hVar;
        map.put("HMAC_SHA256_256BITTAG", gVarB2.d());
        k5.g gVarB3 = j.b();
        gVarB3.f44325a = 32;
        gVarB3.f44326b = 32;
        gVarB3.f44328d = iVar;
        gVarB3.f44327c = hVar;
        map.put("HMAC_SHA256_256BITTAG_RAW", gVarB3.d());
        k5.g gVarB4 = j.b();
        gVarB4.f44325a = 64;
        gVarB4.f44326b = 16;
        gVarB4.f44328d = iVar2;
        h hVar2 = h.f40752f;
        gVarB4.f44327c = hVar2;
        map.put("HMAC_SHA512_128BITTAG", gVarB4.d());
        k5.g gVarB5 = j.b();
        gVarB5.f44325a = 64;
        gVarB5.f44326b = 16;
        gVarB5.f44328d = iVar;
        gVarB5.f44327c = hVar2;
        map.put("HMAC_SHA512_128BITTAG_RAW", gVarB5.d());
        k5.g gVarB6 = j.b();
        gVarB6.f44325a = 64;
        gVarB6.f44326b = 32;
        gVarB6.f44328d = iVar2;
        gVarB6.f44327c = hVar2;
        map.put("HMAC_SHA512_256BITTAG", gVarB6.d());
        k5.g gVarB7 = j.b();
        gVarB7.f44325a = 64;
        gVarB7.f44326b = 32;
        gVarB7.f44328d = iVar;
        gVarB7.f44327c = hVar2;
        map.put("HMAC_SHA512_256BITTAG_RAW", gVarB7.d());
        map.put("HMAC_SHA512_512BITTAG", n.f40764b);
        k5.g gVarB8 = j.b();
        gVarB8.f44325a = 64;
        gVarB8.f44326b = 64;
        gVarB8.f44328d = iVar;
        gVarB8.f44327c = hVar2;
        map.put("HMAC_SHA512_512BITTAG_RAW", gVarB8.d());
        mVar.b(Collections.unmodifiableMap(map));
        eb.k kVar = eb.k.f39996b;
        kVar.a(g.f40746e, j.class);
        eb.l.f39998b.a(g.f40745d, j.class);
        eb.a aVar = eb.a.f39960d;
        aVar.e(g.f40744c, i10);
        if (ab.a.a()) {
            return;
        }
        bb.b bVar = b.f40722a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering AES CMAC is not supported in FIPS mode");
        }
        oVar.f(gb.a.f41810a);
        oVar.e(gb.a.f41811b);
        oVar.d(gb.a.f41812c);
        oVar.c(gb.a.f41813d);
        kVar.a(b.f40722a, d.class);
        nVar.b(b.f40723b);
        nVar.b(b.f40724c);
        HashMap map2 = new HashMap();
        d dVar = n.f40765c;
        map2.put("AES_CMAC", dVar);
        map2.put("AES256_CMAC", dVar);
        g9.k kVarB = d.b();
        kVarB.E(32);
        kVarB.F(16);
        kVarB.f41772d = c.f40729e;
        map2.put("AES256_CMAC_RAW", kVarB.f());
        mVar.b(Collections.unmodifiableMap(map2));
        aVar.d(b.f40725d);
    }
}
