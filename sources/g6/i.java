package g6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f41597a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f41598b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.e f41599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f41600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f41601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f41602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Class f41603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i9.i f41604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e6.i f41605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Map f41606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Class f41607k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41608m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e6.f f41609n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.bumptech.glide.f f41610o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public l f41611p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41612q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41613r;

    public final ArrayList a() {
        boolean z10 = this.f41608m;
        ArrayList arrayList = this.f41598b;
        if (!z10) {
            this.f41608m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i10 = 0; i10 < size; i10++) {
                k6.q qVar = (k6.q) arrayListB.get(i10);
                e6.f fVar = qVar.f44369a;
                List list = qVar.f44370b;
                if (!arrayList.contains(fVar)) {
                    arrayList.add(qVar.f44369a);
                }
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (!arrayList.contains(list.get(i11))) {
                        arrayList.add(list.get(i11));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z10 = this.l;
        ArrayList arrayList = this.f41597a;
        if (!z10) {
            this.l = true;
            arrayList.clear();
            List listF = this.f41599c.a().f(this.f41600d);
            int size = listF.size();
            for (int i10 = 0; i10 < size; i10++) {
                k6.q qVarB = ((k6.r) listF.get(i10)).b(this.f41600d, this.f41601e, this.f41602f, this.f41605i);
                if (qVarB != null) {
                    arrayList.add(qVarB);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final y c(Class cls) {
        y yVar;
        Class cls2;
        Class cls3;
        Class cls4;
        y yVar2;
        ArrayList arrayList;
        s6.a aVar;
        Class cls5 = cls;
        com.bumptech.glide.h hVarA = this.f41599c.a();
        Class cls6 = this.f41603g;
        Class cls7 = this.f41607k;
        v6.b bVar = hVarA.f10488i;
        a7.n nVar = (a7.n) bVar.f52486b.getAndSet(null);
        if (nVar == null) {
            nVar = new a7.n();
        }
        nVar.f3440a = cls5;
        nVar.f3441b = cls6;
        nVar.f3442c = cls7;
        synchronized (bVar.f52485a) {
            yVar = (y) bVar.f52485a.get(nVar);
        }
        bVar.f52486b.set(nVar);
        hVarA.f10488i.getClass();
        if (v6.b.f52484c.equals(yVar)) {
            return null;
        }
        if (yVar != null) {
            return yVar;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls8 : hVarA.f10482c.y(cls5, cls6)) {
            for (Class cls9 : hVarA.f10485f.b(cls8, cls7)) {
                m5.k kVar = hVarA.f10482c;
                synchronized (kVar) {
                    arrayList = new ArrayList();
                    Iterator it = ((ArrayList) kVar.f45902b).iterator();
                    while (it.hasNext()) {
                        List<v6.d> list = (List) ((HashMap) kVar.f45903c).get((String) it.next());
                        if (list != null) {
                            for (v6.d dVar : list) {
                                if (dVar.f52489a.isAssignableFrom(cls5) && cls8.isAssignableFrom(dVar.f52490b)) {
                                    arrayList.add(dVar.f52491c);
                                }
                            }
                        }
                    }
                }
                l7.a0 a0Var = hVarA.f10485f;
                synchronized (a0Var) {
                    if (cls9.isAssignableFrom(cls8)) {
                        aVar = s6.c.f50193b;
                    } else {
                        Iterator it2 = a0Var.f45082a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                throw new IllegalArgumentException("No transcoder registered to transcode from " + cls8 + " to " + cls9);
                            }
                            s6.b bVar2 = (s6.b) it2.next();
                            if (bVar2.f50190a.isAssignableFrom(cls8) && cls9.isAssignableFrom(bVar2.f50191b)) {
                                aVar = bVar2.f50192c;
                                break;
                            }
                            cls5 = cls;
                        }
                    }
                }
                arrayList2.add(new k(cls5, cls8, cls9, arrayList, aVar, hVarA.f10489j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList2.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            yVar2 = null;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            yVar2 = new y(cls2, cls3, cls4, arrayList2, hVarA.f10489j);
        }
        v6.b bVar3 = hVarA.f10488i;
        synchronized (bVar3.f52485a) {
            bVar3.f52485a.put(new a7.n(cls2, cls3, cls4), yVar2 != null ? yVar2 : v6.b.f52484c);
        }
        return yVar2;
    }

    public final e6.b d(Object obj) {
        e6.b bVar;
        qj.x xVar = this.f41599c.a().f10481b;
        Class<?> cls = obj.getClass();
        synchronized (xVar) {
            for (v6.a aVar : (ArrayList) xVar.f49096b) {
                if (aVar.f52482a.isAssignableFrom(cls)) {
                    bVar = aVar.f52483b;
                }
            }
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        throw new com.bumptech.glide.g(defpackage.e.l(obj.getClass(), "Failed to find source encoder for data class: "));
    }

    public final e6.m e(Class cls) {
        e6.m mVar = (e6.m) this.f41606j.get(cls);
        if (mVar == null) {
            for (Map.Entry entry : this.f41606j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (e6.m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f41606j.isEmpty() || !this.f41612q) {
            return m6.c.f45911b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
