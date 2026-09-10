package ml;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fl.n f46144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.o f46145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al.f f46146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f46147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashMap f46148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f46149f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [jk.b, kotlin.jvm.internal.o] */
    /* JADX WARN: Type inference failed for: r5v6, types: [jk.b, kotlin.jvm.internal.o] */
    public a(fl.n jClass, jk.b bVar) {
        kotlin.jvm.internal.n.f(jClass, "jClass");
        this.f46144a = jClass;
        this.f46145b = (kotlin.jvm.internal.o) bVar;
        al.f fVar = new al.f(this, 16);
        this.f46146c = fVar;
        zm.f fVarP = zm.l.P(xj.n.g0(jClass.d()), fVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        zm.e eVar = new zm.e(fVarP);
        while (eVar.hasNext()) {
            Object next = eVar.next();
            yl.f fVarC = ((fl.w) next).c();
            Object arrayList = linkedHashMap.get(fVarC);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fVarC, arrayList);
            }
            ((List) arrayList).add(next);
        }
        this.f46147d = linkedHashMap;
        zm.f fVarP2 = zm.l.P(xj.n.g0(this.f46144a.b()), this.f46145b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        zm.e eVar2 = new zm.e(fVarP2);
        while (eVar2.hasNext()) {
            Object next2 = eVar2.next();
            linkedHashMap2.put(((fl.t) next2).c(), next2);
        }
        this.f46148e = linkedHashMap2;
        ArrayList arrayListE = this.f46144a.e();
        ?? r10 = this.f46145b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayListE) {
            if (((Boolean) r10.invoke(obj)).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        int iO = xj.b0.O(xj.p.W(arrayList2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iO < 16 ? 16 : iO);
        for (Object obj2 : arrayList2) {
            linkedHashMap3.put(((fl.z) obj2).c(), obj2);
        }
        this.f46149f = linkedHashMap3;
    }

    @Override // ml.c
    public final Set a() {
        zm.f fVarP = zm.l.P(xj.n.g0(this.f46144a.d()), this.f46146c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zm.e eVar = new zm.e(fVarP);
        while (eVar.hasNext()) {
            linkedHashSet.add(((fl.w) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // ml.c
    public final Set b() {
        return this.f46149f.keySet();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [jk.b, kotlin.jvm.internal.o] */
    @Override // ml.c
    public final Set c() {
        zm.f fVarP = zm.l.P(xj.n.g0(this.f46144a.b()), this.f46145b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        zm.e eVar = new zm.e(fVarP);
        while (eVar.hasNext()) {
            linkedHashSet.add(((fl.t) eVar.next()).c());
        }
        return linkedHashSet;
    }

    @Override // ml.c
    public final Collection d(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        List list = (List) this.f46147d.get(name);
        return list != null ? list : xj.v.f53866a;
    }

    @Override // ml.c
    public final fl.z e(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        return (fl.z) this.f46149f.get(name);
    }

    @Override // ml.c
    public final fl.t f(yl.f name) {
        kotlin.jvm.internal.n.f(name, "name");
        return (fl.t) this.f46148e.get(name);
    }
}
