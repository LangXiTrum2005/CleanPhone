package androidx.lifecycle;

import android.os.Bundle;
import cn.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y0 f4586a = new y0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final y0 f4587b = new y0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y0 f4588c = new y0();

    public static final void a(x0 x0Var, j4.e registry, o lifecycle) {
        Object obj;
        kotlin.jvm.internal.n.f(registry, "registry");
        kotlin.jvm.internal.n.f(lifecycle, "lifecycle");
        HashMap map = x0Var.f4616a;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = x0Var.f4616a.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        p0 p0Var = (p0) obj;
        if (p0Var == null || p0Var.f4583c) {
            return;
        }
        p0Var.b(lifecycle, registry);
        n nVar = ((x) lifecycle).f4609d;
        if (nVar == n.f4565b || nVar.compareTo(n.f4567d) >= 0) {
            registry.d();
        } else {
            lifecycle.a(new f(lifecycle, registry));
        }
    }

    public static o0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new o0();
            }
            HashMap map = new HashMap();
            for (String key : bundle2.keySet()) {
                kotlin.jvm.internal.n.e(key, "key");
                map.put(key, bundle2.get(key));
            }
            return new o0(map);
        }
        ClassLoader classLoader = o0.class.getClassLoader();
        kotlin.jvm.internal.n.c(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = parcelableArrayList.get(i10);
            kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
        }
        return new o0(linkedHashMap);
    }

    public static final o0 c(e1.c cVar) {
        LinkedHashMap linkedHashMap = cVar.f39019a;
        j4.g gVar = (j4.g) linkedHashMap.get(f4586a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        d1 d1Var = (d1) linkedHashMap.get(f4587b);
        if (d1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f4588c);
        String str = (String) linkedHashMap.get(y0.f4621b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        j4.d dVarB = gVar.getSavedStateRegistry().b();
        s0 s0Var = dVarB instanceof s0 ? (s0) dVarB : null;
        if (s0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = f(d1Var).f4594d;
        o0 o0Var = (o0) linkedHashMap2.get(str);
        if (o0Var != null) {
            return o0Var;
        }
        Class[] clsArr = o0.f4572f;
        s0Var.b();
        Bundle bundle2 = s0Var.f4592c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = s0Var.f4592c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = s0Var.f4592c;
        if (bundle5 != null && bundle5.isEmpty()) {
            s0Var.f4592c = null;
        }
        o0 o0VarB = b(bundle3, bundle);
        linkedHashMap2.put(str, o0VarB);
        return o0VarB;
    }

    public static final void d(j4.g gVar) {
        n nVar = ((x) gVar.getLifecycle()).f4609d;
        if (nVar != n.f4565b && nVar != n.f4566c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.getSavedStateRegistry().b() == null) {
            s0 s0Var = new s0(gVar.getSavedStateRegistry(), (d1) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", s0Var);
            gVar.getLifecycle().a(new j4.b(s0Var, 2));
        }
    }

    public static final q e(v vVar) {
        kotlin.jvm.internal.n.f(vVar, "<this>");
        o lifecycle = vVar.getLifecycle();
        kotlin.jvm.internal.n.f(lifecycle, "<this>");
        AtomicReference atomicReference = lifecycle.f4571a;
        while (true) {
            q qVar = (q) atomicReference.get();
            if (qVar != null) {
                return qVar;
            }
            z1 z1VarE = cn.d0.e();
            jn.e eVar = cn.n0.f6748a;
            q qVar2 = new q(lifecycle, com.google.android.gms.internal.auth.i.D(z1VarE, hn.o.f42451a.f38972d));
            do {
                ak.f fVar = null;
                if (atomicReference.compareAndSet(null, qVar2)) {
                    jn.e eVar2 = cn.n0.f6748a;
                    cn.d0.w(qVar2, hn.o.f42451a.f38972d, new p(qVar2, fVar, 0), 2);
                    return qVar2;
                }
            } while (atomicReference.get() == null);
        }
    }

    public static final t0 f(d1 d1Var) {
        return (t0) new g9.k(d1Var.getViewModelStore(), new q0(), d1Var instanceof i ? ((i) d1Var).getDefaultViewModelCreationExtras() : e1.a.f39018b).p(t0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
