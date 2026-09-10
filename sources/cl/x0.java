package cl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class x0 extends y0 implements zk.f0, zk.p0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final pm.y f6635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x0 f6636k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(zk.b containingDeclaration, x0 x0Var, int i10, al.j annotations, yl.f name, pm.y outType, boolean z10, boolean z11, boolean z12, pm.y yVar, zk.j0 source) {
        super(containingDeclaration, annotations, name, outType, source);
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.n.f(annotations, "annotations");
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(outType, "outType");
        kotlin.jvm.internal.n.f(source, "source");
        this.f6631f = i10;
        this.f6632g = z10;
        this.f6633h = z11;
        this.f6634i = z12;
        this.f6635j = yVar;
        this.f6636k = x0Var == null ? this : x0Var;
    }

    @Override // zk.p0
    public final boolean I() {
        return false;
    }

    public x0 J0(xk.g gVar, yl.f fVar, int i10) {
        al.j annotations = getAnnotations();
        kotlin.jvm.internal.n.e(annotations, "annotations");
        pm.y type = getType();
        kotlin.jvm.internal.n.e(type, "type");
        return new x0(gVar, null, i10, annotations, fVar, type, K0(), this.f6633h, this.f6634i, this.f6635j, zk.j0.C9);
    }

    public final boolean K0() {
        return this.f6632g && ((zk.c) e()).getKind() != 2;
    }

    @Override // cl.q, zk.j
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public final zk.b e() {
        zk.j jVarE = super.e();
        kotlin.jvm.internal.n.d(jVarE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (zk.b) jVarE;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public final x0 a() {
        x0 x0Var = this.f6636k;
        return x0Var == this ? this : x0Var.a();
    }

    @Override // zk.l0
    public final zk.k b(pm.w0 substitutor) {
        kotlin.jvm.internal.n.f(substitutor, "substitutor");
        if (substitutor.f48483a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.o(this, obj);
    }

    @Override // zk.b
    public final Collection f() {
        Collection collectionF = e().f();
        kotlin.jvm.internal.n.e(collectionF, "containingDeclaration.overriddenDescriptors");
        Collection collection = collectionF;
        ArrayList arrayList = new ArrayList(xj.p.W(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add((x0) ((zk.b) it.next()).B().get(this.f6631f));
        }
        return arrayList;
    }

    @Override // zk.m, zk.v
    public final il.o getVisibility() {
        il.o LOCAL = zk.n.f54979f;
        kotlin.jvm.internal.n.e(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // zk.p0
    public final /* bridge */ /* synthetic */ dm.g h0() {
        return null;
    }
}
