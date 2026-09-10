package ql;

import java.util.Map;
import pm.y;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements al.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f49133a = new b();

    @Override // al.c
    public final j0 c() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // al.c
    public final Map d() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // al.c
    public final yl.c e() {
        zk.e eVarD = fm.e.d(this);
        if (eVarD != null) {
            if (rm.i.f(eVarD)) {
                eVarD = null;
            }
            if (eVarD != null) {
                return fm.e.c(eVarD);
            }
        }
        return null;
    }

    @Override // al.c
    public final y getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
