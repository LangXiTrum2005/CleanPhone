package ml;

import cc.a2;
import cl.x0;
import com.google.android.gms.internal.measurement.nf;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import pm.a1;
import zk.m0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 extends im.o {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ qk.w[] f46150m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf f46151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f46152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.c f46153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final om.i f46154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.e f46155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final om.j f46156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final om.e f46157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final om.i f46158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final om.i f46159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final om.i f46160k;
    public final om.e l;

    static {
        kotlin.jvm.internal.e0 e0Var = kotlin.jvm.internal.d0.f44761a;
        f46150m = new qk.w[]{e0Var.g(new kotlin.jvm.internal.v(e0Var.b(a0.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(a0.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), e0Var.g(new kotlin.jvm.internal.v(e0Var.b(a0.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};
    }

    public a0(nf c4, p pVar) {
        kotlin.jvm.internal.n.f(c4, "c");
        this.f46151b = c4;
        this.f46152c = pVar;
        om.o oVar = ((ll.a) c4.f23782b).f45485a;
        y yVar = new y(this, 0);
        om.l lVar = (om.l) oVar;
        lVar.getClass();
        this.f46153d = new om.c(lVar, yVar);
        y yVar2 = new y(this, 2);
        om.l lVar2 = (om.l) oVar;
        lVar2.getClass();
        this.f46154e = new om.i(lVar2, yVar2);
        this.f46155f = ((om.l) oVar).b(new z(this, 1));
        this.f46156g = ((om.l) oVar).c(new z(this, 0));
        this.f46157h = ((om.l) oVar).b(new z(this, 2));
        y yVar3 = new y(this, 3);
        om.l lVar3 = (om.l) oVar;
        lVar3.getClass();
        this.f46158i = new om.i(lVar3, yVar3);
        y yVar4 = new y(this, 4);
        om.l lVar4 = (om.l) oVar;
        lVar4.getClass();
        this.f46159j = new om.i(lVar4, yVar4);
        y yVar5 = new y(this, 1);
        om.l lVar5 = (om.l) oVar;
        lVar5.getClass();
        this.f46160k = new om.i(lVar5, yVar5);
        this.l = ((om.l) oVar).b(new z(this, 3));
    }

    public static pm.y l(fl.w method, nf nfVar) {
        kotlin.jvm.internal.n.f(method, "method");
        Class<?> declaringClass = ((Method) method.b()).getDeclaringClass();
        kotlin.jvm.internal.n.e(declaringClass, "member.declaringClass");
        return ((v9.e) nfVar.f23786f).L(method.f(), android.support.v4.media.session.a.I(2, declaringClass.isAnnotation(), null, 6));
    }

    public static bc.i u(nf nfVar, cl.y yVar, List list) {
        wj.f fVar;
        yl.f fVar2;
        yl.f fVarE;
        v9.e eVar = (v9.e) nfVar.f23786f;
        ll.a aVar = (ll.a) nfVar.f23782b;
        zk.w wVar = aVar.f45498o;
        xj.m mVarT0 = xj.n.T0(list);
        ArrayList arrayList = new ArrayList(xj.p.W(mVarT0, 10));
        Iterator it = mVarT0.iterator();
        boolean z10 = false;
        while (true) {
            xj.z zVar = (xj.z) it;
            if (!zVar.f53872b.hasNext()) {
                return new bc.i(11, xj.n.N0(arrayList), z10);
            }
            xj.y yVar2 = (xj.y) zVar.next();
            int i10 = yVar2.f53869a;
            fl.c0 c0Var = (fl.c0) yVar2.f53870b;
            ll.c cVarI = a2.I(nfVar, c0Var);
            nl.a aVarI = android.support.v4.media.session.a.I(2, false, null, 7);
            boolean z11 = c0Var.f40987d;
            fl.a0 a0Var = c0Var.f40984a;
            if (z11) {
                fl.h hVar = a0Var instanceof fl.h ? (fl.h) a0Var : null;
                if (hVar == null) {
                    throw new AssertionError("Vararg parameter should be an array: " + c0Var);
                }
                a1 a1VarK = eVar.K(hVar, aVarI, true);
                fVar = new wj.f(a1VarK, wVar.d().f(a1VarK));
            } else {
                fVar = new wj.f(eVar.L(a0Var, aVarI), null);
            }
            pm.y yVar3 = (pm.y) fVar.f53283a;
            pm.y yVar4 = (pm.y) fVar.f53284b;
            if (kotlin.jvm.internal.n.a(yVar.getName().b(), "equals") && list.size() == 1 && wVar.d().o().equals(yVar3)) {
                fVarE = yl.f.e("other");
            } else {
                String str = c0Var.f40986c;
                yl.f fVarD = str != null ? yl.f.d(str) : null;
                if (fVarD == null) {
                    z10 = true;
                }
                if (fVarD == null) {
                    fVarE = yl.f.e(TtmlNode.TAG_P + i10);
                } else {
                    fVar2 = fVarD;
                }
                arrayList.add(new x0(yVar, null, i10, cVarI, fVar2, yVar3, false, false, false, yVar4, aVar.f45494j.c(c0Var)));
            }
            fVar2 = fVarE;
            arrayList.add(new x0(yVar, null, i10, cVarI, fVar2, yVar3, false, false, false, yVar4, aVar.f45494j.c(c0Var)));
        }
    }

    @Override // im.o, im.n
    public Collection a(yl.f name, hl.b location) {
        kotlin.jvm.internal.n.f(name, "name");
        kotlin.jvm.internal.n.f(location, "location");
        return !b().contains(name) ? xj.v.f53866a : (Collection) this.f46157h.invoke(name);
    }

    @Override // im.o, im.n
    public final Set b() {
        return (Set) j1.f.w(this.f46158i, f46150m[0]);
    }

    @Override // im.o, im.p
    public Collection d(im.f kindFilter, jk.b bVar) {
        kotlin.jvm.internal.n.f(kindFilter, "kindFilter");
        return (Collection) this.f46153d.invoke();
    }

    @Override // im.o, im.n
    public final Set e() {
        return (Set) j1.f.w(this.f46160k, f46150m[2]);
    }

    @Override // im.o, im.n
    public Collection f(yl.f name, hl.b bVar) {
        kotlin.jvm.internal.n.f(name, "name");
        return !g().contains(name) ? xj.v.f53866a : (Collection) this.l.invoke(name);
    }

    @Override // im.o, im.n
    public final Set g() {
        return (Set) j1.f.w(this.f46159j, f46150m[1]);
    }

    public abstract Set h(im.f fVar, jk.b bVar);

    public abstract Set i(im.f fVar, im.k kVar);

    public void j(ArrayList arrayList, yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
    }

    public abstract c k();

    public abstract void m(LinkedHashSet linkedHashSet, yl.f fVar);

    public abstract void n(ArrayList arrayList, yl.f fVar);

    public abstract Set o(im.f fVar);

    public abstract cl.z p();

    public abstract zk.j q();

    public boolean r(kl.e eVar) {
        return true;
    }

    public abstract x s(fl.w wVar, ArrayList arrayList, pm.y yVar, List list);

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, wj.d] */
    public final kl.e t(fl.w method) {
        kotlin.jvm.internal.n.f(method, "method");
        nf nfVar = this.f46151b;
        int i10 = 1;
        kl.e eVarY0 = kl.e.Y0(q(), a2.I(nfVar, method), method.c(), ((ll.a) nfVar.f23782b).f45494j.c(method), ((c) this.f46154e.invoke()).e(method.c()) != null && ((ArrayList) method.g()).isEmpty());
        kotlin.jvm.internal.n.f(nfVar, "<this>");
        nf nfVar2 = new nf((ll.a) nfVar.f23782b, new i3.f(nfVar, eVarY0, method, 0), (wj.d) nfVar.f23784d);
        ArrayList typeParameters = method.getTypeParameters();
        ArrayList arrayList = new ArrayList(xj.p.W(typeParameters, 10));
        Iterator it = typeParameters.iterator();
        while (it.hasNext()) {
            m0 m0VarC = ((ll.e) nfVar2.f23783c).c((fl.b0) it.next());
            kotlin.jvm.internal.n.c(m0VarC);
            arrayList.add(m0VarC);
        }
        bc.i iVarU = u(nfVar2, eVarY0, method.g());
        x xVarS = s(method, arrayList, l(method, nfVar2), (List) iVarU.f5553c);
        List list = xVarS.f46249d;
        cl.z zVarP = p();
        ArrayList arrayList2 = xVarS.f46248c;
        List list2 = xVarS.f46247b;
        pm.y yVar = xVarS.f46246a;
        boolean zIsAbstract = Modifier.isAbstract(((Method) method.b()).getModifiers());
        boolean zIsFinal = Modifier.isFinal(((Method) method.b()).getModifiers());
        if (zIsAbstract) {
            i10 = 4;
        } else if (!zIsFinal) {
            i10 = 3;
        }
        eVarY0.X0(null, zVarP, xj.v.f53866a, arrayList2, list2, yVar, i10, r9.b.A(method.e()), xj.w.f53867a);
        eVarY0.Z0(false, iVarU.f5552b);
        if (list.isEmpty()) {
            return eVarY0;
        }
        ((ll.a) nfVar2.f23782b).f45489e.getClass();
        throw new UnsupportedOperationException("Should not be called");
    }

    public String toString() {
        return "Lazy scope for " + q();
    }
}
