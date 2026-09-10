package zk;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f54963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f54964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54965c;

    public d(m0 m0Var, h hVar, int i10) {
        this.f54963a = m0Var;
        this.f54964b = hVar;
        this.f54965c = i10;
    }

    @Override // zk.m0
    public final om.o H() {
        return this.f54963a.H();
    }

    @Override // zk.m0
    public final boolean L() {
        return true;
    }

    @Override // zk.g
    public final g a() {
        return this.f54963a.a();
    }

    @Override // zk.k
    public final j0 c() {
        return this.f54963a.c();
    }

    @Override // zk.j
    public final Object c0(l lVar, Object obj) {
        return this.f54963a.c0(lVar, obj);
    }

    @Override // zk.j
    public final j e() {
        return this.f54964b;
    }

    @Override // zk.g
    public final pm.c0 g() {
        return this.f54963a.g();
    }

    @Override // al.a
    public final al.j getAnnotations() {
        return this.f54963a.getAnnotations();
    }

    @Override // zk.m0
    public final int getIndex() {
        return this.f54963a.getIndex() + this.f54965c;
    }

    @Override // zk.j
    public final yl.f getName() {
        return this.f54963a.getName();
    }

    @Override // zk.m0
    public final List getUpperBounds() {
        return this.f54963a.getUpperBounds();
    }

    @Override // zk.g
    public final pm.n0 n() {
        return this.f54963a.n();
    }

    @Override // zk.m0
    public final boolean q() {
        return this.f54963a.q();
    }

    public final String toString() {
        return this.f54963a + "[inner-copy]";
    }

    @Override // zk.m0
    public final int v() {
        return this.f54963a.v();
    }

    @Override // zk.j, zk.g
    public final j a() {
        return this.f54963a.a();
    }

    @Override // zk.m0, zk.g
    public final m0 a() {
        return this.f54963a.a();
    }
}
