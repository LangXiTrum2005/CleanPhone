package fm;

import cl.h0;
import cl.l0;
import cl.x0;
import com.ironsource.X3;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.n;
import wk.h;
import yl.f;
import ym.l;
import zk.b0;
import zk.g;
import zk.g0;
import zk.j;
import zk.k;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41020a = 0;

    static {
        f.e(X3.i.X);
    }

    public static final boolean a(x0 x0Var) {
        Boolean boolG = l.g(j1.f.C(x0Var), a.f41013b, b.f41015b);
        n.e(boolG, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolG.booleanValue();
    }

    public static zk.c b(zk.c cVar, jk.b bVar) {
        n.f(cVar, "<this>");
        return (zk.c) l.e(j1.f.C(cVar), new a(1), new c(new c0(), bVar));
    }

    public static final yl.c c(k kVar) {
        n.f(kVar, "<this>");
        yl.e eVarH = h(kVar);
        if (!eVarH.d()) {
            eVarH = null;
        }
        if (eVarH != null) {
            return eVarH.g();
        }
        return null;
    }

    public static final zk.e d(al.c cVar) {
        n.f(cVar, "<this>");
        g gVarE = cVar.getType().P().e();
        if (gVarE instanceof zk.e) {
            return (zk.e) gVarE;
        }
        return null;
    }

    public static final h e(j jVar) {
        n.f(jVar, "<this>");
        return j(jVar).d();
    }

    public static final yl.b f(g gVar) {
        j jVarE;
        yl.b bVarF;
        if (gVar == null || (jVarE = gVar.e()) == null) {
            return null;
        }
        if (jVarE instanceof b0) {
            return new yl.b(((h0) ((b0) jVarE)).f6518e, gVar.getName());
        }
        if (!(jVarE instanceof zk.h) || (bVarF = f((g) jVarE)) == null) {
            return null;
        }
        return bVarF.d(gVar.getName());
    }

    public static final yl.c g(j jVar) {
        n.f(jVar, "<this>");
        yl.c cVarH = bm.e.h(jVar);
        return cVarH != null ? cVarH : bm.e.g(jVar.e()).b(jVar.getName()).g();
    }

    public static final yl.e h(j jVar) {
        n.f(jVar, "<this>");
        yl.e eVarG = bm.e.g(jVar);
        n.e(eVarG, "getFqName(this)");
        return eVarG;
    }

    public static final void i(w wVar) {
        n.f(wVar, "<this>");
        if (wVar.n0(qm.g.f49176a) != null) {
            throw new ClassCastException();
        }
    }

    public static final w j(j jVar) {
        n.f(jVar, "<this>");
        w wVarD = bm.e.d(jVar);
        n.e(wVarD, "getContainingModule(this)");
        return wVarD;
    }

    public static final zk.c k(zk.c cVar) {
        n.f(cVar, "<this>");
        if (!(cVar instanceof g0)) {
            return cVar;
        }
        zk.h0 correspondingProperty = ((l0) ((g0) cVar)).J0();
        n.e(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }
}
