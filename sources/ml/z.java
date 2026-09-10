package ml;

import cc.a2;
import cl.q0;
import com.google.android.gms.internal.measurement.nf;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import pm.y0;
import zk.h0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f46252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f46253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, int i10) {
        super(1);
        this.f46252e = i10;
        this.f46253f = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:92:0x027d  */
    @Override // jk.b
    public final Object invoke(Object obj) {
        pl.d hVar;
        pl.d yVar;
        int i10 = this.f46252e;
        int i11 = 2;
        a0 a0Var = this.f46253f;
        switch (i10) {
            case 0:
                yl.f name = (yl.f) obj;
                kotlin.jvm.internal.n.f(name, "name");
                a0 a0Var2 = a0Var.f46152c;
                if (a0Var2 != null) {
                    return (h0) a0Var2.f46156g.invoke(name);
                }
                fl.t tVarF = ((c) a0Var.f46154e.invoke()).f(name);
                if (tVarF != null) {
                    Field field = tVarF.f41007a;
                    if (!field.isEnumConstant()) {
                        boolean z10 = !Modifier.isFinal(((Field) tVarF.b()).getModifiers());
                        nf nfVar = a0Var.f46151b;
                        ll.c cVarI = a2.I(nfVar, tVarF);
                        zk.j jVarQ = a0Var.q();
                        il.o oVarA = r9.b.A(tVarF.e());
                        yl.f fVarC = tVarF.c();
                        ll.a aVar = (ll.a) nfVar.f23782b;
                        kl.f fVarR0 = kl.f.R0(jVarQ, cVarI, oVarA, z10, fVarC, aVar.f45494j.c(tVarF), Modifier.isFinal(((Field) tVarF.b()).getModifiers()) && Modifier.isStatic(((Field) tVarF.b()).getModifiers()));
                        fVarR0.N0(null, null, null, null);
                        v9.e eVar = (v9.e) nfVar.f23786f;
                        Type genericType = field.getGenericType();
                        kotlin.jvm.internal.n.e(genericType, "member.genericType");
                        boolean z11 = genericType instanceof Class;
                        if (z11) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                yVar = new fl.y(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z11 && ((Class) genericType).isArray())) {
                                    hVar = new fl.h(genericType);
                                } else {
                                    hVar = genericType instanceof WildcardType ? new fl.d0((WildcardType) genericType) : new fl.p(genericType);
                                }
                                yVar = hVar;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                hVar = new fl.h(genericType);
                            } else {
                                hVar = new fl.h(genericType);
                            }
                            yVar = hVar;
                        }
                        pm.y yVarL = eVar.L(yVar, android.support.v4.media.session.a.I(2, false, null, 7));
                        if ((wk.h.F(yVarL) || wk.h.G(yVarL)) && Modifier.isFinal(((Field) tVarF.b()).getModifiers())) {
                            Modifier.isStatic(((Field) tVarF.b()).getModifiers());
                        }
                        cl.z zVarP = a0Var.p();
                        xj.v vVar = xj.v.f53866a;
                        fVarR0.Q0(yVarL, vVar, zVarP, null, vVar);
                        pm.y type = fVarR0.getType();
                        if (type == null) {
                            bm.e.a(67);
                            throw null;
                        }
                        int i12 = bm.e.f5728a;
                        if (!fVarR0.f6560f && !pm.c.j(type)) {
                            if (y0.b(type)) {
                                fVarR0.O0(null, new androidx.fragment.app.o(a0Var, tVarF, fVarR0, i11));
                            } else {
                                wk.h hVarE = fm.e.e(fVarR0);
                                if (wk.h.F(type)) {
                                    fVarR0.O0(null, new androidx.fragment.app.o(a0Var, tVarF, fVarR0, i11));
                                } else {
                                    qm.l lVar = qm.d.f49173a;
                                    if (lVar.a(hVarE.u(), type) || lVar.a(hVarE.j("Number").g(), type) || lVar.a(hVarE.e(), type) || wk.q.a(type)) {
                                        fVarR0.O0(null, new androidx.fragment.app.o(a0Var, tVarF, fVarR0, i11));
                                    }
                                }
                            }
                        }
                        aVar.f45491g.getClass();
                        return fVarR0;
                    }
                }
                return null;
            case 1:
                yl.f name2 = (yl.f) obj;
                kotlin.jvm.internal.n.f(name2, "name");
                a0 a0Var3 = a0Var.f46152c;
                if (a0Var3 != null) {
                    return (Collection) a0Var3.f46155f.invoke(name2);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((c) a0Var.f46154e.invoke()).d(name2).iterator();
                while (it.hasNext()) {
                    kl.e eVarT = a0Var.t((fl.w) it.next());
                    if (a0Var.r(eVarT)) {
                        ((ll.a) a0Var.f46151b.f23782b).f45491g.getClass();
                        arrayList.add(eVarT);
                    }
                }
                a0Var.j(arrayList, name2);
                return arrayList;
            case 2:
                yl.f name3 = (yl.f) obj;
                kotlin.jvm.internal.n.f(name3, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) a0Var.f46155f.invoke(name3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String strU = go.k.u((q0) obj2, 2);
                    Object arrayList2 = linkedHashMap.get(strU);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strU, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionO = bm.m.o(list2, k.f46208g);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionO);
                    }
                }
                a0Var.m(linkedHashSet, name3);
                nf nfVar2 = a0Var.f46151b;
                return xj.n.N0(((ll.a) nfVar2.f23782b).f45501r.e(nfVar2, linkedHashSet));
            default:
                yl.f name4 = (yl.f) obj;
                kotlin.jvm.internal.n.f(name4, "name");
                ArrayList arrayList3 = new ArrayList();
                ym.l.a(arrayList3, a0Var.f46156g.invoke(name4));
                a0Var.n(arrayList3, name4);
                if (bm.e.n(a0Var.q(), 5)) {
                    return xj.n.N0(arrayList3);
                }
                nf nfVar3 = a0Var.f46151b;
                return xj.n.N0(((ll.a) nfVar3.f23782b).f45501r.e(nfVar3, arrayList3));
        }
    }
}
