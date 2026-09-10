package nm;

import cl.i0;
import cl.u0;
import cl.y;
import cl.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import pm.c0;
import pm.n0;
import pm.w0;
import pm.y0;
import tl.s0;
import xj.v;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s extends cl.q implements j, zk.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final il.o f46858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f46859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final cl.f f46860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final om.o f46861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s0 f46862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vl.f f46863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l3.i f46864k;
    public final vl.g l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f46865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object f46866n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c0 f46867o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c0 f46868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public List f46869q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c0 f46870r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(om.o storageManager, zk.j containingDeclaration, al.j jVar, yl.f fVar, il.o visibility, s0 proto, vl.f nameResolver, l3.i typeTable, vl.g versionRequirementTable, i iVar) {
        super(containingDeclaration, jVar, fVar, j0.C9);
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        kotlin.jvm.internal.n.f(containingDeclaration, "containingDeclaration");
        kotlin.jvm.internal.n.f(visibility, "visibility");
        kotlin.jvm.internal.n.f(proto, "proto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(typeTable, "typeTable");
        kotlin.jvm.internal.n.f(versionRequirementTable, "versionRequirementTable");
        this.f46858e = visibility;
        this.f46860g = new cl.f(this);
        this.f46861h = storageManager;
        this.f46862i = proto;
        this.f46863j = nameResolver;
        this.f46864k = typeTable;
        this.l = versionRequirementTable;
        this.f46865m = iVar;
    }

    @Override // nm.j
    public final vl.f C() {
        throw null;
    }

    @Override // nm.j
    public final i D() {
        return this.f46865m;
    }

    public final zk.e J0() {
        if (pm.c.j(K0())) {
            return null;
        }
        zk.g gVarE = K0().P().e();
        if (gVarE instanceof zk.e) {
            return (zk.e) gVarE;
        }
        return null;
    }

    public final c0 K0() {
        c0 c0Var = this.f46868p;
        if (c0Var != null) {
            return c0Var;
        }
        kotlin.jvm.internal.n.l("expandedType");
        throw null;
    }

    public final c0 L0() {
        c0 c0Var = this.f46867o;
        if (c0Var != null) {
            return c0Var;
        }
        kotlin.jvm.internal.n.l("underlyingType");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    public final void M0(List list, c0 underlyingType, c0 expandedType) {
        im.n nVarR;
        c0 c0VarT;
        cl.l lVarB;
        u0 u0Var;
        List list2;
        kotlin.jvm.internal.n.f(underlyingType, "underlyingType");
        kotlin.jvm.internal.n.f(expandedType, "expandedType");
        this.f46859f = list;
        this.f46867o = underlyingType;
        this.f46868p = expandedType;
        this.f46869q = zk.u.c(this);
        zk.e eVarJ0 = J0();
        if (eVarJ0 == null || (nVarR = eVarJ0.R()) == null) {
            nVarR = im.m.f43190b;
        }
        im.n nVar = nVarR;
        int i10 = 0;
        cl.e eVar = new cl.e(this, 0);
        rm.f fVar = y0.f48489a;
        if (rm.i.f(this)) {
            c0VarT = rm.i.c(rm.h.UNABLE_TO_SUBSTITUTE_TYPE, toString());
        } else {
            n0 n0VarN = n();
            if (n0VarN == null) {
                y0.a(12);
                throw null;
            }
            List listD = y0.d(((cl.f) n0VarN).getParameters());
            pm.j0.f48443b.getClass();
            c0VarT = pm.f.t(pm.j0.f48444c, n0VarN, listD, false, nVar, eVar);
        }
        this.f46870r = c0VarT;
        zk.e eVarJ1 = J0();
        List list3 = v.f53866a;
        if (eVarJ1 != null) {
            Collection<cl.l> collectionP = eVarJ1.p();
            kotlin.jvm.internal.n.e(collectionP, "classDescriptor.constructors");
            ArrayList arrayList = new ArrayList();
            for (cl.l it : collectionP) {
                i0 i0Var = u0.G;
                kotlin.jvm.internal.n.e(it, "it");
                i0Var.getClass();
                om.o storageManager = this.f46861h;
                kotlin.jvm.internal.n.f(storageManager, "storageManager");
                w0 w0VarD = J0() == null ? null : w0.d(K0());
                if (w0VarD == null || (lVarB = it.b(w0VarD)) == null) {
                    u0Var = null;
                } else {
                    al.j annotations = it.getAnnotations();
                    cl.l lVar = it;
                    int kind = lVar.getKind();
                    d5.u.u(kind, "constructor.kind");
                    j0 j0VarC = c();
                    kotlin.jvm.internal.n.e(j0VarC, "typeAliasDescriptor.source");
                    u0Var = new u0(storageManager, this, lVarB, null, annotations, kind, j0VarC);
                    List listB = lVar.B();
                    if (listB == null) {
                        y.z0(28);
                        throw null;
                    }
                    ArrayList arrayListN0 = y.N0(u0Var, listB, w0VarD, false, false, null);
                    if (arrayListN0 == null) {
                        u0Var = null;
                    } else {
                        c0 c0VarA = pm.c.A(pm.c.l(lVarB.f6639g.b0()), g());
                        z zVar = lVar.f6642j;
                        int i11 = 1;
                        al.h hVar = al.i.f3645a;
                        z zVarK = zVar != null ? bm.m.k(u0Var, w0VarD.g(1, zVar.getType()), hVar) : null;
                        zk.e eVarJ2 = J0();
                        if (eVarJ2 != null) {
                            List listP0 = lVar.p0();
                            kotlin.jvm.internal.n.e(listP0, "constructor.contextReceiverParameters");
                            List list4 = listP0;
                            ArrayList arrayList2 = new ArrayList(xj.p.W(list4, 10));
                            int i12 = i10;
                            for (Object obj : list4) {
                                int i13 = i12 + 1;
                                if (i12 < 0) {
                                    xj.o.V();
                                    throw null;
                                }
                                z zVar2 = (z) obj;
                                pm.y yVarG = w0VarD.g(i11, zVar2.getType());
                                jm.d dVarJ0 = zVar2.J0();
                                kotlin.jvm.internal.n.d(dVarJ0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                                jm.a aVar = new jm.a(eVarJ2, yVarG, ((jm.a) dVarJ0).H0());
                                an.g gVar = yl.g.f54516a;
                                arrayList2.add(new z(eVarJ2, aVar, hVar, yl.f.e("_context_receiver_" + i12)));
                                i12 = i13;
                                i11 = 1;
                            }
                            list2 = arrayList2;
                        } else {
                            list2 = list3;
                        }
                        u0Var.O0(zVarK, null, list2, i(), arrayListN0, c0VarA, 1, this.f46858e);
                    }
                }
                if (u0Var != null) {
                    arrayList.add(u0Var);
                }
                i10 = 0;
            }
            list3 = arrayList;
        }
        this.f46866n = list3;
    }

    @Override // zk.v
    public final boolean S() {
        return false;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    public final zk.g a() {
        return this;
    }

    @Override // zk.l0
    public final zk.k b(w0 substitutor) {
        kotlin.jvm.internal.n.f(substitutor, "substitutor");
        if (substitutor.f48483a.e()) {
            return this;
        }
        zk.j containingDeclaration = e();
        kotlin.jvm.internal.n.e(containingDeclaration, "containingDeclaration");
        al.j annotations = getAnnotations();
        kotlin.jvm.internal.n.e(annotations, "annotations");
        yl.f name = getName();
        kotlin.jvm.internal.n.e(name, "name");
        s sVar = new s(this.f46861h, containingDeclaration, annotations, name, this.f46858e, this.f46862i, this.f46863j, this.f46864k, this.l, this.f46865m);
        sVar.M0(i(), pm.c.b(substitutor.g(1, L0())), pm.c.b(substitutor.g(1, K0())));
        return sVar;
    }

    @Override // zk.j
    public final Object c0(zk.l lVar, Object obj) {
        return lVar.w(this, obj);
    }

    @Override // zk.v
    public final boolean f0() {
        return false;
    }

    @Override // zk.g
    public final c0 g() {
        c0 c0Var = this.f46870r;
        if (c0Var != null) {
            return c0Var;
        }
        kotlin.jvm.internal.n.l("defaultTypeImpl");
        throw null;
    }

    @Override // zk.v
    public final il.o getVisibility() {
        return this.f46858e;
    }

    @Override // zk.h
    public final List i() {
        List list = this.f46859f;
        if (list != null) {
            return list;
        }
        kotlin.jvm.internal.n.l("declaredTypeParametersImpl");
        throw null;
    }

    @Override // zk.v
    public final boolean isExternal() {
        return false;
    }

    @Override // zk.g
    public final n0 n() {
        return this.f46860g;
    }

    @Override // cl.p
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // zk.h
    public final boolean u() {
        return y0.c(L0(), new al.f(this, 3), null);
    }

    @Override // nm.j
    public final l3.i z() {
        throw null;
    }

    @Override // cl.q, cl.p, zk.j, zk.g
    public final zk.j a() {
        return this;
    }

    @Override // cl.q
    /* JADX INFO: renamed from: I0 */
    public final zk.k a() {
        return this;
    }
}
