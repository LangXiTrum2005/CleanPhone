package wk;

import cl.g0;
import cl.r;
import cl.v0;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import zk.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f53378a;

    static {
        rm.i iVar = rm.i.f49698a;
        r rVar = new r(rm.i.f49699b, m.f53367e, 0);
        yl.f fVarF = m.f53368f.f();
        om.b bVar = om.l.f47582e;
        g0 g0Var = new g0(rVar, fVarF, bVar);
        g0Var.f6511h = 4;
        il.o oVar = zk.n.f54978e;
        if (oVar == null) {
            g0.s(9);
            throw null;
        }
        g0Var.f6512i = oVar;
        List listC = j1.f.C(v0.M0(g0Var, 2, yl.f.e(RequestConfiguration.MAX_AD_CONTENT_RATING_T), 0, bVar));
        if (g0Var.f6514k != null) {
            throw new IllegalStateException("Type parameters are already set for " + g0Var.getName());
        }
        ArrayList arrayList = new ArrayList(listC);
        g0Var.f6514k = arrayList;
        g0Var.f6513j = new pm.k(g0Var, arrayList, g0Var.l, g0Var.f6515m);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            g0.s(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((cl.l) ((s) it.next())).f6639g = g0Var.g();
        }
        f53378a = g0Var;
    }
}
