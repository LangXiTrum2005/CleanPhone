package h;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.m;
import androidx.lifecycle.o;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import d5.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.n;
import zm.l;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f42062a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f42063b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f42064c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f42065d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f42066e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f42067f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f42068g = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        String str = (String) this.f42062a.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        e eVar = (e) this.f42066e.get(str);
        if ((eVar != null ? eVar.f42054a : null) != null) {
            ArrayList arrayList = this.f42065d;
            if (arrayList.contains(str)) {
                eVar.f42054a.onActivityResult(eVar.f42055b.c(intent, i11));
                arrayList.remove(str);
                return true;
            }
        }
        this.f42067f.remove(str);
        this.f42068g.putParcelable(str, new a(intent, i11));
        return true;
    }

    public abstract void b(int i10, i.a aVar, Object obj);

    public final g c(final String key, v vVar, final i.a contract, final b callback) {
        n.f(key, "key");
        n.f(contract, "contract");
        n.f(callback, "callback");
        o lifecycle = vVar.getLifecycle();
        x xVar = (x) lifecycle;
        if (xVar.f4609d.compareTo(androidx.lifecycle.n.f4567d) >= 0) {
            throw new IllegalStateException(("LifecycleOwner " + vVar + " is attempting to register while current state is " + xVar.f4609d + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        e(key);
        LinkedHashMap linkedHashMap = this.f42064c;
        f fVar = (f) linkedHashMap.get(key);
        if (fVar == null) {
            fVar = new f(lifecycle);
        }
        t tVar = new t() { // from class: h.d
            @Override // androidx.lifecycle.t
            public final void onStateChanged(v vVar2, m mVar) {
                h hVar = this.f42050a;
                LinkedHashMap linkedHashMap2 = hVar.f42066e;
                m mVar2 = m.ON_START;
                String str = key;
                if (mVar2 != mVar) {
                    if (m.ON_STOP == mVar) {
                        linkedHashMap2.remove(str);
                        return;
                    } else {
                        if (m.ON_DESTROY == mVar) {
                            hVar.f(str);
                            return;
                        }
                        return;
                    }
                }
                Bundle bundle = hVar.f42068g;
                LinkedHashMap linkedHashMap3 = hVar.f42067f;
                i.a aVar = contract;
                b bVar = callback;
                linkedHashMap2.put(str, new e(aVar, bVar));
                if (linkedHashMap3.containsKey(str)) {
                    Object obj = linkedHashMap3.get(str);
                    linkedHashMap3.remove(str);
                    bVar.onActivityResult(obj);
                }
                a aVar2 = (a) a.a.t(bundle, str, a.class);
                if (aVar2 != null) {
                    bundle.remove(str);
                    bVar.onActivityResult(aVar.c(aVar2.f42049b, aVar2.f42048a));
                }
            }
        };
        fVar.f42056a.a(tVar);
        fVar.f42057b.add(tVar);
        linkedHashMap.put(key, fVar);
        return new g(this, key, contract, 0);
    }

    public final g d(String key, i.a aVar, b bVar) {
        n.f(key, "key");
        e(key);
        this.f42066e.put(key, new e(aVar, bVar));
        LinkedHashMap linkedHashMap = this.f42067f;
        if (linkedHashMap.containsKey(key)) {
            Object obj = linkedHashMap.get(key);
            linkedHashMap.remove(key);
            bVar.onActivityResult(obj);
        }
        Bundle bundle = this.f42068g;
        a aVar2 = (a) a.a.t(bundle, key, a.class);
        if (aVar2 != null) {
            bundle.remove(key);
            bVar.onActivityResult(aVar.c(aVar2.f42049b, aVar2.f42048a));
        }
        return new g(this, key, aVar, 1);
    }

    public final void e(String str) {
        LinkedHashMap linkedHashMap = this.f42063b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : (zm.a) l.S(new defpackage.c(8))) {
            Integer numValueOf = Integer.valueOf(number.intValue());
            LinkedHashMap linkedHashMap2 = this.f42062a;
            if (!linkedHashMap2.containsKey(numValueOf)) {
                int iIntValue = number.intValue();
                linkedHashMap2.put(Integer.valueOf(iIntValue), str);
                linkedHashMap.put(str, Integer.valueOf(iIntValue));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public final void f(String key) {
        Integer num;
        n.f(key, "key");
        if (!this.f42065d.contains(key) && (num = (Integer) this.f42063b.remove(key)) != null) {
            this.f42062a.remove(num);
        }
        this.f42066e.remove(key);
        LinkedHashMap linkedHashMap = this.f42067f;
        if (linkedHashMap.containsKey(key)) {
            StringBuilder sbK = u.k("Dropping pending result for request ", key, ": ");
            sbK.append(linkedHashMap.get(key));
            Log.w("ActivityResultRegistry", sbK.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = this.f42068g;
        if (bundle.containsKey(key)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + key + ": " + ((a) a.a.t(bundle, key, a.class)));
            bundle.remove(key);
        }
        LinkedHashMap linkedHashMap2 = this.f42064c;
        f fVar = (f) linkedHashMap2.get(key);
        if (fVar != null) {
            ArrayList arrayList = fVar.f42057b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fVar.f42056a.b((t) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(key);
        }
    }
}
