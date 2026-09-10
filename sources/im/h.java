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
public abstract class h extends o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ w[] f43178d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cl.c f43179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final om.i f43180c;

    static {
        e0 e0Var = d0.f44761a;
        f43178d = new w[]{e0Var.g(new v(e0Var.b(h.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public h(om.l lVar, cl.c cVar) {
        this.f43179b = cVar;
        this.f43180c = new om.i(lVar, new al.l(this, 7));
    }

    @Override // im.o, im.n
    public final Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        List list = (List) j1.f.w(this.f43180c, f43178d[0]);
        ym.f fVar = new ym.f();
        for (Object obj : list) {
            if ((obj instanceof q0) && kotlin.jvm.internal.n.a(((q0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    @Override // im.o, im.p
    public final Collection d(f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        if (!kindFilter.a(f.f43168n.f43175b)) {
            return xj.v.f53866a;
        }
        return (List) j1.f.w(this.f43180c, f43178d[0]);
    }

    @Override // im.o, im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        List list = (List) j1.f.w(this.f43180c, f43178d[0]);
        ym.f fVar = new ym.f();
        for (Object obj : list) {
            if ((obj instanceof h0) && kotlin.jvm.internal.n.a(((h0) obj).getName(), name)) {
                fVar.add(obj);
            }
        }
        return fVar;
    }

    public abstract List h();
}
