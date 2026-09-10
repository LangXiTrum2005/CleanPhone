package cl;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.internal.measurement.nf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import pm.a1;
import tk.j1;
import tk.k1;
import tk.t1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f6596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f6598g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(int i10, Object obj, Object obj2) {
        super(0);
        this.f6596e = i10;
        this.f6597f = obj;
        this.f6598g = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [jk.a, kotlin.jvm.internal.o] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, wj.d] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, wj.d] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, wj.d] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.lang.Object, wj.d] */
    @Override // jk.a
    public final Object invoke() throws IOException {
        qk.a0 a0Var;
        switch (this.f6596e) {
            case 0:
                u0 u0Var = (u0) this.f6597f;
                om.o oVar = u0Var.D;
                nm.s sVar = u0Var.E;
                l lVar = (l) this.f6598g;
                al.j annotations = lVar.getAnnotations();
                l lVar2 = (l) this.f6598g;
                int kind = lVar2.getKind();
                d5.u.u(kind, "underlyingConstructorDescriptor.kind");
                nm.s sVar2 = u0Var.E;
                zk.j0 j0VarC = sVar2.c();
                kotlin.jvm.internal.n.e(j0VarC, "typeAliasDescriptor.source");
                u0 u0Var2 = new u0(oVar, sVar, lVar, u0Var, annotations, kind, j0VarC);
                u0.G.getClass();
                pm.w0 w0VarD = sVar2.J0() == null ? null : pm.w0.d(sVar2.K0());
                if (w0VarD == null) {
                    return null;
                }
                z zVar = lVar2.f6642j;
                z zVarB = zVar != null ? zVar.b(w0VarD) : null;
                List listP0 = lVar2.p0();
                kotlin.jvm.internal.n.e(listP0, "underlyingConstructorDes…contextReceiverParameters");
                List list = listP0;
                ArrayList arrayList = new ArrayList(xj.p.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((z) it.next()).b(w0VarD));
                }
                List listI = sVar2.i();
                List listB = u0Var.B();
                pm.y yVar = u0Var.f6639g;
                kotlin.jvm.internal.n.c(yVar);
                u0Var2.O0(null, zVarB, arrayList, listI, listB, yVar, 1, sVar2.f46858e);
                return u0Var2;
            case 1:
                pm.c0 c0VarG = ((ll.a) ((nf) this.f6597f).f23782b).f45498o.d().i(((jl.b) this.f6598g).f43965a).g();
                kotlin.jvm.internal.n.e(c0VarG, "c.module.builtIns.getBui…qName(fqName).defaultType");
                return c0VarG;
            case 2:
                nf nfVar = (nf) this.f6597f;
                al.j additionalAnnotations = ((zk.f) this.f6598g).getAnnotations();
                kotlin.jvm.internal.n.f(nfVar, "<this>");
                kotlin.jvm.internal.n.f(additionalAnnotations, "additionalAnnotations");
                return ((ll.a) nfVar.f23782b).f45500q.b((il.v) nfVar.f23785e.getValue(), additionalAnnotations);
            case 3:
                nf nfVar2 = (nf) this.f6597f;
                al.j additionalAnnotations2 = (al.j) this.f6598g;
                kotlin.jvm.internal.n.f(nfVar2, "<this>");
                kotlin.jvm.internal.n.f(additionalAnnotations2, "additionalAnnotations");
                return ((ll.a) nfVar2.f23782b).f45500q.b((il.v) nfVar2.f23785e.getValue(), additionalAnnotations2);
            case 4:
                return new ml.r(((ll.d) this.f6597f).f45514a, (fl.x) this.f6598g);
            case 5:
                com.google.android.gms.internal.consent_sdk.d dVar = ((lm.b0) this.f6597f).f45519a;
                return ((lm.i) dVar.f22981a).f45541e.Q((tl.q0) this.f6598g, (vl.f) dVar.f22982b);
            case 6:
                n5.f fVar = ((ll.a) ((nf) this.f6597f).f23782b).f45486b;
                yl.c packageFqName = ((ml.w) this.f6598g).f46243o.f6518e;
                fVar.getClass();
                kotlin.jvm.internal.n.f(packageFqName, "packageFqName");
                return null;
            case 7:
                nm.h hVar = (nm.h) this.f6597f;
                return xj.n.N0(((lm.i) hVar.l.f22981a).f45541e.B(hVar.f46831v, (tl.t) this.f6598g));
            case 8:
                qm.f fVar2 = (qm.f) this.f6597f;
                sm.c type = (sm.c) ((pm.a0) this.f6598g).f48411c.invoke();
                fVar2.getClass();
                kotlin.jvm.internal.n.f(type, "type");
                return (pm.y) type;
            case 9:
                Iterable iterable = (List) ((qm.i) this.f6597f).f49187e.getValue();
                if (iterable == null) {
                    iterable = xj.v.f53866a;
                }
                Iterable iterable2 = iterable;
                qm.f fVar3 = (qm.f) this.f6598g;
                ArrayList arrayList2 = new ArrayList(xj.p.W(iterable2, 10));
                Iterator it2 = iterable2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((a1) it2.next()).j0(fVar3));
                }
                return arrayList2;
            case 10:
                tk.e0 e0Var = (tk.e0) this.f6597f;
                tk.c0 c0Var = e0Var.f50963f;
                String str = (String) this.f6598g;
                String signature = e0Var.f50964g;
                c0Var.getClass();
                kotlin.jvm.internal.n.f(signature, "signature");
                Collection collectionN0 = str.equals("<init>") ? xj.n.N0(c0Var.f()) : c0Var.h(yl.f.e(str));
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : collectionN0) {
                    if (kotlin.jvm.internal.n.a(t1.c((zk.s) obj).c(), signature)) {
                        arrayList3.add(obj);
                    }
                }
                if (arrayList3.size() == 1) {
                    return (zk.s) xj.n.F0(arrayList3);
                }
                String strU0 = xj.n.u0(collectionN0, "\n", null, null, tk.b.f50949j, 30);
                StringBuilder sbV = defpackage.e.v("Function '", str, "' (JVM signature: ", signature, ") not resolved in ");
                sbV.append(c0Var);
                sbV.append(':');
                sbV.append(strU0.length() == 0 ? " no members found" : "\n".concat(strU0));
                throw new cn.c0(sbV.toString(), 3);
            case 11:
                k1 k1Var = (k1) this.f6597f;
                List listT = k1Var.f51002a.t();
                if (listT.isEmpty()) {
                    return xj.v.f53866a;
                }
                wj.d dVarT = r9.b.t(wj.e.f53280a, new j1(k1Var, 0));
                List list2 = listT;
                jk.a aVar = (jk.a) this.f6598g;
                ArrayList arrayList4 = new ArrayList(xj.p.W(list2, 10));
                int i10 = 0;
                for (Object obj2 : list2) {
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        xj.o.V();
                        throw null;
                    }
                    pm.q0 q0Var = (pm.q0) obj2;
                    if (q0Var.c()) {
                        a0Var = qk.a0.f49102c;
                    } else {
                        pm.y yVarB = q0Var.b();
                        kotlin.jvm.internal.n.e(yVarB, "typeProjection.type");
                        k1 k1Var2 = new k1(yVarB, aVar != null ? new lm.n(k1Var, i10, dVarT) : null);
                        int iC = v0.i.c(q0Var.a());
                        if (iC == 0) {
                            a0Var = new qk.a0(qk.b0.f49105a, k1Var2);
                        } else if (iC == 1) {
                            a0Var = new qk.a0(qk.b0.f49106b, k1Var2);
                        } else {
                            if (iC != 2) {
                                throw new aa.b((byte) 0, 20);
                            }
                            a0Var = new qk.a0(qk.b0.f49107c, k1Var2);
                        }
                    }
                    arrayList4.add(a0Var);
                    i10 = i11;
                }
                return arrayList4;
            case 12:
                SharedPreferences sharedPreferences = ((Context) this.f6597f).getSharedPreferences((String) this.f6598g, 0);
                kotlin.jvm.internal.n.e(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
                return sharedPreferences;
            case 13:
                Class cls = (Class) this.f6597f;
                Map map = (Map) this.f6598g;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('@');
                sb2.append(cls.getCanonicalName());
                xj.n.t0(map.entrySet(), sb2, ", ", "(", ")", uk.d.f52230e, 48);
                String string = sb2.toString();
                kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            case 14:
                Context applicationContext = (Context) this.f6597f;
                kotlin.jvm.internal.n.e(applicationContext, "applicationContext");
                String name = ((v0.b) this.f6598g).f52279a;
                kotlin.jvm.internal.n.f(name, "name");
                return x7.a.l(applicationContext, name.concat(".preferences_pb"));
            case 15:
                ((y4.a) ((x4.b) this.f6597f).f53613b).a((com.applovin.impl.sdk.ad.d) this.f6598g);
                return wj.r.f53297a;
            case 16:
                yk.g gVar = (yk.g) this.f6597f;
                jk.b bVar = gVar.f54469b;
                f0 f0Var = gVar.f54468a;
                zk.j jVar = (zk.j) bVar.invoke(f0Var);
                yl.f fVar4 = yk.g.f54466g;
                List listC = j1.f.C(f0Var.f6499d.e());
                om.l lVar3 = (om.l) this.f6598g;
                n nVar = new n(jVar, fVar4, 4, 2, listC, lVar3);
                nVar.M(new yk.a(lVar3, nVar), xj.x.f53868a, null);
                return nVar;
            case 17:
                yk.i iVar = (yk.i) this.f6597f;
                f0 builtInsModule = iVar.k();
                kotlin.jvm.internal.n.e(builtInsModule, "builtInsModule");
                return new yk.l(builtInsModule, (om.l) this.f6598g, new uk.c(iVar, 3));
            case 18:
                yk.l lVar4 = (yk.l) this.f6597f;
                f0 f0Var2 = lVar4.g().f54471a;
                yk.g.f54463d.getClass();
                return zk.u.f(f0Var2, yk.g.f54467h, new zc.u((om.l) this.f6598g, lVar4.g().f54471a)).g();
            default:
                ml.j jVar2 = (ml.j) this.f6597f;
                zk.e eVar = (zk.e) this.f6598g;
                nf nfVar3 = jVar2.f46195j;
                ll.a aVar2 = (ll.a) nfVar3.f23782b;
                nf nfVar4 = new nf(new ll.a(aVar2.f45485a, aVar2.f45486b, aVar2.f45487c, aVar2.f45488d, aVar2.f45489e, aVar2.f45490f, aVar2.f45492h, aVar2.f45493i, aVar2.f45494j, aVar2.f45495k, aVar2.l, aVar2.f45496m, aVar2.f45497n, aVar2.f45498o, aVar2.f45499p, aVar2.f45500q, aVar2.f45501r, aVar2.f45502s, aVar2.f45503t, aVar2.f45504u, aVar2.f45505v, aVar2.f45506w), (ll.e) nfVar3.f23783c, (wj.d) nfVar3.f23784d);
                zk.j containingDeclaration = jVar2.e();
                kotlin.jvm.internal.n.e(containingDeclaration, "containingDeclaration");
                return new ml.j(nfVar4, containingDeclaration, jVar2.f46193h, eVar);
        }
    }
}
