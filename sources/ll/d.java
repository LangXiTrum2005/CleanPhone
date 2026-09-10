package ll;

import cl.t0;
import com.google.android.gms.internal.measurement.nf;
import fl.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.n;
import ml.r;
import om.f;
import om.g;
import om.l;
import xj.v;
import zk.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nf f45514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final om.e f45515b;

    public d(a aVar) {
        this.f45514a = new nf(aVar, b.f45509b, new wj.b(null));
        l lVar = (l) aVar.f45485a;
        lVar.getClass();
        this.f45515b = new om.e(lVar, new ConcurrentHashMap(3, 1.0f, 2), new f(), 0);
    }

    @Override // zk.d0
    public final void a(yl.c fqName, ArrayList arrayList) {
        n.f(fqName, "fqName");
        arrayList.add(c(fqName));
    }

    @Override // zk.d0
    public final boolean b(yl.c fqName) {
        n.f(fqName, "fqName");
        ((a) this.f45514a.f23782b).f45486b.getClass();
        return false;
    }

    public final r c(yl.c fqName) throws Throwable {
        ((a) this.f45514a.f23782b).f45486b.getClass();
        n.f(fqName, "fqName");
        t0 t0Var = new t0(4, this, new x(fqName));
        om.e eVar = this.f45515b;
        eVar.getClass();
        Object objInvoke = eVar.invoke(new g(fqName, t0Var));
        if (objInvoke != null) {
            return (r) objInvoke;
        }
        om.e.a(3);
        throw null;
    }

    @Override // zk.d0
    public final Collection h(yl.c fqName, jk.b bVar) {
        n.f(fqName, "fqName");
        Collection collection = (List) c(fqName).f46236k.invoke();
        if (collection == null) {
            collection = v.f53866a;
        }
        return collection;
    }

    public final String toString() {
        return "LazyJavaPackageFragmentProvider of module " + ((a) this.f45514a.f23782b).f45498o;
    }
}
