package im;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import pm.t0;
import pm.w0;
import zk.l0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f43198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f43199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f43200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wj.j f43201e;

    public s(n workerScope, w0 givenSubstitutor) {
        kotlin.jvm.internal.n.f(workerScope, "workerScope");
        kotlin.jvm.internal.n.f(givenSubstitutor, "givenSubstitutor");
        this.f43198b = workerScope;
        r9.b.u(new al.l(givenSubstitutor, 10));
        t0 t0VarF = givenSubstitutor.f();
        kotlin.jvm.internal.n.e(t0VarF, "givenSubstitutor.substitution");
        this.f43199c = new w0(com.bumptech.glide.c.L(t0VarF));
        this.f43201e = r9.b.u(new al.l(this, 9));
    }

    @Override // im.n
    public final Collection a(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return h(this.f43198b.a(name, bVar));
    }

    @Override // im.n
    public final Set b() {
        return this.f43198b.b();
    }

    @Override // im.p
    public final zk.g c(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        zk.g gVarC = this.f43198b.c(name, location);
        if (gVarC != null) {
            return (zk.g) i(gVarC);
        }
        return null;
    }

    @Override // im.p
    public final Collection d(f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return (Collection) this.f43201e.getValue();
    }

    @Override // im.n
    public final Set e() {
        return this.f43198b.e();
    }

    @Override // im.n
    public final Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return h(this.f43198b.f(name, bVar));
    }

    @Override // im.n
    public final Set g() {
        return this.f43198b.g();
    }

    public final Collection h(Collection collection) {
        if (this.f43199c.f48483a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((zk.j) it.next()));
        }
        return linkedHashSet;
    }

    public final zk.j i(zk.j jVar) {
        w0 w0Var = this.f43199c;
        if (w0Var.f48483a.e()) {
            return jVar;
        }
        if (this.f43200d == null) {
            this.f43200d = new HashMap();
        }
        HashMap map = this.f43200d;
        kotlin.jvm.internal.n.c(map);
        Object objB = map.get(jVar);
        if (objB == null) {
            if (!(jVar instanceof l0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + jVar).toString());
            }
            objB = ((l0) jVar).b(w0Var);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + jVar + " substitution fails");
            }
            map.put(jVar, objB);
        }
        return (zk.j) objB;
    }
}
