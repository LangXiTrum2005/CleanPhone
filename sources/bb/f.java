package bb;

import ea.f2;
import eb.k;
import eb.l;
import eb.m;
import eb.n;
import eb.o;
import eb.s;
import eb.x;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import jb.t1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    static {
        int i10 = t1.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void a() {
        n nVar = n.f40002b;
        nVar.c(g.f5526a);
        nVar.b(g.f5527b);
        if (ab.a.a()) {
            return;
        }
        x xVar = c.f5516a;
        if (!defpackage.e.c(1)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        s sVar = cb.a.f5965a;
        o oVar = o.f40004b;
        oVar.f(cb.a.f5965a);
        oVar.e(cb.a.f5966b);
        oVar.d(cb.a.f5967c);
        oVar.c(cb.a.f5968d);
        nVar.b(c.f5516a);
        m mVar = m.f40000b;
        HashMap map = new HashMap();
        map.put("AES256_SIV", h.f5528a);
        f2 f2VarB = e.b();
        f2VarB.E(64);
        f2VarB.f39410c = d.f5522d;
        map.put("AES256_SIV_RAW", f2VarB.b());
        mVar.b(Collections.unmodifiableMap(map));
        l.f39998b.a(c.f5518c, e.class);
        k.f39996b.a(c.f5519d, e.class);
        eb.a.f39960d.d(c.f5517b);
    }
}
