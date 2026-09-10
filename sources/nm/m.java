package nm;

import com.google.android.gms.internal.ads.k3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.v;
import qk.w;
import tl.g0;
import tl.s0;
import tl.y;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ w[] f46838j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f46839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f46840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f46841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final om.e f46842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final om.e f46843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final om.j f46844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final om.i f46845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final om.i f46846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f46847i;

    static {
        e0 e0Var = d0.f44761a;
        f46838j = new w[]{e0Var.g(new v(e0Var.b(m.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), e0Var.g(new v(e0Var.b(m.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public m(o oVar, List functionList, List propertyList, List typeAliasList) {
        kotlin.jvm.internal.n.f(functionList, "functionList");
        kotlin.jvm.internal.n.f(propertyList, "propertyList");
        kotlin.jvm.internal.n.f(typeAliasList, "typeAliasList");
        this.f46847i = oVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : functionList) {
            yl.f fVarS = com.bumptech.glide.c.s((vl.f) oVar.f46851b.f22982b, ((y) ((zl.a) obj)).f51554f);
            Object arrayList = linkedHashMap.get(fVarS);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fVarS, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f46839a = a(linkedHashMap);
        o oVar2 = this.f46847i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : propertyList) {
            yl.f fVarS2 = com.bumptech.glide.c.s((vl.f) oVar2.f46851b.f22982b, ((g0) ((zl.a) obj2)).f51242f);
            Object arrayList2 = linkedHashMap2.get(fVarS2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(fVarS2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f46840b = a(linkedHashMap2);
        ((lm.i) this.f46847i.f46851b.f22981a).f45539c.getClass();
        o oVar3 = this.f46847i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : typeAliasList) {
            yl.f fVarS3 = com.bumptech.glide.c.s((vl.f) oVar3.f46851b.f22982b, ((s0) ((zl.a) obj3)).f51454e);
            Object arrayList3 = linkedHashMap3.get(fVarS3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(fVarS3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f46841c = a(linkedHashMap3);
        this.f46842d = ((lm.i) this.f46847i.f46851b.f22981a).f45537a.b(new l(this, 0));
        this.f46843e = ((lm.i) this.f46847i.f46851b.f22981a).f45537a.b(new l(this, 1));
        this.f46844f = ((lm.i) this.f46847i.f46851b.f22981a).f45537a.c(new l(this, 2));
        o oVar4 = this.f46847i;
        om.l lVar = ((lm.i) oVar4.f46851b.f22981a).f45537a;
        k kVar = new k(this, oVar4, 0);
        lVar.getClass();
        this.f46845g = new om.i(lVar, kVar);
        o oVar5 = this.f46847i;
        om.l lVar2 = ((lm.i) oVar5.f46851b.f22981a).f45537a;
        k kVar2 = new k(this, oVar5, 1);
        lVar2.getClass();
        this.f46846h = new om.i(lVar2, kVar2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(b0.O(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<zl.a> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(xj.p.W(iterable, 10));
            for (zl.a aVar : iterable) {
                int iD = aVar.d();
                int iG = k3.g(iD) + iD;
                if (iG > 4096) {
                    iG = 4096;
                }
                k3 k3VarL = k3.l(byteArrayOutputStream, iG);
                k3VarL.z(iD);
                aVar.i(k3VarL);
                k3VarL.j();
                arrayList.add(wj.r.f53297a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
