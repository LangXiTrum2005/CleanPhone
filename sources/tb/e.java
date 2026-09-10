package tb;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import l2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final kd.d f50682h = new kd.d(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f50683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f50684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f50685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f50686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f50687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f50688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v1.j f50689g;

    public e(ArrayList arrayList, ArrayList arrayList2, v1.j jVar) {
        ub.l lVar = ub.l.f51976a;
        this.f50683a = new HashMap();
        this.f50684b = new HashMap();
        this.f50685c = new HashMap();
        this.f50686d = new HashSet();
        this.f50688f = new AtomicReference();
        j jVar2 = new j();
        this.f50687e = jVar2;
        this.f50689g = jVar;
        ArrayList<a> arrayList3 = new ArrayList();
        arrayList3.add(a.c(jVar2, j.class, qc.d.class, qc.c.class));
        arrayList3.add(a.c(this, e.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                arrayList3.add(aVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((tc.b) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(this.f50689g.f(componentRegistrar));
                        it3.remove();
                    }
                } catch (k e10) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((a) it4.next()).f50674b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f50686d.contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        this.f50686d.add(obj.toString());
                    }
                }
            }
            if (this.f50683a.isEmpty()) {
                x7.a.p(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f50683a.keySet());
                arrayList6.addAll(arrayList3);
                x7.a.p(arrayList6);
            }
            for (a aVar2 : arrayList3) {
                this.f50683a.put(aVar2, new l(new mb.c(2, this, aVar2)));
            }
            arrayList5.addAll(j(arrayList3));
            arrayList5.addAll(k());
            i();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) this.f50688f.get();
        if (bool != null) {
            h(this.f50683a, bool.booleanValue());
        }
    }

    @Override // tb.b
    public final synchronized tc.b b(q qVar) {
        a.a.f(qVar, "Null interface requested.");
        return (tc.b) this.f50684b.get(qVar);
    }

    @Override // tb.b
    public final o c(q qVar) {
        tc.b bVarB = b(qVar);
        if (bVarB == null) {
            return new o(o.f50709c, o.f50710d);
        }
        return bVarB instanceof o ? (o) bVarB : new o(null, bVarB);
    }

    @Override // tb.b
    public final synchronized tc.b e(q qVar) {
        m mVar = (m) this.f50685c.get(qVar);
        if (mVar != null) {
            return mVar;
        }
        return f50682h;
    }

    public final void h(HashMap map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            a aVar = (a) entry.getKey();
            tc.b bVar = (tc.b) entry.getValue();
            int i10 = aVar.f50676d;
            if (i10 == 1 || (i10 == 2 && z10)) {
                bVar.get();
            }
        }
        j jVar = this.f50687e;
        synchronized (jVar) {
            try {
                arrayDeque = jVar.f50699b;
                if (arrayDeque != null) {
                    jVar.f50699b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                jVar.a((qc.a) it.next());
            }
        }
    }

    public final void i() {
        HashMap map = this.f50684b;
        HashMap map2 = this.f50685c;
        for (a aVar : this.f50683a.keySet()) {
            for (h hVar : aVar.f50675c) {
                boolean z10 = hVar.f50696b == 2;
                q qVar = hVar.f50695a;
                if (z10 && !map2.containsKey(qVar)) {
                    Set set = Collections.EMPTY_SET;
                    m mVar = new m();
                    mVar.f50705b = null;
                    mVar.f50704a = Collections.newSetFromMap(new ConcurrentHashMap());
                    mVar.f50704a.addAll(set);
                    map2.put(qVar, mVar);
                } else if (map.containsKey(qVar)) {
                    continue;
                } else {
                    int i10 = hVar.f50696b;
                    if (i10 == 1) {
                        throw new i("Unsatisfied dependency for component " + aVar + ": " + qVar, 18);
                    }
                    if (i10 != 2) {
                        map.put(qVar, new o(o.f50709c, o.f50710d));
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f50677e == 0) {
                tc.b bVar = (tc.b) this.f50683a.get(aVar);
                for (q qVar : aVar.f50674b) {
                    HashMap map = this.f50684b;
                    if (map.containsKey(qVar)) {
                        arrayList2.add(new u(23, (o) ((tc.b) map.get(qVar)), bVar));
                    } else {
                        map.put(qVar, bVar);
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        HashMap map = this.f50685c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f50683a.entrySet()) {
            a aVar = (a) entry.getKey();
            if (aVar.f50677e != 0) {
                tc.b bVar = (tc.b) entry.getValue();
                for (q qVar : aVar.f50674b) {
                    if (!map2.containsKey(qVar)) {
                        map2.put(qVar, new HashSet());
                    }
                    ((Set) map2.get(qVar)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                m mVar = (m) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new u(24, mVar, (tc.b) it.next()));
                }
            } else {
                q qVar2 = (q) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                m mVar2 = new m();
                mVar2.f50705b = null;
                mVar2.f50704a = Collections.newSetFromMap(new ConcurrentHashMap());
                mVar2.f50704a.addAll(set);
                map.put(qVar2, mVar2);
            }
        }
        return arrayList;
    }
}
