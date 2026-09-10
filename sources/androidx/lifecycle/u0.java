package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f4595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f4596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f4597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f4598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j4.e f4599e;

    public u0(Application application, j4.g gVar, Bundle bundle) {
        z0 z0Var;
        this.f4599e = gVar.getSavedStateRegistry();
        this.f4598d = gVar.getLifecycle();
        this.f4597c = bundle;
        this.f4595a = application;
        if (application != null) {
            if (z0.f4624c == null) {
                z0.f4624c = new z0(application);
            }
            z0Var = z0.f4624c;
            kotlin.jvm.internal.n.c(z0Var);
        } else {
            z0Var = new z0(null);
        }
        this.f4596b = z0Var;
    }

    @Override // androidx.lifecycle.a1
    public final x0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return c(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.a1
    public final x0 b(Class cls, e1.c cVar) {
        y0 y0Var = y0.f4621b;
        LinkedHashMap linkedHashMap = cVar.f39019a;
        String str = (String) linkedHashMap.get(y0Var);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(r0.f4586a) == null || linkedHashMap.get(r0.f4587b) == null) {
            if (this.f4598d != null) {
                return c(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(y0.f4620a);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? v0.a(cls, v0.f4601b) : v0.a(cls, v0.f4600a);
        if (constructorA == null) {
            return this.f4596b.b(cls, cVar);
        }
        return (!zIsAssignableFrom || application == null) ? v0.b(cls, constructorA, r0.c(cVar)) : v0.b(cls, constructorA, application, r0.c(cVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final x0 c(Class cls, String str) {
        Object obj;
        Application application;
        o oVar = this.f4598d;
        if (oVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || this.f4595a == null) ? v0.a(cls, v0.f4601b) : v0.a(cls, v0.f4600a);
        if (constructorA == null) {
            if (this.f4595a != null) {
                return this.f4596b.a(cls);
            }
            if (b1.f4527a == null) {
                b1.f4527a = new b1();
            }
            b1 b1Var = b1.f4527a;
            kotlin.jvm.internal.n.c(b1Var);
            return b1Var.a(cls);
        }
        j4.e eVar = this.f4599e;
        kotlin.jvm.internal.n.c(eVar);
        Bundle bundle = this.f4597c;
        Bundle bundleA = eVar.a(str);
        Class[] clsArr = o0.f4572f;
        o0 o0VarB = r0.b(bundleA, bundle);
        p0 p0Var = new p0(str, o0VarB);
        p0Var.b(oVar, eVar);
        n nVar = ((x) oVar).f4609d;
        if (nVar == n.f4565b || nVar.compareTo(n.f4567d) >= 0) {
            eVar.d();
        } else {
            oVar.a(new f(oVar, eVar));
        }
        x0 x0VarB = (!zIsAssignableFrom || (application = this.f4595a) == null) ? v0.b(cls, constructorA, o0VarB) : v0.b(cls, constructorA, application, o0VarB);
        synchronized (x0VarB.f4616a) {
            try {
                obj = x0VarB.f4616a.get("androidx.lifecycle.savedstate.vm.tag");
                if (obj == null) {
                    x0VarB.f4616a.put("androidx.lifecycle.savedstate.vm.tag", p0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (obj != null) {
            p0Var = obj;
        }
        if (x0VarB.f4618c) {
            x0.a(p0Var);
        }
        return x0VarB;
    }
}
