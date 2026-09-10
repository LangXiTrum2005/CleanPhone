package tk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n0 extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f51025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o0 f51026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(o0 o0Var, int i10) {
        super(0);
        this.f51025e = i10;
        this.f51026f = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // jk.a
    public final Object invoke() throws zl.q {
        ?? C;
        switch (this.f51025e) {
            case 0:
                o1 o1Var = this.f51026f.f51031c;
                qk.w wVar = o0.f51030g[0];
                el.b bVar = (el.b) o1Var.invoke();
                if (bVar != null) {
                    eo.g gVar = bVar.f40113b;
                    String[] strArr = (String[]) gVar.f40199e;
                    String[] strArr2 = (String[]) gVar.f40201g;
                    if (strArr != null && strArr2 != null) {
                        wj.f fVarH = xl.h.h(strArr, strArr2);
                        return new wj.k((xl.g) fVarH.f53283a, (tl.c0) fVarH.f53284b, (xl.f) gVar.f40198d);
                    }
                }
                return null;
            default:
                o0 o0Var = this.f51026f;
                o1 o1Var2 = o0Var.f51031c;
                qk.w wVar2 = o0.f51030g[0];
                el.b bVar2 = (el.b) o1Var2.invoke();
                if (bVar2 == null) {
                    return im.m.f43190b;
                }
                o1 o1Var3 = o0Var.f50942a;
                qk.w wVar3 = a0.f50941b[0];
                Object objInvoke = o1Var3.invoke();
                kotlin.jvm.internal.n.e(objInvoke, "<get-moduleData>(...)");
                v9.e eVar = ((el.f) objInvoke).f40119b;
                rl.d dVar = (rl.d) eVar.f52503b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) eVar.f52505d;
                Class cls = bVar2.f40112a;
                yl.b bVarA = fl.c.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    yl.c cVarG = fl.c.a(cls).g();
                    kotlin.jvm.internal.n.e(cVarG, "fileClass.classId.packageFqName");
                    eo.g gVar2 = bVar2.f40113b;
                    sl.a aVar = (sl.a) gVar2.f40197c;
                    sl.a aVar2 = sl.a.MULTIFILE_CLASS;
                    if (aVar == aVar2) {
                        String[] strArr3 = (String[]) gVar2.f40199e;
                        if (aVar != aVar2) {
                            strArr3 = null;
                        }
                        List listA0 = strArr3 != null ? xj.k.a0(strArr3) : null;
                        if (listA0 == null) {
                            listA0 = xj.v.f53866a;
                        }
                        C = new ArrayList();
                        Iterator it = listA0.iterator();
                        while (it.hasNext()) {
                            yl.b bVarJ = yl.b.j(new yl.c(gm.b.d((String) it.next()).f41960a.replace('/', '.')));
                            el.c cVar = (el.c) eVar.f52504c;
                            kotlin.jvm.internal.n.f(dVar.c().f45539c, "<this>");
                            el.b bVarN = com.google.android.gms.internal.play_billing.q1.n(cVar, bVarJ, xl.f.f53902g);
                            if (bVarN != null) {
                                C.add(bVarN);
                            }
                        }
                    } else {
                        C = j1.f.C(bVar2);
                    }
                    cl.r rVar = new cl.r(dVar.c().f45538b, cVarG, 0);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) C).iterator();
                    while (it2.hasNext()) {
                        nm.p pVarA = dVar.a(rVar, (el.b) it2.next());
                        if (pVarA != null) {
                            arrayList.add(pVarA);
                        }
                    }
                    im.n nVarB = t9.e.b("package " + cVarG + " (" + bVar2 + ')', xj.n.N0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, nVarB);
                    obj = objPutIfAbsent == null ? nVarB : objPutIfAbsent;
                }
                kotlin.jvm.internal.n.e(obj, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
                return (im.n) obj;
        }
    }
}
