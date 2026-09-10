package im;

import cl.q0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.v;
import qk.w;
import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ w[] f43194e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nm.h f43195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.i f43196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.i f43197d;

    static {
        e0 e0Var = d0.f44761a;
        f43194e = new w[]{e0Var.g(new v(e0Var.b(r.class), "functions", "getFunctions()Ljava/util/List;")), e0Var.g(new v(e0Var.b(r.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public r(om.l storageManager, nm.h hVar) {
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f43195b = hVar;
        this.f43196c = new om.i(storageManager, new q(this, 0));
        this.f43197d = new om.i(storageManager, new q(this, 1));
    }

    @Override // im.o, im.n
    public final Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        List list = (List) j1.f.w(this.f43196c, f43194e[0]);
        ym.f fVar = new ym.f();
        for (Object obj : list) {
            if (kotlin.jvm.internal.n.a(((q0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // im.o, im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        return null;
    }

    @Override // im.o, im.p
    public final Collection d(f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        w[] wVarArr = f43194e;
        return xj.n.B0((List) j1.f.w(this.f43197d, wVarArr[1]), (List) j1.f.w(this.f43196c, wVarArr[0]));
    }

    @Override // im.o, im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        List list = (List) j1.f.w(this.f43197d, f43194e[1]);
        ym.f fVar = new ym.f();
        for (Object obj : list) {
            if (kotlin.jvm.internal.n.a(((h0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }
}
