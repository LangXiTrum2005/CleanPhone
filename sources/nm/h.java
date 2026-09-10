package nm;

import cl.z;
import com.google.android.gms.internal.play_billing.q1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lm.b0;
import lm.v;
import pm.c0;
import tl.a0;
import tl.d1;
import tl.e1;
import tl.q0;
import tl.w0;
import zk.h0;
import zk.i0;
import zk.j0;
import zk.k0;
import zk.n0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends cl.c implements zk.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tl.j f46815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vl.a f46816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j0 f46817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yl.b f46818h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f46819i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final il.o f46820j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f46821k;
    public final com.google.android.gms.internal.consent_sdk.d l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final im.o f46822m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ml.h f46823n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final i0 f46824o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zc.u f46825p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zk.j f46826q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final om.h f46827r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final om.i f46828s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final om.i f46829t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final om.h f46830u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final lm.s f46831v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final al.j f46832w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.google.android.gms.internal.consent_sdk.d outerContext, tl.j classProto, vl.f nameResolver, vl.a aVar, j0 sourceElement) {
        int i10;
        super(((lm.i) outerContext.f22981a).f45537a, com.bumptech.glide.c.r(nameResolver, classProto.f51297e).i());
        kotlin.jvm.internal.n.f(outerContext, "outerContext");
        kotlin.jvm.internal.n.f(classProto, "classProto");
        kotlin.jvm.internal.n.f(nameResolver, "nameResolver");
        kotlin.jvm.internal.n.f(sourceElement, "sourceElement");
        this.f46815e = classProto;
        this.f46816f = aVar;
        this.f46817g = sourceElement;
        this.f46818h = com.bumptech.glide.c.r(nameResolver, classProto.f51297e);
        this.f46819i = lm.j.d((a0) vl.e.f52634e.c(classProto.f51296d));
        this.f46820j = com.bumptech.glide.d.t((e1) vl.e.f52633d.c(classProto.f51296d));
        tl.i iVar = (tl.i) vl.e.f52635f.c(classProto.f51296d);
        int i11 = 2;
        int i12 = 4;
        int i13 = 5;
        int i14 = 3;
        int i15 = 1;
        switch (iVar == null ? -1 : v.f45595b[iVar.ordinal()]) {
            case 2:
                i10 = 2;
                break;
            case 3:
                i10 = 3;
                break;
            case 4:
                i10 = 4;
                break;
            case 5:
                i10 = 5;
                break;
            case 6:
            case 7:
                i10 = 6;
                break;
            default:
                i10 = 1;
                break;
        }
        this.f46821k = i10;
        List list = classProto.f51299g;
        kotlin.jvm.internal.n.e(list, "classProto.typeParameterList");
        w0 w0Var = classProto.E;
        kotlin.jvm.internal.n.e(w0Var, "classProto.typeTable");
        l3.i iVar2 = new l3.i(w0Var);
        vl.g gVar = vl.g.f52655b;
        d1 d1Var = classProto.G;
        kotlin.jvm.internal.n.e(d1Var, "classProto.versionRequirementTable");
        com.google.android.gms.internal.consent_sdk.d dVarA = outerContext.a(this, list, nameResolver, iVar2, q1.h(d1Var), aVar);
        lm.i iVar3 = (lm.i) dVarA.f22981a;
        this.l = dVarA;
        this.f46822m = i10 == 3 ? new im.r(iVar3.f45537a, this) : im.m.f43190b;
        this.f46823n = new ml.h(this);
        k0 k0Var = i0.f54966d;
        om.l storageManager = iVar3.f45537a;
        om.l lVar = iVar3.f45537a;
        ((qm.l) iVar3.f45552q).getClass();
        ml.l lVar2 = new ml.l(i15, i13, this);
        k0Var.getClass();
        kotlin.jvm.internal.n.f(storageManager, "storageManager");
        this.f46824o = new i0(this, storageManager, lVar2);
        this.f46825p = i10 == 3 ? new zc.u(this) : null;
        zk.j jVar = (zk.j) outerContext.f22983c;
        this.f46826q = jVar;
        g gVar2 = new g(this, i12);
        lVar.getClass();
        this.f46827r = new om.h(lVar, gVar2);
        this.f46828s = new om.i(lVar, new g(this, i14));
        new om.h(lVar, new g(this, i11));
        this.f46829t = new om.i(lVar, new g(this, i13));
        this.f46830u = new om.h(lVar, new g(this, 6));
        vl.f fVar = (vl.f) dVarA.f22982b;
        l3.i iVar4 = (l3.i) dVarA.f22984d;
        h hVar = jVar instanceof h ? (h) jVar : null;
        this.f46831v = new lm.s(classProto, fVar, iVar4, sourceElement, hVar != null ? hVar.f46831v : null);
        this.f46832w = !vl.e.f52632c.c(classProto.f51296d).booleanValue() ? al.i.f3645a : new u(lVar, new g(this, i15));
    }

    public final f M() {
        ((qm.l) ((lm.i) this.l.f22981a).f45552q).getClass();
        i0 i0Var = this.f46824o;
        fm.e.j(i0Var.f54968a);
        return (f) ((im.n) j1.f.w(i0Var.f54970c, i0.f54967e[0]));
    }

    @Override // zk.e
    public final n0 O() {
        return (n0) this.f46830u.invoke();
    }

    public final c0 P(yl.f fVar) {
        Iterator it = M().f(fVar, hl.b.f42411g).iterator();
        boolean z10 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z10) {
                    break;
                }
                break;
            }
            Object next = it.next();
            if (((h0) next).J() == null) {
                if (!z10) {
                    z10 = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        h0 h0Var = (h0) obj;
        return (c0) (h0Var != null ? h0Var.getType() : null);
    }

    @Override // zk.v
    public final boolean S() {
        return false;
    }

    @Override // cl.c, zk.e
    public final List T() {
        com.google.android.gms.internal.consent_sdk.d dVar = this.l;
        l3.i iVar = (l3.i) dVar.f22984d;
        tl.j jVar = this.f46815e;
        kotlin.jvm.internal.n.f(jVar, "<this>");
        List list = jVar.f51304m;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            List contextReceiverTypeIdList = jVar.f51305n;
            kotlin.jvm.internal.n.e(contextReceiverTypeIdList, "contextReceiverTypeIdList");
            List<Integer> list2 = contextReceiverTypeIdList;
            ArrayList arrayList = new ArrayList(xj.p.W(list2, 10));
            for (Integer it : list2) {
                kotlin.jvm.internal.n.e(it, "it");
                arrayList.add(iVar.a(it.intValue()));
            }
            list = arrayList;
        }
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new z(y0(), new jm.a(this, ((b0) dVar.f22988h).g((q0) it2.next()), (yl.f) null), al.i.f3645a));
        }
        return arrayList2;
    }

    @Override // zk.e
    public final boolean W() {
        return vl.e.f52635f.c(this.f46815e.f51296d) == tl.i.COMPANION_OBJECT;
    }

    @Override // zk.e
    public final boolean Y() {
        return vl.e.l.c(this.f46815e.f51296d).booleanValue();
    }

    @Override // zk.k
    public final j0 c() {
        return this.f46817g;
    }

    @Override // zk.j
    public final zk.j e() {
        return this.f46826q;
    }

    @Override // zk.e
    public final boolean e0() {
        return vl.e.f52640k.c(this.f46815e.f51296d).booleanValue() && this.f46816f.a(1, 4, 2);
    }

    @Override // zk.v
    public final boolean f0() {
        return vl.e.f52639j.c(this.f46815e.f51296d).booleanValue();
    }

    @Override // zk.e
    public final im.n g0() {
        return this.f46822m;
    }

    @Override // al.a
    public final al.j getAnnotations() {
        return this.f46832w;
    }

    @Override // zk.e, zk.m, zk.v
    public final il.o getVisibility() {
        return this.f46820j;
    }

    @Override // zk.e, zk.h
    public final List i() {
        return ((b0) this.l.f22988h).b();
    }

    @Override // zk.v
    public final boolean isExternal() {
        return vl.e.f52638i.c(this.f46815e.f51296d).booleanValue();
    }

    @Override // zk.e
    public final boolean isInline() {
        if (!vl.e.f52640k.c(this.f46815e.f51296d).booleanValue()) {
            return false;
        }
        vl.a aVar = this.f46816f;
        int i10 = aVar.f52623b;
        if (i10 >= 1) {
            if (i10 > 1) {
                return false;
            }
            int i11 = aVar.f52624c;
            if (i11 >= 4 && (i11 > 4 || aVar.f52625d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // zk.e, zk.v
    public final int j() {
        return this.f46819i;
    }

    @Override // zk.e
    public final int l0() {
        return this.f46821k;
    }

    @Override // zk.g
    public final pm.n0 n() {
        return this.f46823n;
    }

    @Override // cl.d0
    public final im.n o(qm.f fVar) {
        i0 i0Var = this.f46824o;
        fm.e.j(i0Var.f54968a);
        return (im.n) j1.f.w(i0Var.f54970c, i0.f54967e[0]);
    }

    @Override // zk.e
    public final Collection p() {
        return (Collection) this.f46828s.invoke();
    }

    @Override // zk.e
    public final Collection r() {
        return (Collection) this.f46829t.invoke();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(f0() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    @Override // zk.h
    public final boolean u() {
        return vl.e.f52636g.c(this.f46815e.f51296d).booleanValue();
    }

    @Override // zk.e
    public final boolean x0() {
        return vl.e.f52637h.c(this.f46815e.f51296d).booleanValue();
    }

    @Override // zk.e
    public final cl.l y() {
        return (cl.l) this.f46827r.invoke();
    }
}
