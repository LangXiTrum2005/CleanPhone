package a4;

import androidx.fragment.app.FragmentActivity;
import cc.a2;
import cl.q0;
import cl.t0;
import cl.v;
import cn.h0;
import com.google.android.gms.internal.ads.hx0;
import com.google.android.gms.internal.measurement.nf;
import en.k;
import fl.t;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ml.j;
import ml.p;
import ml.s;
import ml.u;
import ml.w;
import nm.h;
import pm.y;
import qj.x;
import qk.i0;
import ql.d;
import wj.r;
import y7.q;
import yl.c;
import yl.f;
import z.i;
import z.l;
import zk.e;
import zk.g;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends o implements jk.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f3385g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        super(1);
        this.f3383e = i10;
        this.f3384f = obj;
        this.f3385g = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x0249  */
    @Override // jk.b
    public final Object invoke(Object extractNullability) {
        x xVarB;
        a.a tVar;
        el.b bVarM;
        d dVar;
        g gVarE;
        r rVar;
        int i10 = this.f3383e;
        int i11 = 2;
        boolean z10 = true;
        r rVar2 = r.f53297a;
        Object obj = this.f3385g;
        Object obj2 = this.f3384f;
        switch (i10) {
            case 0:
                Throwable th2 = (Throwable) extractNullability;
                i iVar = (i) obj2;
                if (th2 == null) {
                    iVar.a(((h0) obj).B());
                } else if (th2 instanceof CancellationException) {
                    iVar.f54593d = true;
                    l lVar = iVar.f54591b;
                    if (lVar != null && lVar.f54596b.cancel(true)) {
                        iVar.f54590a = null;
                        iVar.f54591b = null;
                        iVar.f54592c = null;
                    }
                } else {
                    iVar.b(th2);
                }
                return rVar2;
            case 1:
                f accessorName = (f) extractNullability;
                p pVar = (p) obj;
                n.f(accessorName, "accessorName");
                q0 q0Var = (q0) obj2;
                return n.a(q0Var.getName(), accessorName) ? j1.f.C(q0Var) : xj.n.B0(p.w(pVar, accessorName), p.v(pVar, accessorName));
            case 2:
                f name = (f) extractNullability;
                nf nfVar = (nf) obj;
                n.f(name, "name");
                p pVar2 = (p) obj2;
                om.i iVar2 = pVar2.f46225r;
                e eVar = pVar2.f46221n;
                if (((Set) iVar2.invoke()).contains(name)) {
                    n5.f fVar = ((ll.a) nfVar.f23782b).f45486b;
                    yl.b bVarF = fm.e.f(eVar);
                    n.c(bVarF);
                    yl.b bVarD = bVarF.d(name);
                    fVar.getClass();
                    c cVarG = bVarD.g();
                    n.e(cVarG, "classId.packageFqName");
                    String strM0 = an.p.m0(bVarD.h().b(), '.', '$');
                    if (!cVarG.d()) {
                        strM0 = cVarG.b() + '.' + strM0;
                    }
                    Class clsG = no.b.G((ClassLoader) fVar.f46523b, strM0);
                    fl.n nVar = clsG != null ? new fl.n(clsG) : null;
                    if (nVar == null) {
                        return null;
                    }
                    j jVar = new j(nfVar, eVar, nVar, null);
                    ((ll.a) nfVar.f23782b).f45502s.getClass();
                    return jVar;
                }
                if (!((Set) pVar2.f46226s.invoke()).contains(name)) {
                    t tVar2 = (t) ((Map) pVar2.f46227t.invoke()).get(name);
                    if (tVar2 == null) {
                        return null;
                    }
                    ll.a aVar = (ll.a) nfVar.f23782b;
                    om.o oVar = aVar.f45485a;
                    ml.o oVar2 = new ml.o(pVar2, i11);
                    om.l lVar2 = (om.l) oVar;
                    lVar2.getClass();
                    return v.M(aVar.f45485a, pVar2.f46221n, name, new om.i(lVar2, oVar2), a2.I(nfVar, tVar2), aVar.f45494j.c(tVar2));
                }
                yj.c cVarM = j1.f.m();
                ((gm.a) ((ll.a) nfVar.f23782b).f45507x).c(nfVar, eVar, name, cVarM);
                yj.c cVarD = j1.f.d(cVarM);
                int iH = cVarD.h();
                if (iH == 0) {
                    return null;
                }
                if (iH == 1) {
                    return (e) xj.n.F0(cVarD);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + cVarD).toString());
            case 3:
                s request = (s) extractNullability;
                nf nfVar2 = (nf) obj;
                ll.a aVar2 = (ll.a) nfVar2.f23782b;
                n.f(request, "request");
                w wVar = (w) obj2;
                nf nfVar3 = wVar.f46151b;
                ml.r rVar3 = wVar.f46243o;
                yl.b bVar = new yl.b(rVar3.f6518e, request.f46237a);
                fl.n nVar2 = request.f46238b;
                if (nVar2 != null) {
                    el.c cVar = aVar2.f45487c;
                    n.f(((ll.a) nfVar3.f23782b).f45488d.c().f45539c, "<this>");
                    xl.f jvmMetadataVersion = xl.f.f53902g;
                    cVar.getClass();
                    n.f(jvmMetadataVersion, "jvmMetadataVersion");
                    Class clsG2 = no.b.G(cVar.f40114a, nVar2.c().b());
                    xVarB = (clsG2 == null || (bVarM = i0.m(clsG2)) == null) ? null : new x(bVarM, i11);
                } else {
                    el.c cVar2 = aVar2.f45487c;
                    n.f(((ll.a) nfVar3.f23782b).f45488d.c().f45539c, "<this>");
                    xVarB = cVar2.b(bVar, xl.f.f53902g);
                }
                el.b bVar2 = xVarB != null ? (el.b) xVarB.f49096b : null;
                yl.b bVarA = bVar2 != null ? fl.c.a(bVar2.f40112a) : null;
                if (bVarA != null && (!bVarA.f54502b.e().d() || bVarA.f54503c)) {
                    return null;
                }
                if (bVar2 == null) {
                    tVar = u.f46240c;
                } else if (((sl.a) bVar2.f40113b.f40197c) == sl.a.CLASS) {
                    rl.d dVar2 = ((ll.a) nfVar3.f23782b).f45488d;
                    dVar2.getClass();
                    lm.d dVarF = dVar2.f(bVar2);
                    e eVarA = dVarF == null ? null : dVar2.c().f45555t.a(fl.c.a(bVar2.f40112a), dVarF);
                    if (eVarA != null) {
                        tVar = new ml.t(eVarA);
                    } else {
                        tVar = u.f46240c;
                    }
                } else {
                    tVar = ml.v.f46241c;
                }
                if (tVar instanceof ml.t) {
                    return ((ml.t) tVar).f46239c;
                }
                if (tVar instanceof ml.v) {
                    return null;
                }
                if (!(tVar instanceof u)) {
                    throw new aa.b((byte) 0, 20);
                }
                if (nVar2 == null) {
                    n5.f fVar2 = aVar2.f45486b;
                    fVar2.getClass();
                    c cVarG2 = bVar.g();
                    n.e(cVarG2, "classId.packageFqName");
                    String strM1 = an.p.m0(bVar.h().b(), '.', '$');
                    if (!cVarG2.d()) {
                        strM1 = cVarG2.b() + '.' + strM1;
                    }
                    Class clsG3 = no.b.G((ClassLoader) fVar2.f46523b, strM1);
                    nVar2 = clsG3 != null ? new fl.n(clsG3) : null;
                }
                c cVarC = nVar2 != null ? nVar2.c() : null;
                if (cVarC == null || cVarC.d() || !cVarC.e().equals(rVar3.f6518e)) {
                    return null;
                }
                j jVar2 = new j(nfVar2, rVar3, nVar2, null);
                aVar2.f45502s.getClass();
                return jVar2;
            case 4:
                f name2 = (f) extractNullability;
                n.f(name2, "name");
                zc.u uVar = (zc.u) obj2;
                tl.t tVar3 = (tl.t) ((LinkedHashMap) uVar.f54879b).get(name2);
                if (tVar3 == null) {
                    return null;
                }
                h hVar = (h) obj;
                com.google.android.gms.internal.consent_sdk.d dVar3 = hVar.l;
                return v.M(((lm.i) dVar3.f22981a).f45537a, hVar, name2, (om.i) uVar.f54881d, new nm.a(((lm.i) dVar3.f22981a).f45537a, new t0(7, hVar, tVar3)), j0.C9);
            case 5:
                int iIntValue = ((Number) extractNullability).intValue();
                ql.o oVar3 = (ql.o) obj2;
                if (oVar3 != null && (dVar = (d) oVar3.f49167a.get(Integer.valueOf(iIntValue))) != null) {
                    return dVar;
                }
                d[] dVarArr = (d[]) obj;
                return (iIntValue < 0 || iIntValue > dVarArr.length - 1) ? d.f49134e : dVarArr[iIntValue];
            case 6:
                n.f(extractNullability, "$this$extractNullability");
                hx0 hx0Var = (hx0) obj2;
                nf nfVar4 = (nf) hx0Var.f15421e;
                sm.c cVar3 = ((ql.a) obj).f49130a;
                al.c cVar4 = (al.c) extractNullability;
                if (cVar4 instanceof ml.f) {
                    ((ll.a) nfVar4.f23782b).f45503t.getClass();
                    if (!((ml.f) cVar4).f46185g && ((il.a) hx0Var.f15422f) != il.a.TYPE_PARAMETER_BOUNDS) {
                        if (cVar3 != null) {
                            f fVar3 = wk.h.f53310e;
                            gVarE = ((y) cVar3).P().e();
                            if (gVarE != null || wk.h.r(gVarE) == null) {
                                z10 = false;
                            } else {
                                ((ll.a) nfVar4.f23782b).f45500q.getClass();
                                Object objC = il.c.c(cVar4, wk.l.f53356t);
                                if (objC == null) {
                                    z10 = false;
                                } else {
                                    ArrayList<String> arrayListA = il.c.a(objC, false);
                                    if (arrayListA.isEmpty()) {
                                        z10 = false;
                                    } else {
                                        for (String str : arrayListA) {
                                            HashMap map = al.r.f3663b;
                                            if (n.a(str, "TYPE")) {
                                                ((ll.a) nfVar4.f23782b).f45503t.getClass();
                                            }
                                        }
                                        z10 = false;
                                    }
                                }
                            }
                        } else {
                            z10 = false;
                        }
                    }
                } else if (cVar3 != null) {
                    f fVar4 = wk.h.f53310e;
                    gVarE = ((y) cVar3).P().e();
                    if (gVarE != null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 7:
                if (n.a((String) extractNullability, ((File) obj2).getName())) {
                    t9.e.B((en.r) obj, rVar2);
                }
                return rVar2;
            case 8:
                Throwable th3 = (Throwable) extractNullability;
                ((al.f) obj2).invoke(th3);
                en.e eVar2 = (en.e) ((zc.u) obj).f54881d;
                eVar2.j(th3, false);
                do {
                    Object objL = eVar2.l();
                    if (objL instanceof k) {
                        objL = null;
                    }
                    if (objL != null) {
                        cn.r rVar4 = ((s0.q0) objL).f49885b;
                        Throwable cancellationException = th3 == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th3;
                        rVar4.getClass();
                        rVar4.O(new cn.u(cancellationException, false));
                        rVar = rVar2;
                    } else {
                        rVar = null;
                    }
                } while (rVar != null);
                return rVar2;
            default:
                h.a result = (h.a) extractNullability;
                n.f(result, "result");
                int i12 = result.f42048a;
                if (i12 == -1) {
                    y7.p pVarD = ((q) obj2).D();
                    l7.s sVar = l7.s.f45212a;
                    q7.f.o();
                    pVarD.i(l7.s.f45221j, i12, result.f42049b);
                } else {
                    ((FragmentActivity) obj).finish();
                }
                return rVar2;
        }
    }
}
