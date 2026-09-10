package jl;

import cl.x0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import pm.y;
import wk.l;
import zk.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f43973e = new d(1);

    @Override // jk.b
    public final Object invoke(Object obj) {
        w module = (w) obj;
        n.f(module, "module");
        x0 x0VarR = go.c.r(c.f43970b, module.d().i(l.f53356t));
        y type = x0VarR != null ? x0VarR.getType() : null;
        if (type == null) {
            return rm.i.c(rm.h.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]);
        }
        return type;
    }
}
