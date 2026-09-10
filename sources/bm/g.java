package bm;

import cl.o0;
import kotlin.jvm.internal.n;
import pm.c0;
import pm.y;
import zk.h0;
import zk.n0;
import zk.p0;
import zk.t;
import zk.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    static {
        yl.b.j(new yl.c("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(zk.c cVar) {
        n.f(cVar, "<this>");
        if (!(cVar instanceof o0)) {
            return false;
        }
        h0 correspondingProperty = ((o0) cVar).J0();
        n.e(correspondingProperty, "correspondingProperty");
        return d(correspondingProperty);
    }

    public static final boolean b(zk.j jVar) {
        n.f(jVar, "<this>");
        return (jVar instanceof zk.e) && (((zk.e) jVar).O() instanceof t);
    }

    public static final boolean c(y yVar) {
        n.f(yVar, "<this>");
        zk.g gVarE = yVar.P().e();
        if (gVarE != null) {
            return b(gVarE);
        }
        return false;
    }

    public static final boolean d(p0 p0Var) {
        if (p0Var.J() != null) {
            return false;
        }
        zk.j jVarE = p0Var.e();
        yl.f fVar = null;
        zk.e eVar = jVarE instanceof zk.e ? (zk.e) jVarE : null;
        if (eVar != null) {
            int i10 = fm.e.f41020a;
            n0 n0VarO = eVar.O();
            t tVar = n0VarO instanceof t ? (t) n0VarO : null;
            if (tVar != null) {
                fVar = tVar.f54998a;
            }
        }
        return n.a(fVar, p0Var.getName());
    }

    public static final boolean e(zk.j jVar) {
        if (b(jVar)) {
            return true;
        }
        return (jVar instanceof zk.e) && (((zk.e) jVar).O() instanceof x);
    }

    public static final c0 f(y yVar) {
        n.f(yVar, "<this>");
        zk.g gVarE = yVar.P().e();
        zk.e eVar = gVarE instanceof zk.e ? (zk.e) gVarE : null;
        if (eVar != null) {
            int i10 = fm.e.f41020a;
            n0 n0VarO = eVar.O();
            t tVar = n0VarO instanceof t ? (t) n0VarO : null;
            if (tVar != null) {
                return (c0) tVar.f54999b;
            }
        }
        return null;
    }
}
